/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referto Enforcement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RefertoEnforcementImpl#getRefen <em>Refen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefertoEnforcementImpl extends MinimalEObjectImpl.Container implements RefertoEnforcement
{
  /**
   * The cached value of the '{@link #getRefen() <em>Refen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefen()
   * @generated
   * @ordered
   */
  protected Enforcement refen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefertoEnforcementImpl()
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
    return Rslil4privacyPackage.Literals.REFERTO_ENFORCEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement getRefen()
  {
    if (refen != null && refen.eIsProxy())
    {
      InternalEObject oldRefen = (InternalEObject)refen;
      refen = (Enforcement)eResolveProxy(oldRefen);
      if (refen != oldRefen)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rslil4privacyPackage.REFERTO_ENFORCEMENT__REFEN, oldRefen, refen));
      }
    }
    return refen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement basicGetRefen()
  {
    return refen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefen(Enforcement newRefen)
  {
    Enforcement oldRefen = refen;
    refen = newRefen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.REFERTO_ENFORCEMENT__REFEN, oldRefen, refen));
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
      case Rslil4privacyPackage.REFERTO_ENFORCEMENT__REFEN:
        if (resolve) return getRefen();
        return basicGetRefen();
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
      case Rslil4privacyPackage.REFERTO_ENFORCEMENT__REFEN:
        setRefen((Enforcement)newValue);
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
      case Rslil4privacyPackage.REFERTO_ENFORCEMENT__REFEN:
        setRefen((Enforcement)null);
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
      case Rslil4privacyPackage.REFERTO_ENFORCEMENT__REFEN:
        return refen != null;
    }
    return super.eIsSet(featureID);
  }

} //RefertoEnforcementImpl
