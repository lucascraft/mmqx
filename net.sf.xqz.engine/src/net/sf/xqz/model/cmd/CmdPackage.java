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

package net.sf.xqz.model.cmd;

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
 * @see net.sf.xqz.model.cmd.CmdFactory
 * @model kind="package"
 * @generated
 */
public interface CmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.sf.xqz/command/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmdPackage eINSTANCE = net.sf.xqz.model.cmd.impl.CmdPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.cmd.impl.CmdImpl <em>Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.cmd.impl.CmdImpl
	 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getCmd()
	 * @generated
	 */
	int CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD__PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD__STAMP = 1;

	/**
	 * The number of structural features of the '<em>Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.cmd.impl.CompoundCmdImpl <em>Compound Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.cmd.impl.CompoundCmdImpl
	 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getCompoundCmd()
	 * @generated
	 */
	int COMPOUND_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CMD__PRIORITY = CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CMD__STAMP = CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CMD__CHILDREN = CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CMD_FEATURE_COUNT = CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.cmd.impl.XCmdImpl <em>XCmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.cmd.impl.XCmdImpl
	 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getXCmd()
	 * @generated
	 */
	int XCMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCMD__PRIORITY = CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCMD__STAMP = CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCMD__OBJ = CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XCmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCMD_FEATURE_COUNT = CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.cmd.impl.ByteCmdImpl <em>Byte Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.cmd.impl.ByteCmdImpl
	 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getByteCmd()
	 * @generated
	 */
	int BYTE_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_CMD__PRIORITY = CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_CMD__STAMP = CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_CMD__MESSAGE = CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_CMD_FEATURE_COUNT = CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.cmd.PRIORITY <em>PRIORITY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.cmd.PRIORITY
	 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getPRIORITY()
	 * @generated
	 */
	int PRIORITY = 4;


	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd</em>'.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	EClass getCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.cmd.Cmd#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see net.sf.xqz.model.cmd.Cmd#getPriority()
	 * @see #getCmd()
	 * @generated
	 */
	EAttribute getCmd_Priority();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.cmd.Cmd#getStamp <em>Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stamp</em>'.
	 * @see net.sf.xqz.model.cmd.Cmd#getStamp()
	 * @see #getCmd()
	 * @generated
	 */
	EAttribute getCmd_Stamp();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.cmd.CompoundCmd <em>Compound Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Cmd</em>'.
	 * @see net.sf.xqz.model.cmd.CompoundCmd
	 * @generated
	 */
	EClass getCompoundCmd();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.cmd.CompoundCmd#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.xqz.model.cmd.CompoundCmd#getChildren()
	 * @see #getCompoundCmd()
	 * @generated
	 */
	EReference getCompoundCmd_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.cmd.XCmd <em>XCmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCmd</em>'.
	 * @see net.sf.xqz.model.cmd.XCmd
	 * @generated
	 */
	EClass getXCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.cmd.XCmd#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj</em>'.
	 * @see net.sf.xqz.model.cmd.XCmd#getObj()
	 * @see #getXCmd()
	 * @generated
	 */
	EAttribute getXCmd_Obj();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.cmd.ByteCmd <em>Byte Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Cmd</em>'.
	 * @see net.sf.xqz.model.cmd.ByteCmd
	 * @generated
	 */
	EClass getByteCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.cmd.ByteCmd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see net.sf.xqz.model.cmd.ByteCmd#getMessage()
	 * @see #getByteCmd()
	 * @generated
	 */
	EAttribute getByteCmd_Message();

	/**
	 * Returns the meta object for enum '{@link net.sf.xqz.model.cmd.PRIORITY <em>PRIORITY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PRIORITY</em>'.
	 * @see net.sf.xqz.model.cmd.PRIORITY
	 * @generated
	 */
	EEnum getPRIORITY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmdFactory getCmdFactory();

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
		 * The meta object literal for the '{@link net.sf.xqz.model.cmd.impl.CmdImpl <em>Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.cmd.impl.CmdImpl
		 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getCmd()
		 * @generated
		 */
		EClass CMD = eINSTANCE.getCmd();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD__PRIORITY = eINSTANCE.getCmd_Priority();

		/**
		 * The meta object literal for the '<em><b>Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD__STAMP = eINSTANCE.getCmd_Stamp();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.cmd.impl.CompoundCmdImpl <em>Compound Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.cmd.impl.CompoundCmdImpl
		 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getCompoundCmd()
		 * @generated
		 */
		EClass COMPOUND_CMD = eINSTANCE.getCompoundCmd();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_CMD__CHILDREN = eINSTANCE.getCompoundCmd_Children();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.cmd.impl.XCmdImpl <em>XCmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.cmd.impl.XCmdImpl
		 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getXCmd()
		 * @generated
		 */
		EClass XCMD = eINSTANCE.getXCmd();

		/**
		 * The meta object literal for the '<em><b>Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCMD__OBJ = eINSTANCE.getXCmd_Obj();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.cmd.impl.ByteCmdImpl <em>Byte Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.cmd.impl.ByteCmdImpl
		 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getByteCmd()
		 * @generated
		 */
		EClass BYTE_CMD = eINSTANCE.getByteCmd();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE_CMD__MESSAGE = eINSTANCE.getByteCmd_Message();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.cmd.PRIORITY <em>PRIORITY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.cmd.PRIORITY
		 * @see net.sf.xqz.model.cmd.impl.CmdPackageImpl#getPRIORITY()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPRIORITY();

	}

} //CmdPackage
