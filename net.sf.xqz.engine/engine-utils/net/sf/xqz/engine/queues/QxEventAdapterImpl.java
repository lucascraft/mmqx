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

package net.sf.xqz.engine.queues;

import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.xqz.engine.cmd.clients.QxMonitorJob;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IQxEventHandler;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class QxEventAdapterImpl extends AdapterImpl {
	private boolean activated;
    private QxMonitorJob job;
    private ConcurrentLinkedQueue<IQxEventHandler> evtHandlers;
    
    public QxEventAdapterImpl(QxMonitorJob j) {
        job = j;
        evtHandlers = new ConcurrentLinkedQueue<IQxEventHandler>();
        activated = true;
    }
    
    public synchronized boolean toggle() {
    	return activated = activated ? false : true;
    }
    
    public synchronized boolean isActivated() {
    	return activated;
    }
    
    public synchronized void activate() {
    	activated = true;
    }
    
    public synchronized void deactivate() {
    	activated = false;
    }
    
    @Override
    public synchronized void notifyChanged(Notification msg) {
    	if (activated) {
	        super.notifyChanged(msg);
	        if (msg.getFeature().equals(EnginePackage.eINSTANCE.getCmdPipe_TxEvents())) {
	            switch (msg.getEventType()) {
	                case Notification.ADD:
	                case Notification.ADD_MANY:
		                for (IQxEventHandler h : evtHandlers) {
		                	if (h != null) {
		                        if (Platform.inDebugMode()) {
		                        	System.out.println("Tx Handler [" + h.getID() + "] To Process Event");
		                        }
		                		h.handleQxEvent((Event)msg.getNewValue());
		                	}
		                }
	                    job.schedule();
	                    break;
	                default:
	                    break;
	            }
	        } else if (msg.getFeature().equals(EnginePackage.eINSTANCE.getCmdPipe_RxEvents())) {
	            switch (msg.getEventType()) {
	                case Notification.ADD:
	                case Notification.ADD_MANY:
		                for (IQxEventHandler h : evtHandlers) {
		                	if (h != null) {
		                        if (Platform.inDebugMode()) {
		                        	System.out.println("Rx Handler [" + h.getID() + "] To Process Event");
		                        }
		                		h.handleQxEvent((Event)msg.getNewValue());
		                	}
		                }
	                    job.schedule();
	                    break;
	                default:
	                    break;
	            }
	        }
    	}
    }
    
    public synchronized ConcurrentLinkedQueue<IQxEventHandler> getEvtHandlers() {
		return evtHandlers;
	}
}
