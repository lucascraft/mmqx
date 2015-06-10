/**
 */
package net.sf.xqz.engine.script.orchestror.impl;

import java.util.Collection;

import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;
import net.sf.xqz.engine.script.orchestror.DSLEngineClient;
import net.sf.xqz.engine.script.orchestror.DSLOrchestror;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Orchestror</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLOrchestrorImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLOrchestrorImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.xqz.engine.script.orchestror.impl.DSLOrchestrorImpl#getClients <em>Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSLOrchestrorImpl extends MinimalEObjectImpl.Container implements DSLOrchestror
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
   * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEngines()
   * @generated
   * @ordered
   */
  protected EList<DSLCommandEngine> engines;

  /**
   * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClients()
   * @generated
   * @ordered
   */
  protected EList<DSLEngineClient> clients;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLOrchestrorImpl()
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
    return OrchestrorPackage.Literals.DSL_ORCHESTROR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrorPackage.DSL_ORCHESTROR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLCommandEngine> getEngines()
  {
    if (engines == null)
    {
      engines = new EObjectContainmentEList<DSLCommandEngine>(DSLCommandEngine.class, this, OrchestrorPackage.DSL_ORCHESTROR__ENGINES);
    }
    return engines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLEngineClient> getClients()
  {
    if (clients == null)
    {
      clients = new EObjectContainmentEList<DSLEngineClient>(DSLEngineClient.class, this, OrchestrorPackage.DSL_ORCHESTROR__CLIENTS);
    }
    return clients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrchestrorPackage.DSL_ORCHESTROR__ENGINES:
        return ((InternalEList<?>)getEngines()).basicRemove(otherEnd, msgs);
      case OrchestrorPackage.DSL_ORCHESTROR__CLIENTS:
        return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OrchestrorPackage.DSL_ORCHESTROR__NAME:
        return getName();
      case OrchestrorPackage.DSL_ORCHESTROR__ENGINES:
        return getEngines();
      case OrchestrorPackage.DSL_ORCHESTROR__CLIENTS:
        return getClients();
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
      case OrchestrorPackage.DSL_ORCHESTROR__NAME:
        setName((String)newValue);
        return;
      case OrchestrorPackage.DSL_ORCHESTROR__ENGINES:
        getEngines().clear();
        getEngines().addAll((Collection<? extends DSLCommandEngine>)newValue);
        return;
      case OrchestrorPackage.DSL_ORCHESTROR__CLIENTS:
        getClients().clear();
        getClients().addAll((Collection<? extends DSLEngineClient>)newValue);
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
      case OrchestrorPackage.DSL_ORCHESTROR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrchestrorPackage.DSL_ORCHESTROR__ENGINES:
        getEngines().clear();
        return;
      case OrchestrorPackage.DSL_ORCHESTROR__CLIENTS:
        getClients().clear();
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
      case OrchestrorPackage.DSL_ORCHESTROR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrchestrorPackage.DSL_ORCHESTROR__ENGINES:
        return engines != null && !engines.isEmpty();
      case OrchestrorPackage.DSL_ORCHESTROR__CLIENTS:
        return clients != null && !clients.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //DSLOrchestrorImpl
