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

package net.sf.xqz.engine.queues;

import java.util.List;

import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.utils.EngineUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.Rx;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class CmdAdapterImpl extends AdapterImpl {
    private CmdPipe cmdEngine;
    
    public CmdAdapterImpl(CmdPipe engine) {
        cmdEngine = engine;
    }

    @Override
    public void notifyChanged(Notification msg) {
        if (msg.getFeature().equals(EnginePackage.eINSTANCE.getQx_Commands())) {
            switch(msg.getEventType())  {
                case Notification.ADD:
                    handleEventProcessing(msg, (Cmd) msg.getNewValue());
                    break;
                case Notification.REMOVE:
                    handleEventProcessing(msg, (Cmd) msg.getOldValue());
                    break;
                default:
                    break;
            }
        }
    }
    
    private synchronized void handleEventProcessing(Notification msg, Cmd cmd) {
        if (Platform.inDebugMode()) {
            System.out.println(
            	CmdUtil.INSTANCE.getCmdInfo(cmd) + 
                	(msg.getEventType() == Notification.ADD ? 
                			" Added !" : 
                				" Removed !"
                    )
            );
            System.out.println("Events : TX [" + cmdEngine.getTxEvents().size() + "], RX : [" + cmdEngine.getRxEvents().size() + "]");
        }
        handleEvent(cmdEngine, cmd, msg);
    }
    
     synchronized void handleEvent(CmdPipe cmdEngine, Cmd cmd, Notification msg) {
         EVENT_KIND kind = EVENT_KIND.UNKNOWN;
         
         Qx qx = (Qx) msg.getNotifier();
         boolean isRx = qx instanceof Rx ? true : false;
         if (msg.getEventType() == Notification.ADD) {
             kind = isRx ? EVENT_KIND.RX_DONE	: EVENT_KIND.TX_DONE; 
         } else {
             kind = isRx ? EVENT_KIND.RX_READY	: EVENT_KIND.TX_READY; 
         }
   	
        List<Event> events = isRx ? cmdEngine.getRxEvents() : cmdEngine.getTxEvents();
        
    	int size = EngineUtil.INSTANCE.getEventQueueSize(events);
		if (size > 0) {
			if (qx.getMax()<events.size()) {
		        if (Platform.inDebugMode()) {
		        	System.out.println(qx.eClass().getName() + " THRESHOLD RAISED !!!");
		        }
				int idx = qx.getMax() - qx.getMax()/3;
				idx = idx > 0 ? idx : 1;
				idx = idx >= events.size() ? events.size() - 1 : idx;
				List<Event> lst = events.subList(
					0, 
					idx
				);
				cmdEngine.eSetDeliver(false);
				events.removeAll(lst);
				cmdEngine.eSetDeliver(false);
			}
			
			if (events.size() > 1) {
				long lag = System.currentTimeMillis() - events.get(events.size()-1).getTime();
				for (int i=events.size()-1; i>0; i--) {
					Event evt = events.get(i);
					long delay = System.currentTimeMillis() - (evt.getTime() - lag);
					if (qx.getTtl() < delay) {
				        if (Platform.inDebugMode()) {
				        	System.out.println("Event " + qx.eClass().getName() + " FLUSH BECAUSE OF delay over TTL : " + delay + " > "+ qx.getTtl());
				        }
						cmdEngine.eSetDeliver(false);
						int idx = events.indexOf(evt);
						events.removeAll(
							events.subList(
								0,
								idx < 1 ? 1 : idx -1 
							)
						);
						cmdEngine.eSetDeliver(true);
						break;
					}
				}
			} else if (!events.isEmpty()) {
				Event evt = events.get(0);
				long delay = System.currentTimeMillis() - evt.getTime();
				if (qx.getTtl() < delay) {
			        if (Platform.inDebugMode()) {
			        	System.out.println("Event " + qx.eClass().getName() + " FLUSH BECAUSE OF delay over TTL : " + delay + " > "+ qx.getTtl());
			        }
					cmdEngine.eSetDeliver(false);
					events.remove(0);
					cmdEngine.eSetDeliver(true);
				}
			}
		}
		
		cmdEngine.eSetDeliver(true);
		cmd.setStamp(System.currentTimeMillis());
        Event e = EngineUtil.INSTANCE.createEvent(
        	kind, 
	        cmd, 
	        (Qx) msg.getNotifier()
	    );
		if (isRx) {
	       	cmdEngine.getRxEvents().add(e);
		} else {
	       	cmdEngine.getTxEvents().add(e);
		}
    }
}
