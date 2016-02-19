/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refer To Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient#getRefertore <em>Refertore</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getReferToRecipient()
 * @model
 * @generated
 */
public interface ReferToRecipient extends EObject
{
  /**
   * Returns the value of the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refertore</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refertore</em>' reference.
   * @see #setRefertore(Recipient)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getReferToRecipient_Refertore()
   * @model
   * @generated
   */
  Recipient getRefertore();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient#getRefertore <em>Refertore</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refertore</em>' reference.
   * @see #getRefertore()
   * @generated
   */
  void setRefertore(Recipient value);

} // ReferToRecipient
