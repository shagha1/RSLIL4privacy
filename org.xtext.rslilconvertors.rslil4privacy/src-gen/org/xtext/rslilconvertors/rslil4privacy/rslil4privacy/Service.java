/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getServicename <em>Servicename</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getRefertoservice <em>Refertoservice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Servicename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servicename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servicename</em>' attribute.
   * @see #setServicename(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getService_Servicename()
   * @model
   * @generated
   */
  String getServicename();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getServicename <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servicename</em>' attribute.
   * @see #getServicename()
   * @generated
   */
  void setServicename(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getService_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getService_ReftoPrivateData()
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getService_Refertoservice()
   * @model containment="true"
   * @generated
   */
  EList<ReferToService> getRefertoservice();

} // Service
