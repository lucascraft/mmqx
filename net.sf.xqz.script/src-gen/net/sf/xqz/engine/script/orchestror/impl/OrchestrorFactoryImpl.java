/**
 */
package net.sf.xqz.engine.script.orchestror.impl;

import net.sf.xqz.engine.script.orchestror.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrorFactoryImpl extends EFactoryImpl implements OrchestrorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrchestrorFactory init()
  {
    try
    {
      OrchestrorFactory theOrchestrorFactory = (OrchestrorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/xqz/engine/script/Orchestror"); 
      if (theOrchestrorFactory != null)
      {
        return theOrchestrorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OrchestrorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrchestrorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OrchestrorPackage.DSL_ORCHESTROR: return createDSLOrchestror();
      case OrchestrorPackage.DSL_COMMAND_ENGINE: return createDSLCommandEngine();
      case OrchestrorPackage.DSL_ENGINE_CLIENT: return createDSLEngineClient();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OrchestrorPackage.DSL_STRATEGY:
        return createDSLStrategyFromString(eDataType, initialValue);
      case OrchestrorPackage.DSL_RATE:
        return createDSLRateFromString(eDataType, initialValue);
      case OrchestrorPackage.DSL_PRIORITY:
        return createDSLPriorityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OrchestrorPackage.DSL_STRATEGY:
        return convertDSLStrategyToString(eDataType, instanceValue);
      case OrchestrorPackage.DSL_RATE:
        return convertDSLRateToString(eDataType, instanceValue);
      case OrchestrorPackage.DSL_PRIORITY:
        return convertDSLPriorityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLOrchestror createDSLOrchestror()
  {
    DSLOrchestrorImpl dslOrchestror = new DSLOrchestrorImpl();
    return dslOrchestror;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLCommandEngine createDSLCommandEngine()
  {
    DSLCommandEngineImpl dslCommandEngine = new DSLCommandEngineImpl();
    return dslCommandEngine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEngineClient createDSLEngineClient()
  {
    DSLEngineClientImpl dslEngineClient = new DSLEngineClientImpl();
    return dslEngineClient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLStrategy createDSLStrategyFromString(EDataType eDataType, String initialValue)
  {
    DSLStrategy result = DSLStrategy.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDSLStrategyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLRate createDSLRateFromString(EDataType eDataType, String initialValue)
  {
    DSLRate result = DSLRate.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDSLRateToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPriority createDSLPriorityFromString(EDataType eDataType, String initialValue)
  {
    DSLPriority result = DSLPriority.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDSLPriorityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrchestrorPackage getOrchestrorPackage()
  {
    return (OrchestrorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OrchestrorPackage getPackage()
  {
    return OrchestrorPackage.eINSTANCE;
  }

} //OrchestrorFactoryImpl
