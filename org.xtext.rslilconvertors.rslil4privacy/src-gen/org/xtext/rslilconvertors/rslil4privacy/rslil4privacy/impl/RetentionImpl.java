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
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getRetentiondescription <em>Retentiondescription</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getRetentioncondition <em>Retentioncondition</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RetentionImpl extends MinimalEObjectImpl.Container implements Retention
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
   * The default value of the '{@link #getRetentiondescription() <em>Retentiondescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetentiondescription()
   * @generated
   * @ordered
   */
  protected static final String RETENTIONDESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRetentiondescription() <em>Retentiondescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetentiondescription()
   * @generated
   * @ordered
   */
  protected String retentiondescription = RETENTIONDESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getRetentioncondition() <em>Retentioncondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetentioncondition()
   * @generated
   * @ordered
   */
  protected static final String RETENTIONCONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRetentioncondition() <em>Retentioncondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetentioncondition()
   * @generated
   * @ordered
   */
  protected String retentioncondition = RETENTIONCONDITION_EDEFAULT;

  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final String PERIOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected String period = PERIOD_EDEFAULT;

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
  protected RetentionImpl()
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
    return Rslil4privacyPackage.Literals.RETENTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RETENTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRetentiondescription()
  {
    return retentiondescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRetentiondescription(String newRetentiondescription)
  {
    String oldRetentiondescription = retentiondescription;
    retentiondescription = newRetentiondescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RETENTION__RETENTIONDESCRIPTION, oldRetentiondescription, retentiondescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRetentioncondition()
  {
    return retentioncondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRetentioncondition(String newRetentioncondition)
  {
    String oldRetentioncondition = retentioncondition;
    retentioncondition = newRetentioncondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RETENTION__RETENTIONCONDITION, oldRetentioncondition, retentioncondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(String newPeriod)
  {
    String oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RETENTION__PERIOD, oldPeriod, period));
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
      reftoPrivateData = new EObjectContainmentEList<ReftoPrivateData>(ReftoPrivateData.class, this, Rslil4privacyPackage.RETENTION__REFTO_PRIVATE_DATA);
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
      refertoservice = new EObjectContainmentEList<ReferToService>(ReferToService.class, this, Rslil4privacyPackage.RETENTION__REFERTOSERVICE);
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
      refertoEnforcement = new EObjectContainmentEList<RefertoEnforcement>(RefertoEnforcement.class, this, Rslil4privacyPackage.RETENTION__REFERTO_ENFORCEMENT);
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RETENTION__MODALITYKIND, oldModalitykind, modalitykind));
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
      case Rslil4privacyPackage.RETENTION__REFTO_PRIVATE_DATA:
        return ((InternalEList<?>)getReftoPrivateData()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.RETENTION__REFERTOSERVICE:
        return ((InternalEList<?>)getRefertoservice()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.RETENTION__REFERTO_ENFORCEMENT:
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
      case Rslil4privacyPackage.RETENTION__NAME:
        return getName();
      case Rslil4privacyPackage.RETENTION__RETENTIONDESCRIPTION:
        return getRetentiondescription();
      case Rslil4privacyPackage.RETENTION__RETENTIONCONDITION:
        return getRetentioncondition();
      case Rslil4privacyPackage.RETENTION__PERIOD:
        return getPeriod();
      case Rslil4privacyPackage.RETENTION__REFTO_PRIVATE_DATA:
        return getReftoPrivateData();
      case Rslil4privacyPackage.RETENTION__REFERTOSERVICE:
        return getRefertoservice();
      case Rslil4privacyPackage.RETENTION__REFERTO_ENFORCEMENT:
        return getRefertoEnforcement();
      case Rslil4privacyPackage.RETENTION__MODALITYKIND:
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
      case Rslil4privacyPackage.RETENTION__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.RETENTION__RETENTIONDESCRIPTION:
        setRetentiondescription((String)newValue);
        return;
      case Rslil4privacyPackage.RETENTION__RETENTIONCONDITION:
        setRetentioncondition((String)newValue);
        return;
      case Rslil4privacyPackage.RETENTION__PERIOD:
        setPeriod((String)newValue);
        return;
      case Rslil4privacyPackage.RETENTION__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        getReftoPrivateData().addAll((Collection<? extends ReftoPrivateData>)newValue);
        return;
      case Rslil4privacyPackage.RETENTION__REFERTOSERVICE:
        getRefertoservice().clear();
        getRefertoservice().addAll((Collection<? extends ReferToService>)newValue);
        return;
      case Rslil4privacyPackage.RETENTION__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        getRefertoEnforcement().addAll((Collection<? extends RefertoEnforcement>)newValue);
        return;
      case Rslil4privacyPackage.RETENTION__MODALITYKIND:
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
      case Rslil4privacyPackage.RETENTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.RETENTION__RETENTIONDESCRIPTION:
        setRetentiondescription(RETENTIONDESCRIPTION_EDEFAULT);
        return;
      case Rslil4privacyPackage.RETENTION__RETENTIONCONDITION:
        setRetentioncondition(RETENTIONCONDITION_EDEFAULT);
        return;
      case Rslil4privacyPackage.RETENTION__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case Rslil4privacyPackage.RETENTION__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        return;
      case Rslil4privacyPackage.RETENTION__REFERTOSERVICE:
        getRefertoservice().clear();
        return;
      case Rslil4privacyPackage.RETENTION__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        return;
      case Rslil4privacyPackage.RETENTION__MODALITYKIND:
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
      case Rslil4privacyPackage.RETENTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.RETENTION__RETENTIONDESCRIPTION:
        return RETENTIONDESCRIPTION_EDEFAULT == null ? retentiondescription != null : !RETENTIONDESCRIPTION_EDEFAULT.equals(retentiondescription);
      case Rslil4privacyPackage.RETENTION__RETENTIONCONDITION:
        return RETENTIONCONDITION_EDEFAULT == null ? retentioncondition != null : !RETENTIONCONDITION_EDEFAULT.equals(retentioncondition);
      case Rslil4privacyPackage.RETENTION__PERIOD:
        return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
      case Rslil4privacyPackage.RETENTION__REFTO_PRIVATE_DATA:
        return reftoPrivateData != null && !reftoPrivateData.isEmpty();
      case Rslil4privacyPackage.RETENTION__REFERTOSERVICE:
        return refertoservice != null && !refertoservice.isEmpty();
      case Rslil4privacyPackage.RETENTION__REFERTO_ENFORCEMENT:
        return refertoEnforcement != null && !refertoEnforcement.isEmpty();
      case Rslil4privacyPackage.RETENTION__MODALITYKIND:
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
    result.append(", retentiondescription: ");
    result.append(retentiondescription);
    result.append(", retentioncondition: ");
    result.append(retentioncondition);
    result.append(", period: ");
    result.append(period);
    result.append(", modalitykind: ");
    result.append(modalitykind);
    result.append(')');
    return result.toString();
  }

} //RetentionImpl
