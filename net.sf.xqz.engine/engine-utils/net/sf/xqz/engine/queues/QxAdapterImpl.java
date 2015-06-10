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

import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Qx;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class QxAdapterImpl extends AdapterImpl {
    private CmdPipe cmdEngine;
    
    public QxAdapterImpl(CmdPipe engine) {
        cmdEngine = engine;
    }
    
    @Override
    public void notifyChanged(Notification msg) {
        if (msg.getFeature().equals(EnginePackage.eINSTANCE.getCmdPipe_Queues())) {
            Object newVal;
            switch(msg.getEventType())  {
                case Notification.ADD:
                    newVal = msg.getNewValue();
                    if (newVal instanceof Qx) {
                        Qx queue = (Qx) newVal;
                        if (queue.eAdapters().size()==0) {
                            ((Qx)newVal).eAdapters().add(new CmdAdapterImpl(cmdEngine));
                        } else {
	                        int nbAdapters = 0;
	                        for (Adapter adapter : queue.eAdapters()) {
	                            if (adapter instanceof CmdAdapterImpl) {
	                                nbAdapters++;
	                            }
	                        }
	                        if (nbAdapters <= 0) {
	                            ((Qx)newVal).eAdapters().add(new CmdAdapterImpl(cmdEngine));
	                        }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        super.notifyChanged(msg);
    }
}
