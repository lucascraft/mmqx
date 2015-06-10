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

import java.util.List;

import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.temporal.Orchestror;
import net.sf.xqz.model.temporal.TemporalPackage;
import net.sf.xqz.model.temporal.TimeInfo;
import net.sf.xqz.model.temporal.TimeLine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestror</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl#getTimelines <em>Timelines</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl#getClock <em>Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrchestrorImpl extends MinimalEObjectImpl.Container implements Orchestror {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalPackage.Literals.ORCHESTROR;
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
		return (String)eGet(TemporalPackage.Literals.ORCHESTROR__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(TemporalPackage.Literals.ORCHESTROR__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(TemporalPackage.Literals.ORCHESTROR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TemporalPackage.Literals.ORCHESTROR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<TimeLine> getTimelines() {
		return (List<TimeLine>)eGet(TemporalPackage.Literals.ORCHESTROR__TIMELINES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineApplication getApplication() {
		return (EngineApplication)eGet(TemporalPackage.Literals.ORCHESTROR__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(EngineApplication newApplication) {
		eSet(TemporalPackage.Literals.ORCHESTROR__APPLICATION, newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInfo getTime() {
		return (TimeInfo)eGet(TemporalPackage.Literals.ORCHESTROR__TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TimeInfo newTime) {
		eSet(TemporalPackage.Literals.ORCHESTROR__TIME, newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getClock() {
		return (Object)eGet(TemporalPackage.Literals.ORCHESTROR__CLOCK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(Object newClock) {
		eSet(TemporalPackage.Literals.ORCHESTROR__CLOCK, newClock);
	}

} //OrchestrorImpl
