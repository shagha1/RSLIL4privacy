/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disclosure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDidescription <em>Didescription</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDiscondition <em>Discondition</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipient <em>Refer To Recipient</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipientsource <em>Refer To Recipientsource</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipienttarget <em>Refer To Recipienttarget</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure()
 * @model
 * @generated
 */
public interface Disclosure extends EObject
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Didescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Didescription</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Didescription</em>' attribute.
   * @see #setDidescription(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_Didescription()
   * @model
   * @generated
   */
  String getDidescription();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDidescription <em>Didescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Didescription</em>' attribute.
   * @see #getDidescription()
   * @generated
   */
  void setDidescription(String value);

  /**
   * Returns the value of the '<em><b>Discondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discondition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discondition</em>' attribute.
   * @see #setDiscondition(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_Discondition()
   * @model
   * @generated
   */
  String getDiscondition();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDiscondition <em>Discondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discondition</em>' attribute.
   * @see #getDiscondition()
   * @generated
   */
  void setDiscondition(String value);

  /**
   * Returns the value of the '<em><b>Refer To Recipient</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refer To Recipient</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refer To Recipient</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_ReferToRecipient()
   * @model containment="true"
   * @generated
   */
  EList<ReferToRecipient> getReferToRecipient();

  /**
   * Returns the value of the '<em><b>Refer To Recipientsource</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refer To Recipientsource</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refer To Recipientsource</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_ReferToRecipientsource()
   * @model containment="true"
   * @generated
   */
  EList<ReferToRecipientSource> getReferToRecipientsource();

  /**
   * Returns the value of the '<em><b>Refer To Recipienttarget</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refer To Recipienttarget</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refer To Recipienttarget</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_ReferToRecipienttarget()
   * @model containment="true"
   * @generated
   */
  EList<ReferToRecipientTarget> getReferToRecipienttarget();

  /**
   * Returns the value of the '<em><b>Refto Private Data</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refto Private Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refto Private Data</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_ReftoPrivateData()
   * @model containment="true"
   * @generated
   */
  EList<ReftoPrivateData> getReftoPrivateData();

  /**
   * Returns the value of the '<em><b>Refertoservice</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refertoservice</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refertoservice</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_Refertoservice()
   * @model containment="true"
   * @generated
   */
  EList<ReferToService> getRefertoservice();

  /**
   * Returns the value of the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referto Enforcement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referto Enforcement</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_RefertoEnforcement()
   * @model containment="true"
   * @generated
   */
  EList<RefertoEnforcement> getRefertoEnforcement();

  /**
   * Returns the value of the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modalitykind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modalitykind</em>' attribute.
   * @see #setModalitykind(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getDisclosure_Modalitykind()
   * @model
   * @generated
   */
  String getModalitykind();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getModalitykind <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modalitykind</em>' attribute.
   * @see #getModalitykind()
   * @generated
   */
  void setModalitykind(String value);

} // Disclosure
