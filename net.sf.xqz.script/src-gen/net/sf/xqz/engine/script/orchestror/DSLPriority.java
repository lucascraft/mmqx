/**
 */
package net.sf.xqz.engine.script.orchestror;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DSL Priority</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLPriority()
 * @model
 * @generated
 */
public enum DSLPriority implements Enumerator
{
  /**
   * The '<em><b>HIGHER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HIGHER_VALUE
   * @generated
   * @ordered
   */
  HIGHER(0, "HIGHER", "HIGHER"),

  /**
   * The '<em><b>HIGH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HIGH_VALUE
   * @generated
   * @ordered
   */
  HIGH(1, "HIGH", "HIGH"),

  /**
   * The '<em><b>MEDIUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIUM_VALUE
   * @generated
   * @ordered
   */
  MEDIUM(2, "MEDIUM", "MEDIUM"),

  /**
   * The '<em><b>LOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOW_VALUE
   * @generated
   * @ordered
   */
  LOW(3, "LOW", "LOW"),

  /**
   * The '<em><b>LOWEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOWEST_VALUE
   * @generated
   * @ordered
   */
  LOWEST(4, "LOWEST", "LOWEST");

  /**
   * The '<em><b>HIGHER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HIGHER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HIGHER
   * @model
   * @generated
   * @ordered
   */
  public static final int HIGHER_VALUE = 0;

  /**
   * The '<em><b>HIGH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HIGH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HIGH
   * @model
   * @generated
   * @ordered
   */
  public static final int HIGH_VALUE = 1;

  /**
   * The '<em><b>MEDIUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEDIUM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEDIUM
   * @model
   * @generated
   * @ordered
   */
  public static final int MEDIUM_VALUE = 2;

  /**
   * The '<em><b>LOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOW
   * @model
   * @generated
   * @ordered
   */
  public static final int LOW_VALUE = 3;

  /**
   * The '<em><b>LOWEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOWEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOWEST
   * @model
   * @generated
   * @ordered
   */
  public static final int LOWEST_VALUE = 4;

  /**
   * An array of all the '<em><b>DSL Priority</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DSLPriority[] VALUES_ARRAY =
    new DSLPriority[]
    {
      HIGHER,
      HIGH,
      MEDIUM,
      LOW,
      LOWEST,
    };

  /**
   * A public read-only list of all the '<em><b>DSL Priority</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DSLPriority> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>DSL Priority</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLPriority get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DSLPriority result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DSL Priority</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLPriority getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DSLPriority result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DSL Priority</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLPriority get(int value)
  {
    switch (value)
    {
      case HIGHER_VALUE: return HIGHER;
      case HIGH_VALUE: return HIGH;
      case MEDIUM_VALUE: return MEDIUM;
      case LOW_VALUE: return LOW;
      case LOWEST_VALUE: return LOWEST;
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
  private DSLPriority(int value, String name, String literal)
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
  
} //DSLPriority
