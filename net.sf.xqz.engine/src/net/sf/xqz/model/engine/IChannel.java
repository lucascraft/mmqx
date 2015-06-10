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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IChannel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.engine.IChannel#getCmdInterpretrers <em>Cmd Interpretrers</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.IChannel#getFrameInterpreters <em>Frame Interpreters</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.IChannel#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link net.sf.xqz.model.engine.IChannel#getLastFrame <em>Last Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.engine.EnginePackage#getIChannel()
 * @model
 * @generated
 */
public interface IChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Cmd Interpretrers</b></em>' reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.IXCmdInterpreter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Interpretrers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Interpretrers</em>' reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getIChannel_CmdInterpretrers()
	 * @model
	 * @generated
	 */
	List<IXCmdInterpreter> getCmdInterpretrers();

	/**
	 * Returns the value of the '<em><b>Frame Interpreters</b></em>' reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.IXFrameInterpreter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Interpreters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Interpreters</em>' reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getIChannel_FrameInterpreters()
	 * @model
	 * @generated
	 */
	List<IXFrameInterpreter> getFrameInterpreters();

	/**
	 * Returns the value of the '<em><b>Event Listeners</b></em>' reference list.
	 * The list contents are of type {@link net.sf.xqz.model.engine.AbstractQxEventHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listeners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listeners</em>' reference list.
	 * @see net.sf.xqz.model.engine.EnginePackage#getIChannel_EventListeners()
	 * @model
	 * @generated
	 */
	List<AbstractQxEventHandler> getEventListeners();

	/**
	 * Returns the value of the '<em><b>Last Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Frame</em>' attribute.
	 * @see #setLastFrame(byte[])
	 * @see net.sf.xqz.model.engine.EnginePackage#getIChannel_LastFrame()
	 * @model
	 * @generated
	 */
	byte[] getLastFrame();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.engine.IChannel#getLastFrame <em>Last Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Frame</em>' attribute.
	 * @see #getLastFrame()
	 * @generated
	 */
	void setLastFrame(byte[] value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send(byte[] bytes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receive(byte[] bytes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean inputReady();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean outputReady();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean connected();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void debug();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void get(Event event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send(Cmd cmd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addFrameListener(AbstractFrameInterpreter frameListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeFrameListener(AbstractFrameInterpreter frameListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCmdListener(AbstractCmdInterpreter cmdListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCmdListener(AbstractCmdInterpreter cmdListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addQxEventListener(AbstractQxEventHandler eventListener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeQxEventListener(AbstractQxEventHandler eventListener);

} // IChannel
