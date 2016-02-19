/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientname <em>Recipientname</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientDescription <em>Recipient Description</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getPartof <em>Partof</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientScope <em>Recipient Scope</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientType <em>Recipient Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRecipient()
 * @model
 * @generated
 */
public interface Recipient extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRecipient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Recipientname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipientname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipientname</em>' attribute.
   * @see #setRecipientname(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRecipient_Recipientname()
   * @model
   * @generated
   */
  String getRecipientname();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientname <em>Recipientname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipientname</em>' attribute.
   * @see #getRecipientname()
   * @generated
   */
  void setRecipientname(String value);

  /**
   * Returns the value of the '<em><b>Recipient Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Description</em>' attribute.
   * @see #setRecipientDescription(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRecipient_RecipientDescription()
   * @model
   * @generated
   */
  String getRecipientDescription();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientDescription <em>Recipient Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipient Description</em>' attribute.
   * @see #getRecipientDescription()
   * @generated
   */
  void setRecipientDescription(String value);

  /**
   * Returns the value of the '<em><b>Partof</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partof</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partof</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRecipient_Partof()
   * @model containment="true"
   * @generated
   */
  EList<Partof> getPartof();

  /**
   * Returns the value of the '<em><b>Recipient Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Scope</em>' attribute.
   * @see #setRecipientScope(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRecipient_RecipientScope()
   * @model
   * @generated
   */
  String getRecipientScope();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientScope <em>Recipient Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipient Scope</em>' attribute.
   * @see #getRecipientScope()
   * @generated
   */
  void setRecipientScope(String value);

  /**
   * Returns the value of the '<em><b>Recipient Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Type</em>' attribute.
   * @see #setRecipientType(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRecipient_RecipientType()
   * @model
   * @generated
   */
  String getRecipientType();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientType <em>Recipient Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipient Type</em>' attribute.
   * @see #getRecipientType()
   * @generated
   */
  void setRecipientType(String value);

} // Recipient
