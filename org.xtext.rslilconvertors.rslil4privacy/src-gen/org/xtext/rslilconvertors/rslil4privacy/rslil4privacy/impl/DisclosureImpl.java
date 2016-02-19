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

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientSource;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disclosure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getDidescription <em>Didescription</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getDiscondition <em>Discondition</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getReferToRecipient <em>Refer To Recipient</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getReferToRecipientsource <em>Refer To Recipientsource</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getReferToRecipienttarget <em>Refer To Recipienttarget</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisclosureImpl extends MinimalEObjectImpl.Container implements Disclosure
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
   * The default value of the '{@link #getDidescription() <em>Didescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDidescription()
   * @generated
   * @ordered
   */
  protected static final String DIDESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDidescription() <em>Didescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDidescription()
   * @generated
   * @ordered
   */
  protected String didescription = DIDESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getDiscondition() <em>Discondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscondition()
   * @generated
   * @ordered
   */
  protected static final String DISCONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiscondition() <em>Discondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscondition()
   * @generated
   * @ordered
   */
  protected String discondition = DISCONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getReferToRecipient() <em>Refer To Recipient</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferToRecipient()
   * @generated
   * @ordered
   */
  protected EList<ReferToRecipient> referToRecipient;

  /**
   * The cached value of the '{@link #getReferToRecipientsource() <em>Refer To Recipientsource</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferToRecipientsource()
   * @generated
   * @ordered
   */
  protected EList<ReferToRecipientSource> referToRecipientsource;

  /**
   * The cached value of the '{@link #getReferToRecipienttarget() <em>Refer To Recipienttarget</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferToRecipienttarget()
   * @generated
   * @ordered
   */
  protected EList<ReferToRecipientTarget> referToRecipienttarget;

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
  protected DisclosureImpl()
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
    return Rslil4privacyPackage.Literals.DISCLOSURE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.DISCLOSURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDidescription()
  {
    return didescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDidescription(String newDidescription)
  {
    String oldDidescription = didescription;
    didescription = newDidescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.DISCLOSURE__DIDESCRIPTION, oldDidescription, didescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDiscondition()
  {
    return discondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscondition(String newDiscondition)
  {
    String oldDiscondition = discondition;
    discondition = newDiscondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.DISCLOSURE__DISCONDITION, oldDiscondition, discondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToRecipient> getReferToRecipient()
  {
    if (referToRecipient == null)
    {
      referToRecipient = new EObjectContainmentEList<ReferToRecipient>(ReferToRecipient.class, this, Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENT);
    }
    return referToRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToRecipientSource> getReferToRecipientsource()
  {
    if (referToRecipientsource == null)
    {
      referToRecipientsource = new EObjectContainmentEList<ReferToRecipientSource>(ReferToRecipientSource.class, this, Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE);
    }
    return referToRecipientsource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToRecipientTarget> getReferToRecipienttarget()
  {
    if (referToRecipienttarget == null)
    {
      referToRecipienttarget = new EObjectContainmentEList<ReferToRecipientTarget>(ReferToRecipientTarget.class, this, Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET);
    }
    return referToRecipienttarget;
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
      reftoPrivateData = new EObjectContainmentEList<ReftoPrivateData>(ReftoPrivateData.class, this, Rslil4privacyPackage.DISCLOSURE__REFTO_PRIVATE_DATA);
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
      refertoservice = new EObjectContainmentEList<ReferToService>(ReferToService.class, this, Rslil4privacyPackage.DISCLOSURE__REFERTOSERVICE);
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
      refertoEnforcement = new EObjectContainmentEList<RefertoEnforcement>(RefertoEnforcement.class, this, Rslil4privacyPackage.DISCLOSURE__REFERTO_ENFORCEMENT);
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.DISCLOSURE__MODALITYKIND, oldModalitykind, modalitykind));
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
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        return ((InternalEList<?>)getReferToRecipient()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        return ((InternalEList<?>)getReferToRecipientsource()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        return ((InternalEList<?>)getReferToRecipienttarget()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.DISCLOSURE__REFTO_PRIVATE_DATA:
        return ((InternalEList<?>)getReftoPrivateData()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.DISCLOSURE__REFERTOSERVICE:
        return ((InternalEList<?>)getRefertoservice()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
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
      case Rslil4privacyPackage.DISCLOSURE__NAME:
        return getName();
      case Rslil4privacyPackage.DISCLOSURE__DIDESCRIPTION:
        return getDidescription();
      case Rslil4privacyPackage.DISCLOSURE__DISCONDITION:
        return getDiscondition();
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        return getReferToRecipient();
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        return getReferToRecipientsource();
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        return getReferToRecipienttarget();
      case Rslil4privacyPackage.DISCLOSURE__REFTO_PRIVATE_DATA:
        return getReftoPrivateData();
      case Rslil4privacyPackage.DISCLOSURE__REFERTOSERVICE:
        return getRefertoservice();
      case Rslil4privacyPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        return getRefertoEnforcement();
      case Rslil4privacyPackage.DISCLOSURE__MODALITYKIND:
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
      case Rslil4privacyPackage.DISCLOSURE__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__DIDESCRIPTION:
        setDidescription((String)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__DISCONDITION:
        setDiscondition((String)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        getReferToRecipient().clear();
        getReferToRecipient().addAll((Collection<? extends ReferToRecipient>)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        getReferToRecipientsource().clear();
        getReferToRecipientsource().addAll((Collection<? extends ReferToRecipientSource>)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        getReferToRecipienttarget().clear();
        getReferToRecipienttarget().addAll((Collection<? extends ReferToRecipientTarget>)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        getReftoPrivateData().addAll((Collection<? extends ReftoPrivateData>)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFERTOSERVICE:
        getRefertoservice().clear();
        getRefertoservice().addAll((Collection<? extends ReferToService>)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        getRefertoEnforcement().addAll((Collection<? extends RefertoEnforcement>)newValue);
        return;
      case Rslil4privacyPackage.DISCLOSURE__MODALITYKIND:
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
      case Rslil4privacyPackage.DISCLOSURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.DISCLOSURE__DIDESCRIPTION:
        setDidescription(DIDESCRIPTION_EDEFAULT);
        return;
      case Rslil4privacyPackage.DISCLOSURE__DISCONDITION:
        setDiscondition(DISCONDITION_EDEFAULT);
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        getReferToRecipient().clear();
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        getReferToRecipientsource().clear();
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        getReferToRecipienttarget().clear();
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFERTOSERVICE:
        getRefertoservice().clear();
        return;
      case Rslil4privacyPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        return;
      case Rslil4privacyPackage.DISCLOSURE__MODALITYKIND:
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
      case Rslil4privacyPackage.DISCLOSURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.DISCLOSURE__DIDESCRIPTION:
        return DIDESCRIPTION_EDEFAULT == null ? didescription != null : !DIDESCRIPTION_EDEFAULT.equals(didescription);
      case Rslil4privacyPackage.DISCLOSURE__DISCONDITION:
        return DISCONDITION_EDEFAULT == null ? discondition != null : !DISCONDITION_EDEFAULT.equals(discondition);
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        return referToRecipient != null && !referToRecipient.isEmpty();
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        return referToRecipientsource != null && !referToRecipientsource.isEmpty();
      case Rslil4privacyPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        return referToRecipienttarget != null && !referToRecipienttarget.isEmpty();
      case Rslil4privacyPackage.DISCLOSURE__REFTO_PRIVATE_DATA:
        return reftoPrivateData != null && !reftoPrivateData.isEmpty();
      case Rslil4privacyPackage.DISCLOSURE__REFERTOSERVICE:
        return refertoservice != null && !refertoservice.isEmpty();
      case Rslil4privacyPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        return refertoEnforcement != null && !refertoEnforcement.isEmpty();
      case Rslil4privacyPackage.DISCLOSURE__MODALITYKIND:
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
    result.append(", didescription: ");
    result.append(didescription);
    result.append(", discondition: ");
    result.append(discondition);
    result.append(", modalitykind: ");
    result.append(modalitykind);
    result.append(')');
    return result.toString();
  }

} //DisclosureImpl
