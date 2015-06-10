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

import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.temporal.EXECUTION_STATUS;
import net.sf.xqz.model.temporal.Orchestror;
import net.sf.xqz.model.temporal.TemporalPackage;
import net.sf.xqz.model.temporal.TimeInfo;
import net.sf.xqz.model.temporal.TimeLine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getCmdEngine <em>Cmd Engine</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getOrchestror <em>Orchestror</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.TimeLineImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeLineImpl extends MinimalEObjectImpl.Container implements TimeLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalPackage.Literals.TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(TemporalPackage.Literals.TIME_LINE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(TemporalPackage.Literals.TIME_LINE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(TemporalPackage.Literals.TIME_LINE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TemporalPackage.Literals.TIME_LINE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStart() {
		return (Long)eGet(TemporalPackage.Literals.TIME_LINE__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(long newStart) {
		eSet(TemporalPackage.Literals.TIME_LINE__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFinish() {
		return (Long)eGet(TemporalPackage.Literals.TIME_LINE__FINISH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(long newFinish) {
		eSet(TemporalPackage.Literals.TIME_LINE__FINISH, newFinish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXECUTION_STATUS getStatus() {
		return (EXECUTION_STATUS)eGet(TemporalPackage.Literals.TIME_LINE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EXECUTION_STATUS newStatus) {
		eSet(TemporalPackage.Literals.TIME_LINE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getCmdEngine() {
		return (CmdPipe)eGet(TemporalPackage.Literals.TIME_LINE__CMD_ENGINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdEngine(CmdPipe newCmdEngine) {
		eSet(TemporalPackage.Literals.TIME_LINE__CMD_ENGINE, newCmdEngine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orchestror getOrchestror() {
		return (Orchestror)eGet(TemporalPackage.Literals.TIME_LINE__ORCHESTROR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrchestror(Orchestror newOrchestror) {
		eSet(TemporalPackage.Literals.TIME_LINE__ORCHESTROR, newOrchestror);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInfo getTime() {
		return (TimeInfo)eGet(TemporalPackage.Literals.TIME_LINE__TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TimeInfo newTime) {
		eSet(TemporalPackage.Literals.TIME_LINE__TIME, newTime);
	}

} //TimeLineImpl
