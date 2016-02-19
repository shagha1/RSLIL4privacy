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

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl#getRecipientname <em>Recipientname</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl#getRecipientDescription <em>Recipient Description</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl#getPartof <em>Partof</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl#getRecipientScope <em>Recipient Scope</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl#getRecipientType <em>Recipient Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipientImpl extends MinimalEObjectImpl.Container implements Recipient
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
   * The default value of the '{@link #getRecipientname() <em>Recipientname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientname()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientname() <em>Recipientname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientname()
   * @generated
   * @ordered
   */
  protected String recipientname = RECIPIENTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRecipientDescription() <em>Recipient Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientDescription()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENT_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientDescription() <em>Recipient Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientDescription()
   * @generated
   * @ordered
   */
  protected String recipientDescription = RECIPIENT_DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPartof() <em>Partof</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartof()
   * @generated
   * @ordered
   */
  protected EList<Partof> partof;

  /**
   * The default value of the '{@link #getRecipientScope() <em>Recipient Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientScope()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENT_SCOPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientScope() <em>Recipient Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientScope()
   * @generated
   * @ordered
   */
  protected String recipientScope = RECIPIENT_SCOPE_EDEFAULT;

  /**
   * The default value of the '{@link #getRecipientType() <em>Recipient Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientType()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientType() <em>Recipient Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientType()
   * @generated
   * @ordered
   */
  protected String recipientType = RECIPIENT_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecipientImpl()
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
    return Rslil4privacyPackage.Literals.RECIPIENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RECIPIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecipientname()
  {
    return recipientname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientname(String newRecipientname)
  {
    String oldRecipientname = recipientname;
    recipientname = newRecipientname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RECIPIENT__RECIPIENTNAME, oldRecipientname, recipientname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecipientDescription()
  {
    return recipientDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientDescription(String newRecipientDescription)
  {
    String oldRecipientDescription = recipientDescription;
    recipientDescription = newRecipientDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RECIPIENT__RECIPIENT_DESCRIPTION, oldRecipientDescription, recipientDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Partof> getPartof()
  {
    if (partof == null)
    {
      partof = new EObjectContainmentEList<Partof>(Partof.class, this, Rslil4privacyPackage.RECIPIENT__PARTOF);
    }
    return partof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecipientScope()
  {
    return recipientScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientScope(String newRecipientScope)
  {
    String oldRecipientScope = recipientScope;
    recipientScope = newRecipientScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RECIPIENT__RECIPIENT_SCOPE, oldRecipientScope, recipientScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecipientType()
  {
    return recipientType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientType(String newRecipientType)
  {
    String oldRecipientType = recipientType;
    recipientType = newRecipientType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.RECIPIENT__RECIPIENT_TYPE, oldRecipientType, recipientType));
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
      case Rslil4privacyPackage.RECIPIENT__PARTOF:
        return ((InternalEList<?>)getPartof()).basicRemove(otherEnd, msgs);
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
      case Rslil4privacyPackage.RECIPIENT__NAME:
        return getName();
      case Rslil4privacyPackage.RECIPIENT__RECIPIENTNAME:
        return getRecipientname();
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_DESCRIPTION:
        return getRecipientDescription();
      case Rslil4privacyPackage.RECIPIENT__PARTOF:
        return getPartof();
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_SCOPE:
        return getRecipientScope();
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_TYPE:
        return getRecipientType();
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
      case Rslil4privacyPackage.RECIPIENT__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENTNAME:
        setRecipientname((String)newValue);
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_DESCRIPTION:
        setRecipientDescription((String)newValue);
        return;
      case Rslil4privacyPackage.RECIPIENT__PARTOF:
        getPartof().clear();
        getPartof().addAll((Collection<? extends Partof>)newValue);
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_SCOPE:
        setRecipientScope((String)newValue);
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_TYPE:
        setRecipientType((String)newValue);
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
      case Rslil4privacyPackage.RECIPIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENTNAME:
        setRecipientname(RECIPIENTNAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_DESCRIPTION:
        setRecipientDescription(RECIPIENT_DESCRIPTION_EDEFAULT);
        return;
      case Rslil4privacyPackage.RECIPIENT__PARTOF:
        getPartof().clear();
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_SCOPE:
        setRecipientScope(RECIPIENT_SCOPE_EDEFAULT);
        return;
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_TYPE:
        setRecipientType(RECIPIENT_TYPE_EDEFAULT);
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
      case Rslil4privacyPackage.RECIPIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.RECIPIENT__RECIPIENTNAME:
        return RECIPIENTNAME_EDEFAULT == null ? recipientname != null : !RECIPIENTNAME_EDEFAULT.equals(recipientname);
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_DESCRIPTION:
        return RECIPIENT_DESCRIPTION_EDEFAULT == null ? recipientDescription != null : !RECIPIENT_DESCRIPTION_EDEFAULT.equals(recipientDescription);
      case Rslil4privacyPackage.RECIPIENT__PARTOF:
        return partof != null && !partof.isEmpty();
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_SCOPE:
        return RECIPIENT_SCOPE_EDEFAULT == null ? recipientScope != null : !RECIPIENT_SCOPE_EDEFAULT.equals(recipientScope);
      case Rslil4privacyPackage.RECIPIENT__RECIPIENT_TYPE:
        return RECIPIENT_TYPE_EDEFAULT == null ? recipientType != null : !RECIPIENT_TYPE_EDEFAULT.equals(recipientType);
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
    result.append(", recipientname: ");
    result.append(recipientname);
    result.append(", recipientDescription: ");
    result.append(recipientDescription);
    result.append(", recipientScope: ");
    result.append(recipientScope);
    result.append(", recipientType: ");
    result.append(recipientType);
    result.append(')');
    return result.toString();
  }

} //RecipientImpl
