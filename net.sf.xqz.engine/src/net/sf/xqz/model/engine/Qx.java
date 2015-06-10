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

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.PRIORITY;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getCommands <em>Commands</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getEngine <em>Engine</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#isLocked <em>Locked</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getCurrentMaxPriority <em>Current Max Priority</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getTtl <em>Ttl</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getTimeRange <em>Time Range</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.Qx#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.engine.EnginePackage#getQx()
 * @model abstract="true"
 * @generated
 */
public interface Qx extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link net.sf.xqz.model.cmd.Cmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_Commands()
	 * @model
	 * @generated
	 */
	List<Cmd> getCommands();

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.xqz.model.engine.CmdPipe#getQueues <em>Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' container reference.
	 * @see #setEngine(CmdPipe)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_Engine()
	 * @see net.sf.xqz.model.engine.CmdPipe#getQueues
	 * @model opposite="queues" transient="false"
	 * @generated
	 */
	CmdPipe getEngine();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#getEngine <em>Engine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' container reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(CmdPipe value);

	/**
	 * Returns the value of the '<em><b>Current Max Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.xqz.model.cmd.PRIORITY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Max Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Max Priority</em>' attribute.
	 * @see net.sf.xqz.model.cmd.PRIORITY
	 * @see #setCurrentMaxPriority(PRIORITY)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_CurrentMaxPriority()
	 * @model
	 * @generated
	 */
	PRIORITY getCurrentMaxPriority();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#getCurrentMaxPriority <em>Current Max Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Max Priority</em>' attribute.
	 * @see net.sf.xqz.model.cmd.PRIORITY
	 * @see #getCurrentMaxPriority()
	 * @generated
	 */
	void setCurrentMaxPriority(PRIORITY value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttl</em>' attribute.
	 * @see #setTtl(long)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_Ttl()
	 * @model
	 * @generated
	 */
	long getTtl();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#getTtl <em>Ttl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttl</em>' attribute.
	 * @see #getTtl()
	 * @generated
	 */
	void setTtl(long value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(float)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_Threshold()
	 * @model
	 * @generated
	 */
	float getThreshold();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(float value);

	/**
	 * Returns the value of the '<em><b>Time Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Range</em>' reference.
	 * @see #setTimeRange(QxTimeRange)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_TimeRange()
	 * @model
	 * @generated
	 */
	QxTimeRange getTimeRange();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#getTimeRange <em>Time Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Range</em>' reference.
	 * @see #getTimeRange()
	 * @generated
	 */
	void setTimeRange(QxTimeRange value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.xqz.model.engine.QxProcessingStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see net.sf.xqz.model.engine.QxProcessingStrategy
	 * @see #setStrategy(QxProcessingStrategy)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_Strategy()
	 * @model
	 * @generated
	 */
	QxProcessingStrategy getStrategy();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see net.sf.xqz.model.engine.QxProcessingStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(QxProcessingStrategy value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see net.sf.xqz.model.engine.EnginePackage#getQx_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.Qx#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void postCommand(Cmd cmd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cmd consumeCommand();

} // Qx
