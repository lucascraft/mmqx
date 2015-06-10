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

package net.sf.xqz.model.temporal.impl;

import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.cmd.impl.CmdPackageImpl;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.impl.EnginePackageImpl;
import net.sf.xqz.model.temporal.Orchestror;
import net.sf.xqz.model.temporal.TemporalFactory;
import net.sf.xqz.model.temporal.TemporalPackage;
import net.sf.xqz.model.temporal.TimeInfo;
import net.sf.xqz.model.temporal.TimeLine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class TemporalPackageImpl extends EPackageImpl implements TemporalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executioN_STATUSEEnum = null;

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
	 * @see net.sf.xqz.model.temporal.TemporalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TemporalPackageImpl() {
		super(eNS_URI, TemporalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TemporalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TemporalPackage init() {
		if (isInited) return (TemporalPackage)EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI);

		// Obtain or create and register package
		TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TemporalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EnginePackageImpl theEnginePackage = (EnginePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI) instanceof EnginePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI) : EnginePackage.eINSTANCE);
		CmdPackageImpl theCmdPackage = (CmdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI) instanceof CmdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI) : CmdPackage.eINSTANCE);

		// Create package meta-data objects
		theTemporalPackage.createPackageContents();
		theEnginePackage.createPackageContents();
		theCmdPackage.createPackageContents();

		// Initialize created meta-data
		theTemporalPackage.initializePackageContents();
		theEnginePackage.initializePackageContents();
		theCmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTemporalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TemporalPackage.eNS_URI, theTemporalPackage);
		return theTemporalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLine() {
		return timeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Id() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Name() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Start() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Finish() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Status() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_CmdEngine() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_Orchestror() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_Time() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrchestror() {
		return orchestrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrchestror_Id() {
		return (EAttribute)orchestrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrchestror_Name() {
		return (EAttribute)orchestrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestror_Timelines() {
		return (EReference)orchestrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestror_Application() {
		return (EReference)orchestrorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestror_Time() {
		return (EReference)orchestrorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrchestror_Clock() {
		return (EAttribute)orchestrorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInfo() {
		return timeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInfo_Start() {
		return (EAttribute)timeInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInfo_Cursor() {
		return (EAttribute)timeInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInfo_Duration() {
		return (EAttribute)timeInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInfo_Tick() {
		return (EAttribute)timeInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEXECUTION_STATUS() {
		return executioN_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalFactory getTemporalFactory() {
		return (TemporalFactory)getEFactoryInstance();
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
		timeLineEClass = createEClass(TIME_LINE);
		createEAttribute(timeLineEClass, TIME_LINE__ID);
		createEAttribute(timeLineEClass, TIME_LINE__NAME);
		createEAttribute(timeLineEClass, TIME_LINE__START);
		createEAttribute(timeLineEClass, TIME_LINE__FINISH);
		createEAttribute(timeLineEClass, TIME_LINE__STATUS);
		createEReference(timeLineEClass, TIME_LINE__CMD_ENGINE);
		createEReference(timeLineEClass, TIME_LINE__ORCHESTROR);
		createEReference(timeLineEClass, TIME_LINE__TIME);

		orchestrorEClass = createEClass(ORCHESTROR);
		createEAttribute(orchestrorEClass, ORCHESTROR__ID);
		createEAttribute(orchestrorEClass, ORCHESTROR__NAME);
		createEReference(orchestrorEClass, ORCHESTROR__TIMELINES);
		createEReference(orchestrorEClass, ORCHESTROR__APPLICATION);
		createEReference(orchestrorEClass, ORCHESTROR__TIME);
		createEAttribute(orchestrorEClass, ORCHESTROR__CLOCK);

		timeInfoEClass = createEClass(TIME_INFO);
		createEAttribute(timeInfoEClass, TIME_INFO__START);
		createEAttribute(timeInfoEClass, TIME_INFO__CURSOR);
		createEAttribute(timeInfoEClass, TIME_INFO__DURATION);
		createEAttribute(timeInfoEClass, TIME_INFO__TICK);

		// Create enums
		executioN_STATUSEEnum = createEEnum(EXECUTION_STATUS);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(timeLineEClass, TimeLine.class, "TimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeLine_Id(), ecorePackage.getEString(), "id", "T1", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_Name(), ecorePackage.getEString(), "name", "T1", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_Start(), ecorePackage.getELong(), "start", "0", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_Finish(), ecorePackage.getELong(), "finish", "5000", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_Status(), this.getEXECUTION_STATUS(), "status", "", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLine_CmdEngine(), theEnginePackage.getCmdPipe(), null, "cmdEngine", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLine_Orchestror(), this.getOrchestror(), this.getOrchestror_Timelines(), "orchestror", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLine_Time(), this.getTimeInfo(), null, "time", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orchestrorEClass, Orchestror.class, "Orchestror", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrchestror_Id(), ecorePackage.getEString(), "id", null, 0, 1, Orchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestror_Name(), ecorePackage.getEString(), "name", null, 0, 1, Orchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestror_Timelines(), this.getTimeLine(), this.getTimeLine_Orchestror(), "timelines", null, 0, -1, Orchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestror_Application(), theEnginePackage.getEngineApplication(), null, "application", null, 0, 1, Orchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestror_Time(), this.getTimeInfo(), null, "time", null, 0, 1, Orchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestror_Clock(), ecorePackage.getEJavaObject(), "clock", null, 0, 1, Orchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeInfoEClass, TimeInfo.class, "TimeInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeInfo_Start(), ecorePackage.getELong(), "start", null, 0, 1, TimeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInfo_Cursor(), ecorePackage.getELong(), "cursor", null, 0, 1, TimeInfo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInfo_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, TimeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInfo_Tick(), ecorePackage.getELong(), "tick", null, 0, 1, TimeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.class, "EXECUTION_STATUS");
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.PLAY);
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.STOP);
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.FORWARD);
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.BACKWARD);
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.FROZEN);
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.RECORD);
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.UNDEFINED);
		addEEnumLiteral(executioN_STATUSEEnum, net.sf.xqz.model.temporal.EXECUTION_STATUS.MUTE);

		// Create resource
		createResource(eNS_URI);
	}

} //TemporalPackageImpl
