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

package net.sf.xqz.model.engine.impl;

import java.util.List;

import net.sf.xqz.engine.utils.EngineUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.QxProcessingStrategy;
import net.sf.xqz.model.engine.QxTimeRange;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qx</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getCurrentMaxPriority <em>Current Max Priority</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getTtl <em>Ttl</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getTimeRange <em>Time Range</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.impl.QxImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QxImpl extends MinimalEObjectImpl.Container implements Qx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.QX;
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
	@SuppressWarnings("unchecked")
	public List<Cmd> getCommands() {
		return (List<Cmd>)eGet(EnginePackage.Literals.QX__COMMANDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getEngine() {
		return (CmdPipe)eGet(EnginePackage.Literals.QX__ENGINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(CmdPipe newEngine) {
		eSet(EnginePackage.Literals.QX__ENGINE, newEngine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIORITY getCurrentMaxPriority() {
		return (PRIORITY)eGet(EnginePackage.Literals.QX__CURRENT_MAX_PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentMaxPriority(PRIORITY newCurrentMaxPriority) {
		eSet(EnginePackage.Literals.QX__CURRENT_MAX_PRIORITY, newCurrentMaxPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocked() {
		return (Boolean)eGet(EnginePackage.Literals.QX__LOCKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked) {
		eSet(EnginePackage.Literals.QX__LOCKED, newLocked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTtl() {
		return (Long)eGet(EnginePackage.Literals.QX__TTL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTtl(long newTtl) {
		eSet(EnginePackage.Literals.QX__TTL, newTtl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThreshold() {
		return (Float)eGet(EnginePackage.Literals.QX__THRESHOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(float newThreshold) {
		eSet(EnginePackage.Literals.QX__THRESHOLD, newThreshold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QxTimeRange getTimeRange() {
		return (QxTimeRange)eGet(EnginePackage.Literals.QX__TIME_RANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeRange(QxTimeRange newTimeRange) {
		eSet(EnginePackage.Literals.QX__TIME_RANGE, newTimeRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QxProcessingStrategy getStrategy() {
		return (QxProcessingStrategy)eGet(EnginePackage.Literals.QX__STRATEGY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(QxProcessingStrategy newStrategy) {
		eSet(EnginePackage.Literals.QX__STRATEGY, newStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return (Integer)eGet(EnginePackage.Literals.QX__MAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		eSet(EnginePackage.Literals.QX__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void postCommand(Cmd cmd) {
		EngineUtil.INSTANCE.sendCmd(this, cmd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 * @generated NOT
	 */
	public Cmd consumeCommand() {
		return EngineUtil.INSTANCE.consumeCmd(this);
	}

} //QxImpl
