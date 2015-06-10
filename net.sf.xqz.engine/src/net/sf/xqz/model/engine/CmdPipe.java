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

package net.sf.xqz.model.engine;

import java.util.List;

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.PRIORITY;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getQueues <em>Queues</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getClient <em>Client</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getApplication <em>Application</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getPriority <em>Priority</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getTx <em>Tx</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getRx <em>Rx</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getCommandPool <em>Command Pool</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getOutputInterpreter <em>Output Interpreter</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getInputInterpreter <em>Input Interpreter</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#isRecording <em>Recording</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getPorts <em>Ports</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getTransportProtocol <em>Transport Protocol</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getCommunicationProtocol <em>Communication Protocol</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getTxEvents <em>Tx Events</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getRxEvents <em>Rx Events</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#isActivated <em>Activated</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#isLocked <em>Locked</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.CmdPipe#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe()
 * @model
 * @generated
 */
public interface CmdPipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Queues</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.Qx}.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.engine.Qx#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queues</em>' containment reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Queues()
	 * @see net.sf.xqz.model.engine.Qx#getEngine
	 * @model opposite="engine" containment="true"
	 * @generated
	 */
	List<Qx> getQueues();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.engine.EngineClient#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(EngineClient)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Client()
	 * @see net.sf.xqz.model.engine.EngineClient#getEngines
	 * @model opposite="engines"
	 * @generated
	 */
	EngineClient getClient();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(EngineClient value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.engine.EngineApplication#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(EngineApplication)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Application()
	 * @see net.sf.xqz.model.engine.EngineApplication#getEngine
	 * @model opposite="engine" transient="false"
	 * @generated
	 */
	EngineApplication getApplication();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(EngineApplication value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.xqz.model.cmd.PRIORITY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see net.sf.xqz.model.cmd.PRIORITY
	 * @see #setPriority(PRIORITY)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Priority()
	 * @model
	 * @generated
	 */
	PRIORITY getPriority();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see net.sf.xqz.model.cmd.PRIORITY
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PRIORITY value);

	/**
	 * Returns the value of the '<em><b>Tx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx</em>' reference.
	 * @see #setTx(Tx)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Tx()
	 * @model
	 * @generated
	 */
	Tx getTx();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getTx <em>Tx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx</em>' reference.
	 * @see #getTx()
	 * @generated
	 */
	void setTx(Tx value);

	/**
	 * Returns the value of the '<em><b>Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx</em>' reference.
	 * @see #setRx(Rx)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Rx()
	 * @model
	 * @generated
	 */
	Rx getRx();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getRx <em>Rx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx</em>' reference.
	 * @see #getRx()
	 * @generated
	 */
	void setRx(Rx value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Events()
	 * @model containment="true" transient="true" volatile="true"
	 * @generated
	 */
	List<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Input Interpreter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Interpreter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Interpreter</em>' reference.
	 * @see #setInputInterpreter(IXFrameInterpreter)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_InputInterpreter()
	 * @model
	 * @generated
	 */
	IXFrameInterpreter getInputInterpreter();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getInputInterpreter <em>Input Interpreter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Interpreter</em>' reference.
	 * @see #getInputInterpreter()
	 * @generated
	 */
	void setInputInterpreter(IXFrameInterpreter value);

	/**
	 * Returns the value of the '<em><b>Recording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording</em>' attribute.
	 * @see #setRecording(boolean)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Recording()
	 * @model
	 * @generated
	 */
	boolean isRecording();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#isRecording <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording</em>' attribute.
	 * @see #isRecording()
	 * @generated
	 */
	void setRecording(boolean value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference.
	 * @see #setTriggers(Trigger)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	Trigger getTriggers();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getTriggers <em>Triggers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' containment reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Trigger value);

	/**
	 * Returns the value of the '<em><b>Command Pool</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.cmd.Cmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Pool</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Pool</em>' containment reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_CommandPool()
	 * @model containment="true"
	 * @generated
	 */
	List<Cmd> getCommandPool();

	/**
	 * Returns the value of the '<em><b>Output Interpreter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Interpreter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Interpreter</em>' reference.
	 * @see #setOutputInterpreter(IXCmdInterpreter)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_OutputInterpreter()
	 * @model
	 * @generated
	 */
	IXCmdInterpreter getOutputInterpreter();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getOutputInterpreter <em>Output Interpreter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Interpreter</em>' reference.
	 * @see #getOutputInterpreter()
	 * @generated
	 */
	void setOutputInterpreter(IXCmdInterpreter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initCmdPool();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addQxEventHandler(IQxEventHandler handler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeQxEventHandler(IQxEventHandler handler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void activateAll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deactivateAll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void activateQxEventHandler(IQxEventHandler qxEvtHandler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deactivateQxEventHandler(IQxEventHandler qxEvtHandler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void activateEngine(String engineID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deactivateEngine(String engineID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receive(byte[] stream);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send(Cmd cmd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cmd send(Cmd cmd, SynchronousQxEventHandler handler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reconnect(String portID, int acceptedPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTrigger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finalize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stopInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stopOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send(Cmd cmd, long delay);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receive(byte[] frame, long delay);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cmd syncSend(Cmd cmd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cmd syncSend(Cmd cmd, long timeout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send(byte[] message);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(String)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Addr()
	 * @model
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Ports()
	 * @model
	 * @generated
	 */
	List<Integer> getPorts();

	/**
	 * Returns the value of the '<em><b>Transport Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Protocol</em>' attribute.
	 * @see #setTransportProtocol(String)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_TransportProtocol()
	 * @model
	 * @generated
	 */
	String getTransportProtocol();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getTransportProtocol <em>Transport Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Protocol</em>' attribute.
	 * @see #getTransportProtocol()
	 * @generated
	 */
	void setTransportProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Communication Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Protocol</em>' attribute.
	 * @see #setCommunicationProtocol(String)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_CommunicationProtocol()
	 * @model
	 * @generated
	 */
	String getCommunicationProtocol();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getCommunicationProtocol <em>Communication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Protocol</em>' attribute.
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	void setCommunicationProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Tx Events</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Events</em>' containment reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_TxEvents()
	 * @model containment="true"
	 * @generated
	 */
	List<Event> getTxEvents();

	/**
	 * Returns the value of the '<em><b>Rx Events</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx Events</em>' containment reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_RxEvents()
	 * @model containment="true"
	 * @generated
	 */
	List<Event> getRxEvents();

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Speed()
	 * @model
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Activated()
	 * @model default="true"
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see net.sf.xqz.model.engine.EnginePackage#getCmdPipe_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.CmdPipe#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

} // CmdEngine
