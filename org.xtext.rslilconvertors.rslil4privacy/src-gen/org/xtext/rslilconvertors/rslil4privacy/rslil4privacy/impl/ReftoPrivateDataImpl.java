/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refto Private Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReftoPrivateDataImpl#getRefpr <em>Refpr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReftoPrivateDataImpl extends MinimalEObjectImpl.Container implements ReftoPrivateData
{
  /**
   * The cached value of the '{@link #getRefpr() <em>Refpr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefpr()
   * @generated
   * @ordered
   */
  protected PrivateData refpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReftoPrivateDataImpl()
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
    return Rslil4privacyPackage.Literals.REFTO_PRIVATE_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateData getRefpr()
  {
    if (refpr != null && refpr.eIsProxy())
    {
      InternalEObject oldRefpr = (InternalEObject)refpr;
      refpr = (PrivateData)eResolveProxy(oldRefpr);
      if (refpr != oldRefpr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rslil4privacyPackage.REFTO_PRIVATE_DATA__REFPR, oldRefpr, refpr));
      }
    }
    return refpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateData basicGetRefpr()
  {
    return refpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefpr(PrivateData newRefpr)
  {
    PrivateData oldRefpr = refpr;
    refpr = newRefpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rslil4privacyPackage.REFTO_PRIVATE_DATA__REFPR, oldRefpr, refpr));
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
      case Rslil4privacyPackage.REFTO_PRIVATE_DATA__REFPR:
        if (resolve) return getRefpr();
        return basicGetRefpr();
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
      case Rslil4privacyPackage.REFTO_PRIVATE_DATA__REFPR:
        setRefpr((PrivateData)newValue);
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
      case Rslil4privacyPackage.REFTO_PRIVATE_DATA__REFPR:
        setRefpr((PrivateData)null);
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
      case Rslil4privacyPackage.REFTO_PRIVATE_DATA__REFPR:
        return refpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ReftoPrivateDataImpl
