package org.xtext.rslilconvertors.rslil4privacy.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
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
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Rslil4privacyPackage;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service;
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage;
import org.xtext.rslilconvertors.rslil4privacy.services.Rslil4privacyGrammarAccess;

@SuppressWarnings("all")
public class Rslil4privacySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Rslil4privacyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Rslil4privacyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Rslil4privacyPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.COLLECTION:
				if(context == grammarAccess.getCollectionRule()) {
					sequence_Collection(context, (Collection) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.DISCLOSURE:
				if(context == grammarAccess.getDisclosureRule()) {
					sequence_Disclosure(context, (Disclosure) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.ENFORCEMENT:
				if(context == grammarAccess.getEnforcementRule()) {
					sequence_Enforcement(context, (Enforcement) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.INFORMATIVE:
				if(context == grammarAccess.getInformativeRule()) {
					sequence_Informative(context, (Informative) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.PARTOF:
				if(context == grammarAccess.getPartofRule()) {
					sequence_Partof(context, (Partof) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.POLICY:
				if(context == grammarAccess.getPolicyRule()) {
					sequence_Policy(context, (Policy) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.PRIVATE_DATA:
				if(context == grammarAccess.getPrivateDataRule()) {
					sequence_PrivateData(context, (PrivateData) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.RECIPIENT:
				if(context == grammarAccess.getRecipientRule()) {
					sequence_Recipient(context, (Recipient) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.REFER_TO_RECIPIENT:
				if(context == grammarAccess.getReferToRecipientRule()) {
					sequence_ReferToRecipient(context, (ReferToRecipient) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.REFER_TO_RECIPIENT_SOURCE:
				if(context == grammarAccess.getReferToRecipientSourceRule()) {
					sequence_ReferToRecipientSource(context, (ReferToRecipientSource) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.REFER_TO_RECIPIENT_TARGET:
				if(context == grammarAccess.getReferToRecipientTargetRule()) {
					sequence_ReferToRecipientTarget(context, (ReferToRecipientTarget) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.REFER_TO_SERVICE:
				if(context == grammarAccess.getReferToServiceRule()) {
					sequence_ReferToService(context, (ReferToService) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.REFERTO_ENFORCEMENT:
				if(context == grammarAccess.getRefertoEnforcementRule()) {
					sequence_RefertoEnforcement(context, (RefertoEnforcement) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.REFTO_PRIVATE_DATA:
				if(context == grammarAccess.getReftoPrivateDataRule()) {
					sequence_ReftoPrivateData(context, (ReftoPrivateData) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.RETENTION:
				if(context == grammarAccess.getRetentionRule()) {
					sequence_Retention(context, (Retention) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.SERVICE:
				if(context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case Rslil4privacyPackage.USAGE:
				if(context == grammarAccess.getUsageRule()) {
					sequence_Usage(context, (Usage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING attributeName=STRING)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.ATTRIBUTE__ATTRIBUTE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.ATTRIBUTE__ATTRIBUTE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getAttributeNameSTRINGTerminalRuleCall_3_0(), semanticObject.getAttributeName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         collectiondescription=STRING 
	 *         collectioncondition=STRING 
	 *         reftoPrivateData+=ReftoPrivateData* 
	 *         refertoservice+=ReferToService* 
	 *         refertoEnforcement+=RefertoEnforcement* 
	 *         (modalitykind='Permitted' | modalitykind='Obligation' | modalitykind='Forbidden')
	 *     )
	 */
	protected void sequence_Collection(EObject context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         didescription=STRING 
	 *         discondition=STRING 
	 *         referToRecipient+=ReferToRecipient* 
	 *         referToRecipientsource+=ReferToRecipientSource* 
	 *         referToRecipienttarget+=ReferToRecipientTarget* 
	 *         reftoPrivateData+=ReftoPrivateData* 
	 *         refertoservice+=ReferToService* 
	 *         refertoEnforcement+=RefertoEnforcement* 
	 *         (modalitykind='Permitted' | modalitykind='Obligation' | modalitykind='Forbidden')
	 *     )
	 */
	protected void sequence_Disclosure(EObject context, Disclosure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         enforcementName=STRING 
	 *         enforcementDescription=STRING 
	 *         (enforcementKind='Action' | enforcementKind='Algorithm' | enforcementKind='Config' | enforcementKind='Process' | enforcementKind='Tool')
	 *     )
	 */
	protected void sequence_Enforcement(EObject context, Enforcement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         infdescription=STRING 
	 *         infcondition=STRING 
	 *         reftoPrivateData+=ReftoPrivateData* 
	 *         refertoservice+=ReferToService* 
	 *         refertoEnforcement+=RefertoEnforcement* 
	 *         (modalitykind='Permitted' | modalitykind='Obligation' | modalitykind='Forbidden')
	 *     )
	 */
	protected void sequence_Informative(EObject context, Informative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     partof=[Recipient|QualifiedName]
	 */
	protected void sequence_Partof(EObject context, Partof semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.PARTOF__PARTOF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.PARTOF__PARTOF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPartofAccess().getPartofRecipientQualifiedNameParserRuleCall_0_0_1(), semanticObject.getPartof());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         importelements+=Import* 
	 *         (collection+=Collection | disclosure+=Disclosure | retention+=Retention | usage+=Usage | informative+=Informative)* 
	 *         privateData+=PrivateData* 
	 *         recipient+=Recipient* 
	 *         service+=Service* 
	 *         enforcement+=Enforcement*
	 *     )
	 */
	protected void sequence_Policy(EObject context, Policy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID privatedata=STRING (PrivateDataKind='PersonalInformation' | PrivateDataKind='UsageInformation') attribute+=Attribute*)
	 */
	protected void sequence_PrivateData(EObject context, PrivateData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         recipientname=STRING 
	 *         recipientDescription=STRING 
	 *         partof+=Partof* 
	 *         (recipientScope='Internal' | recipientScope='External' | recipientScope='Internal/External') 
	 *         (recipientType='Individual' | recipientType='Organization' | recipientType='Individual/Organization')
	 *     )
	 */
	protected void sequence_Recipient(EObject context, Recipient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     refertore=[Recipient|QualifiedName]
	 */
	protected void sequence_ReferToRecipientSource(EObject context, ReferToRecipientSource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_RECIPIENT_SOURCE__REFERTORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_RECIPIENT_SOURCE__REFERTORE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferToRecipientSourceAccess().getRefertoreRecipientQualifiedNameParserRuleCall_0_0_1(), semanticObject.getRefertore());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refertore=[Recipient|QualifiedName]
	 */
	protected void sequence_ReferToRecipientTarget(EObject context, ReferToRecipientTarget semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_RECIPIENT_TARGET__REFERTORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_RECIPIENT_TARGET__REFERTORE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferToRecipientTargetAccess().getRefertoreRecipientQualifiedNameParserRuleCall_0_0_1(), semanticObject.getRefertore());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refertore=[Recipient|QualifiedName]
	 */
	protected void sequence_ReferToRecipient(EObject context, ReferToRecipient semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_RECIPIENT__REFERTORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_RECIPIENT__REFERTORE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferToRecipientAccess().getRefertoreRecipientQualifiedNameParserRuleCall_0_0_1(), semanticObject.getRefertore());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refertose=[Service|QualifiedName]
	 */
	protected void sequence_ReferToService(EObject context, ReferToService semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_SERVICE__REFERTOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.REFER_TO_SERVICE__REFERTOSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferToServiceAccess().getRefertoseServiceQualifiedNameParserRuleCall_0_0_1(), semanticObject.getRefertose());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refen=[Enforcement|QualifiedName]
	 */
	protected void sequence_RefertoEnforcement(EObject context, RefertoEnforcement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.REFERTO_ENFORCEMENT__REFEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.REFERTO_ENFORCEMENT__REFEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefertoEnforcementAccess().getRefenEnforcementQualifiedNameParserRuleCall_0_0_1(), semanticObject.getRefen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refpr=[PrivateData|QualifiedName]
	 */
	protected void sequence_ReftoPrivateData(EObject context, ReftoPrivateData semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Rslil4privacyPackage.Literals.REFTO_PRIVATE_DATA__REFPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Rslil4privacyPackage.Literals.REFTO_PRIVATE_DATA__REFPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReftoPrivateDataAccess().getRefprPrivateDataQualifiedNameParserRuleCall_0_0_1(), semanticObject.getRefpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         retentiondescription=STRING 
	 *         retentioncondition=STRING 
	 *         period=STRING 
	 *         reftoPrivateData+=ReftoPrivateData* 
	 *         refertoservice+=ReferToService* 
	 *         refertoEnforcement+=RefertoEnforcement* 
	 *         (modalitykind='Permitted' | modalitykind='Obligation' | modalitykind='Forbidden')
	 *     )
	 */
	protected void sequence_Retention(EObject context, Retention semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID servicename=STRING description=STRING? reftoPrivateData+=ReftoPrivateData* refertoservice+=ReferToService*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         usagedescription=STRING 
	 *         usagecondition=STRING 
	 *         reftoPrivateData+=ReftoPrivateData* 
	 *         refertoservice+=ReferToService* 
	 *         refertoEnforcement+=RefertoEnforcement* 
	 *         (modalitykind='Permitted' | modalitykind='Obligation' | modalitykind='Forbidden')
	 *     )
	 */
	protected void sequence_Usage(EObject context, Usage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
