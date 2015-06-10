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

package net.sf.xqz.model.cmd.impl;

import net.sf.xqz.model.cmd.ByteCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.cmd.XCmd;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.impl.EnginePackageImpl;
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
public class CmdPackageImpl extends EPackageImpl implements CmdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityEEnum = null;

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
	 * @see net.sf.xqz.model.cmd.CmdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmdPackageImpl() {
		super(eNS_URI, CmdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CmdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmdPackage init() {
		if (isInited) return (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Obtain or create and register package
		CmdPackageImpl theCmdPackage = (CmdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CmdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CmdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
		EnginePackageImpl theEnginePackage = (EnginePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI) instanceof EnginePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI) : EnginePackage.eINSTANCE);

		// Create package meta-data objects
		theCmdPackage.createPackageContents();
		theTemporalPackage.createPackageContents();
		theEnginePackage.createPackageContents();

		// Initialize created meta-data
		theCmdPackage.initializePackageContents();
		theTemporalPackage.initializePackageContents();
		theEnginePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCmdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmdPackage.eNS_URI, theCmdPackage);
		return theCmdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmd() {
		return cmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmd_Priority() {
		return (EAttribute)cmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmd_Stamp() {
		return (EAttribute)cmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundCmd() {
		return compoundCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundCmd_Children() {
		return (EReference)compoundCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCmd() {
		return xCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCmd_Obj() {
		return (EAttribute)xCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByteCmd() {
		return byteCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByteCmd_Message() {
		return (EAttribute)byteCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPRIORITY() {
		return priorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdFactory getCmdFactory() {
		return (CmdFactory)getEFactoryInstance();
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
		cmdEClass = createEClass(CMD);
		createEAttribute(cmdEClass, CMD__PRIORITY);
		createEAttribute(cmdEClass, CMD__STAMP);

		compoundCmdEClass = createEClass(COMPOUND_CMD);
		createEReference(compoundCmdEClass, COMPOUND_CMD__CHILDREN);

		xCmdEClass = createEClass(XCMD);
		createEAttribute(xCmdEClass, XCMD__OBJ);

		byteCmdEClass = createEClass(BYTE_CMD);
		createEAttribute(byteCmdEClass, BYTE_CMD__MESSAGE);

		// Create enums
		priorityEEnum = createEEnum(PRIORITY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compoundCmdEClass.getESuperTypes().add(this.getCmd());
		xCmdEClass.getESuperTypes().add(this.getCmd());
		byteCmdEClass.getESuperTypes().add(this.getCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(cmdEClass, Cmd.class, "Cmd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCmd_Priority(), this.getPRIORITY(), "priority", null, 0, 1, Cmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmd_Stamp(), ecorePackage.getELong(), "stamp", null, 0, 1, Cmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundCmdEClass, CompoundCmd.class, "CompoundCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundCmd_Children(), this.getCmd(), null, "children", null, 0, -1, CompoundCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(compoundCmdEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compoundCmdEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compoundCmdEClass, null, "queue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compoundCmdEClass, null, "pop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compoundCmdEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compoundCmdEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compoundCmdEClass, null, "drop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xCmdEClass, XCmd.class, "XCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXCmd_Obj(), ecorePackage.getEJavaObject(), "obj", null, 0, 1, XCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(byteCmdEClass, ByteCmd.class, "ByteCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getByteCmd_Message(), ecorePackage.getEByteArray(), "message", null, 0, 1, ByteCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.class, "PRIORITY");
		addEEnumLiteral(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.LOWEST);
		addEEnumLiteral(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.LOW);
		addEEnumLiteral(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.MEDIUM);
		addEEnumLiteral(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.HIGH);
		addEEnumLiteral(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.HIGHEST);
		addEEnumLiteral(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.NONE);
		addEEnumLiteral(priorityEEnum, net.sf.xqz.model.cmd.PRIORITY.VITAL);

		// Create resource
		createResource(eNS_URI);
	}

} //CmdPackageImpl
