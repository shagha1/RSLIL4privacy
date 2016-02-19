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
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl#getUsagedescription <em>Usagedescription</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl#getUsagecondition <em>Usagecondition</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageImpl extends MinimalEObjectImpl.Container implements Usage
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
   * The default value of the '{@link #getUsagedescription() <em>Usagedescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsagedescription()
   * @generated
   * @ordered
   */
  protected static final String USAGEDESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsagedescription() <em>Usagedescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsagedescription()
   * @generated
   * @ordered
   */
  protected String usagedescription = USAGEDESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getUsagecondition() <em>Usagecondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsagecondition()
   * @generated
   * @ordered
   */
  protected static final String USAGECONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsagecondition() <em>Usagecondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsagecondition()
   * @generated
   * @ordered
   */
  protected String usagecondition = USAGECONDITION_EDEFAULT;

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
   * The cached value of the '{@link #getRefertoEnforcement() <em>Referto Enforcement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefertoEnforcement()
   * @generated
   * @ordered
   */
  protected EList<RefertoEnforcement> refertoEnforcement;

  /**
   * The default value of the '{@link #getModalitykind() <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModalitykind()
   * @generated
   * @ordered
   */
  protected static final String MODALITYKIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModalitykind() <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModalitykind()
   * @generated
   * @ordered
   */
  protected String modalitykind = MODALITYKIND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsageImpl()
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
    return Rslil4privacyPackage.Literals.USAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.USAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsagedescription()
  {
    return usagedescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsagedescription(String newUsagedescription)
  {
    String oldUsagedescription = usagedescription;
    usagedescription = newUsagedescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.USAGE__USAGEDESCRIPTION, oldUsagedescription, usagedescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsagecondition()
  {
    return usagecondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsagecondition(String newUsagecondition)
  {
    String oldUsagecondition = usagecondition;
    usagecondition = newUsagecondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.USAGE__USAGECONDITION, oldUsagecondition, usagecondition));
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
      reftoPrivateData = new EObjectContainmentEList<ReftoPrivateData>(ReftoPrivateData.class, this, Rslil4privacyPackage.USAGE__REFTO_PRIVATE_DATA);
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
      refertoservice = new EObjectContainmentEList<ReferToService>(ReferToService.class, this, Rslil4privacyPackage.USAGE__REFERTOSERVICE);
    }
    return refertoservice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefertoEnforcement> getRefertoEnforcement()
  {
    if (refertoEnforcement == null)
    {
      refertoEnforcement = new EObjectContainmentEList<RefertoEnforcement>(RefertoEnforcement.class, this, Rslil4privacyPackage.USAGE__REFERTO_ENFORCEMENT);
    }
    return refertoEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModalitykind()
  {
    return modalitykind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModalitykind(String newModalitykind)
  {
    String oldModalitykind = modalitykind;
    modalitykind = newModalitykind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.USAGE__MODALITYKIND, oldModalitykind, modalitykind));
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
      case Rslil4privacyPackage.USAGE__REFTO_PRIVATE_DATA:
        return ((InternalEList<?>)getReftoPrivateData()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.USAGE__REFERTOSERVICE:
        return ((InternalEList<?>)getRefertoservice()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.USAGE__REFERTO_ENFORCEMENT:
        return ((InternalEList<?>)getRefertoEnforcement()).basicRemove(otherEnd, msgs);
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
      case Rslil4privacyPackage.USAGE__NAME:
        return getName();
      case Rslil4privacyPackage.USAGE__USAGEDESCRIPTION:
        return getUsagedescription();
      case Rslil4privacyPackage.USAGE__USAGECONDITION:
        return getUsagecondition();
      case Rslil4privacyPackage.USAGE__REFTO_PRIVATE_DATA:
        return getReftoPrivateData();
      case Rslil4privacyPackage.USAGE__REFERTOSERVICE:
        return getRefertoservice();
      case Rslil4privacyPackage.USAGE__REFERTO_ENFORCEMENT:
        return getRefertoEnforcement();
      case Rslil4privacyPackage.USAGE__MODALITYKIND:
        return getModalitykind();
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
      case Rslil4privacyPackage.USAGE__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.USAGE__USAGEDESCRIPTION:
        setUsagedescription((String)newValue);
        return;
      case Rslil4privacyPackage.USAGE__USAGECONDITION:
        setUsagecondition((String)newValue);
        return;
      case Rslil4privacyPackage.USAGE__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        getReftoPrivateData().addAll((Collection<? extends ReftoPrivateData>)newValue);
        return;
      case Rslil4privacyPackage.USAGE__REFERTOSERVICE:
        getRefertoservice().clear();
        getRefertoservice().addAll((Collection<? extends ReferToService>)newValue);
        return;
      case Rslil4privacyPackage.USAGE__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        getRefertoEnforcement().addAll((Collection<? extends RefertoEnforcement>)newValue);
        return;
      case Rslil4privacyPackage.USAGE__MODALITYKIND:
        setModalitykind((String)newValue);
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
      case Rslil4privacyPackage.USAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.USAGE__USAGEDESCRIPTION:
        setUsagedescription(USAGEDESCRIPTION_EDEFAULT);
        return;
      case Rslil4privacyPackage.USAGE__USAGECONDITION:
        setUsagecondition(USAGECONDITION_EDEFAULT);
        return;
      case Rslil4privacyPackage.USAGE__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        return;
      case Rslil4privacyPackage.USAGE__REFERTOSERVICE:
        getRefertoservice().clear();
        return;
      case Rslil4privacyPackage.USAGE__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        return;
      case Rslil4privacyPackage.USAGE__MODALITYKIND:
        setModalitykind(MODALITYKIND_EDEFAULT);
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
      case Rslil4privacyPackage.USAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.USAGE__USAGEDESCRIPTION:
        return USAGEDESCRIPTION_EDEFAULT == null ? usagedescription != null : !USAGEDESCRIPTION_EDEFAULT.equals(usagedescription);
      case Rslil4privacyPackage.USAGE__USAGECONDITION:
        return USAGECONDITION_EDEFAULT == null ? usagecondition != null : !USAGECONDITION_EDEFAULT.equals(usagecondition);
      case Rslil4privacyPackage.USAGE__REFTO_PRIVATE_DATA:
        return reftoPrivateData != null && !reftoPrivateData.isEmpty();
      case Rslil4privacyPackage.USAGE__REFERTOSERVICE:
        return refertoservice != null && !refertoservice.isEmpty();
      case Rslil4privacyPackage.USAGE__REFERTO_ENFORCEMENT:
        return refertoEnforcement != null && !refertoEnforcement.isEmpty();
      case Rslil4privacyPackage.USAGE__MODALITYKIND:
        return MODALITYKIND_EDEFAULT == null ? modalitykind != null : !MODALITYKIND_EDEFAULT.equals(modalitykind);
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
    result.append(", usagedescription: ");
    result.append(usagedescription);
    result.append(", usagecondition: ");
    result.append(usagecondition);
    result.append(", modalitykind: ");
    result.append(modalitykind);
    result.append(')');
    return result.toString();
  }

} //UsageImpl
