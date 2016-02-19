/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enforcement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl#getEnforcementName <em>Enforcement Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl#getEnforcementDescription <em>Enforcement Description</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl#getEnforcementKind <em>Enforcement Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnforcementImpl extends MinimalEObjectImpl.Container implements Enforcement
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
   * The default value of the '{@link #getEnforcementName() <em>Enforcement Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementName()
   * @generated
   * @ordered
   */
  protected static final String ENFORCEMENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnforcementName() <em>Enforcement Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementName()
   * @generated
   * @ordered
   */
  protected String enforcementName = ENFORCEMENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getEnforcementDescription() <em>Enforcement Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementDescription()
   * @generated
   * @ordered
   */
  protected static final String ENFORCEMENT_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnforcementDescription() <em>Enforcement Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementDescription()
   * @generated
   * @ordered
   */
  protected String enforcementDescription = ENFORCEMENT_DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getEnforcementKind() <em>Enforcement Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementKind()
   * @generated
   * @ordered
   */
  protected static final String ENFORCEMENT_KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnforcementKind() <em>Enforcement Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementKind()
   * @generated
   * @ordered
   */
  protected String enforcementKind = ENFORCEMENT_KIND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnforcementImpl()
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
    return Rslil4privacyPackage.Literals.ENFORCEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.ENFORCEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnforcementName()
  {
    return enforcementName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnforcementName(String newEnforcementName)
  {
    String oldEnforcementName = enforcementName;
    enforcementName = newEnforcementName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_NAME, oldEnforcementName, enforcementName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnforcementDescription()
  {
    return enforcementDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnforcementDescription(String newEnforcementDescription)
  {
    String oldEnforcementDescription = enforcementDescription;
    enforcementDescription = newEnforcementDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_DESCRIPTION, oldEnforcementDescription, enforcementDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnforcementKind()
  {
    return enforcementKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnforcementKind(String newEnforcementKind)
  {
    String oldEnforcementKind = enforcementKind;
    enforcementKind = newEnforcementKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_KIND, oldEnforcementKind, enforcementKind));
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
      case Rslil4privacyPackage.ENFORCEMENT__NAME:
        return getName();
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        return getEnforcementName();
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_DESCRIPTION:
        return getEnforcementDescription();
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_KIND:
        return getEnforcementKind();
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
      case Rslil4privacyPackage.ENFORCEMENT__NAME:
        setName((String)newValue);
        return;
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        setEnforcementName((String)newValue);
        return;
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_DESCRIPTION:
        setEnforcementDescription((String)newValue);
        return;
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_KIND:
        setEnforcementKind((String)newValue);
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
      case Rslil4privacyPackage.ENFORCEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        setEnforcementName(ENFORCEMENT_NAME_EDEFAULT);
        return;
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_DESCRIPTION:
        setEnforcementDescription(ENFORCEMENT_DESCRIPTION_EDEFAULT);
        return;
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_KIND:
        setEnforcementKind(ENFORCEMENT_KIND_EDEFAULT);
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
      case Rslil4privacyPackage.ENFORCEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        return ENFORCEMENT_NAME_EDEFAULT == null ? enforcementName != null : !ENFORCEMENT_NAME_EDEFAULT.equals(enforcementName);
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_DESCRIPTION:
        return ENFORCEMENT_DESCRIPTION_EDEFAULT == null ? enforcementDescription != null : !ENFORCEMENT_DESCRIPTION_EDEFAULT.equals(enforcementDescription);
      case Rslil4privacyPackage.ENFORCEMENT__ENFORCEMENT_KIND:
        return ENFORCEMENT_KIND_EDEFAULT == null ? enforcementKind != null : !ENFORCEMENT_KIND_EDEFAULT.equals(enforcementKind);
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
    result.append(", enforcementName: ");
    result.append(enforcementName);
    result.append(", enforcementDescription: ");
    result.append(enforcementDescription);
    result.append(", enforcementKind: ");
    result.append(enforcementKind);
    result.append(')');
    return result.toString();
  }

} //EnforcementImpl
