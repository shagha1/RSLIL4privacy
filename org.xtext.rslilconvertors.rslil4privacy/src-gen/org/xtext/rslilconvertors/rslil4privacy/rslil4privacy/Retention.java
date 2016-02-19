/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentiondescription <em>Retentiondescription</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentioncondition <em>Retentioncondition</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getReftoPrivateData <em>Refto Private Data</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getModalitykind <em>Modalitykind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention()
 * @model
 * @generated
 */
public interface Retention extends EObject
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Retentiondescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retentiondescription</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retentiondescription</em>' attribute.
   * @see #setRetentiondescription(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_Retentiondescription()
   * @model
   * @generated
   */
  String getRetentiondescription();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentiondescription <em>Retentiondescription</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retentiondescription</em>' attribute.
   * @see #getRetentiondescription()
   * @generated
   */
  void setRetentiondescription(String value);

  /**
   * Returns the value of the '<em><b>Retentioncondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retentioncondition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retentioncondition</em>' attribute.
   * @see #setRetentioncondition(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_Retentioncondition()
   * @model
   * @generated
   */
  String getRetentioncondition();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentioncondition <em>Retentioncondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retentioncondition</em>' attribute.
   * @see #getRetentioncondition()
   * @generated
   */
  void setRetentioncondition(String value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(String)
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_Period()
   * @model
   * @generated
   */
  String getPeriod();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(String value);

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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_ReftoPrivateData()
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_Refertoservice()
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_RefertoEnforcement()
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
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#getRetention_Modalitykind()
   * @model
   * @generated
   */
  String getModalitykind();

  /**
   * Sets the value of the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getModalitykind <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modalitykind</em>' attribute.
   * @see #getModalitykind()
   * @generated
   */
  void setModalitykind(String value);

} // Retention
