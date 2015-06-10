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

import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getCmdEngine <em>Cmd Engine</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getOrchestror <em>Orchestror</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.TimeLine#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine()
 * @model
 * @generated
 */
public interface TimeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"T1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_Id()
	 * @model default="T1"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"T1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_Name()
	 * @model default="T1"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(long)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_Start()
	 * @model default="0"
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' attribute.
	 * The default value is <code>"5000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' attribute.
	 * @see #setFinish(long)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_Finish()
	 * @model default="5000"
	 * @generated
	 */
	long getFinish();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getFinish <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' attribute.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link net.sf.xqz.model.temporal.EXECUTION_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.xqz.model.temporal.EXECUTION_STATUS
	 * @see #setStatus(EXECUTION_STATUS)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_Status()
	 * @model default=""
	 * @generated
	 */
	EXECUTION_STATUS getStatus();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.xqz.model.temporal.EXECUTION_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EXECUTION_STATUS value);

	/**
	 * Returns the value of the '<em><b>Cmd Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Engine</em>' reference.
	 * @see #setCmdEngine(CmdPipe)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_CmdEngine()
	 * @model
	 * @generated
	 */
	CmdPipe getCmdEngine();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getCmdEngine <em>Cmd Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Engine</em>' reference.
	 * @see #getCmdEngine()
	 * @generated
	 */
	void setCmdEngine(CmdPipe value);

	/**
	 * Returns the value of the '<em><b>Orchestror</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.temporal.Orchestror#getTimelines <em>Timelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orchestror</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestror</em>' container reference.
	 * @see #setOrchestror(Orchestror)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_Orchestror()
	 * @see net.sf.xqz.model.temporal.Orchestror#getTimelines
	 * @model opposite="timelines" transient="false"
	 * @generated
	 */
	Orchestror getOrchestror();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getOrchestror <em>Orchestror</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orchestror</em>' container reference.
	 * @see #getOrchestror()
	 * @generated
	 */
	void setOrchestror(Orchestror value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(TimeInfo)
	 * @see net.sf.xqz.model.temporal.TemporalPackage#getTimeLine_Time()
	 * @model
	 * @generated
	 */
	TimeInfo getTime();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.temporal.TimeLine#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeInfo value);

} // TimeLine
