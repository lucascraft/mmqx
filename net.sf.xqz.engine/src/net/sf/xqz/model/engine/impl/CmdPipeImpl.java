/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

package net.sf.xqz.model.engine.impl;

import java.util.List;
import java.util.concurrent.TimeoutException;

import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.queues.QxEventAdapterImpl;
import net.sf.xqz.engine.utils.EngineUtil;
import net.sf.xqz.model.cmd.ByteCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.Port;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.Rx;
import net.sf.xqz.model.engine.SynchronousQxEventHandler;
import net.sf.xqz.model.engine.Trigger;
import net.sf.xqz.model.engine.Tx;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmd Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getQueues <em>Queues</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getClient <em>Client</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getTx <em>Tx</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getCommandPool <em>Command Pool</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getOutputInterpreter <em>Output Interpreter</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getInputInterpreter <em>Input Interpreter</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#isRecording <em>Recording</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getTransportProtocol <em>Transport Protocol</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getCommunicationProtocol <em>Communication Protocol</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getTxEvents <em>Tx Events</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getRxEvents <em>Rx Events</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#isActivated <em>Activated</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.CmdPipeImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CmdPipeImpl extends MinimalEObjectImpl.Container implements CmdPipe {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdPipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.CMD_PIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Qx> getQueues() {
		return (List<Qx>)eGet(EnginePackage.Literals.CMD_PIPE__QUEUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineClient getClient() {
		return (EngineClient)eGet(EnginePackage.Literals.CMD_PIPE__CLIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(EngineClient newClient) {
		eSet(EnginePackage.Literals.CMD_PIPE__CLIENT, newClient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineApplication getApplication() {
		return (EngineApplication)eGet(EnginePackage.Literals.CMD_PIPE__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(EngineApplication newApplication) {
		eSet(EnginePackage.Literals.CMD_PIPE__APPLICATION, newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(EnginePackage.Literals.CMD_PIPE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EnginePackage.Literals.CMD_PIPE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EnginePackage.Literals.CMD_PIPE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EnginePackage.Literals.CMD_PIPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIORITY getPriority() {
		return (PRIORITY)eGet(EnginePackage.Literals.CMD_PIPE__PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(PRIORITY newPriority) {
		eSet(EnginePackage.Literals.CMD_PIPE__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tx getTx() {
		return (Tx)eGet(EnginePackage.Literals.CMD_PIPE__TX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx(Tx newTx) {
		eSet(EnginePackage.Literals.CMD_PIPE__TX, newTx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rx getRx() {
		return (Rx)eGet(EnginePackage.Literals.CMD_PIPE__RX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx(Rx newRx) {
		eSet(EnginePackage.Literals.CMD_PIPE__RX, newRx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Event> getEvents() {
		return (List<Event>)eGet(EnginePackage.Literals.CMD_PIPE__EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		return (Port)eGet(EnginePackage.Literals.CMD_PIPE__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		eSet(EnginePackage.Literals.CMD_PIPE__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IXFrameInterpreter getInputInterpreter() {
		return (IXFrameInterpreter)eGet(EnginePackage.Literals.CMD_PIPE__INPUT_INTERPRETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputInterpreter(IXFrameInterpreter newInputInterpreter) {
		eSet(EnginePackage.Literals.CMD_PIPE__INPUT_INTERPRETER, newInputInterpreter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecording() {
		return (Boolean)eGet(EnginePackage.Literals.CMD_PIPE__RECORDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecording(boolean newRecording) {
		eSet(EnginePackage.Literals.CMD_PIPE__RECORDING, newRecording);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTriggers() {
		return (Trigger)eGet(EnginePackage.Literals.CMD_PIPE__TRIGGERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggers(Trigger newTriggers) {
		eSet(EnginePackage.Literals.CMD_PIPE__TRIGGERS, newTriggers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Cmd> getCommandPool() {
		return (List<Cmd>)eGet(EnginePackage.Literals.CMD_PIPE__COMMAND_POOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IXCmdInterpreter getOutputInterpreter() {
		return (IXCmdInterpreter)eGet(EnginePackage.Literals.CMD_PIPE__OUTPUT_INTERPRETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputInterpreter(IXCmdInterpreter newOutputInterpreter) {
		eSet(EnginePackage.Literals.CMD_PIPE__OUTPUT_INTERPRETER, newOutputInterpreter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initCmdPool() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addQxEventHandler(IQxEventHandler handler) {
		for (Adapter adapter : eAdapters()) {
			if (adapter instanceof QxEventAdapterImpl) {
				if (!((QxEventAdapterImpl)adapter).getEvtHandlers().contains(handler)) {
					((QxEventAdapterImpl)adapter).getEvtHandlers().add(handler);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeQxEventHandler(IQxEventHandler handler) {
		for (Adapter adapter : eAdapters()) {
			if (adapter instanceof QxEventAdapterImpl) {
				if (((QxEventAdapterImpl)adapter).getEvtHandlers().contains(handler)) {
					((QxEventAdapterImpl)adapter).getEvtHandlers().remove(handler);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void activateAll() {
		setActivated(true);
		Port commPort = getPort();
		if (commPort instanceof Port) {
			commPort.getChannel();
		}
        for (Adapter a : eAdapters()) {
        	if (a instanceof QxEventAdapterImpl) {
        		((QxEventAdapterImpl)a).activate();
        	}
        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deactivateAll() {
		setActivated(false);
		Port commPort = getPort();
		if (commPort instanceof Port) {
			commPort.getChannel();
		}
	    for (Adapter a : eAdapters()) {
	       	if (a instanceof QxEventAdapterImpl) {
	       		((QxEventAdapterImpl)a).deactivate();
	       	}
	    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void activateQxEventHandler(IQxEventHandler qxEvtHandler) {
		for (Adapter adapter : eAdapters()) {
			if (adapter instanceof QxEventAdapterImpl) {
				if (adapter == qxEvtHandler) {
					((QxEventAdapterImpl) adapter).activate();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deactivateQxEventHandler(IQxEventHandler qxEvtHandler) {
		for (Adapter adapter : eAdapters()) {
			if (adapter instanceof QxEventAdapterImpl) {
				if (adapter == qxEvtHandler) {
					((QxEventAdapterImpl) adapter).deactivate();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void activateEngine(String engineID) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deactivateEngine(String engineID) {
		// skip comm data
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receive(byte[] stream) {
		if (getInputInterpreter() != null) {
			EngineUtil.INSTANCE.sendCmd(
				getRx(),
				getInputInterpreter().byteArray2Cmd(stream)
			);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void send(Cmd cmd) {
		EngineUtil.INSTANCE.sendCmd(getTx(), cmd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Cmd send(Cmd cmd, SynchronousQxEventHandler handler) {
		send(cmd);
		try {
			Thread.sleep(75);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Cmd c = null;
		if (handler != null && handler.getLastRcvEvent() != null) {
			c = handler.getLastRcvEvent().getCmd();
			handler.setLastRcvEvent(null);
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnect(String portID, int acceptedPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTrigger() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public synchronized void finalize() {
		stop();
		if (getPort() instanceof Port) {
			getPort().finalize();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void start() {
		if (getPort() instanceof Port) {
			getPort().start();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void startInput() {
		if (getPort() instanceof Port) {
			getPort().startInput();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void startOutput() {
		if (getPort() instanceof Port) {
			for (OutputJob oJob : getPort().getOutputJobs()) {
				oJob.start();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void stop() {
		if (getPort() instanceof Port) {
			getPort().stop();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void stopInput() {
		if (getPort() instanceof Port) {
			for (InputJob iJob : getPort().getInputJobs()) {
				iJob.start();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void stopOutput() {
		if (getPort() instanceof Port) {
			getPort().stopOutput();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void send(Cmd cmd, long delay) {
		send(cmd);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void receive(byte[] frame, long delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		receive(frame);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Cmd syncSend(Cmd cmd) {
		return EngineUtil.INSTANCE.syncSend(
			cmd, 
			getTx()
		);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TimeoutException 
	 * @generated NOT
	 */
	public Cmd syncSend(Cmd cmd, long timeout) {
		return EngineUtil.INSTANCE.syncSend(
			cmd, 
			getTx(),
			timeout
		);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void send(byte[] message) {
		send(
			CmdUtil.INSTANCE.createByteCmd(message)
		);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return (String)eGet(EnginePackage.Literals.CMD_PIPE__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		eSet(EnginePackage.Literals.CMD_PIPE__ADDR, newAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Integer> getPorts() {
		return (List<Integer>)eGet(EnginePackage.Literals.CMD_PIPE__PORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransportProtocol() {
		return (String)eGet(EnginePackage.Literals.CMD_PIPE__TRANSPORT_PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportProtocol(String newTransportProtocol) {
		eSet(EnginePackage.Literals.CMD_PIPE__TRANSPORT_PROTOCOL, newTransportProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunicationProtocol() {
		return (String)eGet(EnginePackage.Literals.CMD_PIPE__COMMUNICATION_PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationProtocol(String newCommunicationProtocol) {
		eSet(EnginePackage.Literals.CMD_PIPE__COMMUNICATION_PROTOCOL, newCommunicationProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Event> getTxEvents() {
		return (List<Event>)eGet(EnginePackage.Literals.CMD_PIPE__TX_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Event> getRxEvents() {
		return (List<Event>)eGet(EnginePackage.Literals.CMD_PIPE__RX_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return (Integer)eGet(EnginePackage.Literals.CMD_PIPE__SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		eSet(EnginePackage.Literals.CMD_PIPE__SPEED, newSpeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivated() {
		return (Boolean)eGet(EnginePackage.Literals.CMD_PIPE__ACTIVATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivated(boolean newActivated) {
		eSet(EnginePackage.Literals.CMD_PIPE__ACTIVATED, newActivated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocked() {
		return (Boolean)eGet(EnginePackage.Literals.CMD_PIPE__LOCKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked) {
		eSet(EnginePackage.Literals.CMD_PIPE__LOCKED, newLocked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopic() {
		return (String)eGet(EnginePackage.Literals.CMD_PIPE__TOPIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(String newTopic) {
		eSet(EnginePackage.Literals.CMD_PIPE__TOPIC, newTopic);
	}

} //CmdPipeImpl
