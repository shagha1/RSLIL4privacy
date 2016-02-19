/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl#getCollectiondescription <em>Collectiondescription</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl#getCollectioncondition <em>Collectioncondition</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionImpl extends MinimalEObjectImpl.Container implements Collection
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
   * The default value of the '{@link #getCollectiondescription() <em>Collectiondescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectiondescription()
   * @generated
   * @ordered
   */
  protected static final String COLLECTIONDESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCollectiondescription() <em>Collectiondescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectiondescription()
   * @generated
   * @ordered
   */
  protected String collectiondescription = COLLECTIONDESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCollectioncondition() <em>Collectioncondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectioncondition()
   * @generated
   * @ordered
   */
  protected static final String COLLECTIONCONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCollectioncondition() <em>Collectioncondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectioncondition()
   * @generated
   * @ordered
   */
  protected String collectioncondition = COLLECTIONCONDITION_EDEFAULT;

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
  protected CollectionImpl()
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
    return Rslil4privacyPackage.Literals.COLLECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.COLLECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCollectiondescription()
  {
    return collectiondescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollectiondescription(String newCollectiondescription)
  {
    String oldCollectiondescription = collectiondescription;
    collectiondescription = newCollectiondescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.COLLECTION__COLLECTIONDESCRIPTION, oldCollectiondescription, collectiondescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCollectioncondition()
  {
    return collectioncondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollectioncondition(String newCollectioncondition)
  {
    String oldCollectioncondition = collectioncondition;
    collectioncondition = newCollectioncondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.COLLECTION__COLLECTIONCONDITION, oldCollectioncondition, collectioncondition));
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
      reftoPrivateData = new EObjectContainmentEList<ReftoPrivateData>(ReftoPrivateData.class, this, Rslil4privacyPackage.COLLECTION__REFTO_PRIVATE_DATA);
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
      refertoservice = new EObjectContainmentEList<ReferToService>(ReferToService.class, this, Rslil4privacyPackage.COLLECTION__REFERTOSERVICE);
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
      refertoEnforcement = new EObjectContainmentEList<RefertoEnforcement>(RefertoEnforcement.class, this, Rslil4privacyPackage.COLLECTION__REFERTO_ENFORCEMENT);
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.COLLECTION__MODALITYKIND, oldModalitykind, modalitykind));
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
      case Rslil4privacyPackage.COLLECTION__REFTO_PRIVATE_DATA:
        return ((InternalEList<?>)getReftoPrivateData()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.COLLECTION__REFERTOSERVICE:
        return ((InternalEList<?>)getRefertoservice()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.COLLECTION__REFERTO_ENFORCEMENT:
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
      case Rslil4privacyPackage.COLLECTION__NAME:
        return getName();
      case Rslil4privacyPackage.COLLECTION__COLLECTIONDESCRIPTION:
        return getCollectiondescription();
      case Rslil4privacyPackage.COLLECTION__COLLECTIONCONDITION:
        return getCollectioncondition();
      case Rslil4privacyPackage.COLLECTION__REFTO_PRIVATE_DATA:
        return getReftoPrivateData();
      case Rslil4privacyPackage.COLLECTION__REFERTOSERVICE:
        return getRefertoservice();
      case Rslil4privacyPackage.COLLECTION__REFERTO_ENFORCEMENT:
        return getRefertoEnforcement();
      case Rslil4privacyPackage.COLLECTION__MODALITYKIND:
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
      case Rslil4privacyPackage.COLLECTION__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.COLLECTION__COLLECTIONDESCRIPTION:
        setCollectiondescription((String)newValue);
        return;
      case Rslil4privacyPackage.COLLECTION__COLLECTIONCONDITION:
        setCollectioncondition((String)newValue);
        return;
      case Rslil4privacyPackage.COLLECTION__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        getReftoPrivateData().addAll((java.util.Collection<? extends ReftoPrivateData>)newValue);
        return;
      case Rslil4privacyPackage.COLLECTION__REFERTOSERVICE:
        getRefertoservice().clear();
        getRefertoservice().addAll((java.util.Collection<? extends ReferToService>)newValue);
        return;
      case Rslil4privacyPackage.COLLECTION__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        getRefertoEnforcement().addAll((java.util.Collection<? extends RefertoEnforcement>)newValue);
        return;
      case Rslil4privacyPackage.COLLECTION__MODALITYKIND:
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
      case Rslil4privacyPackage.COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.COLLECTION__COLLECTIONDESCRIPTION:
        setCollectiondescription(COLLECTIONDESCRIPTION_EDEFAULT);
        return;
      case Rslil4privacyPackage.COLLECTION__COLLECTIONCONDITION:
        setCollectioncondition(COLLECTIONCONDITION_EDEFAULT);
        return;
      case Rslil4privacyPackage.COLLECTION__REFTO_PRIVATE_DATA:
        getReftoPrivateData().clear();
        return;
      case Rslil4privacyPackage.COLLECTION__REFERTOSERVICE:
        getRefertoservice().clear();
        return;
      case Rslil4privacyPackage.COLLECTION__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        return;
      case Rslil4privacyPackage.COLLECTION__MODALITYKIND:
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
      case Rslil4privacyPackage.COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.COLLECTION__COLLECTIONDESCRIPTION:
        return COLLECTIONDESCRIPTION_EDEFAULT == null ? collectiondescription != null : !COLLECTIONDESCRIPTION_EDEFAULT.equals(collectiondescription);
      case Rslil4privacyPackage.COLLECTION__COLLECTIONCONDITION:
        return COLLECTIONCONDITION_EDEFAULT == null ? collectioncondition != null : !COLLECTIONCONDITION_EDEFAULT.equals(collectioncondition);
      case Rslil4privacyPackage.COLLECTION__REFTO_PRIVATE_DATA:
        return reftoPrivateData != null && !reftoPrivateData.isEmpty();
      case Rslil4privacyPackage.COLLECTION__REFERTOSERVICE:
        return refertoservice != null && !refertoservice.isEmpty();
      case Rslil4privacyPackage.COLLECTION__REFERTO_ENFORCEMENT:
        return refertoEnforcement != null && !refertoEnforcement.isEmpty();
      case Rslil4privacyPackage.COLLECTION__MODALITYKIND:
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
    result.append(", collectiondescription: ");
    result.append(collectiondescription);
    result.append(", collectioncondition: ");
    result.append(collectioncondition);
    result.append(", modalitykind: ");
    result.append(modalitykind);
    result.append(')');
    return result.toString();
  }

} //CollectionImpl
