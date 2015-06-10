/**
 */
package net.sf.xqz.engine.script.orchestror;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Engine Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getRefCmdEngines <em>Ref Cmd Engines</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLEngineClient()
 * @model
 * @generated
 */
public interface DSLEngineClient extends EObject
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
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLEngineClient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getName <em>Name</em>}' attribute.
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
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLEngineClient_Speed()
   * @model
   * @generated
   */
  DSLRate getSpeed();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getSpeed <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Speed</em>' attribute.
   * @see net.sf.xqz.engine.script.orchestror.DSLRate
   * @see #getSpeed()
   * @generated
   */
  void setSpeed(DSLRate value);

  /**
   * Returns the value of the '<em><b>Ref Cmd Engines</b></em>' reference list.
   * The list contents are of type {@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Cmd Engines</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Cmd Engines</em>' reference list.
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLEngineClient_RefCmdEngines()
   * @model
   * @generated
   */
  EList<DSLCommandEngine> getRefCmdEngines();

} // DSLEngineClient
