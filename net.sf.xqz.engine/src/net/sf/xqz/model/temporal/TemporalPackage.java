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
 * @see net.sf.xqz.model.temporal.TemporalFactory
 * @model kind="package"
 * @generated
 */
public interface TemporalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "temporal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.sf.xqz/temporal/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "temporal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemporalPackage eINSTANCE = net.sf.xqz.model.temporal.impl.TemporalPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.temporal.impl.TimeLineImpl <em>Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.temporal.impl.TimeLineImpl
	 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getTimeLine()
	 * @generated
	 */
	int TIME_LINE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__START = 2;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__FINISH = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Cmd Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__CMD_ENGINE = 5;

	/**
	 * The feature id for the '<em><b>Orchestror</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__ORCHESTROR = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__TIME = 7;

	/**
	 * The number of structural features of the '<em>Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl <em>Orchestror</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.temporal.impl.OrchestrorImpl
	 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getOrchestror()
	 * @generated
	 */
	int ORCHESTROR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTROR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTROR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Timelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTROR__TIMELINES = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTROR__APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTROR__TIME = 4;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTROR__CLOCK = 5;

	/**
	 * The number of structural features of the '<em>Orchestror</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTROR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.temporal.impl.TimeInfoImpl <em>Time Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.temporal.impl.TimeInfoImpl
	 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getTimeInfo()
	 * @generated
	 */
	int TIME_INFO = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INFO__START = 0;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INFO__CURSOR = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INFO__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Tick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INFO__TICK = 3;

	/**
	 * The number of structural features of the '<em>Time Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INFO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.xqz.model.temporal.EXECUTION_STATUS <em>EXECUTION STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.xqz.model.temporal.EXECUTION_STATUS
	 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getEXECUTION_STATUS()
	 * @generated
	 */
	int EXECUTION_STATUS = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.temporal.TimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine
	 * @generated
	 */
	EClass getTimeLine();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeLine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getId()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getName()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeLine#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getStart()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeLine#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getFinish()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeLine#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getStatus()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Status();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.temporal.TimeLine#getCmdEngine <em>Cmd Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cmd Engine</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getCmdEngine()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_CmdEngine();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.xqz.model.temporal.TimeLine#getOrchestror <em>Orchestror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orchestror</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getOrchestror()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_Orchestror();

	/**
	 * Returns the meta object for the reference '{@link net.sf.xqz.model.temporal.TimeLine#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see net.sf.xqz.model.temporal.TimeLine#getTime()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_Time();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.temporal.Orchestror <em>Orchestror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestror</em>'.
	 * @see net.sf.xqz.model.temporal.Orchestror
	 * @generated
	 */
	EClass getOrchestror();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.Orchestror#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.xqz.model.temporal.Orchestror#getId()
	 * @see #getOrchestror()
	 * @generated
	 */
	EAttribute getOrchestror_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.Orchestror#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.xqz.model.temporal.Orchestror#getName()
	 * @see #getOrchestror()
	 * @generated
	 */
	EAttribute getOrchestror_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.xqz.model.temporal.Orchestror#getTimelines <em>Timelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timelines</em>'.
	 * @see net.sf.xqz.model.temporal.Orchestror#getTimelines()
	 * @see #getOrchestror()
	 * @generated
	 */
	EReference getOrchestror_Timelines();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.xqz.model.temporal.Orchestror#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see net.sf.xqz.model.temporal.Orchestror#getApplication()
	 * @see #getOrchestror()
	 * @generated
	 */
	EReference getOrchestror_Application();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.xqz.model.temporal.Orchestror#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see net.sf.xqz.model.temporal.Orchestror#getTime()
	 * @see #getOrchestror()
	 * @generated
	 */
	EReference getOrchestror_Time();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.Orchestror#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see net.sf.xqz.model.temporal.Orchestror#getClock()
	 * @see #getOrchestror()
	 * @generated
	 */
	EAttribute getOrchestror_Clock();

	/**
	 * Returns the meta object for class '{@link net.sf.xqz.model.temporal.TimeInfo <em>Time Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Info</em>'.
	 * @see net.sf.xqz.model.temporal.TimeInfo
	 * @generated
	 */
	EClass getTimeInfo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeInfo#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.sf.xqz.model.temporal.TimeInfo#getStart()
	 * @see #getTimeInfo()
	 * @generated
	 */
	EAttribute getTimeInfo_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeInfo#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see net.sf.xqz.model.temporal.TimeInfo#getCursor()
	 * @see #getTimeInfo()
	 * @generated
	 */
	EAttribute getTimeInfo_Cursor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeInfo#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.sf.xqz.model.temporal.TimeInfo#getDuration()
	 * @see #getTimeInfo()
	 * @generated
	 */
	EAttribute getTimeInfo_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.xqz.model.temporal.TimeInfo#getTick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick</em>'.
	 * @see net.sf.xqz.model.temporal.TimeInfo#getTick()
	 * @see #getTimeInfo()
	 * @generated
	 */
	EAttribute getTimeInfo_Tick();

	/**
	 * Returns the meta object for enum '{@link net.sf.xqz.model.temporal.EXECUTION_STATUS <em>EXECUTION STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EXECUTION STATUS</em>'.
	 * @see net.sf.xqz.model.temporal.EXECUTION_STATUS
	 * @generated
	 */
	EEnum getEXECUTION_STATUS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemporalFactory getTemporalFactory();

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
		 * The meta object literal for the '{@link net.sf.xqz.model.temporal.impl.TimeLineImpl <em>Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.temporal.impl.TimeLineImpl
		 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getTimeLine()
		 * @generated
		 */
		EClass TIME_LINE = eINSTANCE.getTimeLine();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__ID = eINSTANCE.getTimeLine_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__NAME = eINSTANCE.getTimeLine_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__START = eINSTANCE.getTimeLine_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__FINISH = eINSTANCE.getTimeLine_Finish();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__STATUS = eINSTANCE.getTimeLine_Status();

		/**
		 * The meta object literal for the '<em><b>Cmd Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__CMD_ENGINE = eINSTANCE.getTimeLine_CmdEngine();

		/**
		 * The meta object literal for the '<em><b>Orchestror</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__ORCHESTROR = eINSTANCE.getTimeLine_Orchestror();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__TIME = eINSTANCE.getTimeLine_Time();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.temporal.impl.OrchestrorImpl <em>Orchestror</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.temporal.impl.OrchestrorImpl
		 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getOrchestror()
		 * @generated
		 */
		EClass ORCHESTROR = eINSTANCE.getOrchestror();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTROR__ID = eINSTANCE.getOrchestror_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTROR__NAME = eINSTANCE.getOrchestror_Name();

		/**
		 * The meta object literal for the '<em><b>Timelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTROR__TIMELINES = eINSTANCE.getOrchestror_Timelines();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTROR__APPLICATION = eINSTANCE.getOrchestror_Application();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTROR__TIME = eINSTANCE.getOrchestror_Time();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTROR__CLOCK = eINSTANCE.getOrchestror_Clock();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.temporal.impl.TimeInfoImpl <em>Time Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.temporal.impl.TimeInfoImpl
		 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getTimeInfo()
		 * @generated
		 */
		EClass TIME_INFO = eINSTANCE.getTimeInfo();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INFO__START = eINSTANCE.getTimeInfo_Start();

		/**
		 * The meta object literal for the '<em><b>Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INFO__CURSOR = eINSTANCE.getTimeInfo_Cursor();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INFO__DURATION = eINSTANCE.getTimeInfo_Duration();

		/**
		 * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INFO__TICK = eINSTANCE.getTimeInfo_Tick();

		/**
		 * The meta object literal for the '{@link net.sf.xqz.model.temporal.EXECUTION_STATUS <em>EXECUTION STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.xqz.model.temporal.EXECUTION_STATUS
		 * @see net.sf.xqz.model.temporal.impl.TemporalPackageImpl#getEXECUTION_STATUS()
		 * @generated
		 */
		EEnum EXECUTION_STATUS = eINSTANCE.getEXECUTION_STATUS();

	}

} //TemporalPackage
