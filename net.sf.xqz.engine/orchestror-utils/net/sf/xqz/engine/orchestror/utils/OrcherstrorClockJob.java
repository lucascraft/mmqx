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

package net.sf.xqz.engine.orchestror.utils;

import java.io.Serializable;

import net.sf.xqz.model.temporal.EXECUTION_STATUS;
import net.sf.xqz.model.temporal.Orchestror;
import net.sf.xqz.model.temporal.TimeInfo;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class OrcherstrorClockJob extends Job implements Serializable {
	/**
	 * UUID 
	 */
	private static final long serialVersionUID = -5929241529403426663L;
	
	private Orchestror lOrchestror;
	private volatile EXECUTION_STATUS status;
	public OrcherstrorClockJob(Orchestror orchestror) {
		super("Clock");
		lOrchestror = orchestror;
		status = EXECUTION_STATUS.PLAY;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		TimeInfo tInfo = lOrchestror.getTime();
		long now = System.currentTimeMillis();
		if ((double) tInfo.getStart() + (double) tInfo.getDuration() < now) {
			tInfo.setStart(now);
		}
		lOrchestror.getTime().setCursor(now);
		schedule(lOrchestror.getTime().getTick());
		return Status.OK_STATUS;
	}
	
	public synchronized boolean isSchedulingCompatibleExecutionStatus() {
		switch(status) {
			case STOP:
			case MUTE:
			case FROZEN:
			case BACKWARD:
			case FORWARD:
				return true;
			case PLAY:
			case RECORD:
				return false;
			default:
				return false;
		}
	}
	
	public synchronized void setExecutionStatus(EXECUTION_STATUS eStatus) {
		status = eStatus;
	}
	
	public synchronized EXECUTION_STATUS getExecutionStatus() {
		return status;
	}
}
