/**
 */
package net.sf.xqz.engine.script.orchestror;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Orchestror</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror#getClients <em>Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLOrchestror()
 * @model
 * @generated
 */
public interface DSLOrchestror extends EObject
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
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLOrchestror_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Engines</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Engines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Engines</em>' containment reference list.
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLOrchestror_Engines()
   * @model containment="true"
   * @generated
   */
  EList<DSLCommandEngine> getEngines();

  /**
   * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.xqz.engine.script.orchestror.DSLEngineClient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clients</em>' containment reference list.
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#getDSLOrchestror_Clients()
   * @model containment="true"
   * @generated
   */
  EList<DSLEngineClient> getClients();

} // DSLOrchestror
