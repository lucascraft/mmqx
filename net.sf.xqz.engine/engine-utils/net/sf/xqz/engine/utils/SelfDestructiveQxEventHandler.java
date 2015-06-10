/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2008 - 2013, Lucas Bigeardel
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

package net.sf.xqz.engine.utils;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

public abstract class SelfDestructiveQxEventHandler extends AbstractQxEventHandlerImpl implements ITTLJob {
	
	private Job selfDestructor;
	private CmdPipe containerPipe;
	private static SelfDestructiveQxEventHandler INSTANCE;
	@SuppressWarnings("unused")
	private Cmd lastCmd;
	
	public SelfDestructiveQxEventHandler(CmdPipe pipe, long timeout) {
		//System.out.println("create " + timeout + "ms self destructive Qx handler");
		INSTANCE = this;
		selfDestructor	= new Job("") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				containerPipe.removeQxEventHandler(INSTANCE);
				return Status.OK_STATUS;
			}
		};
		containerPipe	= pipe;
		selfDestructor.schedule(timeout);
	}
	
	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public void schedule() {
		selfDestructor.schedule();
	}
	
	//public abstract Cmd getCmd();
}
