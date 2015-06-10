/**
 */
package net.sf.xqz.engine.script.orchestror.impl;

import java.util.Collection;

import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;
import net.sf.xqz.engine.script.orchestror.DSLEngineClient;
import net.sf.xqz.engine.script.orchestror.DSLRate;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Engine Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLEngineClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLEngineClientImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLEngineClientImpl#getRefCmdEngines <em>Ref Cmd Engines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSLEngineClientImpl extends MinimalEObjectImpl.Container implements DSLEngineClient
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected static final DSLRate SPEED_EDEFAULT = DSLRate.MAX;

  /**
   * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected DSLRate speed = SPEED_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefCmdEngines() <em>Ref Cmd Engines</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefCmdEngines()
   * @generated
   * @ordered
   */
  protected EList<DSLCommandEngine> refCmdEngines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLEngineClientImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OrchestrorPackage.Literals.DSL_ENGINE_CLIENT;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_ENGINE_CLIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLRate getSpeed()
  {
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpeed(DSLRate newSpeed)
  {
    DSLRate oldSpeed = speed;
    speed = newSpeed == null ? SPEED_EDEFAULT : newSpeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_ENGINE_CLIENT__SPEED, oldSpeed, speed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLCommandEngine> getRefCmdEngines()
  {
    if (refCmdEngines == null)
    {
      refCmdEngines = new EObjectResolvingEList<DSLCommandEngine>(DSLCommandEngine.class, this, OrchestrorPackage.DSL_ENGINE_CLIENT__REF_CMD_ENGINES);
    }
    return refCmdEngines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OrchestrorPackage.DSL_ENGINE_CLIENT__NAME:
        return getName();
      case OrchestrorPackage.DSL_ENGINE_CLIENT__SPEED:
        return getSpeed();
      case OrchestrorPackage.DSL_ENGINE_CLIENT__REF_CMD_ENGINES:
        return getRefCmdEngines();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OrchestrorPackage.DSL_ENGINE_CLIENT__NAME:
        setName((String)newValue);
        return;
      case OrchestrorPackage.DSL_ENGINE_CLIENT__SPEED:
        setSpeed((DSLRate)newValue);
        return;
      case OrchestrorPackage.DSL_ENGINE_CLIENT__REF_CMD_ENGINES:
        getRefCmdEngines().clear();
        getRefCmdEngines().addAll((Collection<? extends DSLCommandEngine>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OrchestrorPackage.DSL_ENGINE_CLIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_ENGINE_CLIENT__SPEED:
        setSpeed(SPEED_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_ENGINE_CLIENT__REF_CMD_ENGINES:
        getRefCmdEngines().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OrchestrorPackage.DSL_ENGINE_CLIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrchestrorPackage.DSL_ENGINE_CLIENT__SPEED:
        return speed != SPEED_EDEFAULT;
      case OrchestrorPackage.DSL_ENGINE_CLIENT__REF_CMD_ENGINES:
        return refCmdEngines != null && !refCmdEngines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", speed: ");
    result.append(speed);
    result.append(')');
    return result.toString();
  }

} //DSLEngineClientImpl
