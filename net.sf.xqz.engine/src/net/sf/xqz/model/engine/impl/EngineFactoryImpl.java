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

import net.sf.xqz.model.engine.*;
import net.sf.xqz.model.engine.AbstractFrameInterpreter;
import net.sf.xqz.model.engine.CmdEngineActionArg;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.EngineFactory;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.IOJob;
import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.Port;
import net.sf.xqz.model.engine.QxProcessingStrategy;
import net.sf.xqz.model.engine.QxTimeRange;
import net.sf.xqz.model.engine.Rx;
import net.sf.xqz.model.engine.SynchronousQxEventHandler;
import net.sf.xqz.model.engine.Trigger;
import net.sf.xqz.model.engine.TriggerKind;
import net.sf.xqz.model.engine.Tx;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineFactoryImpl extends EFactoryImpl implements EngineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EngineFactory init() {
		try {
			EngineFactory theEngineFactory = (EngineFactory)EPackage.Registry.INSTANCE.getEFactory(EnginePackage.eNS_URI);
			if (theEngineFactory != null) {
				return theEngineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EngineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EnginePackage.TX: return createTx();
			case EnginePackage.RX: return createRx();
			case EnginePackage.CMD_PIPE: return createCmdPipe();
			case EnginePackage.ENGINE_CLIENT: return createEngineClient();
			case EnginePackage.ENGINE_APPLICATION: return createEngineApplication();
			case EnginePackage.EVENT: return createEvent();
			case EnginePackage.PORT: return createPort();
			case EnginePackage.IX_FRAME_INTERPRETER: return createIXFrameInterpreter();
			case EnginePackage.ABSTRACT_FRAME_INTERPRETER: return createAbstractFrameInterpreter();
			case EnginePackage.CMD_ENGINE_ACTION_ARG: return createCmdEngineActionArg();
			case EnginePackage.QX_TIME_RANGE: return createQxTimeRange();
			case EnginePackage.INPUT_JOB: return createInputJob();
			case EnginePackage.OUTPUT_JOB: return createOutputJob();
			case EnginePackage.TRIGGER: return createTrigger();
			case EnginePackage.IO_JOB: return createIOJob();
			case EnginePackage.SYNCHRONOUS_QX_EVENT_HANDLER: return createSynchronousQxEventHandler();
			case EnginePackage.ICHANNEL: return createIChannel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EnginePackage.EVENT_KIND:
				return createEVENT_KINDFromString(eDataType, initialValue);
			case EnginePackage.QX_PROCESSING_STRATEGY:
				return createQxProcessingStrategyFromString(eDataType, initialValue);
			case EnginePackage.TRIGGER_KIND:
				return createTriggerKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EnginePackage.EVENT_KIND:
				return convertEVENT_KINDToString(eDataType, instanceValue);
			case EnginePackage.QX_PROCESSING_STRATEGY:
				return convertQxProcessingStrategyToString(eDataType, instanceValue);
			case EnginePackage.TRIGGER_KIND:
				return convertTriggerKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tx createTx() {
		TxImpl tx = new TxImpl();
		return tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rx createRx() {
		RxImpl rx = new RxImpl();
		return rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe createCmdPipe() {
		CmdPipeImpl cmdPipe = new CmdPipeImpl();
		return cmdPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineClient createEngineClient() {
		EngineClientImpl engineClient = new EngineClientImpl();
		return engineClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineApplication createEngineApplication() {
		EngineApplicationImpl engineApplication = new EngineApplicationImpl();
		return engineApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IXFrameInterpreter createIXFrameInterpreter() {
		IXFrameInterpreterImpl ixFrameInterpreter = new IXFrameInterpreterImpl();
		return ixFrameInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFrameInterpreter createAbstractFrameInterpreter() {
		AbstractFrameInterpreterImpl abstractFrameInterpreter = new AbstractFrameInterpreterImpl();
		return abstractFrameInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdEngineActionArg createCmdEngineActionArg() {
		CmdEngineActionArgImpl cmdEngineActionArg = new CmdEngineActionArgImpl();
		return cmdEngineActionArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QxTimeRange createQxTimeRange() {
		QxTimeRangeImpl qxTimeRange = new QxTimeRangeImpl();
		return qxTimeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputJob createInputJob() {
		InputJobImpl inputJob = new InputJobImpl();
		return inputJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputJob createOutputJob() {
		OutputJobImpl outputJob = new OutputJobImpl();
		return outputJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOJob createIOJob() {
		IOJobImpl ioJob = new IOJobImpl();
		return ioJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousQxEventHandler createSynchronousQxEventHandler() {
		SynchronousQxEventHandlerImpl synchronousQxEventHandler = new SynchronousQxEventHandlerImpl();
		return synchronousQxEventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChannel createIChannel() {
		IChannelImpl iChannel = new IChannelImpl();
		return iChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVENT_KIND createEVENT_KINDFromString(EDataType eDataType, String initialValue) {
		EVENT_KIND result = EVENT_KIND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVENT_KINDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QxProcessingStrategy createQxProcessingStrategyFromString(EDataType eDataType, String initialValue) {
		QxProcessingStrategy result = QxProcessingStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQxProcessingStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind createTriggerKindFromString(EDataType eDataType, String initialValue) {
		TriggerKind result = TriggerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnginePackage getEnginePackage() {
		return (EnginePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnginePackage getPackage() {
		return EnginePackage.eINSTANCE;
	}

} //EngineFactoryImpl
