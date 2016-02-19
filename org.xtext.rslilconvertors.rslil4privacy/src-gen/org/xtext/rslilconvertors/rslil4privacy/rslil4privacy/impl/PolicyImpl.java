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
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Import;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getImportelements <em>Importelements</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getDisclosure <em>Disclosure</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getRetention <em>Retention</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getInformative <em>Informative</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getPrivateData <em>Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl#getEnforcement <em>Enforcement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy
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
   * The cached value of the '{@link #getImportelements() <em>Importelements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportelements()
   * @generated
   * @ordered
   */
  protected EList<Import> importelements;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected EList<Collection> collection;

  /**
   * The cached value of the '{@link #getDisclosure() <em>Disclosure</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisclosure()
   * @generated
   * @ordered
   */
  protected EList<Disclosure> disclosure;

  /**
   * The cached value of the '{@link #getRetention() <em>Retention</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetention()
   * @generated
   * @ordered
   */
  protected EList<Retention> retention;

  /**
   * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsage()
   * @generated
   * @ordered
   */
  protected EList<Usage> usage;

  /**
   * The cached value of the '{@link #getInformative() <em>Informative</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInformative()
   * @generated
   * @ordered
   */
  protected EList<Informative> informative;

  /**
   * The cached value of the '{@link #getPrivateData() <em>Private Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateData()
   * @generated
   * @ordered
   */
  protected EList<PrivateData> privateData;

  /**
   * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipient()
   * @generated
   * @ordered
   */
  protected EList<Recipient> recipient;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected EList<Service> service;

  /**
   * The cached value of the '{@link #getEnforcement() <em>Enforcement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcement()
   * @generated
   * @ordered
   */
  protected EList<Enforcement> enforcement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolicyImpl()
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
    return Rslil4privacyPackage.Literals.POLICY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImportelements()
  {
    if (importelements == null)
    {
      importelements = new EObjectContainmentEList<Import>(Import.class, this, Rslil4privacyPackage.POLICY__IMPORTELEMENTS);
    }
    return importelements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Collection> getCollection()
  {
    if (collection == null)
    {
      collection = new EObjectContainmentEList<Collection>(Collection.class, this, Rslil4privacyPackage.POLICY__COLLECTION);
    }
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Disclosure> getDisclosure()
  {
    if (disclosure == null)
    {
      disclosure = new EObjectContainmentEList<Disclosure>(Disclosure.class, this, Rslil4privacyPackage.POLICY__DISCLOSURE);
    }
    return disclosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Retention> getRetention()
  {
    if (retention == null)
    {
      retention = new EObjectContainmentEList<Retention>(Retention.class, this, Rslil4privacyPackage.POLICY__RETENTION);
    }
    return retention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Usage> getUsage()
  {
    if (usage == null)
    {
      usage = new EObjectContainmentEList<Usage>(Usage.class, this, Rslil4privacyPackage.POLICY__USAGE);
    }
    return usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Informative> getInformative()
  {
    if (informative == null)
    {
      informative = new EObjectContainmentEList<Informative>(Informative.class, this, Rslil4privacyPackage.POLICY__INFORMATIVE);
    }
    return informative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PrivateData> getPrivateData()
  {
    if (privateData == null)
    {
      privateData = new EObjectContainmentEList<PrivateData>(PrivateData.class, this, Rslil4privacyPackage.POLICY__PRIVATE_DATA);
    }
    return privateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recipient> getRecipient()
  {
    if (recipient == null)
    {
      recipient = new EObjectContainmentEList<Recipient>(Recipient.class, this, Rslil4privacyPackage.POLICY__RECIPIENT);
    }
    return recipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getService()
  {
    if (service == null)
    {
      service = new EObjectContainmentEList<Service>(Service.class, this, Rslil4privacyPackage.POLICY__SERVICE);
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Enforcement> getEnforcement()
  {
    if (enforcement == null)
    {
      enforcement = new EObjectContainmentEList<Enforcement>(Enforcement.class, this, Rslil4privacyPackage.POLICY__ENFORCEMENT);
    }
    return enforcement;
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
      case Rslil4privacyPackage.POLICY__IMPORTELEMENTS:
        return ((InternalEList<?>)getImportelements()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__COLLECTION:
        return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__DISCLOSURE:
        return ((InternalEList<?>)getDisclosure()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__RETENTION:
        return ((InternalEList<?>)getRetention()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__USAGE:
        return ((InternalEList<?>)getUsage()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__INFORMATIVE:
        return ((InternalEList<?>)getInformative()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__PRIVATE_DATA:
        return ((InternalEList<?>)getPrivateData()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__RECIPIENT:
        return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__SERVICE:
        return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
      case Rslil4privacyPackage.POLICY__ENFORCEMENT:
        return ((InternalEList<?>)getEnforcement()).basicRemove(otherEnd, msgs);
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
      case Rslil4privacyPackage.POLICY__NAME:
        return getName();
      case Rslil4privacyPackage.POLICY__IMPORTELEMENTS:
        return getImportelements();
      case Rslil4privacyPackage.POLICY__COLLECTION:
        return getCollection();
      case Rslil4privacyPackage.POLICY__DISCLOSURE:
        return getDisclosure();
      case Rslil4privacyPackage.POLICY__RETENTION:
        return getRetention();
      case Rslil4privacyPackage.POLICY__USAGE:
        return getUsage();
      case Rslil4privacyPackage.POLICY__INFORMATIVE:
        return getInformative();
      case Rslil4privacyPackage.POLICY__PRIVATE_DATA:
        return getPrivateData();
      case Rslil4privacyPackage.POLICY__RECIPIENT:
        return getRecipient();
      case Rslil4privacyPackage.POLICY__SERVICE:
        return getService();
      case Rslil4privacyPackage.POLICY__ENFORCEMENT:
        return getEnforcement();
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
      case Rslil4privacyPackage.POLICY__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.POLICY__IMPORTELEMENTS:
        getImportelements().clear();
        getImportelements().addAll((java.util.Collection<? extends Import>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__COLLECTION:
        getCollection().clear();
        getCollection().addAll((java.util.Collection<? extends Collection>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__DISCLOSURE:
        getDisclosure().clear();
        getDisclosure().addAll((java.util.Collection<? extends Disclosure>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__RETENTION:
        getRetention().clear();
        getRetention().addAll((java.util.Collection<? extends Retention>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__USAGE:
        getUsage().clear();
        getUsage().addAll((java.util.Collection<? extends Usage>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__INFORMATIVE:
        getInformative().clear();
        getInformative().addAll((java.util.Collection<? extends Informative>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__PRIVATE_DATA:
        getPrivateData().clear();
        getPrivateData().addAll((java.util.Collection<? extends PrivateData>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__RECIPIENT:
        getRecipient().clear();
        getRecipient().addAll((java.util.Collection<? extends Recipient>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__SERVICE:
        getService().clear();
        getService().addAll((java.util.Collection<? extends Service>)newValue);
        return;
      case Rslil4privacyPackage.POLICY__ENFORCEMENT:
        getEnforcement().clear();
        getEnforcement().addAll((java.util.Collection<? extends Enforcement>)newValue);
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
      case Rslil4privacyPackage.POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.POLICY__IMPORTELEMENTS:
        getImportelements().clear();
        return;
      case Rslil4privacyPackage.POLICY__COLLECTION:
        getCollection().clear();
        return;
      case Rslil4privacyPackage.POLICY__DISCLOSURE:
        getDisclosure().clear();
        return;
      case Rslil4privacyPackage.POLICY__RETENTION:
        getRetention().clear();
        return;
      case Rslil4privacyPackage.POLICY__USAGE:
        getUsage().clear();
        return;
      case Rslil4privacyPackage.POLICY__INFORMATIVE:
        getInformative().clear();
        return;
      case Rslil4privacyPackage.POLICY__PRIVATE_DATA:
        getPrivateData().clear();
        return;
      case Rslil4privacyPackage.POLICY__RECIPIENT:
        getRecipient().clear();
        return;
      case Rslil4privacyPackage.POLICY__SERVICE:
        getService().clear();
        return;
      case Rslil4privacyPackage.POLICY__ENFORCEMENT:
        getEnforcement().clear();
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
      case Rslil4privacyPackage.POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.POLICY__IMPORTELEMENTS:
        return importelements != null && !importelements.isEmpty();
      case Rslil4privacyPackage.POLICY__COLLECTION:
        return collection != null && !collection.isEmpty();
      case Rslil4privacyPackage.POLICY__DISCLOSURE:
        return disclosure != null && !disclosure.isEmpty();
      case Rslil4privacyPackage.POLICY__RETENTION:
        return retention != null && !retention.isEmpty();
      case Rslil4privacyPackage.POLICY__USAGE:
        return usage != null && !usage.isEmpty();
      case Rslil4privacyPackage.POLICY__INFORMATIVE:
        return informative != null && !informative.isEmpty();
      case Rslil4privacyPackage.POLICY__PRIVATE_DATA:
        return privateData != null && !privateData.isEmpty();
      case Rslil4privacyPackage.POLICY__RECIPIENT:
        return recipient != null && !recipient.isEmpty();
      case Rslil4privacyPackage.POLICY__SERVICE:
        return service != null && !service.isEmpty();
      case Rslil4privacyPackage.POLICY__ENFORCEMENT:
        return enforcement != null && !enforcement.isEmpty();
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

} //PolicyImpl
