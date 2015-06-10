/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.xqz.engine.utils.AbstractTTLJob;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class CmdPipeIO implements ICmdPipeIO {
	
	List<CmdPipe> pipes;
	
	public CmdPipeIO() {
		pipes = new ArrayList<CmdPipe>();
	}

	@Override
	public void register(CmdPipe... pipe) {
		pipes.addAll(Arrays.asList(pipe));
	}

	@Override
	public void unregister(CmdPipe... pipe) {
		pipes.removeAll(Arrays.asList(pipe));
	}

	@Override
	public void send(Cmd... cmd) {
		for (Cmd c : cmd) {
			for (CmdPipe p : pipes) {
				p.send(c);
			}
		}
	}

	@Override
	public void send(int delay, Cmd... cmd) {
		for (Cmd c : cmd) {
			for (CmdPipe p : pipes) {
				p.send(c);
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void repeat(int duration, final int frequency, final Cmd... cmd) {
		new AbstractTTLJob(duration) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				for (Cmd c : cmd) {
					for (CmdPipe p : pipes) {
						p.send(c);
					}
				}
				schedule(
					frequency
				);
				return Status.OK_STATUS;
			}
		}.schedule();
	}
}
