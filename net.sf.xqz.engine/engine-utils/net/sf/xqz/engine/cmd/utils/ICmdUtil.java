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

package net.sf.xqz.engine.cmd.utils;

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.cmd.XCmd;

import org.eclipse.emf.common.command.Command;

public interface ICmdUtil {
	
	/**
	 * Stamp a {@link Command} with date/time for tracing purposes
	 * 
	 * @param <T> some command type extending {@link Cmd}
	 * @param cmd the command to be stamped
	 * 
	 * @return the freshly stamped command
	 */
	<T extends Cmd> T stampCmd(T cmd);
	
	/**
	 * Generate a pseudo random command 
	 * 
	 * @return a pseudo generated command
	 */
	XCmd generateRamdomCmd();

	/**
	 * Generate a random PRIORITY
	 * 
	 * @return a pseudo random PRIORITY
	 */
	PRIORITY getRandomPRIORITY();
	
	/**
	 * Randomizer for int type
	 * 
	 * @param size wanted random size range
	 * 
	 * @return a random size range
	 */
	int getSomeInt(int size);
	
	/**
	 * Dump a command info
	 * 
	 * @param c a given command
	 */
	void dumpCmdInfo(Cmd c);
	
	/**
	 * Return a command info as a String
	 * 
	 * @param c a given command
	 * 
	 * @return an info for a given command
	 */
	String getCmdInfo(Cmd c);
	
	/**
	 * Get frame information
	 * 
	 * @param frame a given frame
	 * 
	 * @return frame information as a String
	 */
	String getFrameInfo(byte[] frame);
}
