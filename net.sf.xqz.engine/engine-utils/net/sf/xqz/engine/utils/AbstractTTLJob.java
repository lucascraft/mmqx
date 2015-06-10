/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

import java.util.UUID;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;

/**
 * This special job has a Time To live duration until which it is forced to be DONE !
 * 
 * @author lucas
 *
 */
public abstract class AbstractTTLJob extends Job implements ITTLJob {
	/** forever means no limit to duratoin : eg a plain immortal job ... */
    public final static long FOREVER = -1l;
    /** self reference to this Job */
    private AbstractTTLJob INSTANCE;
    /** true if running, false otherwise (eg : DONE) */
    public boolean running = true;
    /** true if running, false otherwise (eg : DONE) */
    public boolean isRunning() {
		return INSTANCE.running;
	}
    /** Default constructor (immortal) */
	public AbstractTTLJob() {
    	this(FOREVER);
    }
	   /** Default constructor (immortal) */
	public AbstractTTLJob(String id) {
    	this(id, FOREVER);
    }
	/** Constructor with TTL duration */
    public AbstractTTLJob(final long TTL) {
        this(UUID.randomUUID().toString(), TTL);
    }
    
    /** Constructor with TTL duration */
    public AbstractTTLJob(String id, final long TTL) {
    	super(id);
    	setSystem(true);
    	setPriority(INTERACTIVE);
    	INSTANCE = this;
        if (TTL >= 0) {
        	/* A timer checking for TTL duration expiration */
        	Job timer = new Job(UUID.randomUUID().toString()) {
        		@Override
        		protected IStatus run(IProgressMonitor monitor) {
        			return Status.OK_STATUS;
        		}
        	};
        	/* Listen to timer TTL expiration */
            timer.addJobChangeListener(new IJobChangeListener() {
    			public void sleeping(IJobChangeEvent event) {}
    			public void scheduled(IJobChangeEvent event) {}
    			public void running(IJobChangeEvent event) {}
    			public void done(IJobChangeEvent event) {
    				INSTANCE.running = false;
			    	INSTANCE.done(Status.CANCEL_STATUS);
    			}
    			public void awake(IJobChangeEvent event) {}
    			public void aboutToRun(IJobChangeEvent event) {}
    		});
			timer.schedule(TTL);
        }
    }
    protected IStatus run(IProgressMonitor monitor) {
    	schedule();
    	return Status.OK_STATUS;
    };
}
