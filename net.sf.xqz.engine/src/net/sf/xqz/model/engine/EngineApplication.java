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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.engine.EngineApplication#getEngine <em>Engine</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.EngineApplication#getClients <em>Clients</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.EngineApplication#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.EngineApplication#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.engine.EnginePackage#getEngineApplication()
 * @model
 * @generated
 */
public interface EngineApplication extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.CmdPipe}.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.engine.CmdPipe#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getEngineApplication_Engine()
	 * @see net.sf.xqz.model.engine.CmdPipe#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	List<CmdPipe> getEngine();

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.EngineClient}.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.engine.EngineClient#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getEngineApplication_Clients()
	 * @see net.sf.xqz.model.engine.EngineClient#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	List<EngineClient> getClients();

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
	 * @see net.sf.xqz.model.engine.EnginePackage#getEngineApplication_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.EngineApplication#getId <em>Id</em>}' attribute.
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
	 * @see net.sf.xqz.model.engine.EnginePackage#getEngineApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.EngineApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EngineApplication
