/**
 */
package net.sf.xqz.engine.script.orchestror;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.xqz.engine.script.orchestror.OrchestrorFactory
 * @model kind="package"
 * @generated
 */
public interface OrchestrorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "orchestror";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sf.net/xqz/engine/script/Orchestror";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "orchestror";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OrchestrorPackage eINSTANCE = net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.xqz.engine.script.orchestror.impl.DSLOrchestrorImpl <em>DSL Orchestror</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.xqz.engine.script.orchestror.impl.DSLOrchestrorImpl
   * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLOrchestror()
   * @generated
   */
  int DSL_ORCHESTROR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ORCHESTROR__NAME = 0;

  /**
   * The feature id for the '<em><b>Engines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ORCHESTROR__ENGINES = 1;

  /**
   * The feature id for the '<em><b>Clients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ORCHESTROR__CLIENTS = 2;

  /**
   * The number of structural features of the '<em>DSL Orchestror</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ORCHESTROR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl <em>DSL Command Engine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl
   * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLCommandEngine()
   * @generated
   */
  int DSL_COMMAND_ENGINE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE__SPEED = 1;

  /**
   * The feature id for the '<em><b>Ttl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE__TTL = 2;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE__STRATEGY = 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE__THRESHOLD = 4;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE__PRIORITY = 5;

  /**
   * The feature id for the '<em><b>Fillter ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE__FILLTER_ID = 6;

  /**
   * The number of structural features of the '<em>DSL Command Engine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMMAND_ENGINE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link net.sf.xqz.engine.script.orchestror.impl.DSLEngineClientImpl <em>DSL Engine Client</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.xqz.engine.script.orchestror.impl.DSLEngineClientImpl
   * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLEngineClient()
   * @generated
   */
  int DSL_ENGINE_CLIENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ENGINE_CLIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ENGINE_CLIENT__SPEED = 1;

  /**
   * The feature id for the '<em><b>Ref Cmd Engines</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ENGINE_CLIENT__REF_CMD_ENGINES = 2;

  /**
   * The number of structural features of the '<em>DSL Engine Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ENGINE_CLIENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.xqz.engine.script.orchestror.DSLStrategy <em>DSL Strategy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.xqz.engine.script.orchestror.DSLStrategy
   * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLStrategy()
   * @generated
   */
  int DSL_STRATEGY = 3;

  /**
   * The meta object id for the '{@link net.sf.xqz.engine.script.orchestror.DSLRate <em>DSL Rate</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.xqz.engine.script.orchestror.DSLRate
   * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLRate()
   * @generated
   */
  int DSL_RATE = 4;

  /**
   * The meta object id for the '{@link net.sf.xqz.engine.script.orchestror.DSLPriority <em>DSL Priority</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.xqz.engine.script.orchestror.DSLPriority
   * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLPriority()
   * @generated
   */
  int DSL_PRIORITY = 5;


  /**
   * Returns the meta object for class '{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror <em>DSL Orchestror</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Orchestror</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLOrchestror
   * @generated
   */
  EClass getDSLOrchestror();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLOrchestror#getName()
   * @see #getDSLOrchestror()
   * @generated
   */
  EAttribute getDSLOrchestror_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror#getEngines <em>Engines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Engines</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLOrchestror#getEngines()
   * @see #getDSLOrchestror()
   * @generated
   */
  EReference getDSLOrchestror_Engines();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.xqz.engine.script.orchestror.DSLOrchestror#getClients <em>Clients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clients</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLOrchestror#getClients()
   * @see #getDSLOrchestror()
   * @generated
   */
  EReference getDSLOrchestror_Clients();

  /**
   * Returns the meta object for class '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine <em>DSL Command Engine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Command Engine</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine
   * @generated
   */
  EClass getDSLCommandEngine();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getName()
   * @see #getDSLCommandEngine()
   * @generated
   */
  EAttribute getDSLCommandEngine_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getSpeed()
   * @see #getDSLCommandEngine()
   * @generated
   */
  EAttribute getDSLCommandEngine_Speed();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getTtl <em>Ttl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ttl</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getTtl()
   * @see #getDSLCommandEngine()
   * @generated
   */
  EAttribute getDSLCommandEngine_Ttl();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strategy</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getStrategy()
   * @see #getDSLCommandEngine()
   * @generated
   */
  EAttribute getDSLCommandEngine_Strategy();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getThreshold()
   * @see #getDSLCommandEngine()
   * @generated
   */
  EAttribute getDSLCommandEngine_Threshold();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getPriority()
   * @see #getDSLCommandEngine()
   * @generated
   */
  EAttribute getDSLCommandEngine_Priority();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getFillterID <em>Fillter ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fillter ID</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLCommandEngine#getFillterID()
   * @see #getDSLCommandEngine()
   * @generated
   */
  EAttribute getDSLCommandEngine_FillterID();

  /**
   * Returns the meta object for class '{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient <em>DSL Engine Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Engine Client</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLEngineClient
   * @generated
   */
  EClass getDSLEngineClient();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLEngineClient#getName()
   * @see #getDSLEngineClient()
   * @generated
   */
  EAttribute getDSLEngineClient_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLEngineClient#getSpeed()
   * @see #getDSLEngineClient()
   * @generated
   */
  EAttribute getDSLEngineClient_Speed();

  /**
   * Returns the meta object for the reference list '{@link net.sf.xqz.engine.script.orchestror.DSLEngineClient#getRefCmdEngines <em>Ref Cmd Engines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ref Cmd Engines</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLEngineClient#getRefCmdEngines()
   * @see #getDSLEngineClient()
   * @generated
   */
  EReference getDSLEngineClient_RefCmdEngines();

  /**
   * Returns the meta object for enum '{@link net.sf.xqz.engine.script.orchestror.DSLStrategy <em>DSL Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DSL Strategy</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLStrategy
   * @generated
   */
  EEnum getDSLStrategy();

  /**
   * Returns the meta object for enum '{@link net.sf.xqz.engine.script.orchestror.DSLRate <em>DSL Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DSL Rate</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLRate
   * @generated
   */
  EEnum getDSLRate();

  /**
   * Returns the meta object for enum '{@link net.sf.xqz.engine.script.orchestror.DSLPriority <em>DSL Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DSL Priority</em>'.
   * @see net.sf.xqz.engine.script.orchestror.DSLPriority
   * @generated
   */
  EEnum getDSLPriority();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OrchestrorFactory getOrchestrorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.sf.xqz.engine.script.orchestror.impl.DSLOrchestrorImpl <em>DSL Orchestror</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.xqz.engine.script.orchestror.impl.DSLOrchestrorImpl
     * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLOrchestror()
     * @generated
     */
    EClass DSL_ORCHESTROR = eINSTANCE.getDSLOrchestror();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_ORCHESTROR__NAME = eINSTANCE.getDSLOrchestror_Name();

    /**
     * The meta object literal for the '<em><b>Engines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ORCHESTROR__ENGINES = eINSTANCE.getDSLOrchestror_Engines();

    /**
     * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ORCHESTROR__CLIENTS = eINSTANCE.getDSLOrchestror_Clients();

    /**
     * The meta object literal for the '{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl <em>DSL Command Engine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl
     * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLCommandEngine()
     * @generated
     */
    EClass DSL_COMMAND_ENGINE = eINSTANCE.getDSLCommandEngine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMMAND_ENGINE__NAME = eINSTANCE.getDSLCommandEngine_Name();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMMAND_ENGINE__SPEED = eINSTANCE.getDSLCommandEngine_Speed();

    /**
     * The meta object literal for the '<em><b>Ttl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMMAND_ENGINE__TTL = eINSTANCE.getDSLCommandEngine_Ttl();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMMAND_ENGINE__STRATEGY = eINSTANCE.getDSLCommandEngine_Strategy();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMMAND_ENGINE__THRESHOLD = eINSTANCE.getDSLCommandEngine_Threshold();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMMAND_ENGINE__PRIORITY = eINSTANCE.getDSLCommandEngine_Priority();

    /**
     * The meta object literal for the '<em><b>Fillter ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMMAND_ENGINE__FILLTER_ID = eINSTANCE.getDSLCommandEngine_FillterID();

    /**
     * The meta object literal for the '{@link net.sf.xqz.engine.script.orchestror.impl.DSLEngineClientImpl <em>DSL Engine Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.xqz.engine.script.orchestror.impl.DSLEngineClientImpl
     * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLEngineClient()
     * @generated
     */
    EClass DSL_ENGINE_CLIENT = eINSTANCE.getDSLEngineClient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_ENGINE_CLIENT__NAME = eINSTANCE.getDSLEngineClient_Name();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_ENGINE_CLIENT__SPEED = eINSTANCE.getDSLEngineClient_Speed();

    /**
     * The meta object literal for the '<em><b>Ref Cmd Engines</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ENGINE_CLIENT__REF_CMD_ENGINES = eINSTANCE.getDSLEngineClient_RefCmdEngines();

    /**
     * The meta object literal for the '{@link net.sf.xqz.engine.script.orchestror.DSLStrategy <em>DSL Strategy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.xqz.engine.script.orchestror.DSLStrategy
     * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLStrategy()
     * @generated
     */
    EEnum DSL_STRATEGY = eINSTANCE.getDSLStrategy();

    /**
     * The meta object literal for the '{@link net.sf.xqz.engine.script.orchestror.DSLRate <em>DSL Rate</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.xqz.engine.script.orchestror.DSLRate
     * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLRate()
     * @generated
     */
    EEnum DSL_RATE = eINSTANCE.getDSLRate();

    /**
     * The meta object literal for the '{@link net.sf.xqz.engine.script.orchestror.DSLPriority <em>DSL Priority</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.xqz.engine.script.orchestror.DSLPriority
     * @see net.sf.xqz.engine.script.orchestror.impl.OrchestrorPackageImpl#getDSLPriority()
     * @generated
     */
    EEnum DSL_PRIORITY = eINSTANCE.getDSLPriority();

  }

} //OrchestrorPackage
