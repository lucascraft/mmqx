/**
 */
package net.sf.xqz.engine.script.orchestror.impl;

import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;
import net.sf.xqz.engine.script.orchestror.DSLEngineClient;
import net.sf.xqz.engine.script.orchestror.DSLOrchestror;
import net.sf.xqz.engine.script.orchestror.DSLPriority;
import net.sf.xqz.engine.script.orchestror.DSLRate;
import net.sf.xqz.engine.script.orchestror.DSLStrategy;
import net.sf.xqz.engine.script.orchestror.OrchestrorFactory;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrorPackageImpl extends EPackageImpl implements OrchestrorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslOrchestrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslCommandEngineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslEngineClientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dslStrategyEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dslRateEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dslPriorityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.sf.xqz.engine.script.orchestror.OrchestrorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OrchestrorPackageImpl()
  {
    super(eNS_URI, OrchestrorFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OrchestrorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OrchestrorPackage init()
  {
    if (isInited) return (OrchestrorPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrorPackage.eNS_URI);

    // Obtain or create and register package
    OrchestrorPackageImpl theOrchestrorPackage = (OrchestrorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrchestrorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrchestrorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOrchestrorPackage.createPackageContents();

    // Initialize created meta-data
    theOrchestrorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOrchestrorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OrchestrorPackage.eNS_URI, theOrchestrorPackage);
    return theOrchestrorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSLOrchestror()
  {
    return dslOrchestrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLOrchestror_Name()
  {
    return (EAttribute)dslOrchestrorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSLOrchestror_Engines()
  {
    return (EReference)dslOrchestrorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSLOrchestror_Clients()
  {
    return (EReference)dslOrchestrorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSLCommandEngine()
  {
    return dslCommandEngineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLCommandEngine_Name()
  {
    return (EAttribute)dslCommandEngineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLCommandEngine_Speed()
  {
    return (EAttribute)dslCommandEngineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLCommandEngine_Ttl()
  {
    return (EAttribute)dslCommandEngineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLCommandEngine_Strategy()
  {
    return (EAttribute)dslCommandEngineEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLCommandEngine_Threshold()
  {
    return (EAttribute)dslCommandEngineEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLCommandEngine_Priority()
  {
    return (EAttribute)dslCommandEngineEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLCommandEngine_FillterID()
  {
    return (EAttribute)dslCommandEngineEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSLEngineClient()
  {
    return dslEngineClientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLEngineClient_Name()
  {
    return (EAttribute)dslEngineClientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLEngineClient_Speed()
  {
    return (EAttribute)dslEngineClientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSLEngineClient_RefCmdEngines()
  {
    return (EReference)dslEngineClientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDSLStrategy()
  {
    return dslStrategyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDSLRate()
  {
    return dslRateEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDSLPriority()
  {
    return dslPriorityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrchestrorFactory getOrchestrorFactory()
  {
    return (OrchestrorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dslOrchestrorEClass = createEClass(DSL_ORCHESTROR);
    createEAttribute(dslOrchestrorEClass, DSL_ORCHESTROR__NAME);
    createEReference(dslOrchestrorEClass, DSL_ORCHESTROR__ENGINES);
    createEReference(dslOrchestrorEClass, DSL_ORCHESTROR__CLIENTS);

    dslCommandEngineEClass = createEClass(DSL_COMMAND_ENGINE);
    createEAttribute(dslCommandEngineEClass, DSL_COMMAND_ENGINE__NAME);
    createEAttribute(dslCommandEngineEClass, DSL_COMMAND_ENGINE__SPEED);
    createEAttribute(dslCommandEngineEClass, DSL_COMMAND_ENGINE__TTL);
    createEAttribute(dslCommandEngineEClass, DSL_COMMAND_ENGINE__STRATEGY);
    createEAttribute(dslCommandEngineEClass, DSL_COMMAND_ENGINE__THRESHOLD);
    createEAttribute(dslCommandEngineEClass, DSL_COMMAND_ENGINE__PRIORITY);
    createEAttribute(dslCommandEngineEClass, DSL_COMMAND_ENGINE__FILLTER_ID);

    dslEngineClientEClass = createEClass(DSL_ENGINE_CLIENT);
    createEAttribute(dslEngineClientEClass, DSL_ENGINE_CLIENT__NAME);
    createEAttribute(dslEngineClientEClass, DSL_ENGINE_CLIENT__SPEED);
    createEReference(dslEngineClientEClass, DSL_ENGINE_CLIENT__REF_CMD_ENGINES);

    // Create enums
    dslStrategyEEnum = createEEnum(DSL_STRATEGY);
    dslRateEEnum = createEEnum(DSL_RATE);
    dslPriorityEEnum = createEEnum(DSL_PRIORITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(dslOrchestrorEClass, DSLOrchestror.class, "DSLOrchestror", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSLOrchestror_Name(), ecorePackage.getEString(), "name", null, 0, 1, DSLOrchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSLOrchestror_Engines(), this.getDSLCommandEngine(), null, "engines", null, 0, -1, DSLOrchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSLOrchestror_Clients(), this.getDSLEngineClient(), null, "clients", null, 0, -1, DSLOrchestror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslCommandEngineEClass, DSLCommandEngine.class, "DSLCommandEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSLCommandEngine_Name(), ecorePackage.getEString(), "name", null, 0, 1, DSLCommandEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSLCommandEngine_Speed(), this.getDSLRate(), "speed", null, 0, 1, DSLCommandEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSLCommandEngine_Ttl(), ecorePackage.getEInt(), "ttl", null, 0, 1, DSLCommandEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSLCommandEngine_Strategy(), this.getDSLStrategy(), "strategy", null, 0, 1, DSLCommandEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSLCommandEngine_Threshold(), ecorePackage.getEInt(), "threshold", null, 0, 1, DSLCommandEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSLCommandEngine_Priority(), this.getDSLPriority(), "priority", null, 0, 1, DSLCommandEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSLCommandEngine_FillterID(), ecorePackage.getEString(), "fillterID", null, 0, 1, DSLCommandEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslEngineClientEClass, DSLEngineClient.class, "DSLEngineClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSLEngineClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, DSLEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSLEngineClient_Speed(), this.getDSLRate(), "speed", null, 0, 1, DSLEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSLEngineClient_RefCmdEngines(), this.getDSLCommandEngine(), null, "refCmdEngines", null, 0, -1, DSLEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dslStrategyEEnum, DSLStrategy.class, "DSLStrategy");
    addEEnumLiteral(dslStrategyEEnum, DSLStrategy.PICK_NRUSH);
    addEEnumLiteral(dslStrategyEEnum, DSLStrategy.OLDEST_MOST_URGENT);
    addEEnumLiteral(dslStrategyEEnum, DSLStrategy.NEWEST_MOST_URGENT);
    addEEnumLiteral(dslStrategyEEnum, DSLStrategy.PREDICATE);
    addEEnumLiteral(dslStrategyEEnum, DSLStrategy.ROUN_ROBIN);
    addEEnumLiteral(dslStrategyEEnum, DSLStrategy.TIME_RANGE_INCLUSIVE);
    addEEnumLiteral(dslStrategyEEnum, DSLStrategy.TIME_RANGE_EXCLUSIVE);

    initEEnum(dslRateEEnum, DSLRate.class, "DSLRate");
    addEEnumLiteral(dslRateEEnum, DSLRate.MAX);
    addEEnumLiteral(dslRateEEnum, DSLRate.VERY_FAST);
    addEEnumLiteral(dslRateEEnum, DSLRate.FAST);
    addEEnumLiteral(dslRateEEnum, DSLRate.AVERAGE);
    addEEnumLiteral(dslRateEEnum, DSLRate.SLOW);
    addEEnumLiteral(dslRateEEnum, DSLRate.VERY_SLOW);
    addEEnumLiteral(dslRateEEnum, DSLRate.MIN);

    initEEnum(dslPriorityEEnum, DSLPriority.class, "DSLPriority");
    addEEnumLiteral(dslPriorityEEnum, DSLPriority.HIGHER);
    addEEnumLiteral(dslPriorityEEnum, DSLPriority.HIGH);
    addEEnumLiteral(dslPriorityEEnum, DSLPriority.MEDIUM);
    addEEnumLiteral(dslPriorityEEnum, DSLPriority.LOW);
    addEEnumLiteral(dslPriorityEEnum, DSLPriority.LOWEST);

    // Create resource
    createResource(eNS_URI);
  }

} //OrchestrorPackageImpl
