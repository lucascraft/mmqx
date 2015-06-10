/**
 */
package net.sf.xqz.engine.script.orchestror;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage
 * @generated
 */
public interface OrchestrorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OrchestrorFactory eINSTANCE = net.sf.xqz.engine.script.orchestror.impl.OrchestrorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>DSL Orchestror</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Orchestror</em>'.
   * @generated
   */
  DSLOrchestror createDSLOrchestror();

  /**
   * Returns a new object of class '<em>DSL Command Engine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Command Engine</em>'.
   * @generated
   */
  DSLCommandEngine createDSLCommandEngine();

  /**
   * Returns a new object of class '<em>DSL Engine Client</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Engine Client</em>'.
   * @generated
   */
  DSLEngineClient createDSLEngineClient();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OrchestrorPackage getOrchestrorPackage();

} //OrchestrorFactory
