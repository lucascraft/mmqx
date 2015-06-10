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

package net.sf.xqz.engine.interpret.cmd;

import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.cmd.utils.ICmdUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl;


/**
 * Almost useless {@link IXCmdInterpreter} implementation
 * 
 * @author lb
 *
 */
public class NullXFrameInterpreter extends AbstractFrameInterpreterImpl {
		
	ICmdUtil cmdUtil;
	
	public NullXFrameInterpreter() {
		
		cmdUtil = CmdUtil.INSTANCE;
	}

	public synchronized Cmd byteArray2Cmd(final byte[] frame) {
		return cmdUtil.generateRamdomCmd();
	}
}
