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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qx Processing Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.xqz.model.engine.EnginePackage#getQxProcessingStrategy()
 * @model
 * @generated
 */
public enum QxProcessingStrategy implements Enumerator {
	/**
	 * The '<em><b>OLDEST MOST URGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLDEST_MOST_URGENT_VALUE
	 * @generated
	 * @ordered
	 */
	OLDEST_MOST_URGENT(0, "OLDEST_MOST_URGENT", "OLDEST_MOST_URGENT"),

	/**
	 * The '<em><b>NEWEST MOST URGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWEST_MOST_URGENT_VALUE
	 * @generated
	 * @ordered
	 */
	NEWEST_MOST_URGENT(1, "NEWEST_MOST_URGENT", "NEWEST_MOST_URGENT"),

	/**
	 * The '<em><b>ROUND ROBIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND_ROBIN(2, "ROUND_ROBIN", "ROUND_ROBIN"),

	/**
	 * The '<em><b>PREDICATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICATE_VALUE
	 * @generated
	 * @ordered
	 */
	PREDICATE(3, "PREDICATE", "PREDICATE"),

	/**
	 * The '<em><b>TIME RANGE EXCLUSIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_RANGE_EXCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_RANGE_EXCLUSIVE(4, "TIME_RANGE_EXCLUSIVE", "TIME_RANGE_EXCLUSIVE"),

	/**
	 * The '<em><b>TIME RANGE INCLUSIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_RANGE_INCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_RANGE_INCLUSIVE(5, "TIME_RANGE_INCLUSIVE", "TIME_RANGE_INCLUSIVE"), /**
	 * The '<em><b>PICK NFLUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICK_NFLUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PICK_NFLUSH(6, "PICK_N_FLUSH", "PICK_N_FLUSH");

	/**
	 * The '<em><b>OLDEST MOST URGENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OLDEST MOST URGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OLDEST_MOST_URGENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OLDEST_MOST_URGENT_VALUE = 0;

	/**
	 * The '<em><b>NEWEST MOST URGENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEWEST MOST URGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEWEST_MOST_URGENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEWEST_MOST_URGENT_VALUE = 1;

	/**
	 * The '<em><b>ROUND ROBIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROUND ROBIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_ROBIN_VALUE = 2;

	/**
	 * The '<em><b>PREDICATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREDICATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREDICATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREDICATE_VALUE = 3;

	/**
	 * The '<em><b>TIME RANGE EXCLUSIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME RANGE EXCLUSIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_RANGE_EXCLUSIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_RANGE_EXCLUSIVE_VALUE = 4;

	/**
	 * The '<em><b>TIME RANGE INCLUSIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME RANGE INCLUSIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_RANGE_INCLUSIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_RANGE_INCLUSIVE_VALUE = 5;

	/**
	 * The '<em><b>PICK NFLUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PICK NFLUSH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PICK_NFLUSH
	 * @model name="PICK_N_FLUSH"
	 * @generated
	 * @ordered
	 */
	public static final int PICK_NFLUSH_VALUE = 6;

	/**
	 * An array of all the '<em><b>Qx Processing Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QxProcessingStrategy[] VALUES_ARRAY =
		new QxProcessingStrategy[] {
			OLDEST_MOST_URGENT,
			NEWEST_MOST_URGENT,
			ROUND_ROBIN,
			PREDICATE,
			TIME_RANGE_EXCLUSIVE,
			TIME_RANGE_INCLUSIVE,
			PICK_NFLUSH,
		};

	/**
	 * A public read-only list of all the '<em><b>Qx Processing Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QxProcessingStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qx Processing Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QxProcessingStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QxProcessingStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qx Processing Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QxProcessingStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QxProcessingStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qx Processing Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QxProcessingStrategy get(int value) {
		switch (value) {
			case OLDEST_MOST_URGENT_VALUE: return OLDEST_MOST_URGENT;
			case NEWEST_MOST_URGENT_VALUE: return NEWEST_MOST_URGENT;
			case ROUND_ROBIN_VALUE: return ROUND_ROBIN;
			case PREDICATE_VALUE: return PREDICATE;
			case TIME_RANGE_EXCLUSIVE_VALUE: return TIME_RANGE_EXCLUSIVE;
			case TIME_RANGE_INCLUSIVE_VALUE: return TIME_RANGE_INCLUSIVE;
			case PICK_NFLUSH_VALUE: return PICK_NFLUSH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QxProcessingStrategy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //QxProcessingStrategy
