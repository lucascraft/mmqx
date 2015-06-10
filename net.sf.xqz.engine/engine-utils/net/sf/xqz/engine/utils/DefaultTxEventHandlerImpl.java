/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

public abstract class DefaultTxEventHandlerImpl extends AbstractQxEventHandlerImpl {

	@Override
	public void handleQxEvent(Event event) {
		if (event.getKind() == EVENT_KIND.TX_DONE) {
			if (event.getCmd() instanceof Cmd) {
				handleCmd(event.getQx(), event.getCmd());
			}
		}
	}
	
	private synchronized void handleCmd(Qx _qx, Cmd _cmd) {
		if (_qx != null && _qx.getEngine() != null && _qx.getEngine().getPort() != null) {
			IChannel channel = _qx.getEngine().getPort().getChannel();
			if (channel instanceof IChannel) {
				synchronized (_qx.getEngine().getOutputInterpreter()) {
					byte[] frame = _qx.getEngine().getOutputInterpreter().cmd2ByteArray(_cmd);
					if (frame!=null && frame.length>0) {
						channel.send(frame);
					}
				}
			}
		}
	}

	
	
	
	
	/********************************************** D U M P ********************************************/
	
	
	
	
	public synchronized void ___handleQxEvent(Event event) {

		CmdPipe pipe = (CmdPipe) event.getCmd().eContainer();
		
		pipe.getPort().getChannel();
	
		@SuppressWarnings("unused")
		IXCmdInterpreter out = pipe.getOutputInterpreter();
		
		@SuppressWarnings("unused")
		IXFrameInterpreter in = pipe.getInputInterpreter();
		
	}
	
}