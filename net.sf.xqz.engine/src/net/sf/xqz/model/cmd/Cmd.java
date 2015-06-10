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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.cmd.Cmd#getPriority <em>Priority</em>}</li>
 *   <li>{@link net.sf.xqz.model.cmd.Cmd#getStamp <em>Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.cmd.CmdPackage#getCmd()
 * @model abstract="true"
 * @generated
 */
public interface Cmd extends EObject {
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
	 * @see net.sf.xqz.model.cmd.CmdPackage#getCmd_Priority()
	 * @model
	 * @generated
	 */
	PRIORITY getPriority();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.cmd.Cmd#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see net.sf.xqz.model.cmd.PRIORITY
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PRIORITY value);

	/**
	 * Returns the value of the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stamp</em>' attribute.
	 * @see #setStamp(long)
	 * @see net.sf.xqz.model.cmd.CmdPackage#getCmd_Stamp()
	 * @model
	 * @generated
	 */
	long getStamp();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.cmd.Cmd#getStamp <em>Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stamp</em>' attribute.
	 * @see #getStamp()
	 * @generated
	 */
	void setStamp(long value);

} // Cmd
