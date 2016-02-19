/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectiondescription <em>Collectiondescription</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectioncondition <em>Collectioncondition</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Collectiondescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collectiondescription</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collectiondescription</em>' attribute.
   * @see #setCollectiondescription(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection_Collectiondescription()
   * @model
   * @generated
   */
  String getCollectiondescription();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectiondescription <em>Collectiondescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collectiondescription</em>' attribute.
   * @see #getCollectiondescription()
   * @generated
   */
  void setCollectiondescription(String value);

  /**
   * Returns the value of the '<em><b>Collectioncondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collectioncondition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collectioncondition</em>' attribute.
   * @see #setCollectioncondition(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection_Collectioncondition()
   * @model
   * @generated
   */
  String getCollectioncondition();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectioncondition <em>Collectioncondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collectioncondition</em>' attribute.
   * @see #getCollectioncondition()
   * @generated
   */
  void setCollectioncondition(String value);

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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection_ReftoPrivateData()
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection_Refertoservice()
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection_RefertoEnforcement()
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getCollection_Modalitykind()
   * @model
   * @generated
   */
  String getModalitykind();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getModalitykind <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modalitykind</em>' attribute.
   * @see #getModalitykind()
   * @generated
   */
  void setModalitykind(String value);

} // Collection
