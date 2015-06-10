/**
 */
package net.sf.xqz.engine.script.orchestror.impl;

import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;
import net.sf.xqz.engine.script.orchestror.DSLPriority;
import net.sf.xqz.engine.script.orchestror.DSLRate;
import net.sf.xqz.engine.script.orchestror.DSLStrategy;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Command Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl#getTtl <em>Ttl</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLCommandEngineImpl#getFillterID <em>Fillter ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSLCommandEngineImpl extends MinimalEObjectImpl.Container implements DSLCommandEngine
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
   * The default value of the '{@link #getTtl() <em>Ttl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTtl()
   * @generated
   * @ordered
   */
  protected static final int TTL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTtl() <em>Ttl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTtl()
   * @generated
   * @ordered
   */
  protected int ttl = TTL_EDEFAULT;

  /**
   * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected static final DSLStrategy STRATEGY_EDEFAULT = DSLStrategy.PICK_NRUSH;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected DSLStrategy strategy = STRATEGY_EDEFAULT;

  /**
   * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected static final int THRESHOLD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected int threshold = THRESHOLD_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final DSLPriority PRIORITY_EDEFAULT = DSLPriority.HIGHER;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected DSLPriority priority = PRIORITY_EDEFAULT;

  /**
   * The default value of the '{@link #getFillterID() <em>Fillter ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillterID()
   * @generated
   * @ordered
   */
  protected static final String FILLTER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFillterID() <em>Fillter ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillterID()
   * @generated
   * @ordered
   */
  protected String fillterID = FILLTER_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLCommandEngineImpl()
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
    return OrchestrorPackage.Literals.DSL_COMMAND_ENGINE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_COMMAND_ENGINE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_COMMAND_ENGINE__SPEED, oldSpeed, speed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTtl()
  {
    return ttl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTtl(int newTtl)
  {
    int oldTtl = ttl;
    ttl = newTtl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_COMMAND_ENGINE__TTL, oldTtl, ttl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLStrategy getStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrategy(DSLStrategy newStrategy)
  {
    DSLStrategy oldStrategy = strategy;
    strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_COMMAND_ENGINE__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getThreshold()
  {
    return threshold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreshold(int newThreshold)
  {
    int oldThreshold = threshold;
    threshold = newThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_COMMAND_ENGINE__THRESHOLD, oldThreshold, threshold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLPriority getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(DSLPriority newPriority)
  {
    DSLPriority oldPriority = priority;
    priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_COMMAND_ENGINE__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFillterID()
  {
    return fillterID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFillterID(String newFillterID)
  {
    String oldFillterID = fillterID;
    fillterID = newFillterID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_COMMAND_ENGINE__FILLTER_ID, oldFillterID, fillterID));
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
      case OrchestrorPackage.DSL_COMMAND_ENGINE__NAME:
        return getName();
      case OrchestrorPackage.DSL_COMMAND_ENGINE__SPEED:
        return getSpeed();
      case OrchestrorPackage.DSL_COMMAND_ENGINE__TTL:
        return getTtl();
      case OrchestrorPackage.DSL_COMMAND_ENGINE__STRATEGY:
        return getStrategy();
      case OrchestrorPackage.DSL_COMMAND_ENGINE__THRESHOLD:
        return getThreshold();
      case OrchestrorPackage.DSL_COMMAND_ENGINE__PRIORITY:
        return getPriority();
      case OrchestrorPackage.DSL_COMMAND_ENGINE__FILLTER_ID:
        return getFillterID();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OrchestrorPackage.DSL_COMMAND_ENGINE__NAME:
        setName((String)newValue);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__SPEED:
        setSpeed((DSLRate)newValue);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__TTL:
        setTtl((Integer)newValue);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__STRATEGY:
        setStrategy((DSLStrategy)newValue);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__THRESHOLD:
        setThreshold((Integer)newValue);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__PRIORITY:
        setPriority((DSLPriority)newValue);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__FILLTER_ID:
        setFillterID((String)newValue);
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
      case OrchestrorPackage.DSL_COMMAND_ENGINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__SPEED:
        setSpeed(SPEED_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__TTL:
        setTtl(TTL_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__STRATEGY:
        setStrategy(STRATEGY_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__THRESHOLD:
        setThreshold(THRESHOLD_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__FILLTER_ID:
        setFillterID(FILLTER_ID_EDEFAULT);
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
      case OrchestrorPackage.DSL_COMMAND_ENGINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrchestrorPackage.DSL_COMMAND_ENGINE__SPEED:
        return speed != SPEED_EDEFAULT;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__TTL:
        return ttl != TTL_EDEFAULT;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__STRATEGY:
        return strategy != STRATEGY_EDEFAULT;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__THRESHOLD:
        return threshold != THRESHOLD_EDEFAULT;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case OrchestrorPackage.DSL_COMMAND_ENGINE__FILLTER_ID:
        return FILLTER_ID_EDEFAULT == null ? fillterID != null : !FILLTER_ID_EDEFAULT.equals(fillterID);
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
    result.append(", ttl: ");
    result.append(ttl);
    result.append(", strategy: ");
    result.append(strategy);
    result.append(", threshold: ");
    result.append(threshold);
    result.append(", priority: ");
    result.append(priority);
    result.append(", fillterID: ");
    result.append(fillterID);
    result.append(')');
    return result.toString();
  }

} //DSLCommandEngineImpl
