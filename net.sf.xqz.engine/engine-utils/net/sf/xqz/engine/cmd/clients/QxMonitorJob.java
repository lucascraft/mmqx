/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2008 - 2011, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.xqz.engine.cmd.clients;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.queues.QxEventAdapterImpl;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.Tx;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;


public class QxMonitorJob extends Job {
	public static long DEFAULT_SPEED = 0;
	
    private final CmdPipe cmdEngine;
    private long processingSpeed;

    /**
     * Constructor w/ parameters
     * 
     * @param engine {@link CmdPipe} to consider
     */
    public QxMonitorJob(final CmdPipe engine, long speed) {
        this(engine);
        setPriority(INTERACTIVE);
        setSystem(true);
        processingSpeed = speed;
    }
    
    /**
     * Constructor w/ parameters
     * 
     * @param engine {@link CmdPipe} to consider
     */
    public QxMonitorJob(CmdPipe engine) {
        super(engine.getId());
        cmdEngine = engine;
        cmdEngine.eAdapters().add(new QxEventAdapterImpl(this));
        setPriority(INTERACTIVE);
        setSystem(true);
        processingSpeed = DEFAULT_SPEED;
    }
    
    private <Q extends Qx> void visitQxCmd(Q qx, Cmd cmd) {
        if (cmd instanceof CompoundCmd) {
        	for (Cmd c : ((CompoundCmd)cmd).getChildren()) {
        		visitQxCmd(qx, c);
        	}
        } else {
        	handleQxCmd(qx, cmd);
        }
    }
    
    private synchronized <Q extends Qx> void handleQxCmd(Q qx, Cmd cmd) {
    	if (cmdEngine.isActivated()) {
	        if (Platform.inDebugMode()) {
	        	System.out.println(
	        		"!!! " + 
	        			(qx instanceof Tx ? "Tx" : "Rx") + 
	        				" Cmd Consumed : " + CmdUtil.INSTANCE.getCmdInfo(cmd)
	        	);
	        }
    	}
    }

    @Override
    public IStatus run(IProgressMonitor monitor) {
    	if (cmdEngine.isActivated()) {
		    if (!cmdEngine.getTx().getCommands().isEmpty()) {
		        visitQxCmd(
		        	cmdEngine.getTx(), 
		        	cmdEngine.getTx().consumeCommand()
		        );
		    } 
		    if (!cmdEngine.getRx().getCommands().isEmpty()) {
		    	visitQxCmd(
		        	cmdEngine.getRx(), 
		        	cmdEngine.getRx().consumeCommand()
		        );
		    }
    	}
	    if (cmdEngine.getRx().getCommands().isEmpty() && cmdEngine.getTx().getCommands().isEmpty()) {
	       	sleep();
	    } else {
	       	if (processingSpeed <= 0) {
	       		schedule();
	       	} else {
	       		schedule(processingSpeed);
	       	}
	    }
        return Status.OK_STATUS;
    }
    
    /**
     * Getter for currently owned {@link CmdPipe}
     * 
     * @return owned {@link CmdPipe}
     */ 
    public CmdPipe getCmdEngine() {
        return cmdEngine;
    }
}
