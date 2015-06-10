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

package net.sf.xqz.engine.cmd.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import net.sf.xqz.model.cmd.ByteCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.cmd.XCmd;
import net.sf.xqz.model.engine.CmdPipe;

public final class CmdUtil implements ICmdUtil {
    private Random randomizer;
    /** PRIORITY pseudo randomization (Normal distribution like) */
    private static Map<PRIORITY, Float> cmdDistributionRatesByPiority;

    public static CmdUtil INSTANCE = new CmdUtil();
    
    
    public CmdUtil() {
        // Randomizer
        randomizer = new Random(100);
        
        /* PRIORITY pseudo randomization (Normal distribution like) */
        cmdDistributionRatesByPiority = new HashMap<PRIORITY, Float>();
        cmdDistributionRatesByPiority.put(PRIORITY.LOWEST, new Float(15.0f));
        cmdDistributionRatesByPiority.put(PRIORITY.LOW, new Float(20.0f));
        cmdDistributionRatesByPiority.put(PRIORITY.MEDIUM, new Float(30.0f));
        cmdDistributionRatesByPiority.put(PRIORITY.HIGH, new Float(20.0f));
        cmdDistributionRatesByPiority.put(PRIORITY.HIGHEST, new Float(15.0f));
	}
    
    public ByteCmd createByteCmd(byte[] message) {
    	ByteCmd msg = CmdFactory.eINSTANCE.createByteCmd();
		msg.setMessage(message);
		stampCmd(msg);
		return msg;
    }
    
    /**
     * Basically stamp a {@link Cmd} with unique {@link UUID}, a canonical name and a random priority
     */
	public synchronized <T extends Cmd> T stampCmd(T cmd) {
        return stampCmd(cmd, getRandomPRIORITY());
	}
	
    /**
     * Basically stamp a {@link Cmd} with unique {@link UUID}, a canonical name and a random priority
     */
	public synchronized <T extends Cmd> T stampCmd(T cmd, PRIORITY priority) {
		if (cmd == null) return null;
        cmd.setPriority(priority);
        cmd.setStamp(System.currentTimeMillis());
        return cmd;
	}

	/**
	 * Generate basic random anonymous {@link XCmd}
	 */
	public synchronized XCmd generateRamdomCmd() {
    	XCmd cmd = CmdFactory.eINSTANCE.createXCmd();
        cmd.setPriority(getRandomPRIORITY());
        cmd.setStamp(System.currentTimeMillis());
        return cmd;
    }
	
	/**
	 * Generate basic random anonymous {@link XCmd}
	 */
	public synchronized CompoundCmd createCompoundCmd() {
		CompoundCmd cmd = CmdFactory.eINSTANCE.createCompoundCmd();
        cmd.setPriority(PRIORITY.HIGH);
        cmd.setStamp(System.currentTimeMillis());
        return cmd;
    }
	
	/**
	 * Generate Random PRIORITY
	 */
    public synchronized PRIORITY getRandomPRIORITY() {
        int threshold = -1;
        int percentage = randomizer.nextInt(100);
        for (PRIORITY p : PRIORITY.VALUES) {
            threshold += cmdDistributionRatesByPiority.get(p).intValue();
            if (threshold >= percentage) {
                return p;
            }
        }
        return PRIORITY.LOWEST;
    }
    
    /**
     * Generate random int from seed
     */
    public synchronized int getSomeInt(int size) {
    	return randomizer.nextInt(size) % size;
    }
    
    /**
     * Dump {@link Cmd} info to system.out
     */
    public synchronized void dumpCmdInfo(Cmd c) {
        System.out.println(getCmdInfo(c));
    }
    
    /**
     * Get {@link Cmd} info
     */
    public synchronized String getCmdInfo(Cmd c) {
    	if (c == null) {
    		return "";
    	}
        return c.eClass().getName() + " with " + c.getPriority().getName() + " priority";
    }
    
    /**
     * Get frame info
     */
    public synchronized String getFrameInfo(byte[] frame) {
       	String textualized = "";
    	for (byte b : frame) {
    		textualized += "['" + Byte.toString(b) + "']";
    	}
    	return textualized;
    }
    
    /**
     * Get frame info
     */
    public synchronized String getFrameHexInfo(byte[] frame) {
    	if (frame != null && frame.length > 0) {
    		String textualized = "";
    		for (byte b : frame) {
    			textualized += "['" + valueOf(b) + "']";
    		}
    		return textualized;
    	}
    	return "";
    }
    
	
	public String valueOf(byte num) {
		String hex = Integer.toHexString((int) num & 0xFF);
		return "0x" + (hex.length() == 1 ? "0" : "") + hex;
	}

    
    public CmdPipeIO createCmdPipeIO(CmdPipe... pipes) {
    	CmdPipeIO cmdPipeIO = new CmdPipeIO();
    	cmdPipeIO.register(pipes);
    	return cmdPipeIO;
    }
}
