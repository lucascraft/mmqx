/**
 */
package net.sf.xqz.engine.script.orchestror;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Command Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getTtl <em>Ttl</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getPriority <em>Priority</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getFillterID <em>Fillter ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine()
 * @model
 * @generated
 */
public interface DSLCommandEngine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Speed</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.xqz.engine.script.orchestror.DSLRate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Speed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speed</em>' attribute.
   * @see net.sf.xqz.engine.script.orchestror.DSLRate
   * @see #setSpeed(DSLRate)
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine_Speed()
   * @model
   * @generated
   */
  DSLRate getSpeed();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getSpeed <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Speed</em>' attribute.
   * @see net.sf.xqz.engine.script.orchestror.DSLRate
   * @see #getSpeed()
   * @generated
   */
  void setSpeed(DSLRate value);

  /**
   * Returns the value of the '<em><b>Ttl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ttl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ttl</em>' attribute.
   * @see #setTtl(int)
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine_Ttl()
   * @model
   * @generated
   */
  int getTtl();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getTtl <em>Ttl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ttl</em>' attribute.
   * @see #getTtl()
   * @generated
   */
  void setTtl(int value);

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.xqz.engine.script.orchestror.DSLStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' attribute.
   * @see net.sf.xqz.engine.script.orchestror.DSLStrategy
   * @see #setStrategy(DSLStrategy)
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine_Strategy()
   * @model
   * @generated
   */
  DSLStrategy getStrategy();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getStrategy <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' attribute.
   * @see net.sf.xqz.engine.script.orchestror.DSLStrategy
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(DSLStrategy value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(int)
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine_Threshold()
   * @model
   * @generated
   */
  int getThreshold();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(int value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.xqz.engine.script.orchestror.DSLPriority}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see net.sf.xqz.engine.script.orchestror.DSLPriority
   * @see #setPriority(DSLPriority)
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine_Priority()
   * @model
   * @generated
   */
  DSLPriority getPriority();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see net.sf.xqz.engine.script.orchestror.DSLPriority
   * @see #getPriority()
   * @generated
   */
  void setPriority(DSLPriority value);

  /**
   * Returns the value of the '<em><b>Fillter ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fillter ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fillter ID</em>' attribute.
   * @see #setFillterID(String)
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLCommandEngine_FillterID()
   * @model
   * @generated
   */
  String getFillterID();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getFillterID <em>Fillter ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fillter ID</em>' attribute.
   * @see #getFillterID()
   * @generated
   */
  void setFillterID(String value);

} // DSLCommandEngine
