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

import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.cmd.impl.CmdPackageImpl;
import net.sf.xqz.model.engine.AbstractCmdEngineAction;
import net.sf.xqz.model.engine.AbstractCmdInterpreter;
import net.sf.xqz.model.engine.AbstractFrameInterpreter;
import net.sf.xqz.model.engine.AbstractQxEventHandler;
import net.sf.xqz.model.engine.AbstractQxEventNotifier;
import net.sf.xqz.model.engine.CmdEngineActionArg;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.EngineFactory;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.ICmdEngineAction;
import net.sf.xqz.model.engine.IConnectedUnit;
import net.sf.xqz.model.engine.IOJob;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IQxEventNotifier;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.Port;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.QxProcessingStrategy;
import net.sf.xqz.model.engine.QxTimeRange;
import net.sf.xqz.model.engine.Rx;
import net.sf.xqz.model.engine.SynchronousQxEventHandler;
import net.sf.xqz.model.engine.Trigger;
import net.sf.xqz.model.engine.TriggerKind;
import net.sf.xqz.model.engine.Tx;
import net.sf.xqz.model.temporal.TemporalPackage;
import net.sf.xqz.model.temporal.impl.TemporalPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnginePackageImpl extends EPackageImpl implements EnginePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass txEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmdPipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ixCmdInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCmdInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iQxEventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iQxEventNotifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQxEventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQxEventNotifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ixFrameInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFrameInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCmdEngineActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCmdEngineActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmdEngineActionArgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qxTimeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iConnectedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousQxEventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evenT_KINDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qxProcessingStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.xqz.model.engine.EnginePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnginePackageImpl() {
		super(eNS_URI, EngineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EnginePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnginePackage init() {
		if (isInited) return (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);

		// Obtain or create and register package
		EnginePackageImpl theEnginePackage = (EnginePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnginePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnginePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
		CmdPackageImpl theCmdPackage = (CmdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI) instanceof CmdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI) : CmdPackage.eINSTANCE);

		// Create package meta-data objects
		theEnginePackage.createPackageContents();
		theTemporalPackage.createPackageContents();
		theCmdPackage.createPackageContents();

		// Initialize created meta-data
		theEnginePackage.initializePackageContents();
		theTemporalPackage.initializePackageContents();
		theCmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnginePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnginePackage.eNS_URI, theEnginePackage);
		return theEnginePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTx() {
		return txEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRx() {
		return rxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQx() {
		return qxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQx_Commands() {
		return (EReference)qxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQx_Engine() {
		return (EReference)qxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQx_CurrentMaxPriority() {
		return (EAttribute)qxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQx_Locked() {
		return (EAttribute)qxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQx_Ttl() {
		return (EAttribute)qxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQx_Threshold() {
		return (EAttribute)qxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQx_TimeRange() {
		return (EReference)qxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQx_Strategy() {
		return (EAttribute)qxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQx_Max() {
		return (EAttribute)qxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmdPipe() {
		return cmdPipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Queues() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Client() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Application() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Id() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Name() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Priority() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Tx() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Rx() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Events() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_CommandPool() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_OutputInterpreter() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Port() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_InputInterpreter() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Recording() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_Triggers() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Addr() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Ports() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_TransportProtocol() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_CommunicationProtocol() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_TxEvents() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdPipe_RxEvents() {
		return (EReference)cmdPipeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Speed() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Activated() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Locked() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdPipe_Topic() {
		return (EAttribute)cmdPipeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineClient() {
		return engineClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineClient_Engines() {
		return (EReference)engineClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineClient_Id() {
		return (EAttribute)engineClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineClient_Name() {
		return (EAttribute)engineClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineClient_Application() {
		return (EReference)engineClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineClient_Runner() {
		return (EAttribute)engineClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineApplication() {
		return engineApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineApplication_Engine() {
		return (EReference)engineApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineApplication_Clients() {
		return (EReference)engineApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineApplication_Id() {
		return (EAttribute)engineApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineApplication_Name() {
		return (EAttribute)engineApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Kind() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Cmd() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Qx() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Time() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Bytes() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Topic() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEVENT_KIND() {
		return evenT_KINDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQxProcessingStrategy() {
		return qxProcessingStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerKind() {
		return triggerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIXCmdInterpreter() {
		return ixCmdInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIXCmdInterpreter_ID() {
		return (EAttribute)ixCmdInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCmdInterpreter() {
		return abstractCmdInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIQxEventHandler() {
		return iQxEventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIQxEventHandler_ID() {
		return (EAttribute)iQxEventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIQxEventNotifier() {
		return iQxEventNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIQxEventNotifier_ID() {
		return (EAttribute)iQxEventNotifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQxEventHandler() {
		return abstractQxEventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQxEventNotifier() {
		return abstractQxEventNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Channel() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Engine() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_InputJobs() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_OutputJobs() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIXFrameInterpreter() {
		return ixFrameInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIXFrameInterpreter_ID() {
		return (EAttribute)ixFrameInterpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFrameInterpreter() {
		return abstractFrameInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICmdEngineAction() {
		return iCmdEngineActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCmdEngineAction() {
		return abstractCmdEngineActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCmdEngineAction_Id() {
		return (EAttribute)abstractCmdEngineActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCmdEngineAction_Args() {
		return (EReference)abstractCmdEngineActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmdEngineActionArg() {
		return cmdEngineActionArgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdEngineActionArg_Id() {
		return (EAttribute)cmdEngineActionArgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdEngineActionArg_Value() {
		return (EAttribute)cmdEngineActionArgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQxTimeRange() {
		return qxTimeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQxTimeRange_Start() {
		return (EAttribute)qxTimeRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQxTimeRange_End() {
		return (EAttribute)qxTimeRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputJob() {
		return inputJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputJob() {
		return outputJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIConnectedUnit() {
		return iConnectedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIConnectedUnit_Engines() {
		return (EReference)iConnectedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIConnectedUnit_Default() {
		return (EReference)iConnectedUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Kind() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Target() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOJob() {
		return ioJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOJob_Id() {
		return (EAttribute)ioJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOJob_Job() {
		return (EAttribute)ioJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousQxEventHandler() {
		return synchronousQxEventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIChannel() {
		return iChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIChannel_CmdInterpretrers() {
		return (EReference)iChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIChannel_FrameInterpreters() {
		return (EReference)iChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIChannel_EventListeners() {
		return (EReference)iChannelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIChannel_LastFrame() {
		return (EAttribute)iChannelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineFactory getEngineFactory() {
		return (EngineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		txEClass = createEClass(TX);

		rxEClass = createEClass(RX);

		qxEClass = createEClass(QX);
		createEReference(qxEClass, QX__COMMANDS);
		createEReference(qxEClass, QX__ENGINE);
		createEAttribute(qxEClass, QX__LOCKED);
		createEAttribute(qxEClass, QX__CURRENT_MAX_PRIORITY);
		createEAttribute(qxEClass, QX__TTL);
		createEAttribute(qxEClass, QX__THRESHOLD);
		createEReference(qxEClass, QX__TIME_RANGE);
		createEAttribute(qxEClass, QX__STRATEGY);
		createEAttribute(qxEClass, QX__MAX);

		cmdPipeEClass = createEClass(CMD_PIPE);
		createEReference(cmdPipeEClass, CMD_PIPE__QUEUES);
		createEReference(cmdPipeEClass, CMD_PIPE__CLIENT);
		createEReference(cmdPipeEClass, CMD_PIPE__APPLICATION);
		createEAttribute(cmdPipeEClass, CMD_PIPE__ID);
		createEAttribute(cmdPipeEClass, CMD_PIPE__NAME);
		createEAttribute(cmdPipeEClass, CMD_PIPE__PRIORITY);
		createEReference(cmdPipeEClass, CMD_PIPE__TX);
		createEReference(cmdPipeEClass, CMD_PIPE__RX);
		createEReference(cmdPipeEClass, CMD_PIPE__EVENTS);
		createEReference(cmdPipeEClass, CMD_PIPE__COMMAND_POOL);
		createEReference(cmdPipeEClass, CMD_PIPE__OUTPUT_INTERPRETER);
		createEReference(cmdPipeEClass, CMD_PIPE__PORT);
		createEReference(cmdPipeEClass, CMD_PIPE__INPUT_INTERPRETER);
		createEAttribute(cmdPipeEClass, CMD_PIPE__RECORDING);
		createEReference(cmdPipeEClass, CMD_PIPE__TRIGGERS);
		createEAttribute(cmdPipeEClass, CMD_PIPE__ADDR);
		createEAttribute(cmdPipeEClass, CMD_PIPE__PORTS);
		createEAttribute(cmdPipeEClass, CMD_PIPE__TRANSPORT_PROTOCOL);
		createEAttribute(cmdPipeEClass, CMD_PIPE__COMMUNICATION_PROTOCOL);
		createEReference(cmdPipeEClass, CMD_PIPE__TX_EVENTS);
		createEReference(cmdPipeEClass, CMD_PIPE__RX_EVENTS);
		createEAttribute(cmdPipeEClass, CMD_PIPE__SPEED);
		createEAttribute(cmdPipeEClass, CMD_PIPE__ACTIVATED);
		createEAttribute(cmdPipeEClass, CMD_PIPE__LOCKED);
		createEAttribute(cmdPipeEClass, CMD_PIPE__TOPIC);

		engineClientEClass = createEClass(ENGINE_CLIENT);
		createEReference(engineClientEClass, ENGINE_CLIENT__ENGINES);
		createEAttribute(engineClientEClass, ENGINE_CLIENT__ID);
		createEAttribute(engineClientEClass, ENGINE_CLIENT__NAME);
		createEReference(engineClientEClass, ENGINE_CLIENT__APPLICATION);
		createEAttribute(engineClientEClass, ENGINE_CLIENT__RUNNER);

		engineApplicationEClass = createEClass(ENGINE_APPLICATION);
		createEReference(engineApplicationEClass, ENGINE_APPLICATION__ENGINE);
		createEReference(engineApplicationEClass, ENGINE_APPLICATION__CLIENTS);
		createEAttribute(engineApplicationEClass, ENGINE_APPLICATION__ID);
		createEAttribute(engineApplicationEClass, ENGINE_APPLICATION__NAME);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__KIND);
		createEReference(eventEClass, EVENT__CMD);
		createEReference(eventEClass, EVENT__QX);
		createEAttribute(eventEClass, EVENT__TIME);
		createEAttribute(eventEClass, EVENT__BYTES);
		createEAttribute(eventEClass, EVENT__TOPIC);

		ixCmdInterpreterEClass = createEClass(IX_CMD_INTERPRETER);
		createEAttribute(ixCmdInterpreterEClass, IX_CMD_INTERPRETER__ID);

		abstractCmdInterpreterEClass = createEClass(ABSTRACT_CMD_INTERPRETER);

		iQxEventHandlerEClass = createEClass(IQX_EVENT_HANDLER);
		createEAttribute(iQxEventHandlerEClass, IQX_EVENT_HANDLER__ID);

		iQxEventNotifierEClass = createEClass(IQX_EVENT_NOTIFIER);
		createEAttribute(iQxEventNotifierEClass, IQX_EVENT_NOTIFIER__ID);

		abstractQxEventHandlerEClass = createEClass(ABSTRACT_QX_EVENT_HANDLER);

		abstractQxEventNotifierEClass = createEClass(ABSTRACT_QX_EVENT_NOTIFIER);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__ENGINE);
		createEReference(portEClass, PORT__INPUT_JOBS);
		createEReference(portEClass, PORT__OUTPUT_JOBS);
		createEReference(portEClass, PORT__CHANNEL);

		ixFrameInterpreterEClass = createEClass(IX_FRAME_INTERPRETER);
		createEAttribute(ixFrameInterpreterEClass, IX_FRAME_INTERPRETER__ID);

		abstractFrameInterpreterEClass = createEClass(ABSTRACT_FRAME_INTERPRETER);

		iCmdEngineActionEClass = createEClass(ICMD_ENGINE_ACTION);

		abstractCmdEngineActionEClass = createEClass(ABSTRACT_CMD_ENGINE_ACTION);
		createEAttribute(abstractCmdEngineActionEClass, ABSTRACT_CMD_ENGINE_ACTION__ID);
		createEReference(abstractCmdEngineActionEClass, ABSTRACT_CMD_ENGINE_ACTION__ARGS);

		cmdEngineActionArgEClass = createEClass(CMD_ENGINE_ACTION_ARG);
		createEAttribute(cmdEngineActionArgEClass, CMD_ENGINE_ACTION_ARG__ID);
		createEAttribute(cmdEngineActionArgEClass, CMD_ENGINE_ACTION_ARG__VALUE);

		qxTimeRangeEClass = createEClass(QX_TIME_RANGE);
		createEAttribute(qxTimeRangeEClass, QX_TIME_RANGE__START);
		createEAttribute(qxTimeRangeEClass, QX_TIME_RANGE__END);

		inputJobEClass = createEClass(INPUT_JOB);

		outputJobEClass = createEClass(OUTPUT_JOB);

		iConnectedUnitEClass = createEClass(ICONNECTED_UNIT);
		createEReference(iConnectedUnitEClass, ICONNECTED_UNIT__ENGINES);
		createEReference(iConnectedUnitEClass, ICONNECTED_UNIT__DEFAULT);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__KIND);
		createEReference(triggerEClass, TRIGGER__TARGET);

		ioJobEClass = createEClass(IO_JOB);
		createEAttribute(ioJobEClass, IO_JOB__ID);
		createEAttribute(ioJobEClass, IO_JOB__JOB);

		synchronousQxEventHandlerEClass = createEClass(SYNCHRONOUS_QX_EVENT_HANDLER);

		iChannelEClass = createEClass(ICHANNEL);
		createEReference(iChannelEClass, ICHANNEL__CMD_INTERPRETRERS);
		createEReference(iChannelEClass, ICHANNEL__FRAME_INTERPRETERS);
		createEReference(iChannelEClass, ICHANNEL__EVENT_LISTENERS);
		createEAttribute(iChannelEClass, ICHANNEL__LAST_FRAME);

		// Create enums
		evenT_KINDEEnum = createEEnum(EVENT_KIND);
		qxProcessingStrategyEEnum = createEEnum(QX_PROCESSING_STRATEGY);
		triggerKindEEnum = createEEnum(TRIGGER_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		txEClass.getESuperTypes().add(this.getQx());
		rxEClass.getESuperTypes().add(this.getQx());
		engineApplicationEClass.getESuperTypes().add(this.getIConnectedUnit());
		abstractCmdInterpreterEClass.getESuperTypes().add(this.getIXCmdInterpreter());
		abstractQxEventHandlerEClass.getESuperTypes().add(this.getIQxEventHandler());
		abstractQxEventNotifierEClass.getESuperTypes().add(this.getIQxEventNotifier());
		abstractFrameInterpreterEClass.getESuperTypes().add(this.getIXFrameInterpreter());
		abstractCmdEngineActionEClass.getESuperTypes().add(this.getICmdEngineAction());
		inputJobEClass.getESuperTypes().add(this.getIOJob());
		outputJobEClass.getESuperTypes().add(this.getIOJob());
		synchronousQxEventHandlerEClass.getESuperTypes().add(this.getAbstractQxEventHandler());

		// Initialize classes and features; add operations and parameters
		initEClass(txEClass, Tx.class, "Tx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rxEClass, Rx.class, "Rx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qxEClass, Qx.class, "Qx", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQx_Commands(), theCmdPackage.getCmd(), null, "commands", null, 0, -1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQx_Engine(), this.getCmdPipe(), this.getCmdPipe_Queues(), "engine", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQx_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQx_CurrentMaxPriority(), theCmdPackage.getPRIORITY(), "currentMaxPriority", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQx_Ttl(), ecorePackage.getELong(), "ttl", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQx_Threshold(), ecorePackage.getEFloat(), "threshold", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQx_TimeRange(), this.getQxTimeRange(), null, "timeRange", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQx_Strategy(), this.getQxProcessingStrategy(), "strategy", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQx_Max(), theEcorePackage.getEInt(), "max", null, 0, 1, Qx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(qxEClass, null, "postCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(qxEClass, theCmdPackage.getCmd(), "consumeCommand", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cmdPipeEClass, CmdPipe.class, "CmdPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCmdPipe_Queues(), this.getQx(), this.getQx_Engine(), "queues", null, 0, -1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_Client(), this.getEngineClient(), this.getEngineClient_Engines(), "client", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_Application(), this.getEngineApplication(), this.getEngineApplication_Engine(), "application", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Id(), ecorePackage.getEString(), "id", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Priority(), theCmdPackage.getPRIORITY(), "priority", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_Tx(), this.getTx(), null, "tx", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_Rx(), this.getRx(), null, "rx", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_Events(), this.getEvent(), null, "events", null, 0, -1, CmdPipe.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_CommandPool(), theCmdPackage.getCmd(), null, "commandPool", null, 0, -1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_OutputInterpreter(), this.getIXCmdInterpreter(), null, "outputInterpreter", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_Port(), this.getPort(), null, "port", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_InputInterpreter(), this.getIXFrameInterpreter(), null, "inputInterpreter", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Recording(), ecorePackage.getEBoolean(), "recording", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_Triggers(), this.getTrigger(), null, "triggers", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Addr(), theEcorePackage.getEString(), "addr", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Ports(), theEcorePackage.getEInt(), "ports", null, 0, -1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_TransportProtocol(), theEcorePackage.getEString(), "transportProtocol", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_CommunicationProtocol(), theEcorePackage.getEString(), "communicationProtocol", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_TxEvents(), this.getEvent(), null, "txEvents", null, 0, -1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdPipe_RxEvents(), this.getEvent(), null, "rxEvents", null, 0, -1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Speed(), theEcorePackage.getEInt(), "speed", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Activated(), theEcorePackage.getEBoolean(), "activated", "true", 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Locked(), theEcorePackage.getEBoolean(), "locked", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdPipe_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, CmdPipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "initCmdPool", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "addQxEventHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIQxEventHandler(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "removeQxEventHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIQxEventHandler(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "activateAll", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "deactivateAll", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "activateQxEventHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIQxEventHandler(), "qxEvtHandler", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "deactivateQxEventHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIQxEventHandler(), "qxEvtHandler", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "activateEngine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "engineID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "deactivateEngine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "engineID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "receive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "stream", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "send", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, theCmdPackage.getCmd(), "send", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSynchronousQxEventHandler(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "reconnect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "portID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "acceptedPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "addTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "startInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "startOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "stopInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cmdPipeEClass, null, "stopOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "send", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELong(), "delay", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "receive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEByteArray(), "frame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELong(), "delay", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, theCmdPackage.getCmd(), "syncSend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, theCmdPackage.getCmd(), "syncSend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELong(), "timeout", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cmdPipeEClass, null, "send", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(engineClientEClass, EngineClient.class, "EngineClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineClient_Engines(), this.getCmdPipe(), this.getCmdPipe_Client(), "engines", null, 0, -1, EngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineClient_Id(), ecorePackage.getEString(), "id", null, 0, 1, EngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, EngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineClient_Application(), this.getEngineApplication(), this.getEngineApplication_Clients(), "application", null, 0, 1, EngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineClient_Runner(), ecorePackage.getEJavaObject(), "runner", null, 0, 1, EngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(engineClientEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(engineClientEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(engineClientEClass, null, "quicken", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(engineClientEClass, null, "slow", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(engineClientEClass, null, "activate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(engineClientEClass, null, "deactivate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(engineApplicationEClass, EngineApplication.class, "EngineApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineApplication_Engine(), this.getCmdPipe(), this.getCmdPipe_Application(), "engine", null, 0, -1, EngineApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineApplication_Clients(), this.getEngineClient(), this.getEngineClient_Application(), "clients", null, 0, -1, EngineApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineApplication_Id(), ecorePackage.getEString(), "id", null, 0, 1, EngineApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, EngineApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Kind(), this.getEVENT_KIND(), "kind", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Cmd(), theCmdPackage.getCmd(), null, "cmd", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Qx(), this.getQx(), null, "qx", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Time(), ecorePackage.getELong(), "time", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Bytes(), theEcorePackage.getEByteArray(), "bytes", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Topic(), theEcorePackage.getEString(), "topic", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ixCmdInterpreterEClass, IXCmdInterpreter.class, "IXCmdInterpreter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIXCmdInterpreter_ID(), ecorePackage.getEString(), "ID", null, 0, 1, IXCmdInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ixCmdInterpreterEClass, ecorePackage.getEByteArray(), "cmd2ByteArray", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ixCmdInterpreterEClass, null, "processResults", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "stream", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ixCmdInterpreterEClass, ecorePackage.getEInt(), "getCmdResultLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractCmdInterpreterEClass, AbstractCmdInterpreter.class, "AbstractCmdInterpreter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iQxEventHandlerEClass, IQxEventHandler.class, "IQxEventHandler", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIQxEventHandler_ID(), ecorePackage.getEString(), "ID", null, 0, 1, IQxEventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(iQxEventHandlerEClass, null, "handleQxEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iQxEventNotifierEClass, IQxEventNotifier.class, "IQxEventNotifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIQxEventNotifier_ID(), ecorePackage.getEString(), "ID", null, 0, 1, IQxEventNotifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(iQxEventNotifierEClass, null, "notifyQxEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractQxEventHandlerEClass, AbstractQxEventHandler.class, "AbstractQxEventHandler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractQxEventNotifierEClass, AbstractQxEventNotifier.class, "AbstractQxEventNotifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Engine(), this.getCmdPipe(), null, "engine", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_InputJobs(), this.getInputJob(), null, "inputJobs", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_OutputJobs(), this.getOutputJob(), null, "outputJobs", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Channel(), this.getIChannel(), null, "channel", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(portEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "deactivate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "activate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "startInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "startOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "stopInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, null, "stopOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ixFrameInterpreterEClass, IXFrameInterpreter.class, "IXFrameInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIXFrameInterpreter_ID(), ecorePackage.getEString(), "ID", null, 0, 1, IXFrameInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ixFrameInterpreterEClass, theCmdPackage.getCmd(), "byteArray2Cmd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "stream", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractFrameInterpreterEClass, AbstractFrameInterpreter.class, "AbstractFrameInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iCmdEngineActionEClass, ICmdEngineAction.class, "ICmdEngineAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iCmdEngineActionEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQx(), "qx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iCmdEngineActionEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQx(), "qx", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iCmdEngineActionEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQx(), "qx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractCmdEngineActionEClass, AbstractCmdEngineAction.class, "AbstractCmdEngineAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractCmdEngineAction_Id(), ecorePackage.getEString(), "id", null, 0, 1, AbstractCmdEngineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCmdEngineAction_Args(), this.getCmdEngineActionArg(), null, "args", null, 0, -1, AbstractCmdEngineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmdEngineActionArgEClass, CmdEngineActionArg.class, "CmdEngineActionArg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCmdEngineActionArg_Id(), ecorePackage.getEString(), "id", null, 0, 1, CmdEngineActionArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmdEngineActionArg_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, CmdEngineActionArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qxTimeRangeEClass, QxTimeRange.class, "QxTimeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQxTimeRange_Start(), ecorePackage.getELong(), "start", null, 0, 1, QxTimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQxTimeRange_End(), ecorePackage.getELong(), "end", null, 0, 1, QxTimeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputJobEClass, InputJob.class, "InputJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputJobEClass, OutputJob.class, "OutputJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iConnectedUnitEClass, IConnectedUnit.class, "IConnectedUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIConnectedUnit_Engines(), this.getCmdPipe(), null, "engines", null, 0, -1, IConnectedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIConnectedUnit_Default(), this.getCmdPipe(), null, "default", null, 0, 1, IConnectedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Kind(), this.getTriggerKind(), "kind", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Target(), theEcorePackage.getEClassifier(), null, "target", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioJobEClass, IOJob.class, "IOJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOJob_Id(), ecorePackage.getEString(), "id", null, 0, 1, IOJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIOJob_Job(), ecorePackage.getEJavaObject(), "job", null, 0, 1, IOJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ioJobEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ioJobEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ioJobEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(synchronousQxEventHandlerEClass, SynchronousQxEventHandler.class, "SynchronousQxEventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(synchronousQxEventHandlerEClass, this.getEvent(), "getLastEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(synchronousQxEventHandlerEClass, this.getEvent(), "getLastRcvEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(synchronousQxEventHandlerEClass, this.getEvent(), "getLastSndEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(synchronousQxEventHandlerEClass, null, "setLastEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "evt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(synchronousQxEventHandlerEClass, null, "setLastRcvEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "evt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(synchronousQxEventHandlerEClass, null, "setLastSndEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "evt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iChannelEClass, IChannel.class, "IChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIChannel_CmdInterpretrers(), this.getIXCmdInterpreter(), null, "cmdInterpretrers", null, 0, -1, IChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIChannel_FrameInterpreters(), this.getIXFrameInterpreter(), null, "frameInterpreters", null, 0, -1, IChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIChannel_EventListeners(), this.getAbstractQxEventHandler(), null, "eventListeners", null, 0, -1, IChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIChannel_LastFrame(), theEcorePackage.getEByteArray(), "lastFrame", null, 0, 1, IChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "send", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEByteArray(), "bytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "receive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEByteArray(), "bytes", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iChannelEClass, ecorePackage.getEBoolean(), "inputReady", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iChannelEClass, theEcorePackage.getEBoolean(), "outputReady", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iChannelEClass, theEcorePackage.getEBoolean(), "connected", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iChannelEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iChannelEClass, null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "send", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iChannelEClass, null, "receive", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "addFrameListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFrameInterpreter(), "frameListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "removeFrameListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFrameInterpreter(), "frameListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "addCmdListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractCmdInterpreter(), "cmdListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "removeCmdListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractCmdInterpreter(), "cmdListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "addQxEventListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractQxEventHandler(), "eventListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iChannelEClass, null, "removeQxEventListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractQxEventHandler(), "eventListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.class, "EVENT_KIND");
		addEEnumLiteral(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.RX_READY);
		addEEnumLiteral(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.TX_DONE);
		addEEnumLiteral(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.UNKNOWN);
		addEEnumLiteral(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.RX_FRAME);
		addEEnumLiteral(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.RX_DONE);
		addEEnumLiteral(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.TX_READY);
		addEEnumLiteral(evenT_KINDEEnum, net.sf.xqz.model.engine.EVENT_KIND.TX_FRAME);

		initEEnum(qxProcessingStrategyEEnum, QxProcessingStrategy.class, "QxProcessingStrategy");
		addEEnumLiteral(qxProcessingStrategyEEnum, QxProcessingStrategy.OLDEST_MOST_URGENT);
		addEEnumLiteral(qxProcessingStrategyEEnum, QxProcessingStrategy.NEWEST_MOST_URGENT);
		addEEnumLiteral(qxProcessingStrategyEEnum, QxProcessingStrategy.ROUND_ROBIN);
		addEEnumLiteral(qxProcessingStrategyEEnum, QxProcessingStrategy.PREDICATE);
		addEEnumLiteral(qxProcessingStrategyEEnum, QxProcessingStrategy.TIME_RANGE_EXCLUSIVE);
		addEEnumLiteral(qxProcessingStrategyEEnum, QxProcessingStrategy.TIME_RANGE_INCLUSIVE);
		addEEnumLiteral(qxProcessingStrategyEEnum, QxProcessingStrategy.PICK_NFLUSH);

		initEEnum(triggerKindEEnum, TriggerKind.class, "TriggerKind");
		addEEnumLiteral(triggerKindEEnum, TriggerKind.PARALLEL);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.ANY);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.ONE_OF_IT);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.NOT_ONE_OF_IT);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.BLOCKING);

		// Create resource
		createResource(eNS_URI);
	}

} //EnginePackageImpl
