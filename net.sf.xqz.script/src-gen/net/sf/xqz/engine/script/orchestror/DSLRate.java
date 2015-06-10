/**
 */
package net.sf.xqz.engine.script.orchestror;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DSL Rate</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLRate()
 * @model
 * @generated
 */
public enum DSLRate implements Enumerator
{
  /**
   * The '<em><b>MAX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAX_VALUE
   * @generated
   * @ordered
   */
  MAX(0, "MAX", "MAX"),

  /**
   * The '<em><b>VERY FAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERY_FAST_VALUE
   * @generated
   * @ordered
   */
  VERY_FAST(1, "VERY_FAST", "VERY_FAST"),

  /**
   * The '<em><b>FAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAST_VALUE
   * @generated
   * @ordered
   */
  FAST(2, "FAST", "FAST"),

  /**
   * The '<em><b>AVERAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVERAGE_VALUE
   * @generated
   * @ordered
   */
  AVERAGE(3, "AVERAGE", "AVERAGE"),

  /**
   * The '<em><b>SLOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SLOW_VALUE
   * @generated
   * @ordered
   */
  SLOW(4, "SLOW", "SLOW"),

  /**
   * The '<em><b>VERY SLOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERY_SLOW_VALUE
   * @generated
   * @ordered
   */
  VERY_SLOW(5, "VERY_SLOW", "VERY_SLOW"),

  /**
   * The '<em><b>MIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIN_VALUE
   * @generated
   * @ordered
   */
  MIN(6, "MIN", "MIN");

  /**
   * The '<em><b>MAX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAX
   * @model
   * @generated
   * @ordered
   */
  public static final int MAX_VALUE = 0;

  /**
   * The '<em><b>VERY FAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERY FAST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERY_FAST
   * @model
   * @generated
   * @ordered
   */
  public static final int VERY_FAST_VALUE = 1;

  /**
   * The '<em><b>FAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FAST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FAST
   * @model
   * @generated
   * @ordered
   */
  public static final int FAST_VALUE = 2;

  /**
   * The '<em><b>AVERAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AVERAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVERAGE
   * @model
   * @generated
   * @ordered
   */
  public static final int AVERAGE_VALUE = 3;

  /**
   * The '<em><b>SLOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SLOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SLOW
   * @model
   * @generated
   * @ordered
   */
  public static final int SLOW_VALUE = 4;

  /**
   * The '<em><b>VERY SLOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERY SLOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERY_SLOW
   * @model
   * @generated
   * @ordered
   */
  public static final int VERY_SLOW_VALUE = 5;

  /**
   * The '<em><b>MIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIN
   * @model
   * @generated
   * @ordered
   */
  public static final int MIN_VALUE = 6;

  /**
   * An array of all the '<em><b>DSL Rate</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DSLRate[] VALUES_ARRAY =
    new DSLRate[]
    {
      MAX,
      VERY_FAST,
      FAST,
      AVERAGE,
      SLOW,
      VERY_SLOW,
      MIN,
    };

  /**
   * A public read-only list of all the '<em><b>DSL Rate</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DSLRate> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>DSL Rate</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLRate get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DSLRate result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DSL Rate</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLRate getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DSLRate result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DSL Rate</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLRate get(int value)
  {
    switch (value)
    {
      case MAX_VALUE: return MAX;
      case VERY_FAST_VALUE: return VERY_FAST;
      case FAST_VALUE: return FAST;
      case AVERAGE_VALUE: return AVERAGE;
      case SLOW_VALUE: return SLOW;
      case VERY_SLOW_VALUE: return VERY_SLOW;
      case MIN_VALUE: return MIN;
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
  private DSLRate(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DSLRate
