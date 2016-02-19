/**
 */
package org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rslil4privacyFactoryImpl extends EFactoryImpl implements Rslil4privacyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Rslil4privacyFactory init()
  {
    try
    {
      Rslil4privacyFactory theRslil4privacyFactory = (Rslil4privacyFactory)EPackage.Registry.INSTANCE.getEFactory(Rslil4privacyPackage.eNS_URI);
      if (theRslil4privacyFactory != null)
      {
        return theRslil4privacyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Rslil4privacyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rslil4privacyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Rslil4privacyPackage.POLICY: return createPolicy();
      case Rslil4privacyPackage.IMPORT: return createImport();
      case Rslil4privacyPackage.ENFORCEMENT: return createEnforcement();
      case Rslil4privacyPackage.SERVICE: return createService();
      case Rslil4privacyPackage.RECIPIENT: return createRecipient();
      case Rslil4privacyPackage.PRIVATE_DATA: return createPrivateData();
      case Rslil4privacyPackage.ATTRIBUTE: return createAttribute();
      case Rslil4privacyPackage.COLLECTION: return createCollection();
      case Rslil4privacyPackage.DISCLOSURE: return createDisclosure();
      case Rslil4privacyPackage.RETENTION: return createRetention();
      case Rslil4privacyPackage.USAGE: return createUsage();
      case Rslil4privacyPackage.INFORMATIVE: return createInformative();
      case Rslil4privacyPackage.PARTOF: return createPartof();
      case Rslil4privacyPackage.REFER_TO_RECIPIENT: return createReferToRecipient();
      case Rslil4privacyPackage.REFER_TO_RECIPIENT_SOURCE: return createReferToRecipientSource();
      case Rslil4privacyPackage.REFER_TO_RECIPIENT_TARGET: return createReferToRecipientTarget();
      case Rslil4privacyPackage.REFER_TO_SERVICE: return createReferToService();
      case Rslil4privacyPackage.REFTO_PRIVATE_DATA: return createReftoPrivateData();
      case Rslil4privacyPackage.REFERTO_ENFORCEMENT: return createRefertoEnforcement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Policy createPolicy()
  {
    PolicyImpl policy = new PolicyImpl();
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement createEnforcement()
  {
    EnforcementImpl enforcement = new EnforcementImpl();
    return enforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient createRecipient()
  {
    RecipientImpl recipient = new RecipientImpl();
    return recipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateData createPrivateData()
  {
    PrivateDataImpl privateData = new PrivateDataImpl();
    return privateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disclosure createDisclosure()
  {
    DisclosureImpl disclosure = new DisclosureImpl();
    return disclosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Retention createRetention()
  {
    RetentionImpl retention = new RetentionImpl();
    return retention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Usage createUsage()
  {
    UsageImpl usage = new UsageImpl();
    return usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Informative createInformative()
  {
    InformativeImpl informative = new InformativeImpl();
    return informative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Partof createPartof()
  {
    PartofImpl partof = new PartofImpl();
    return partof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToRecipient createReferToRecipient()
  {
    ReferToRecipientImpl referToRecipient = new ReferToRecipientImpl();
    return referToRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToRecipientSource createReferToRecipientSource()
  {
    ReferToRecipientSourceImpl referToRecipientSource = new ReferToRecipientSourceImpl();
    return referToRecipientSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToRecipientTarget createReferToRecipientTarget()
  {
    ReferToRecipientTargetImpl referToRecipientTarget = new ReferToRecipientTargetImpl();
    return referToRecipientTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToService createReferToService()
  {
    ReferToServiceImpl referToService = new ReferToServiceImpl();
    return referToService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReftoPrivateData createReftoPrivateData()
  {
    ReftoPrivateDataImpl reftoPrivateData = new ReftoPrivateDataImpl();
    return reftoPrivateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefertoEnforcement createRefertoEnforcement()
  {
    RefertoEnforcementImpl refertoEnforcement = new RefertoEnforcementImpl();
    return refertoEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rslil4privacyPackage getRslil4privacyPackage()
  {
    return (Rslil4privacyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Rslil4privacyPackage getPackage()
  {
    return Rslil4privacyPackage.eINSTANCE;
  }

} //Rslil4privacyFactoryImpl
