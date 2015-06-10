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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.xqz.model.engine.EngineFactory
 * @model kind="package"
 * @generated
 */
public interface EnginePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.sf.xqz/engine/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnginePackage eINSTANCE = net.sf.xqz.model.engine.impl.EnginePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.QxImpl <em>Qx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.QxImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getQx()
	 * @generated
	 */
	int QX = 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__ENGINE = 1;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__LOCKED = 2;

	/**
	 * The feature id for the '<em><b>Current Max Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__CURRENT_MAX_PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__TTL = 4;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__THRESHOLD = 5;

	/**
	 * The feature id for the '<em><b>Time Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__TIME_RANGE = 6;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__STRATEGY = 7;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX__MAX = 8;

	/**
	 * The number of structural features of the '<em>Qx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.TxImpl <em>Tx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.TxImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getTx()
	 * @generated
	 */
	int TX = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__COMMANDS = QX__COMMANDS;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__ENGINE = QX__ENGINE;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__LOCKED = QX__LOCKED;

	/**
	 * The feature id for the '<em><b>Current Max Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__CURRENT_MAX_PRIORITY = QX__CURRENT_MAX_PRIORITY;

	/**
	 * The feature id for the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__TTL = QX__TTL;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__THRESHOLD = QX__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Time Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__TIME_RANGE = QX__TIME_RANGE;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__STRATEGY = QX__STRATEGY;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX__MAX = QX__MAX;

	/**
	 * The number of structural features of the '<em>Tx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_FEATURE_COUNT = QX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.RxImpl <em>Rx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.RxImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getRx()
	 * @generated
	 */
	int RX = 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__COMMANDS = QX__COMMANDS;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__ENGINE = QX__ENGINE;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__LOCKED = QX__LOCKED;

	/**
	 * The feature id for the '<em><b>Current Max Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__CURRENT_MAX_PRIORITY = QX__CURRENT_MAX_PRIORITY;

	/**
	 * The feature id for the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__TTL = QX__TTL;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__THRESHOLD = QX__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Time Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__TIME_RANGE = QX__TIME_RANGE;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__STRATEGY = QX__STRATEGY;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX__MAX = QX__MAX;

	/**
	 * The number of structural features of the '<em>Rx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_FEATURE_COUNT = QX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.CmdPipeImpl <em>Cmd Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.CmdPipeImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getCmdPipe()
	 * @generated
	 */
	int CMD_PIPE = 3;

	/**
	 * The feature id for the '<em><b>Queues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__QUEUES = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__TX = 6;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__RX = 7;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__EVENTS = 8;

	/**
	 * The feature id for the '<em><b>Command Pool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__COMMAND_POOL = 9;

	/**
	 * The feature id for the '<em><b>Output Interpreter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__OUTPUT_INTERPRETER = 10;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__PORT = 11;

	/**
	 * The feature id for the '<em><b>Input Interpreter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__INPUT_INTERPRETER = 12;

	/**
	 * The feature id for the '<em><b>Recording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__RECORDING = 13;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__TRIGGERS = 14;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__ADDR = 15;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__PORTS = 16;

	/**
	 * The feature id for the '<em><b>Transport Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__TRANSPORT_PROTOCOL = 17;

	/**
	 * The feature id for the '<em><b>Communication Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__COMMUNICATION_PROTOCOL = 18;

	/**
	 * The feature id for the '<em><b>Tx Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__TX_EVENTS = 19;

	/**
	 * The feature id for the '<em><b>Rx Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__RX_EVENTS = 20;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__SPEED = 21;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__ACTIVATED = 22;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__LOCKED = 23;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE__TOPIC = 24;

	/**
	 * The number of structural features of the '<em>Cmd Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PIPE_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.EngineClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.EngineClientImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEngineClient()
	 * @generated
	 */
	int ENGINE_CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_CLIENT__ENGINES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_CLIENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_CLIENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_CLIENT__APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_CLIENT__RUNNER = 4;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_CLIENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.EngineApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.EngineApplicationImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEngineApplication()
	 * @generated
	 */
	int ENGINE_APPLICATION = 5;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.EventImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.EVENT_KIND <em>EVENT KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.EVENT_KIND
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEVENT_KIND()
	 * @generated
	 */
	int EVENT_KIND = 27;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.QxProcessingStrategy <em>Qx Processing Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.QxProcessingStrategy
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getQxProcessingStrategy()
	 * @generated
	 */
	int QX_PROCESSING_STRATEGY = 28;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.TriggerKind <em>Trigger Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.TriggerKind
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getTriggerKind()
	 * @generated
	 */
	int TRIGGER_KIND = 29;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.IXCmdInterpreter <em>IX Cmd Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.IXCmdInterpreter
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIXCmdInterpreter()
	 * @generated
	 */
	int IX_CMD_INTERPRETER = 7;


	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl <em>Abstract Cmd Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractCmdInterpreter()
	 * @generated
	 */
	int ABSTRACT_CMD_INTERPRETER = 8;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.IQxEventHandler <em>IQx Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.IQxEventHandler
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIQxEventHandler()
	 * @generated
	 */
	int IQX_EVENT_HANDLER = 9;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.IQxEventNotifier <em>IQx Event Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.IQxEventNotifier
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIQxEventNotifier()
	 * @generated
	 */
	int IQX_EVENT_NOTIFIER = 10;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl <em>Abstract Qx Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractQxEventHandler()
	 * @generated
	 */
	int ABSTRACT_QX_EVENT_HANDLER = 11;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.AbstractQxEventNotifierImpl <em>Abstract Qx Event Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.AbstractQxEventNotifierImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractQxEventNotifier()
	 * @generated
	 */
	int ABSTRACT_QX_EVENT_NOTIFIER = 12;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.PortImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 13;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.IXFrameInterpreterImpl <em>IX Frame Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.IXFrameInterpreterImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIXFrameInterpreter()
	 * @generated
	 */
	int IX_FRAME_INTERPRETER = 14;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl <em>Abstract Frame Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractFrameInterpreter()
	 * @generated
	 */
	int ABSTRACT_FRAME_INTERPRETER = 15;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.ICmdEngineAction <em>ICmd Engine Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.ICmdEngineAction
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getICmdEngineAction()
	 * @generated
	 */
	int ICMD_ENGINE_ACTION = 16;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.AbstractCmdEngineActionImpl <em>Abstract Cmd Engine Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.AbstractCmdEngineActionImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractCmdEngineAction()
	 * @generated
	 */
	int ABSTRACT_CMD_ENGINE_ACTION = 17;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.CmdEngineActionArgImpl <em>Cmd Engine Action Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.CmdEngineActionArgImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getCmdEngineActionArg()
	 * @generated
	 */
	int CMD_ENGINE_ACTION_ARG = 18;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.QxTimeRangeImpl <em>Qx Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.QxTimeRangeImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getQxTimeRange()
	 * @generated
	 */
	int QX_TIME_RANGE = 19;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.IOJobImpl <em>IO Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.IOJobImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIOJob()
	 * @generated
	 */
	int IO_JOB = 24;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.InputJobImpl <em>Input Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.InputJobImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getInputJob()
	 * @generated
	 */
	int INPUT_JOB = 20;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.OutputJobImpl <em>Output Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.OutputJobImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getOutputJob()
	 * @generated
	 */
	int OUTPUT_JOB = 21;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIConnectedUnit()
	 * @generated
	 */
	int ICONNECTED_UNIT = 22;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONNECTED_UNIT__ENGINES = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONNECTED_UNIT__DEFAULT = 1;

	/**
	 * The number of structural features of the '<em>IConnected Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONNECTED_UNIT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_APPLICATION__ENGINES = ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_APPLICATION__DEFAULT = ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_APPLICATION__ENGINE = ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_APPLICATION__CLIENTS = ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_APPLICATION__ID = ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_APPLICATION__NAME = ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_APPLICATION_FEATURE_COUNT = ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KIND = 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CMD = 1;

	/**
	 * The feature id for the '<em><b>Qx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__QX = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = 3;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BYTES = 4;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TOPIC = 5;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IX_CMD_INTERPRETER__ID = 0;

	/**
	 * The number of structural features of the '<em>IX Cmd Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IX_CMD_INTERPRETER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CMD_INTERPRETER__ID = IX_CMD_INTERPRETER__ID;

	/**
	 * The number of structural features of the '<em>Abstract Cmd Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CMD_INTERPRETER_FEATURE_COUNT = IX_CMD_INTERPRETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQX_EVENT_HANDLER__ID = 0;

	/**
	 * The number of structural features of the '<em>IQx Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQX_EVENT_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQX_EVENT_NOTIFIER__ID = 0;

	/**
	 * The number of structural features of the '<em>IQx Event Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQX_EVENT_NOTIFIER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QX_EVENT_HANDLER__ID = IQX_EVENT_HANDLER__ID;

	/**
	 * The number of structural features of the '<em>Abstract Qx Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QX_EVENT_HANDLER_FEATURE_COUNT = IQX_EVENT_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QX_EVENT_NOTIFIER__ID = IQX_EVENT_NOTIFIER__ID;

	/**
	 * The number of structural features of the '<em>Abstract Qx Event Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QX_EVENT_NOTIFIER_FEATURE_COUNT = IQX_EVENT_NOTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ENGINE = 0;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INPUT_JOBS = 1;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OUTPUT_JOBS = 2;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CHANNEL = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IX_FRAME_INTERPRETER__ID = 0;

	/**
	 * The number of structural features of the '<em>IX Frame Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IX_FRAME_INTERPRETER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME_INTERPRETER__ID = IX_FRAME_INTERPRETER__ID;

	/**
	 * The number of structural features of the '<em>Abstract Frame Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME_INTERPRETER_FEATURE_COUNT = IX_FRAME_INTERPRETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ICmd Engine Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICMD_ENGINE_ACTION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CMD_ENGINE_ACTION__ID = ICMD_ENGINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CMD_ENGINE_ACTION__ARGS = ICMD_ENGINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Cmd Engine Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CMD_ENGINE_ACTION_FEATURE_COUNT = ICMD_ENGINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_ENGINE_ACTION_ARG__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_ENGINE_ACTION_ARG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Cmd Engine Action Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_ENGINE_ACTION_ARG_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX_TIME_RANGE__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX_TIME_RANGE__END = 1;

	/**
	 * The number of structural features of the '<em>Qx Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QX_TIME_RANGE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_JOB__ID = 0;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_JOB__JOB = 1;

	/**
	 * The number of structural features of the '<em>IO Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_JOB_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_JOB__ID = IO_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_JOB__JOB = IO_JOB__JOB;

	/**
	 * The number of structural features of the '<em>Input Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_JOB_FEATURE_COUNT = IO_JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_JOB__ID = IO_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_JOB__JOB = IO_JOB__JOB;

	/**
	 * The number of structural features of the '<em>Output Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_JOB_FEATURE_COUNT = IO_JOB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.TriggerImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 23;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__KIND = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.SynchronousQxEventHandlerImpl <em>Synchronous Qx Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.SynchronousQxEventHandlerImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getSynchronousQxEventHandler()
	 * @generated
	 */
	int SYNCHRONOUS_QX_EVENT_HANDLER = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_QX_EVENT_HANDLER__ID = ABSTRACT_QX_EVENT_HANDLER__ID;

	/**
	 * The number of structural features of the '<em>Synchronous Qx Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_QX_EVENT_HANDLER_FEATURE_COUNT = ABSTRACT_QX_EVENT_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.engine.impl.IChannelImpl <em>IChannel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.engine.impl.IChannelImpl
	 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIChannel()
	 * @generated
	 */
	int ICHANNEL = 26;

	/**
	 * The feature id for the '<em><b>Cmd Interpretrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHANNEL__CMD_INTERPRETRERS = 0;

	/**
	 * The feature id for the '<em><b>Frame Interpreters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHANNEL__FRAME_INTERPRETERS = 1;

	/**
	 * The feature id for the '<em><b>Event Listeners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHANNEL__EVENT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Last Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHANNEL__LAST_FRAME = 3;

	/**
	 * The number of structural features of the '<em>IChannel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHANNEL_FEATURE_COUNT = 4;

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.Tx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tx</em>'.
	 * @see net.sf.xqz.model.engine.Tx
	 * @generated
	 */
	EClass getTx();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.Rx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rx</em>'.
	 * @see net.sf.xqz.model.engine.Rx
	 * @generated
	 */
	EClass getRx();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.Qx <em>Qx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qx</em>'.
	 * @see net.sf.xqz.model.engine.Qx
	 * @generated
	 */
	EClass getQx();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.Qx#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getCommands()
	 * @see #getQx()
	 * @generated
	 */
	EReference getQx_Commands();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.xqz.model.engine.Qx#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Engine</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getEngine()
	 * @see #getQx()
	 * @generated
	 */
	EReference getQx_Engine();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Qx#getCurrentMaxPriority <em>Current Max Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Max Priority</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getCurrentMaxPriority()
	 * @see #getQx()
	 * @generated
	 */
	EAttribute getQx_CurrentMaxPriority();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Qx#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see net.sf.xqz.model.engine.Qx#isLocked()
	 * @see #getQx()
	 * @generated
	 */
	EAttribute getQx_Locked();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Qx#getTtl <em>Ttl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ttl</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getTtl()
	 * @see #getQx()
	 * @generated
	 */
	EAttribute getQx_Ttl();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Qx#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getThreshold()
	 * @see #getQx()
	 * @generated
	 */
	EAttribute getQx_Threshold();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.Qx#getTimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Range</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getTimeRange()
	 * @see #getQx()
	 * @generated
	 */
	EReference getQx_TimeRange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Qx#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getStrategy()
	 * @see #getQx()
	 * @generated
	 */
	EAttribute getQx_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Qx#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see net.sf.xqz.model.engine.Qx#getMax()
	 * @see #getQx()
	 * @generated
	 */
	EAttribute getQx_Max();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.CmdPipe <em>Cmd Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Pipe</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe
	 * @generated
	 */
	EClass getCmdPipe();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.CmdPipe#getQueues <em>Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queues</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getQueues()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Queues();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.CmdPipe#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getClient()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Client();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.xqz.model.engine.CmdPipe#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getApplication()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Application();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getId()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getName()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getPriority()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Priority();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.CmdPipe#getTx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tx</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getTx()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Tx();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.CmdPipe#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rx</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getRx()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Rx();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.CmdPipe#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getEvents()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.CmdPipe#getCommandPool <em>Command Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command Pool</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getCommandPool()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_CommandPool();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.CmdPipe#getOutputInterpreter <em>Output Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Interpreter</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getOutputInterpreter()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_OutputInterpreter();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.CmdPipe#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getPort()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Port();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.CmdPipe#getInputInterpreter <em>Input Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Interpreter</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getInputInterpreter()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_InputInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#isRecording <em>Recording</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#isRecording()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Recording();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.xqz.model.engine.CmdPipe#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triggers</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getTriggers()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_Triggers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getAddr()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Addr();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.xqz.model.engine.CmdPipe#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getPorts()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Ports();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getTransportProtocol <em>Transport Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Protocol</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getTransportProtocol()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_TransportProtocol();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getCommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Protocol</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getCommunicationProtocol()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_CommunicationProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.CmdPipe#getTxEvents <em>Tx Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tx Events</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getTxEvents()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_TxEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.CmdPipe#getRxEvents <em>Rx Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rx Events</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getRxEvents()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EReference getCmdPipe_RxEvents();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getSpeed()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#isActivated()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Activated();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#isLocked()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Locked();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdPipe#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see net.sf.xqz.model.engine.CmdPipe#getTopic()
	 * @see #getCmdPipe()
	 * @generated
	 */
	EAttribute getCmdPipe_Topic();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.EngineClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see net.sf.xqz.model.engine.EngineClient
	 * @generated
	 */
	EClass getEngineClient();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.EngineClient#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Engines</em>'.
	 * @see net.sf.xqz.model.engine.EngineClient#getEngines()
	 * @see #getEngineClient()
	 * @generated
	 */
	EReference getEngineClient_Engines();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.EngineClient#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.engine.EngineClient#getId()
	 * @see #getEngineClient()
	 * @generated
	 */
	EAttribute getEngineClient_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.EngineClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.xqz.model.engine.EngineClient#getName()
	 * @see #getEngineClient()
	 * @generated
	 */
	EAttribute getEngineClient_Name();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.xqz.model.engine.EngineClient#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see net.sf.xqz.model.engine.EngineClient#getApplication()
	 * @see #getEngineClient()
	 * @generated
	 */
	EReference getEngineClient_Application();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.EngineClient#getRunner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runner</em>'.
	 * @see net.sf.xqz.model.engine.EngineClient#getRunner()
	 * @see #getEngineClient()
	 * @generated
	 */
	EAttribute getEngineClient_Runner();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.EngineApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see net.sf.xqz.model.engine.EngineApplication
	 * @generated
	 */
	EClass getEngineApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.EngineApplication#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engine</em>'.
	 * @see net.sf.xqz.model.engine.EngineApplication#getEngine()
	 * @see #getEngineApplication()
	 * @generated
	 */
	EReference getEngineApplication_Engine();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.EngineApplication#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see net.sf.xqz.model.engine.EngineApplication#getClients()
	 * @see #getEngineApplication()
	 * @generated
	 */
	EReference getEngineApplication_Clients();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.EngineApplication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.engine.EngineApplication#getId()
	 * @see #getEngineApplication()
	 * @generated
	 */
	EAttribute getEngineApplication_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.EngineApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.xqz.model.engine.EngineApplication#getName()
	 * @see #getEngineApplication()
	 * @generated
	 */
	EAttribute getEngineApplication_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see net.sf.xqz.model.engine.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Event#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.xqz.model.engine.Event#getKind()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Kind();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.Event#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cmd</em>'.
	 * @see net.sf.xqz.model.engine.Event#getCmd()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Cmd();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.Event#getQx <em>Qx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qx</em>'.
	 * @see net.sf.xqz.model.engine.Event#getQx()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Qx();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.xqz.model.engine.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Event#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see net.sf.xqz.model.engine.Event#getBytes()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Event#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see net.sf.xqz.model.engine.Event#getTopic()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Topic();

	/**
	 * Returns the meta object for enum '{@link net.sf.xqz.model.engine.EVENT_KIND <em>EVENT KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVENT KIND</em>'.
	 * @see net.sf.xqz.model.engine.EVENT_KIND
	 * @generated
	 */
	EEnum getEVENT_KIND();

	/**
	 * Returns the meta object for enum '{@link net.sf.xqz.model.engine.QxProcessingStrategy <em>Qx Processing Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qx Processing Strategy</em>'.
	 * @see net.sf.xqz.model.engine.QxProcessingStrategy
	 * @generated
	 */
	EEnum getQxProcessingStrategy();

	/**
	 * Returns the meta object for enum '{@link net.sf.xqz.model.engine.TriggerKind <em>Trigger Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Kind</em>'.
	 * @see net.sf.xqz.model.engine.TriggerKind
	 * @generated
	 */
	EEnum getTriggerKind();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.IXCmdInterpreter <em>IX Cmd Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IX Cmd Interpreter</em>'.
	 * @see net.sf.xqz.model.engine.IXCmdInterpreter
	 * @generated
	 */
	EClass getIXCmdInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.IXCmdInterpreter#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.xqz.model.engine.IXCmdInterpreter#getID()
	 * @see #getIXCmdInterpreter()
	 * @generated
	 */
	EAttribute getIXCmdInterpreter_ID();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.AbstractCmdInterpreter <em>Abstract Cmd Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cmd Interpreter</em>'.
	 * @see net.sf.xqz.model.engine.AbstractCmdInterpreter
	 * @generated
	 */
	EClass getAbstractCmdInterpreter();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.IQxEventHandler <em>IQx Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IQx Event Handler</em>'.
	 * @see net.sf.xqz.model.engine.IQxEventHandler
	 * @generated
	 */
	EClass getIQxEventHandler();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.IQxEventHandler#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.xqz.model.engine.IQxEventHandler#getID()
	 * @see #getIQxEventHandler()
	 * @generated
	 */
	EAttribute getIQxEventHandler_ID();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.IQxEventNotifier <em>IQx Event Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IQx Event Notifier</em>'.
	 * @see net.sf.xqz.model.engine.IQxEventNotifier
	 * @generated
	 */
	EClass getIQxEventNotifier();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.IQxEventNotifier#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.xqz.model.engine.IQxEventNotifier#getID()
	 * @see #getIQxEventNotifier()
	 * @generated
	 */
	EAttribute getIQxEventNotifier_ID();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.AbstractQxEventHandler <em>Abstract Qx Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Qx Event Handler</em>'.
	 * @see net.sf.xqz.model.engine.AbstractQxEventHandler
	 * @generated
	 */
	EClass getAbstractQxEventHandler();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.AbstractQxEventNotifier <em>Abstract Qx Event Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Qx Event Notifier</em>'.
	 * @see net.sf.xqz.model.engine.AbstractQxEventNotifier
	 * @generated
	 */
	EClass getAbstractQxEventNotifier();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see net.sf.xqz.model.engine.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.Port#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see net.sf.xqz.model.engine.Port#getChannel()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Channel();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.Port#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine</em>'.
	 * @see net.sf.xqz.model.engine.Port#getEngine()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Engine();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.Port#getInputJobs <em>Input Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Jobs</em>'.
	 * @see net.sf.xqz.model.engine.Port#getInputJobs()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_InputJobs();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.engine.Port#getOutputJobs <em>Output Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Jobs</em>'.
	 * @see net.sf.xqz.model.engine.Port#getOutputJobs()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_OutputJobs();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.IXFrameInterpreter <em>IX Frame Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IX Frame Interpreter</em>'.
	 * @see net.sf.xqz.model.engine.IXFrameInterpreter
	 * @generated
	 */
	EClass getIXFrameInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.IXFrameInterpreter#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.xqz.model.engine.IXFrameInterpreter#getID()
	 * @see #getIXFrameInterpreter()
	 * @generated
	 */
	EAttribute getIXFrameInterpreter_ID();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.AbstractFrameInterpreter <em>Abstract Frame Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Frame Interpreter</em>'.
	 * @see net.sf.xqz.model.engine.AbstractFrameInterpreter
	 * @generated
	 */
	EClass getAbstractFrameInterpreter();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.ICmdEngineAction <em>ICmd Engine Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICmd Engine Action</em>'.
	 * @see net.sf.xqz.model.engine.ICmdEngineAction
	 * @generated
	 */
	EClass getICmdEngineAction();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.AbstractCmdEngineAction <em>Abstract Cmd Engine Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cmd Engine Action</em>'.
	 * @see net.sf.xqz.model.engine.AbstractCmdEngineAction
	 * @generated
	 */
	EClass getAbstractCmdEngineAction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.AbstractCmdEngineAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.engine.AbstractCmdEngineAction#getId()
	 * @see #getAbstractCmdEngineAction()
	 * @generated
	 */
	EAttribute getAbstractCmdEngineAction_Id();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.AbstractCmdEngineAction#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Args</em>'.
	 * @see net.sf.xqz.model.engine.AbstractCmdEngineAction#getArgs()
	 * @see #getAbstractCmdEngineAction()
	 * @generated
	 */
	EReference getAbstractCmdEngineAction_Args();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.CmdEngineActionArg <em>Cmd Engine Action Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Engine Action Arg</em>'.
	 * @see net.sf.xqz.model.engine.CmdEngineActionArg
	 * @generated
	 */
	EClass getCmdEngineActionArg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdEngineActionArg#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.engine.CmdEngineActionArg#getId()
	 * @see #getCmdEngineActionArg()
	 * @generated
	 */
	EAttribute getCmdEngineActionArg_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.CmdEngineActionArg#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.xqz.model.engine.CmdEngineActionArg#getValue()
	 * @see #getCmdEngineActionArg()
	 * @generated
	 */
	EAttribute getCmdEngineActionArg_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.QxTimeRange <em>Qx Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qx Time Range</em>'.
	 * @see net.sf.xqz.model.engine.QxTimeRange
	 * @generated
	 */
	EClass getQxTimeRange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.QxTimeRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.sf.xqz.model.engine.QxTimeRange#getStart()
	 * @see #getQxTimeRange()
	 * @generated
	 */
	EAttribute getQxTimeRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.QxTimeRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see net.sf.xqz.model.engine.QxTimeRange#getEnd()
	 * @see #getQxTimeRange()
	 * @generated
	 */
	EAttribute getQxTimeRange_End();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.InputJob <em>Input Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Job</em>'.
	 * @see net.sf.xqz.model.engine.InputJob
	 * @generated
	 */
	EClass getInputJob();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.OutputJob <em>Output Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Job</em>'.
	 * @see net.sf.xqz.model.engine.OutputJob
	 * @generated
	 */
	EClass getOutputJob();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IConnected Unit</em>'.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	EClass getIConnectedUnit();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.IConnectedUnit#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Engines</em>'.
	 * @see net.sf.xqz.model.engine.IConnectedUnit#getEngines()
	 * @see #getIConnectedUnit()
	 * @generated
	 */
	EReference getIConnectedUnit_Engines();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.engine.IConnectedUnit#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see net.sf.xqz.model.engine.IConnectedUnit#getDefault()
	 * @see #getIConnectedUnit()
	 * @generated
	 */
	EReference getIConnectedUnit_Default();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see net.sf.xqz.model.engine.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.Trigger#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.xqz.model.engine.Trigger#getKind()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Kind();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.Trigger#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see net.sf.xqz.model.engine.Trigger#getTarget()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.IOJob <em>IO Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Job</em>'.
	 * @see net.sf.xqz.model.engine.IOJob
	 * @generated
	 */
	EClass getIOJob();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.IOJob#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.engine.IOJob#getId()
	 * @see #getIOJob()
	 * @generated
	 */
	EAttribute getIOJob_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.IOJob#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job</em>'.
	 * @see net.sf.xqz.model.engine.IOJob#getJob()
	 * @see #getIOJob()
	 * @generated
	 */
	EAttribute getIOJob_Job();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.SynchronousQxEventHandler <em>Synchronous Qx Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Qx Event Handler</em>'.
	 * @see net.sf.xqz.model.engine.SynchronousQxEventHandler
	 * @generated
	 */
	EClass getSynchronousQxEventHandler();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.engine.IChannel <em>IChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IChannel</em>'.
	 * @see net.sf.xqz.model.engine.IChannel
	 * @generated
	 */
	EClass getIChannel();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.IChannel#getCmdInterpretrers <em>Cmd Interpretrers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cmd Interpretrers</em>'.
	 * @see net.sf.xqz.model.engine.IChannel#getCmdInterpretrers()
	 * @see #getIChannel()
	 * @generated
	 */
	EReference getIChannel_CmdInterpretrers();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.IChannel#getFrameInterpreters <em>Frame Interpreters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Frame Interpreters</em>'.
	 * @see net.sf.xqz.model.engine.IChannel#getFrameInterpreters()
	 * @see #getIChannel()
	 * @generated
	 */
	EReference getIChannel_FrameInterpreters();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.xqz.model.engine.IChannel#getEventListeners <em>Event Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Listeners</em>'.
	 * @see net.sf.xqz.model.engine.IChannel#getEventListeners()
	 * @see #getIChannel()
	 * @generated
	 */
	EReference getIChannel_EventListeners();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.engine.IChannel#getLastFrame <em>Last Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Frame</em>'.
	 * @see net.sf.xqz.model.engine.IChannel#getLastFrame()
	 * @see #getIChannel()
	 * @generated
	 */
	EAttribute getIChannel_LastFrame();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EngineFactory getEngineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.TxImpl <em>Tx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.TxImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getTx()
		 * @generated
		 */
		EClass TX = eINSTANCE.getTx();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.RxImpl <em>Rx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.RxImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getRx()
		 * @generated
		 */
		EClass RX = eINSTANCE.getRx();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.QxImpl <em>Qx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.QxImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getQx()
		 * @generated
		 */
		EClass QX = eINSTANCE.getQx();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QX__COMMANDS = eINSTANCE.getQx_Commands();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QX__ENGINE = eINSTANCE.getQx_Engine();

		/**
		 * The meta object literal for the '<em><b>Current Max Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX__CURRENT_MAX_PRIORITY = eINSTANCE.getQx_CurrentMaxPriority();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX__LOCKED = eINSTANCE.getQx_Locked();

		/**
		 * The meta object literal for the '<em><b>Ttl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX__TTL = eINSTANCE.getQx_Ttl();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX__THRESHOLD = eINSTANCE.getQx_Threshold();

		/**
		 * The meta object literal for the '<em><b>Time Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QX__TIME_RANGE = eINSTANCE.getQx_TimeRange();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX__STRATEGY = eINSTANCE.getQx_Strategy();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX__MAX = eINSTANCE.getQx_Max();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.CmdPipeImpl <em>Cmd Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.CmdPipeImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getCmdPipe()
		 * @generated
		 */
		EClass CMD_PIPE = eINSTANCE.getCmdPipe();

		/**
		 * The meta object literal for the '<em><b>Queues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__QUEUES = eINSTANCE.getCmdPipe_Queues();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__CLIENT = eINSTANCE.getCmdPipe_Client();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__APPLICATION = eINSTANCE.getCmdPipe_Application();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__ID = eINSTANCE.getCmdPipe_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__NAME = eINSTANCE.getCmdPipe_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__PRIORITY = eINSTANCE.getCmdPipe_Priority();

		/**
		 * The meta object literal for the '<em><b>Tx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__TX = eINSTANCE.getCmdPipe_Tx();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__RX = eINSTANCE.getCmdPipe_Rx();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__EVENTS = eINSTANCE.getCmdPipe_Events();

		/**
		 * The meta object literal for the '<em><b>Command Pool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__COMMAND_POOL = eINSTANCE.getCmdPipe_CommandPool();

		/**
		 * The meta object literal for the '<em><b>Output Interpreter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__OUTPUT_INTERPRETER = eINSTANCE.getCmdPipe_OutputInterpreter();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__PORT = eINSTANCE.getCmdPipe_Port();

		/**
		 * The meta object literal for the '<em><b>Input Interpreter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__INPUT_INTERPRETER = eINSTANCE.getCmdPipe_InputInterpreter();

		/**
		 * The meta object literal for the '<em><b>Recording</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__RECORDING = eINSTANCE.getCmdPipe_Recording();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__TRIGGERS = eINSTANCE.getCmdPipe_Triggers();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__ADDR = eINSTANCE.getCmdPipe_Addr();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__PORTS = eINSTANCE.getCmdPipe_Ports();

		/**
		 * The meta object literal for the '<em><b>Transport Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__TRANSPORT_PROTOCOL = eINSTANCE.getCmdPipe_TransportProtocol();

		/**
		 * The meta object literal for the '<em><b>Communication Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__COMMUNICATION_PROTOCOL = eINSTANCE.getCmdPipe_CommunicationProtocol();

		/**
		 * The meta object literal for the '<em><b>Tx Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__TX_EVENTS = eINSTANCE.getCmdPipe_TxEvents();

		/**
		 * The meta object literal for the '<em><b>Rx Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_PIPE__RX_EVENTS = eINSTANCE.getCmdPipe_RxEvents();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__SPEED = eINSTANCE.getCmdPipe_Speed();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__ACTIVATED = eINSTANCE.getCmdPipe_Activated();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__LOCKED = eINSTANCE.getCmdPipe_Locked();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PIPE__TOPIC = eINSTANCE.getCmdPipe_Topic();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.EngineClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.EngineClientImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEngineClient()
		 * @generated
		 */
		EClass ENGINE_CLIENT = eINSTANCE.getEngineClient();

		/**
		 * The meta object literal for the '<em><b>Engines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE_CLIENT__ENGINES = eINSTANCE.getEngineClient_Engines();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_CLIENT__ID = eINSTANCE.getEngineClient_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_CLIENT__NAME = eINSTANCE.getEngineClient_Name();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE_CLIENT__APPLICATION = eINSTANCE.getEngineClient_Application();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_CLIENT__RUNNER = eINSTANCE.getEngineClient_Runner();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.EngineApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.EngineApplicationImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEngineApplication()
		 * @generated
		 */
		EClass ENGINE_APPLICATION = eINSTANCE.getEngineApplication();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE_APPLICATION__ENGINE = eINSTANCE.getEngineApplication_Engine();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE_APPLICATION__CLIENTS = eINSTANCE.getEngineApplication_Clients();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_APPLICATION__ID = eINSTANCE.getEngineApplication_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_APPLICATION__NAME = eINSTANCE.getEngineApplication_Name();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.EventImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__KIND = eINSTANCE.getEvent_Kind();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CMD = eINSTANCE.getEvent_Cmd();

		/**
		 * The meta object literal for the '<em><b>Qx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__QX = eINSTANCE.getEvent_Qx();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__BYTES = eINSTANCE.getEvent_Bytes();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TOPIC = eINSTANCE.getEvent_Topic();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.EVENT_KIND <em>EVENT KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.EVENT_KIND
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getEVENT_KIND()
		 * @generated
		 */
		EEnum EVENT_KIND = eINSTANCE.getEVENT_KIND();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.QxProcessingStrategy <em>Qx Processing Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.QxProcessingStrategy
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getQxProcessingStrategy()
		 * @generated
		 */
		EEnum QX_PROCESSING_STRATEGY = eINSTANCE.getQxProcessingStrategy();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.TriggerKind <em>Trigger Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.TriggerKind
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getTriggerKind()
		 * @generated
		 */
		EEnum TRIGGER_KIND = eINSTANCE.getTriggerKind();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.IXCmdInterpreter <em>IX Cmd Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.IXCmdInterpreter
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIXCmdInterpreter()
		 * @generated
		 */
		EClass IX_CMD_INTERPRETER = eINSTANCE.getIXCmdInterpreter();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IX_CMD_INTERPRETER__ID = eINSTANCE.getIXCmdInterpreter_ID();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl <em>Abstract Cmd Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractCmdInterpreter()
		 * @generated
		 */
		EClass ABSTRACT_CMD_INTERPRETER = eINSTANCE.getAbstractCmdInterpreter();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.IQxEventHandler <em>IQx Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.IQxEventHandler
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIQxEventHandler()
		 * @generated
		 */
		EClass IQX_EVENT_HANDLER = eINSTANCE.getIQxEventHandler();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IQX_EVENT_HANDLER__ID = eINSTANCE.getIQxEventHandler_ID();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.IQxEventNotifier <em>IQx Event Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.IQxEventNotifier
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIQxEventNotifier()
		 * @generated
		 */
		EClass IQX_EVENT_NOTIFIER = eINSTANCE.getIQxEventNotifier();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IQX_EVENT_NOTIFIER__ID = eINSTANCE.getIQxEventNotifier_ID();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl <em>Abstract Qx Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractQxEventHandler()
		 * @generated
		 */
		EClass ABSTRACT_QX_EVENT_HANDLER = eINSTANCE.getAbstractQxEventHandler();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.AbstractQxEventNotifierImpl <em>Abstract Qx Event Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.AbstractQxEventNotifierImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractQxEventNotifier()
		 * @generated
		 */
		EClass ABSTRACT_QX_EVENT_NOTIFIER = eINSTANCE.getAbstractQxEventNotifier();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.PortImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CHANNEL = eINSTANCE.getPort_Channel();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ENGINE = eINSTANCE.getPort_Engine();

		/**
		 * The meta object literal for the '<em><b>Input Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INPUT_JOBS = eINSTANCE.getPort_InputJobs();

		/**
		 * The meta object literal for the '<em><b>Output Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__OUTPUT_JOBS = eINSTANCE.getPort_OutputJobs();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.IXFrameInterpreterImpl <em>IX Frame Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.IXFrameInterpreterImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIXFrameInterpreter()
		 * @generated
		 */
		EClass IX_FRAME_INTERPRETER = eINSTANCE.getIXFrameInterpreter();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IX_FRAME_INTERPRETER__ID = eINSTANCE.getIXFrameInterpreter_ID();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl <em>Abstract Frame Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractFrameInterpreter()
		 * @generated
		 */
		EClass ABSTRACT_FRAME_INTERPRETER = eINSTANCE.getAbstractFrameInterpreter();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.ICmdEngineAction <em>ICmd Engine Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.ICmdEngineAction
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getICmdEngineAction()
		 * @generated
		 */
		EClass ICMD_ENGINE_ACTION = eINSTANCE.getICmdEngineAction();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.AbstractCmdEngineActionImpl <em>Abstract Cmd Engine Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.AbstractCmdEngineActionImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getAbstractCmdEngineAction()
		 * @generated
		 */
		EClass ABSTRACT_CMD_ENGINE_ACTION = eINSTANCE.getAbstractCmdEngineAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CMD_ENGINE_ACTION__ID = eINSTANCE.getAbstractCmdEngineAction_Id();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CMD_ENGINE_ACTION__ARGS = eINSTANCE.getAbstractCmdEngineAction_Args();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.CmdEngineActionArgImpl <em>Cmd Engine Action Arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.CmdEngineActionArgImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getCmdEngineActionArg()
		 * @generated
		 */
		EClass CMD_ENGINE_ACTION_ARG = eINSTANCE.getCmdEngineActionArg();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_ENGINE_ACTION_ARG__ID = eINSTANCE.getCmdEngineActionArg_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_ENGINE_ACTION_ARG__VALUE = eINSTANCE.getCmdEngineActionArg_Value();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.QxTimeRangeImpl <em>Qx Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.QxTimeRangeImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getQxTimeRange()
		 * @generated
		 */
		EClass QX_TIME_RANGE = eINSTANCE.getQxTimeRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX_TIME_RANGE__START = eINSTANCE.getQxTimeRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QX_TIME_RANGE__END = eINSTANCE.getQxTimeRange_End();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.InputJobImpl <em>Input Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.InputJobImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getInputJob()
		 * @generated
		 */
		EClass INPUT_JOB = eINSTANCE.getInputJob();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.OutputJobImpl <em>Output Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.OutputJobImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getOutputJob()
		 * @generated
		 */
		EClass OUTPUT_JOB = eINSTANCE.getOutputJob();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.IConnectedUnit
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIConnectedUnit()
		 * @generated
		 */
		EClass ICONNECTED_UNIT = eINSTANCE.getIConnectedUnit();

		/**
		 * The meta object literal for the '<em><b>Engines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICONNECTED_UNIT__ENGINES = eINSTANCE.getIConnectedUnit_Engines();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICONNECTED_UNIT__DEFAULT = eINSTANCE.getIConnectedUnit_Default();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.TriggerImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__KIND = eINSTANCE.getTrigger_Kind();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TARGET = eINSTANCE.getTrigger_Target();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.IOJobImpl <em>IO Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.IOJobImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIOJob()
		 * @generated
		 */
		EClass IO_JOB = eINSTANCE.getIOJob();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_JOB__ID = eINSTANCE.getIOJob_Id();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_JOB__JOB = eINSTANCE.getIOJob_Job();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.SynchronousQxEventHandlerImpl <em>Synchronous Qx Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.SynchronousQxEventHandlerImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getSynchronousQxEventHandler()
		 * @generated
		 */
		EClass SYNCHRONOUS_QX_EVENT_HANDLER = eINSTANCE.getSynchronousQxEventHandler();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.engine.impl.IChannelImpl <em>IChannel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.engine.impl.IChannelImpl
		 * @see net.sf.xqz.model.engine.impl.EnginePackageImpl#getIChannel()
		 * @generated
		 */
		EClass ICHANNEL = eINSTANCE.getIChannel();

		/**
		 * The meta object literal for the '<em><b>Cmd Interpretrers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICHANNEL__CMD_INTERPRETRERS = eINSTANCE.getIChannel_CmdInterpretrers();

		/**
		 * The meta object literal for the '<em><b>Frame Interpreters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICHANNEL__FRAME_INTERPRETERS = eINSTANCE.getIChannel_FrameInterpreters();

		/**
		 * The meta object literal for the '<em><b>Event Listeners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICHANNEL__EVENT_LISTENERS = eINSTANCE.getIChannel_EventListeners();

		/**
		 * The meta object literal for the '<em><b>Last Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICHANNEL__LAST_FRAME = eINSTANCE.getIChannel_LastFrame();

	}

} //EnginePackage
