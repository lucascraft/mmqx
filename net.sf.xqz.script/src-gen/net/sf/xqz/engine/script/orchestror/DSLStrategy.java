/**
 */
package net.sf.xqz.engine.script.orchestror;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DSL Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLStrategy()
 * @model
 * @generated
 */
public enum DSLStrategy implements Enumerator
{
  /**
   * The '<em><b>PICK NRUSH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PICK_NRUSH_VALUE
   * @generated
   * @ordered
   */
  PICK_NRUSH(0, "PICK_N_RUSH", "PICK_N_RUSH"),

  /**
   * The '<em><b>OLDEST MOST URGENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OLDEST_MOST_URGENT_VALUE
   * @generated
   * @ordered
   */
  OLDEST_MOST_URGENT(1, "OLDEST_MOST_URGENT", "OLDEST_MOST_URGENT"),

  /**
   * The '<em><b>NEWEST MOST URGENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEWEST_MOST_URGENT_VALUE
   * @generated
   * @ordered
   */
  NEWEST_MOST_URGENT(2, "NEWEST_MOST_URGENT", "NEWEST_MOST_URGENT"),

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
   * The '<em><b>ROUN ROBIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROUN_ROBIN_VALUE
   * @generated
   * @ordered
   */
  ROUN_ROBIN(4, "ROUN_ROBIN", "ROUN_ROBIN"),

  /**
   * The '<em><b>TIME RANGE INCLUSIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_RANGE_INCLUSIVE_VALUE
   * @generated
   * @ordered
   */
  TIME_RANGE_INCLUSIVE(5, "TIME_RANGE_INCLUSIVE", "TIME_RANGE_INCLUSIVE"),

  /**
   * The '<em><b>TIME RANGE EXCLUSIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_RANGE_EXCLUSIVE_VALUE
   * @generated
   * @ordered
   */
  TIME_RANGE_EXCLUSIVE(6, "TIME_RANGE_EXCLUSIVE", "TIME_RANGE_EXCLUSIVE");

  /**
   * The '<em><b>PICK NRUSH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PICK NRUSH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PICK_NRUSH
   * @model name="PICK_N_RUSH"
   * @generated
   * @ordered
   */
  public static final int PICK_NRUSH_VALUE = 0;

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
  public static final int OLDEST_MOST_URGENT_VALUE = 1;

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
  public static final int NEWEST_MOST_URGENT_VALUE = 2;

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
   * The '<em><b>ROUN ROBIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ROUN ROBIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROUN_ROBIN
   * @model
   * @generated
   * @ordered
   */
  public static final int ROUN_ROBIN_VALUE = 4;

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
  public static final int TIME_RANGE_EXCLUSIVE_VALUE = 6;

  /**
   * An array of all the '<em><b>DSL Strategy</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DSLStrategy[] VALUES_ARRAY =
    new DSLStrategy[]
    {
      PICK_NRUSH,
      OLDEST_MOST_URGENT,
      NEWEST_MOST_URGENT,
      PREDICATE,
      ROUN_ROBIN,
      TIME_RANGE_INCLUSIVE,
      TIME_RANGE_EXCLUSIVE,
    };

  /**
   * A public read-only list of all the '<em><b>DSL Strategy</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DSLStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>DSL Strategy</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLStrategy get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DSLStrategy result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DSL Strategy</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLStrategy getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DSLStrategy result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DSL Strategy</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLStrategy get(int value)
  {
    switch (value)
    {
      case PICK_NRUSH_VALUE: return PICK_NRUSH;
      case OLDEST_MOST_URGENT_VALUE: return OLDEST_MOST_URGENT;
      case NEWEST_MOST_URGENT_VALUE: return NEWEST_MOST_URGENT;
      case PREDICATE_VALUE: return PREDICATE;
      case ROUN_ROBIN_VALUE: return ROUN_ROBIN;
      case TIME_RANGE_INCLUSIVE_VALUE: return TIME_RANGE_INCLUSIVE;
      case TIME_RANGE_EXCLUSIVE_VALUE: return TIME_RANGE_EXCLUSIVE;
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
  private DSLStrategy(int value, String name, String literal)
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
  
} //DSLStrategy
