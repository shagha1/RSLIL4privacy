/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getImportelements <em>Importelements</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getDisclosure <em>Disclosure</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getRetention <em>Retention</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getInformative <em>Informative</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getPrivateData <em>Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getEnforcement <em>Enforcement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Importelements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importelements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importelements</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Importelements()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImportelements();

  /**
   * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Collection()
   * @model containment="true"
   * @generated
   */
  EList<Collection> getCollection();

  /**
   * Returns the value of the '<em><b>Disclosure</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disclosure</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disclosure</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Disclosure()
   * @model containment="true"
   * @generated
   */
  EList<Disclosure> getDisclosure();

  /**
   * Returns the value of the '<em><b>Retention</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retention</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retention</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Retention()
   * @model containment="true"
   * @generated
   */
  EList<Retention> getRetention();

  /**
   * Returns the value of the '<em><b>Usage</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usage</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Usage()
   * @model containment="true"
   * @generated
   */
  EList<Usage> getUsage();

  /**
   * Returns the value of the '<em><b>Informative</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Informative</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Informative</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Informative()
   * @model containment="true"
   * @generated
   */
  EList<Informative> getInformative();

  /**
   * Returns the value of the '<em><b>Private Data</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private Data</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_PrivateData()
   * @model containment="true"
   * @generated
   */
  EList<PrivateData> getPrivateData();

  /**
   * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Recipient()
   * @model containment="true"
   * @generated
   */
  EList<Recipient> getRecipient();

  /**
   * Returns the value of the '<em><b>Service</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Service()
   * @model containment="true"
   * @generated
   */
  EList<Service> getService();

  /**
   * Returns the value of the '<em><b>Enforcement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforcement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforcement</em>' containment reference list.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getPolicy_Enforcement()
   * @model containment="true"
   * @generated
   */
  EList<Enforcement> getEnforcement();

} // Policy
