/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Import;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientSource;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyFactory;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rslil4privacyPackageImpl extends EPackageImpl implements Rslil4privacyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass policyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enforcementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recipientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass privateDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disclosureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass retentionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass informativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partofEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referToRecipientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referToRecipientSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referToRecipientTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referToServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reftoPrivateDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refertoEnforcementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Rslil4privacyPackageImpl()
  {
    super(eNS_URI, Rslil4privacyFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Rslil4privacyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Rslil4privacyPackage init()
  {
    if (isInited) return (Rslil4privacyPackage)EPackage.Registry.INSTANCE.getEPackage(Rslil4privacyPackage.eNS_URI);

    // Obtain or create and register package
    Rslil4privacyPackageImpl theRslil4privacyPackage = (Rslil4privacyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Rslil4privacyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Rslil4privacyPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRslil4privacyPackage.createPackageContents();

    // Initialize created meta-data
    theRslil4privacyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRslil4privacyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Rslil4privacyPackage.eNS_URI, theRslil4privacyPackage);
    return theRslil4privacyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolicy()
  {
    return policyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolicy_Name()
  {
    return (EAttribute)policyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Importelements()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Collection()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Disclosure()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Retention()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Usage()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Informative()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_PrivateData()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Recipient()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Service()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Enforcement()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnforcement()
  {
    return enforcementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnforcement_Name()
  {
    return (EAttribute)enforcementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnforcement_EnforcementName()
  {
    return (EAttribute)enforcementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnforcement_EnforcementDescription()
  {
    return (EAttribute)enforcementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnforcement_EnforcementKind()
  {
    return (EAttribute)enforcementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Servicename()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Description()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_ReftoPrivateData()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Refertoservice()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecipient()
  {
    return recipientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipient_Name()
  {
    return (EAttribute)recipientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipient_Recipientname()
  {
    return (EAttribute)recipientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipient_RecipientDescription()
  {
    return (EAttribute)recipientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipient_Partof()
  {
    return (EReference)recipientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipient_RecipientScope()
  {
    return (EAttribute)recipientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipient_RecipientType()
  {
    return (EAttribute)recipientEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrivateData()
  {
    return privateDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateData_Name()
  {
    return (EAttribute)privateDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateData_Privatedata()
  {
    return (EAttribute)privateDataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateData_PrivateDataKind()
  {
    return (EAttribute)privateDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrivateData_Attribute()
  {
    return (EReference)privateDataEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AttributeName()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollection()
  {
    return collectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollection_Name()
  {
    return (EAttribute)collectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollection_Collectiondescription()
  {
    return (EAttribute)collectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollection_Collectioncondition()
  {
    return (EAttribute)collectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollection_ReftoPrivateData()
  {
    return (EReference)collectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollection_Refertoservice()
  {
    return (EReference)collectionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollection_RefertoEnforcement()
  {
    return (EReference)collectionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollection_Modalitykind()
  {
    return (EAttribute)collectionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisclosure()
  {
    return disclosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisclosure_Name()
  {
    return (EAttribute)disclosureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisclosure_Didescription()
  {
    return (EAttribute)disclosureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisclosure_Discondition()
  {
    return (EAttribute)disclosureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisclosure_ReferToRecipient()
  {
    return (EReference)disclosureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisclosure_ReferToRecipientsource()
  {
    return (EReference)disclosureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisclosure_ReferToRecipienttarget()
  {
    return (EReference)disclosureEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisclosure_ReftoPrivateData()
  {
    return (EReference)disclosureEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisclosure_Refertoservice()
  {
    return (EReference)disclosureEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisclosure_RefertoEnforcement()
  {
    return (EReference)disclosureEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisclosure_Modalitykind()
  {
    return (EAttribute)disclosureEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRetention()
  {
    return retentionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRetention_Name()
  {
    return (EAttribute)retentionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRetention_Retentiondescription()
  {
    return (EAttribute)retentionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRetention_Retentioncondition()
  {
    return (EAttribute)retentionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRetention_Period()
  {
    return (EAttribute)retentionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRetention_ReftoPrivateData()
  {
    return (EReference)retentionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRetention_Refertoservice()
  {
    return (EReference)retentionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRetention_RefertoEnforcement()
  {
    return (EReference)retentionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRetention_Modalitykind()
  {
    return (EAttribute)retentionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsage()
  {
    return usageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsage_Name()
  {
    return (EAttribute)usageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsage_Usagedescription()
  {
    return (EAttribute)usageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsage_Usagecondition()
  {
    return (EAttribute)usageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsage_ReftoPrivateData()
  {
    return (EReference)usageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsage_Refertoservice()
  {
    return (EReference)usageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsage_RefertoEnforcement()
  {
    return (EReference)usageEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsage_Modalitykind()
  {
    return (EAttribute)usageEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInformative()
  {
    return informativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInformative_Name()
  {
    return (EAttribute)informativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInformative_Infdescription()
  {
    return (EAttribute)informativeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInformative_Infcondition()
  {
    return (EAttribute)informativeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInformative_ReftoPrivateData()
  {
    return (EReference)informativeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInformative_Refertoservice()
  {
    return (EReference)informativeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInformative_RefertoEnforcement()
  {
    return (EReference)informativeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInformative_Modalitykind()
  {
    return (EAttribute)informativeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartof()
  {
    return partofEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartof_Partof()
  {
    return (EReference)partofEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferToRecipient()
  {
    return referToRecipientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferToRecipient_Refertore()
  {
    return (EReference)referToRecipientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferToRecipientSource()
  {
    return referToRecipientSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferToRecipientSource_Refertore()
  {
    return (EReference)referToRecipientSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferToRecipientTarget()
  {
    return referToRecipientTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferToRecipientTarget_Refertore()
  {
    return (EReference)referToRecipientTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferToService()
  {
    return referToServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferToService_Refertose()
  {
    return (EReference)referToServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReftoPrivateData()
  {
    return reftoPrivateDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReftoPrivateData_Refpr()
  {
    return (EReference)reftoPrivateDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefertoEnforcement()
  {
    return refertoEnforcementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefertoEnforcement_Refen()
  {
    return (EReference)refertoEnforcementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rslil4privacyFactory getRslil4privacyFactory()
  {
    return (Rslil4privacyFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    policyEClass = createEClass(POLICY);
    createEAttribute(policyEClass, POLICY__NAME);
    createEReference(policyEClass, POLICY__IMPORTELEMENTS);
    createEReference(policyEClass, POLICY__COLLECTION);
    createEReference(policyEClass, POLICY__DISCLOSURE);
    createEReference(policyEClass, POLICY__RETENTION);
    createEReference(policyEClass, POLICY__USAGE);
    createEReference(policyEClass, POLICY__INFORMATIVE);
    createEReference(policyEClass, POLICY__PRIVATE_DATA);
    createEReference(policyEClass, POLICY__RECIPIENT);
    createEReference(policyEClass, POLICY__SERVICE);
    createEReference(policyEClass, POLICY__ENFORCEMENT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    enforcementEClass = createEClass(ENFORCEMENT);
    createEAttribute(enforcementEClass, ENFORCEMENT__NAME);
    createEAttribute(enforcementEClass, ENFORCEMENT__ENFORCEMENT_NAME);
    createEAttribute(enforcementEClass, ENFORCEMENT__ENFORCEMENT_DESCRIPTION);
    createEAttribute(enforcementEClass, ENFORCEMENT__ENFORCEMENT_KIND);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEAttribute(serviceEClass, SERVICE__SERVICENAME);
    createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
    createEReference(serviceEClass, SERVICE__REFTO_PRIVATE_DATA);
    createEReference(serviceEClass, SERVICE__REFERTOSERVICE);

    recipientEClass = createEClass(RECIPIENT);
    createEAttribute(recipientEClass, RECIPIENT__NAME);
    createEAttribute(recipientEClass, RECIPIENT__RECIPIENTNAME);
    createEAttribute(recipientEClass, RECIPIENT__RECIPIENT_DESCRIPTION);
    createEReference(recipientEClass, RECIPIENT__PARTOF);
    createEAttribute(recipientEClass, RECIPIENT__RECIPIENT_SCOPE);
    createEAttribute(recipientEClass, RECIPIENT__RECIPIENT_TYPE);

    privateDataEClass = createEClass(PRIVATE_DATA);
    createEAttribute(privateDataEClass, PRIVATE_DATA__NAME);
    createEAttribute(privateDataEClass, PRIVATE_DATA__PRIVATEDATA);
    createEAttribute(privateDataEClass, PRIVATE_DATA__PRIVATE_DATA_KIND);
    createEReference(privateDataEClass, PRIVATE_DATA__ATTRIBUTE);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_NAME);

    collectionEClass = createEClass(COLLECTION);
    createEAttribute(collectionEClass, COLLECTION__NAME);
    createEAttribute(collectionEClass, COLLECTION__COLLECTIONDESCRIPTION);
    createEAttribute(collectionEClass, COLLECTION__COLLECTIONCONDITION);
    createEReference(collectionEClass, COLLECTION__REFTO_PRIVATE_DATA);
    createEReference(collectionEClass, COLLECTION__REFERTOSERVICE);
    createEReference(collectionEClass, COLLECTION__REFERTO_ENFORCEMENT);
    createEAttribute(collectionEClass, COLLECTION__MODALITYKIND);

    disclosureEClass = createEClass(DISCLOSURE);
    createEAttribute(disclosureEClass, DISCLOSURE__NAME);
    createEAttribute(disclosureEClass, DISCLOSURE__DIDESCRIPTION);
    createEAttribute(disclosureEClass, DISCLOSURE__DISCONDITION);
    createEReference(disclosureEClass, DISCLOSURE__REFER_TO_RECIPIENT);
    createEReference(disclosureEClass, DISCLOSURE__REFER_TO_RECIPIENTSOURCE);
    createEReference(disclosureEClass, DISCLOSURE__REFER_TO_RECIPIENTTARGET);
    createEReference(disclosureEClass, DISCLOSURE__REFTO_PRIVATE_DATA);
    createEReference(disclosureEClass, DISCLOSURE__REFERTOSERVICE);
    createEReference(disclosureEClass, DISCLOSURE__REFERTO_ENFORCEMENT);
    createEAttribute(disclosureEClass, DISCLOSURE__MODALITYKIND);

    retentionEClass = createEClass(RETENTION);
    createEAttribute(retentionEClass, RETENTION__NAME);
    createEAttribute(retentionEClass, RETENTION__RETENTIONDESCRIPTION);
    createEAttribute(retentionEClass, RETENTION__RETENTIONCONDITION);
    createEAttribute(retentionEClass, RETENTION__PERIOD);
    createEReference(retentionEClass, RETENTION__REFTO_PRIVATE_DATA);
    createEReference(retentionEClass, RETENTION__REFERTOSERVICE);
    createEReference(retentionEClass, RETENTION__REFERTO_ENFORCEMENT);
    createEAttribute(retentionEClass, RETENTION__MODALITYKIND);

    usageEClass = createEClass(USAGE);
    createEAttribute(usageEClass, USAGE__NAME);
    createEAttribute(usageEClass, USAGE__USAGEDESCRIPTION);
    createEAttribute(usageEClass, USAGE__USAGECONDITION);
    createEReference(usageEClass, USAGE__REFTO_PRIVATE_DATA);
    createEReference(usageEClass, USAGE__REFERTOSERVICE);
    createEReference(usageEClass, USAGE__REFERTO_ENFORCEMENT);
    createEAttribute(usageEClass, USAGE__MODALITYKIND);

    informativeEClass = createEClass(INFORMATIVE);
    createEAttribute(informativeEClass, INFORMATIVE__NAME);
    createEAttribute(informativeEClass, INFORMATIVE__INFDESCRIPTION);
    createEAttribute(informativeEClass, INFORMATIVE__INFCONDITION);
    createEReference(informativeEClass, INFORMATIVE__REFTO_PRIVATE_DATA);
    createEReference(informativeEClass, INFORMATIVE__REFERTOSERVICE);
    createEReference(informativeEClass, INFORMATIVE__REFERTO_ENFORCEMENT);
    createEAttribute(informativeEClass, INFORMATIVE__MODALITYKIND);

    partofEClass = createEClass(PARTOF);
    createEReference(partofEClass, PARTOF__PARTOF);

    referToRecipientEClass = createEClass(REFER_TO_RECIPIENT);
    createEReference(referToRecipientEClass, REFER_TO_RECIPIENT__REFERTORE);

    referToRecipientSourceEClass = createEClass(REFER_TO_RECIPIENT_SOURCE);
    createEReference(referToRecipientSourceEClass, REFER_TO_RECIPIENT_SOURCE__REFERTORE);

    referToRecipientTargetEClass = createEClass(REFER_TO_RECIPIENT_TARGET);
    createEReference(referToRecipientTargetEClass, REFER_TO_RECIPIENT_TARGET__REFERTORE);

    referToServiceEClass = createEClass(REFER_TO_SERVICE);
    createEReference(referToServiceEClass, REFER_TO_SERVICE__REFERTOSE);

    reftoPrivateDataEClass = createEClass(REFTO_PRIVATE_DATA);
    createEReference(reftoPrivateDataEClass, REFTO_PRIVATE_DATA__REFPR);

    refertoEnforcementEClass = createEClass(REFERTO_ENFORCEMENT);
    createEReference(refertoEnforcementEClass, REFERTO_ENFORCEMENT__REFEN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Importelements(), this.getImport(), null, "importelements", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Collection(), this.getCollection(), null, "collection", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Disclosure(), this.getDisclosure(), null, "disclosure", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Retention(), this.getRetention(), null, "retention", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Usage(), this.getUsage(), null, "usage", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Informative(), this.getInformative(), null, "informative", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_PrivateData(), this.getPrivateData(), null, "privateData", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Recipient(), this.getRecipient(), null, "recipient", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Service(), this.getService(), null, "service", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Enforcement(), this.getEnforcement(), null, "enforcement", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enforcementEClass, Enforcement.class, "Enforcement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnforcement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Enforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnforcement_EnforcementName(), ecorePackage.getEString(), "enforcementName", null, 0, 1, Enforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnforcement_EnforcementDescription(), ecorePackage.getEString(), "enforcementDescription", null, 0, 1, Enforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnforcement_EnforcementKind(), ecorePackage.getEString(), "enforcementKind", null, 0, 1, Enforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Servicename(), ecorePackage.getEString(), "servicename", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_ReftoPrivateData(), this.getReftoPrivateData(), null, "reftoPrivateData", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Refertoservice(), this.getReferToService(), null, "refertoservice", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recipientEClass, Recipient.class, "Recipient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecipient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipient_Recipientname(), ecorePackage.getEString(), "recipientname", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipient_RecipientDescription(), ecorePackage.getEString(), "recipientDescription", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipient_Partof(), this.getPartof(), null, "partof", null, 0, -1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipient_RecipientScope(), ecorePackage.getEString(), "recipientScope", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipient_RecipientType(), ecorePackage.getEString(), "recipientType", null, 0, 1, Recipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(privateDataEClass, PrivateData.class, "PrivateData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrivateData_Name(), ecorePackage.getEString(), "name", null, 0, 1, PrivateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrivateData_Privatedata(), ecorePackage.getEString(), "privatedata", null, 0, 1, PrivateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrivateData_PrivateDataKind(), ecorePackage.getEString(), "PrivateDataKind", null, 0, 1, PrivateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrivateData_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, PrivateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollection_Collectiondescription(), ecorePackage.getEString(), "collectiondescription", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollection_Collectioncondition(), ecorePackage.getEString(), "collectioncondition", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollection_ReftoPrivateData(), this.getReftoPrivateData(), null, "reftoPrivateData", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollection_Refertoservice(), this.getReferToService(), null, "refertoservice", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollection_RefertoEnforcement(), this.getRefertoEnforcement(), null, "refertoEnforcement", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollection_Modalitykind(), ecorePackage.getEString(), "modalitykind", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disclosureEClass, Disclosure.class, "Disclosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDisclosure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDisclosure_Didescription(), ecorePackage.getEString(), "didescription", null, 0, 1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDisclosure_Discondition(), ecorePackage.getEString(), "discondition", null, 0, 1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisclosure_ReferToRecipient(), this.getReferToRecipient(), null, "referToRecipient", null, 0, -1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisclosure_ReferToRecipientsource(), this.getReferToRecipientSource(), null, "referToRecipientsource", null, 0, -1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisclosure_ReferToRecipienttarget(), this.getReferToRecipientTarget(), null, "referToRecipienttarget", null, 0, -1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisclosure_ReftoPrivateData(), this.getReftoPrivateData(), null, "reftoPrivateData", null, 0, -1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisclosure_Refertoservice(), this.getReferToService(), null, "refertoservice", null, 0, -1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisclosure_RefertoEnforcement(), this.getRefertoEnforcement(), null, "refertoEnforcement", null, 0, -1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDisclosure_Modalitykind(), ecorePackage.getEString(), "modalitykind", null, 0, 1, Disclosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(retentionEClass, Retention.class, "Retention", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRetention_Name(), ecorePackage.getEString(), "name", null, 0, 1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetention_Retentiondescription(), ecorePackage.getEString(), "retentiondescription", null, 0, 1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetention_Retentioncondition(), ecorePackage.getEString(), "retentioncondition", null, 0, 1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetention_Period(), ecorePackage.getEString(), "period", null, 0, 1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRetention_ReftoPrivateData(), this.getReftoPrivateData(), null, "reftoPrivateData", null, 0, -1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRetention_Refertoservice(), this.getReferToService(), null, "refertoservice", null, 0, -1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRetention_RefertoEnforcement(), this.getRefertoEnforcement(), null, "refertoEnforcement", null, 0, -1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetention_Modalitykind(), ecorePackage.getEString(), "modalitykind", null, 0, 1, Retention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUsage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUsage_Usagedescription(), ecorePackage.getEString(), "usagedescription", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUsage_Usagecondition(), ecorePackage.getEString(), "usagecondition", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUsage_ReftoPrivateData(), this.getReftoPrivateData(), null, "reftoPrivateData", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUsage_Refertoservice(), this.getReferToService(), null, "refertoservice", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUsage_RefertoEnforcement(), this.getRefertoEnforcement(), null, "refertoEnforcement", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUsage_Modalitykind(), ecorePackage.getEString(), "modalitykind", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(informativeEClass, Informative.class, "Informative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInformative_Name(), ecorePackage.getEString(), "name", null, 0, 1, Informative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInformative_Infdescription(), ecorePackage.getEString(), "infdescription", null, 0, 1, Informative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInformative_Infcondition(), ecorePackage.getEString(), "infcondition", null, 0, 1, Informative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInformative_ReftoPrivateData(), this.getReftoPrivateData(), null, "reftoPrivateData", null, 0, -1, Informative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInformative_Refertoservice(), this.getReferToService(), null, "refertoservice", null, 0, -1, Informative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInformative_RefertoEnforcement(), this.getRefertoEnforcement(), null, "refertoEnforcement", null, 0, -1, Informative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInformative_Modalitykind(), ecorePackage.getEString(), "modalitykind", null, 0, 1, Informative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partofEClass, Partof.class, "Partof", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPartof_Partof(), this.getRecipient(), null, "partof", null, 0, 1, Partof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referToRecipientEClass, ReferToRecipient.class, "ReferToRecipient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferToRecipient_Refertore(), this.getRecipient(), null, "refertore", null, 0, 1, ReferToRecipient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referToRecipientSourceEClass, ReferToRecipientSource.class, "ReferToRecipientSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferToRecipientSource_Refertore(), this.getRecipient(), null, "refertore", null, 0, 1, ReferToRecipientSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referToRecipientTargetEClass, ReferToRecipientTarget.class, "ReferToRecipientTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferToRecipientTarget_Refertore(), this.getRecipient(), null, "refertore", null, 0, 1, ReferToRecipientTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referToServiceEClass, ReferToService.class, "ReferToService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferToService_Refertose(), this.getService(), null, "refertose", null, 0, 1, ReferToService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reftoPrivateDataEClass, ReftoPrivateData.class, "ReftoPrivateData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReftoPrivateData_Refpr(), this.getPrivateData(), null, "refpr", null, 0, 1, ReftoPrivateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refertoEnforcementEClass, RefertoEnforcement.class, "RefertoEnforcement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefertoEnforcement_Refen(), this.getEnforcement(), null, "refen", null, 0, 1, RefertoEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Rslil4privacyPackageImpl
