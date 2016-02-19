/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refto Private Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData#getRefpr <em>Refpr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getReftoPrivateData()
 * @model
 * @generated
 */
public interface ReftoPrivateData extends EObject
{
  /**
   * Returns the value of the '<em><b>Refpr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refpr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refpr</em>' reference.
   * @see #setRefpr(PrivateData)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getReftoPrivateData_Refpr()
   * @model
   * @generated
   */
  PrivateData getRefpr();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData#getRefpr <em>Refpr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refpr</em>' reference.
   * @see #getRefpr()
   * @generated
   */
  void setRefpr(PrivateData value);

} // ReftoPrivateData
