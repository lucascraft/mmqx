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

package net.sf.xqz.model.temporal;

import java.util.List;

import net.sf.xqz.model.engine.EngineApplication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestror</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.temporal.Orchestror#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.Orchestror#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.Orchestror#getTimelines <em>Timelines</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.Orchestror#getApplication <em>Application</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.Orchestror#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.Orchestror#getClock <em>Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.temporal.TemporalPackage#getOrchestror()
 * @model
 * @generated
 */
public interface Orchestror extends EObject {
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
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getOrchestror_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.Orchestror#getId <em>Id</em>}' attribute.
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
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getOrchestror_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.Orchestror#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Timelines</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.temporal.TimeLine}.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.temporal.TimeLine#getOrchestror <em>Orchestror</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timelines</em>' containment reference list.
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getOrchestror_Timelines()
	 * @see net.sf.xqz.model.temporal.TimeLine#getOrchestror
	 * @model opposite="orchestror" containment="true"
	 * @generated
	 */
	List<TimeLine> getTimelines();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(EngineApplication)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getOrchestror_Application()
	 * @model containment="true"
	 * @generated
	 */
	EngineApplication getApplication();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.Orchestror#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(EngineApplication value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeInfo)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getOrchestror_Time()
	 * @model containment="true"
	 * @generated
	 */
	TimeInfo getTime();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.Orchestror#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeInfo value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(Object)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getOrchestror_Clock()
	 * @model
	 * @generated
	 */
	Object getClock();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.Orchestror#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Object value);

} // Orchestror
