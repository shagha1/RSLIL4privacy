/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyFactory
 * @model kind="package"
 * @generated
 */
public interface Rslil4privacyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rslil4privacy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/rslilconvertors/rslil4privacy/Rslil4privacy";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rslil4privacy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Rslil4privacyPackage eINSTANCE = org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl <em>Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getPolicy()
   * @generated
   */
  int POLICY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__NAME = 0;

  /**
   * The feature id for the '<em><b>Importelements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__IMPORTELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__COLLECTION = 2;

  /**
   * The feature id for the '<em><b>Disclosure</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__DISCLOSURE = 3;

  /**
   * The feature id for the '<em><b>Retention</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RETENTION = 4;

  /**
   * The feature id for the '<em><b>Usage</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__USAGE = 5;

  /**
   * The feature id for the '<em><b>Informative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__INFORMATIVE = 6;

  /**
   * The feature id for the '<em><b>Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PRIVATE_DATA = 7;

  /**
   * The feature id for the '<em><b>Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RECIPIENT = 8;

  /**
   * The feature id for the '<em><b>Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__SERVICE = 9;

  /**
   * The feature id for the '<em><b>Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__ENFORCEMENT = 10;

  /**
   * The number of structural features of the '<em>Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ImportImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl <em>Enforcement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getEnforcement()
   * @generated
   */
  int ENFORCEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Enforcement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__ENFORCEMENT_NAME = 1;

  /**
   * The feature id for the '<em><b>Enforcement Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__ENFORCEMENT_DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Enforcement Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__ENFORCEMENT_KIND = 3;

  /**
   * The number of structural features of the '<em>Enforcement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getService()
   * @generated
   */
  int SERVICE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Servicename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICENAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Refto Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__REFTO_PRIVATE_DATA = 3;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__REFERTOSERVICE = 4;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl <em>Recipient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getRecipient()
   * @generated
   */
  int RECIPIENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Recipientname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENTNAME = 1;

  /**
   * The feature id for the '<em><b>Recipient Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENT_DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Partof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__PARTOF = 3;

  /**
   * The feature id for the '<em><b>Recipient Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENT_SCOPE = 4;

  /**
   * The feature id for the '<em><b>Recipient Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENT_TYPE = 5;

  /**
   * The number of structural features of the '<em>Recipient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PrivateDataImpl <em>Private Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PrivateDataImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getPrivateData()
   * @generated
   */
  int PRIVATE_DATA = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__NAME = 0;

  /**
   * The feature id for the '<em><b>Privatedata</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__PRIVATEDATA = 1;

  /**
   * The feature id for the '<em><b>Private Data Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__PRIVATE_DATA_KIND = 2;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__ATTRIBUTE = 3;

  /**
   * The number of structural features of the '<em>Private Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.AttributeImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_NAME = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl <em>Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Collectiondescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__COLLECTIONDESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Collectioncondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__COLLECTIONCONDITION = 2;

  /**
   * The feature id for the '<em><b>Refto Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REFTO_PRIVATE_DATA = 3;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REFERTOSERVICE = 4;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REFERTO_ENFORCEMENT = 5;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__MODALITYKIND = 6;

  /**
   * The number of structural features of the '<em>Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl <em>Disclosure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getDisclosure()
   * @generated
   */
  int DISCLOSURE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Didescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__DIDESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Discondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__DISCONDITION = 2;

  /**
   * The feature id for the '<em><b>Refer To Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFER_TO_RECIPIENT = 3;

  /**
   * The feature id for the '<em><b>Refer To Recipientsource</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFER_TO_RECIPIENTSOURCE = 4;

  /**
   * The feature id for the '<em><b>Refer To Recipienttarget</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFER_TO_RECIPIENTTARGET = 5;

  /**
   * The feature id for the '<em><b>Refto Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFTO_PRIVATE_DATA = 6;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFERTOSERVICE = 7;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFERTO_ENFORCEMENT = 8;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__MODALITYKIND = 9;

  /**
   * The number of structural features of the '<em>Disclosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl <em>Retention</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getRetention()
   * @generated
   */
  int RETENTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Retentiondescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__RETENTIONDESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Retentioncondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__RETENTIONCONDITION = 2;

  /**
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__PERIOD = 3;

  /**
   * The feature id for the '<em><b>Refto Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REFTO_PRIVATE_DATA = 4;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REFERTOSERVICE = 5;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REFERTO_ENFORCEMENT = 6;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__MODALITYKIND = 7;

  /**
   * The number of structural features of the '<em>Retention</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl <em>Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getUsage()
   * @generated
   */
  int USAGE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Usagedescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__USAGEDESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Usagecondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__USAGECONDITION = 2;

  /**
   * The feature id for the '<em><b>Refto Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REFTO_PRIVATE_DATA = 3;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REFERTOSERVICE = 4;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REFERTO_ENFORCEMENT = 5;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__MODALITYKIND = 6;

  /**
   * The number of structural features of the '<em>Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.InformativeImpl <em>Informative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.InformativeImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getInformative()
   * @generated
   */
  int INFORMATIVE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Infdescription</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__INFDESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Infcondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__INFCONDITION = 2;

  /**
   * The feature id for the '<em><b>Refto Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REFTO_PRIVATE_DATA = 3;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REFERTOSERVICE = 4;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REFERTO_ENFORCEMENT = 5;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__MODALITYKIND = 6;

  /**
   * The number of structural features of the '<em>Informative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PartofImpl <em>Partof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PartofImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getPartof()
   * @generated
   */
  int PARTOF = 12;

  /**
   * The feature id for the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTOF__PARTOF = 0;

  /**
   * The number of structural features of the '<em>Partof</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTOF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientImpl <em>Refer To Recipient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToRecipient()
   * @generated
   */
  int REFER_TO_RECIPIENT = 13;

  /**
   * The feature id for the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT__REFERTORE = 0;

  /**
   * The number of structural features of the '<em>Refer To Recipient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientSourceImpl <em>Refer To Recipient Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientSourceImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToRecipientSource()
   * @generated
   */
  int REFER_TO_RECIPIENT_SOURCE = 14;

  /**
   * The feature id for the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_SOURCE__REFERTORE = 0;

  /**
   * The number of structural features of the '<em>Refer To Recipient Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientTargetImpl <em>Refer To Recipient Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientTargetImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToRecipientTarget()
   * @generated
   */
  int REFER_TO_RECIPIENT_TARGET = 15;

  /**
   * The feature id for the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_TARGET__REFERTORE = 0;

  /**
   * The number of structural features of the '<em>Refer To Recipient Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_TARGET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToServiceImpl <em>Refer To Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToServiceImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToService()
   * @generated
   */
  int REFER_TO_SERVICE = 16;

  /**
   * The feature id for the '<em><b>Refertose</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_SERVICE__REFERTOSE = 0;

  /**
   * The number of structural features of the '<em>Refer To Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_SERVICE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReftoPrivateDataImpl <em>Refto Private Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReftoPrivateDataImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReftoPrivateData()
   * @generated
   */
  int REFTO_PRIVATE_DATA = 17;

  /**
   * The feature id for the '<em><b>Refpr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFTO_PRIVATE_DATA__REFPR = 0;

  /**
   * The number of structural features of the '<em>Refto Private Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFTO_PRIVATE_DATA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RefertoEnforcementImpl <em>Referto Enforcement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RefertoEnforcementImpl
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getRefertoEnforcement()
   * @generated
   */
  int REFERTO_ENFORCEMENT = 18;

  /**
   * The feature id for the '<em><b>Refen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERTO_ENFORCEMENT__REFEN = 0;

  /**
   * The number of structural features of the '<em>Referto Enforcement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERTO_ENFORCEMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy
   * @generated
   */
  EClass getPolicy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getName()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getImportelements <em>Importelements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Importelements</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getImportelements()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Importelements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collection</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getCollection()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Collection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getDisclosure <em>Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disclosure</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getDisclosure()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Disclosure();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getRetention <em>Retention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Retention</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getRetention()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Retention();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getUsage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usage</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getUsage()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Usage();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getInformative <em>Informative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Informative</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getInformative()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Informative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getPrivateData <em>Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getPrivateData()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_PrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getRecipient <em>Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipient</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getRecipient()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Recipient();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getService()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Service();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getEnforcement <em>Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy#getEnforcement()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Enforcement();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement <em>Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement
   * @generated
   */
  EClass getEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getName()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getEnforcementName <em>Enforcement Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getEnforcementName()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getEnforcementDescription <em>Enforcement Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Description</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getEnforcementDescription()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementDescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getEnforcementKind <em>Enforcement Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Kind</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement#getEnforcementKind()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementKind();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getServicename <em>Servicename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servicename</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getServicename()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Servicename();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getDescription()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getReftoPrivateData <em>Refto Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refto Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getReftoPrivateData()
   * @see #getService()
   * @generated
   */
  EReference getService_ReftoPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service#getRefertoservice()
   * @see #getService()
   * @generated
   */
  EReference getService_Refertoservice();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient <em>Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipient</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient
   * @generated
   */
  EClass getRecipient();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getName()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientname <em>Recipientname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipientname</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientname()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Recipientname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientDescription <em>Recipient Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Description</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientDescription()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientDescription();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Partof</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getPartof()
   * @see #getRecipient()
   * @generated
   */
  EReference getRecipient_Partof();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientScope <em>Recipient Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Scope</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientScope()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientScope();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientType <em>Recipient Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Type</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient#getRecipientType()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientType();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData <em>Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData
   * @generated
   */
  EClass getPrivateData();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getName()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getPrivatedata <em>Privatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Privatedata</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getPrivatedata()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Privatedata();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getPrivateDataKind <em>Private Data Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private Data Kind</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getPrivateDataKind()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_PrivateDataKind();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData#getAttribute()
   * @see #getPrivateData()
   * @generated
   */
  EReference getPrivateData_Attribute();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeName();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection
   * @generated
   */
  EClass getCollection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getName()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectiondescription <em>Collectiondescription</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collectiondescription</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectiondescription()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Collectiondescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectioncondition <em>Collectioncondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collectioncondition</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getCollectioncondition()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Collectioncondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getReftoPrivateData <em>Refto Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refto Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getReftoPrivateData()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_ReftoPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getRefertoservice()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getRefertoEnforcement()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection#getModalitykind()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure <em>Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disclosure</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure
   * @generated
   */
  EClass getDisclosure();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getName()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDidescription <em>Didescription</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Didescription</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDidescription()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Didescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDiscondition <em>Discondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discondition</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getDiscondition()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Discondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipient <em>Refer To Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipient</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipient()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipient();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipientsource <em>Refer To Recipientsource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipientsource</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipientsource()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipientsource();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipienttarget <em>Refer To Recipienttarget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipienttarget</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReferToRecipienttarget()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipienttarget();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReftoPrivateData <em>Refto Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refto Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getReftoPrivateData()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReftoPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getRefertoservice()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getRefertoEnforcement()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure#getModalitykind()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention <em>Retention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Retention</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention
   * @generated
   */
  EClass getRetention();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getName()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentiondescription <em>Retentiondescription</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retentiondescription</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentiondescription()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Retentiondescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentioncondition <em>Retentioncondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retentioncondition</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRetentioncondition()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Retentioncondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getPeriod()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Period();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getReftoPrivateData <em>Refto Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refto Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getReftoPrivateData()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_ReftoPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRefertoservice()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getRefertoEnforcement()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention#getModalitykind()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Usage</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage
   * @generated
   */
  EClass getUsage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getName()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getUsagedescription <em>Usagedescription</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Usagedescription</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getUsagedescription()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Usagedescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getUsagecondition <em>Usagecondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Usagecondition</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getUsagecondition()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Usagecondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getReftoPrivateData <em>Refto Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refto Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getReftoPrivateData()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_ReftoPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getRefertoservice()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getRefertoEnforcement()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage#getModalitykind()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative <em>Informative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Informative</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative
   * @generated
   */
  EClass getInformative();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getName()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getInfdescription <em>Infdescription</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infdescription</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getInfdescription()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Infdescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getInfcondition <em>Infcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infcondition</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getInfcondition()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Infcondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getReftoPrivateData <em>Refto Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refto Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getReftoPrivateData()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_ReftoPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getRefertoservice()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getRefertoEnforcement()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative#getModalitykind()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partof</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof
   * @generated
   */
  EClass getPartof();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof#getPartof()
   * @see #getPartof()
   * @generated
   */
  EReference getPartof_Partof();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient <em>Refer To Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient
   * @generated
   */
  EClass getReferToRecipient();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient#getRefertore()
   * @see #getReferToRecipient()
   * @generated
   */
  EReference getReferToRecipient_Refertore();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientSource <em>Refer To Recipient Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient Source</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientSource
   * @generated
   */
  EClass getReferToRecipientSource();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientSource#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientSource#getRefertore()
   * @see #getReferToRecipientSource()
   * @generated
   */
  EReference getReferToRecipientSource_Refertore();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget <em>Refer To Recipient Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient Target</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget
   * @generated
   */
  EClass getReferToRecipientTarget();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget#getRefertore()
   * @see #getReferToRecipientTarget()
   * @generated
   */
  EReference getReferToRecipientTarget_Refertore();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService <em>Refer To Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Service</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService
   * @generated
   */
  EClass getReferToService();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService#getRefertose <em>Refertose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertose</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService#getRefertose()
   * @see #getReferToService()
   * @generated
   */
  EReference getReferToService_Refertose();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData <em>Refto Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refto Private Data</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData
   * @generated
   */
  EClass getReftoPrivateData();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData#getRefpr <em>Refpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refpr</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData#getRefpr()
   * @see #getReftoPrivateData()
   * @generated
   */
  EReference getReftoPrivateData_Refpr();

  /**
   * Returns the meta object for class '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referto Enforcement</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement
   * @generated
   */
  EClass getRefertoEnforcement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement#getRefen <em>Refen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refen</em>'.
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement#getRefen()
   * @see #getRefertoEnforcement()
   * @generated
   */
  EReference getRefertoEnforcement_Refen();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Rslil4privacyFactory getRslil4privacyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PolicyImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getPolicy()
     * @generated
     */
    EClass POLICY = eINSTANCE.getPolicy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

    /**
     * The meta object literal for the '<em><b>Importelements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__IMPORTELEMENTS = eINSTANCE.getPolicy_Importelements();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__COLLECTION = eINSTANCE.getPolicy_Collection();

    /**
     * The meta object literal for the '<em><b>Disclosure</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__DISCLOSURE = eINSTANCE.getPolicy_Disclosure();

    /**
     * The meta object literal for the '<em><b>Retention</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__RETENTION = eINSTANCE.getPolicy_Retention();

    /**
     * The meta object literal for the '<em><b>Usage</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__USAGE = eINSTANCE.getPolicy_Usage();

    /**
     * The meta object literal for the '<em><b>Informative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__INFORMATIVE = eINSTANCE.getPolicy_Informative();

    /**
     * The meta object literal for the '<em><b>Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__PRIVATE_DATA = eINSTANCE.getPolicy_PrivateData();

    /**
     * The meta object literal for the '<em><b>Recipient</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__RECIPIENT = eINSTANCE.getPolicy_Recipient();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__SERVICE = eINSTANCE.getPolicy_Service();

    /**
     * The meta object literal for the '<em><b>Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__ENFORCEMENT = eINSTANCE.getPolicy_Enforcement();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ImportImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl <em>Enforcement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.EnforcementImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getEnforcement()
     * @generated
     */
    EClass ENFORCEMENT = eINSTANCE.getEnforcement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__NAME = eINSTANCE.getEnforcement_Name();

    /**
     * The meta object literal for the '<em><b>Enforcement Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__ENFORCEMENT_NAME = eINSTANCE.getEnforcement_EnforcementName();

    /**
     * The meta object literal for the '<em><b>Enforcement Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__ENFORCEMENT_DESCRIPTION = eINSTANCE.getEnforcement_EnforcementDescription();

    /**
     * The meta object literal for the '<em><b>Enforcement Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__ENFORCEMENT_KIND = eINSTANCE.getEnforcement_EnforcementKind();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ServiceImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Servicename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__SERVICENAME = eINSTANCE.getService_Servicename();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

    /**
     * The meta object literal for the '<em><b>Refto Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__REFTO_PRIVATE_DATA = eINSTANCE.getService_ReftoPrivateData();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__REFERTOSERVICE = eINSTANCE.getService_Refertoservice();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl <em>Recipient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RecipientImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getRecipient()
     * @generated
     */
    EClass RECIPIENT = eINSTANCE.getRecipient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__NAME = eINSTANCE.getRecipient_Name();

    /**
     * The meta object literal for the '<em><b>Recipientname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENTNAME = eINSTANCE.getRecipient_Recipientname();

    /**
     * The meta object literal for the '<em><b>Recipient Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENT_DESCRIPTION = eINSTANCE.getRecipient_RecipientDescription();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPIENT__PARTOF = eINSTANCE.getRecipient_Partof();

    /**
     * The meta object literal for the '<em><b>Recipient Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENT_SCOPE = eINSTANCE.getRecipient_RecipientScope();

    /**
     * The meta object literal for the '<em><b>Recipient Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENT_TYPE = eINSTANCE.getRecipient_RecipientType();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PrivateDataImpl <em>Private Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PrivateDataImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getPrivateData()
     * @generated
     */
    EClass PRIVATE_DATA = eINSTANCE.getPrivateData();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__NAME = eINSTANCE.getPrivateData_Name();

    /**
     * The meta object literal for the '<em><b>Privatedata</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__PRIVATEDATA = eINSTANCE.getPrivateData_Privatedata();

    /**
     * The meta object literal for the '<em><b>Private Data Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__PRIVATE_DATA_KIND = eINSTANCE.getPrivateData_PrivateDataKind();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIVATE_DATA__ATTRIBUTE = eINSTANCE.getPrivateData_Attribute();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.AttributeImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl <em>Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.CollectionImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getCollection()
     * @generated
     */
    EClass COLLECTION = eINSTANCE.getCollection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__NAME = eINSTANCE.getCollection_Name();

    /**
     * The meta object literal for the '<em><b>Collectiondescription</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__COLLECTIONDESCRIPTION = eINSTANCE.getCollection_Collectiondescription();

    /**
     * The meta object literal for the '<em><b>Collectioncondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__COLLECTIONCONDITION = eINSTANCE.getCollection_Collectioncondition();

    /**
     * The meta object literal for the '<em><b>Refto Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REFTO_PRIVATE_DATA = eINSTANCE.getCollection_ReftoPrivateData();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REFERTOSERVICE = eINSTANCE.getCollection_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REFERTO_ENFORCEMENT = eINSTANCE.getCollection_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__MODALITYKIND = eINSTANCE.getCollection_Modalitykind();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl <em>Disclosure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.DisclosureImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getDisclosure()
     * @generated
     */
    EClass DISCLOSURE = eINSTANCE.getDisclosure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__NAME = eINSTANCE.getDisclosure_Name();

    /**
     * The meta object literal for the '<em><b>Didescription</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__DIDESCRIPTION = eINSTANCE.getDisclosure_Didescription();

    /**
     * The meta object literal for the '<em><b>Discondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__DISCONDITION = eINSTANCE.getDisclosure_Discondition();

    /**
     * The meta object literal for the '<em><b>Refer To Recipient</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFER_TO_RECIPIENT = eINSTANCE.getDisclosure_ReferToRecipient();

    /**
     * The meta object literal for the '<em><b>Refer To Recipientsource</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFER_TO_RECIPIENTSOURCE = eINSTANCE.getDisclosure_ReferToRecipientsource();

    /**
     * The meta object literal for the '<em><b>Refer To Recipienttarget</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFER_TO_RECIPIENTTARGET = eINSTANCE.getDisclosure_ReferToRecipienttarget();

    /**
     * The meta object literal for the '<em><b>Refto Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFTO_PRIVATE_DATA = eINSTANCE.getDisclosure_ReftoPrivateData();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFERTOSERVICE = eINSTANCE.getDisclosure_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFERTO_ENFORCEMENT = eINSTANCE.getDisclosure_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__MODALITYKIND = eINSTANCE.getDisclosure_Modalitykind();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl <em>Retention</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RetentionImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getRetention()
     * @generated
     */
    EClass RETENTION = eINSTANCE.getRetention();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__NAME = eINSTANCE.getRetention_Name();

    /**
     * The meta object literal for the '<em><b>Retentiondescription</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__RETENTIONDESCRIPTION = eINSTANCE.getRetention_Retentiondescription();

    /**
     * The meta object literal for the '<em><b>Retentioncondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__RETENTIONCONDITION = eINSTANCE.getRetention_Retentioncondition();

    /**
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__PERIOD = eINSTANCE.getRetention_Period();

    /**
     * The meta object literal for the '<em><b>Refto Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REFTO_PRIVATE_DATA = eINSTANCE.getRetention_ReftoPrivateData();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REFERTOSERVICE = eINSTANCE.getRetention_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REFERTO_ENFORCEMENT = eINSTANCE.getRetention_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__MODALITYKIND = eINSTANCE.getRetention_Modalitykind();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl <em>Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.UsageImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getUsage()
     * @generated
     */
    EClass USAGE = eINSTANCE.getUsage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__NAME = eINSTANCE.getUsage_Name();

    /**
     * The meta object literal for the '<em><b>Usagedescription</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__USAGEDESCRIPTION = eINSTANCE.getUsage_Usagedescription();

    /**
     * The meta object literal for the '<em><b>Usagecondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__USAGECONDITION = eINSTANCE.getUsage_Usagecondition();

    /**
     * The meta object literal for the '<em><b>Refto Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REFTO_PRIVATE_DATA = eINSTANCE.getUsage_ReftoPrivateData();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REFERTOSERVICE = eINSTANCE.getUsage_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REFERTO_ENFORCEMENT = eINSTANCE.getUsage_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__MODALITYKIND = eINSTANCE.getUsage_Modalitykind();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.InformativeImpl <em>Informative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.InformativeImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getInformative()
     * @generated
     */
    EClass INFORMATIVE = eINSTANCE.getInformative();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__NAME = eINSTANCE.getInformative_Name();

    /**
     * The meta object literal for the '<em><b>Infdescription</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__INFDESCRIPTION = eINSTANCE.getInformative_Infdescription();

    /**
     * The meta object literal for the '<em><b>Infcondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__INFCONDITION = eINSTANCE.getInformative_Infcondition();

    /**
     * The meta object literal for the '<em><b>Refto Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REFTO_PRIVATE_DATA = eINSTANCE.getInformative_ReftoPrivateData();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REFERTOSERVICE = eINSTANCE.getInformative_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REFERTO_ENFORCEMENT = eINSTANCE.getInformative_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__MODALITYKIND = eINSTANCE.getInformative_Modalitykind();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PartofImpl <em>Partof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.PartofImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getPartof()
     * @generated
     */
    EClass PARTOF = eINSTANCE.getPartof();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTOF__PARTOF = eINSTANCE.getPartof_Partof();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientImpl <em>Refer To Recipient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToRecipient()
     * @generated
     */
    EClass REFER_TO_RECIPIENT = eINSTANCE.getReferToRecipient();

    /**
     * The meta object literal for the '<em><b>Refertore</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_RECIPIENT__REFERTORE = eINSTANCE.getReferToRecipient_Refertore();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientSourceImpl <em>Refer To Recipient Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientSourceImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToRecipientSource()
     * @generated
     */
    EClass REFER_TO_RECIPIENT_SOURCE = eINSTANCE.getReferToRecipientSource();

    /**
     * The meta object literal for the '<em><b>Refertore</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_RECIPIENT_SOURCE__REFERTORE = eINSTANCE.getReferToRecipientSource_Refertore();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientTargetImpl <em>Refer To Recipient Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToRecipientTargetImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToRecipientTarget()
     * @generated
     */
    EClass REFER_TO_RECIPIENT_TARGET = eINSTANCE.getReferToRecipientTarget();

    /**
     * The meta object literal for the '<em><b>Refertore</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_RECIPIENT_TARGET__REFERTORE = eINSTANCE.getReferToRecipientTarget_Refertore();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToServiceImpl <em>Refer To Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReferToServiceImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReferToService()
     * @generated
     */
    EClass REFER_TO_SERVICE = eINSTANCE.getReferToService();

    /**
     * The meta object literal for the '<em><b>Refertose</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_SERVICE__REFERTOSE = eINSTANCE.getReferToService_Refertose();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReftoPrivateDataImpl <em>Refto Private Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.ReftoPrivateDataImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getReftoPrivateData()
     * @generated
     */
    EClass REFTO_PRIVATE_DATA = eINSTANCE.getReftoPrivateData();

    /**
     * The meta object literal for the '<em><b>Refpr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFTO_PRIVATE_DATA__REFPR = eINSTANCE.getReftoPrivateData_Refpr();

    /**
     * The meta object literal for the '{@link org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RefertoEnforcementImpl <em>Referto Enforcement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.RefertoEnforcementImpl
     * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl.Rslil4privacyPackageImpl#getRefertoEnforcement()
     * @generated
     */
    EClass REFERTO_ENFORCEMENT = eINSTANCE.getRefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Refen</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERTO_ENFORCEMENT__REFEN = eINSTANCE.getRefertoEnforcement_Refen();

  }

} //Rslil4privacyPackage
