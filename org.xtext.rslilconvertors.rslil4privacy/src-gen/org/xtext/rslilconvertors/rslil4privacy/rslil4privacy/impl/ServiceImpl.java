/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl#getServicename <em>Servicename</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl#getRefertoservice <em>Refertoservice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
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
   * The default value of the '{@link #getServicename() <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicename()
   * @generated
   * @ordered
   */
  protected static final String SERVICENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServicename() <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicename()
   * @generated
   * @ordered
   */
  protected String servicename = SERVICENAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getReftoPrivateData() <em>Refto Private Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReftoPrivateData()
   * @generated
   * @ordered
   */
  protected EList<ReftoPrivateData> reftoPrivateData;

  /**
   * The cached value of the '{@link #getRefertoservice() <em>Refertoservice</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefertoservice()
   * @generated
   * @ordered
   */
  protected EList<ReferToService> refertoservice;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return Rslil4privacyPackage.Literals.SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServicename()
  {
    return servicename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServicename(String newServicename)
  {
    String oldServicename = servicename;
    servicename = newServicename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.SERVICE__SERVICENAME, oldServicename, servicename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.SERVICE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReftoPrivateData> getReftoPrivateData()
  {
    if (reftoPrivateData == null)
    {
      reftoPrivateData = new EObjectContainmentEList<ReftoPrivateData>(ReftoPrivateData.class, this, Rslil4privacyPackage.SERVICE__REFTO_PRIVATE_DATA);
    }
    return reftoPrivateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToService> getRefertoservice()
  {
    if (refertoservice == null)
    {
      refertoservice = new EObjectContainmentEList<ReferToService>(ReferToService.class, this, Rslil4privacyPackage.SERVICE__REFERTOSERVICE);
    }
    return refertoservice;
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
      case Rslil4privacyPackage.SERVICE__REFTO_PRIVATE_DATA:
        return ((InternalEList<?>)getReftoPrivateData()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.SERVICE__REFERTOSERVICE:
        return ((InternalEList<?>)getRefertoservice()).basicRemove(otherEnd, msgs);
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
      case Rslil4privacyPackage.SERVICE__NAME:
        return getName();
      case Rslil4privacyPackage.SERVICE__SERVICENAME:
        return getServicename();
      case Rslil4privacyPackage.SERVICE__DESCRIPTION:
        return getDescription();
      case Rslil4privacyPackage.SERVICE__REFTO_PRIVATE_DATA:
        return getReftoPrivateData();
      case Rslil4privacyPackage.SERVICE__REFERTOSERVICE:
        return getRefertoservice();
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
      case Rslil4privacyPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.SERVICE__SERVICENAME:
        setServicename((String)newValue);
        return;
      case Rslil4privacyPackage.SERVICE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case Rslil4privacyPackage.SERVICE__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        getReftoPrivateData().addAll((Collection<? extends ReftoPrivateData>)newValue);
        return;
      case Rslil4privacyPackage.SERVICE__REFERTOSERVICE:
        getRefertoservice().clear();
        getRefertoservice().addAll((Collection<? extends ReferToService>)newValue);
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
      case Rslil4privacyPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.SERVICE__SERVICENAME:
        setServicename(SERVICENAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.SERVICE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case Rslil4privacyPackage.SERVICE__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        return;
      case Rslil4privacyPackage.SERVICE__REFERTOSERVICE:
        getRefertoservice().clear();
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
      case Rslil4privacyPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.SERVICE__SERVICENAME:
        return SERVICENAME_EDEFAULT == null ? servicename != null : !SERVICENAME_EDEFAULT.equals(servicename);
      case Rslil4privacyPackage.SERVICE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case Rslil4privacyPackage.SERVICE__REFTO_PRIVATE_DATA:
        return reftoPrivateData != null && !reftoPrivateData.isEmpty();
      case Rslil4privacyPackage.SERVICE__REFERTOSERVICE:
        return refertoservice != null && !refertoservice.isEmpty();
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
    result.append(", servicename: ");
    result.append(servicename);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
