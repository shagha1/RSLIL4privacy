package org.xtext.rslilconvertors.rslil4privacy.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.rslilconvertors.rslil4privacy.services.Rslil4privacyGrammarAccess;

@SuppressWarnings("all")
public class Rslil4privacySyntacticSequencer extends AbstractSyntacticSequencer {

	protected Rslil4privacyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute_CommaKeyword_4_q;
	protected AbstractElementAlias match_Collection___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q;
	protected AbstractElementAlias match_Collection___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q;
	protected AbstractElementAlias match_Collection___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q;
	protected AbstractElementAlias match_Disclosure___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q;
	protected AbstractElementAlias match_Disclosure___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q;
	protected AbstractElementAlias match_Disclosure___RefersToRecipientKeyword_9_0_CommaKeyword_9_2__q;
	protected AbstractElementAlias match_Disclosure___RefersToRecipientSourceKeyword_10_0_CommaKeyword_10_2__q;
	protected AbstractElementAlias match_Disclosure___RefersToRecipientTargetKeyword_11_0_CommaKeyword_11_2__q;
	protected AbstractElementAlias match_Disclosure___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q;
	protected AbstractElementAlias match_Informative___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q;
	protected AbstractElementAlias match_Informative___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q;
	protected AbstractElementAlias match_Informative___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q;
	protected AbstractElementAlias match_Partof_HyphenMinusKeyword_1_q;
	protected AbstractElementAlias match_Recipient___Recipient_PartKeyword_9_0_CommaKeyword_9_2__q;
	protected AbstractElementAlias match_ReferToRecipientSource_HyphenMinusKeyword_1_q;
	protected AbstractElementAlias match_ReferToRecipientTarget_HyphenMinusKeyword_1_q;
	protected AbstractElementAlias match_ReferToRecipient_HyphenMinusKeyword_1_q;
	protected AbstractElementAlias match_ReferToService_HyphenMinusKeyword_1_q;
	protected AbstractElementAlias match_RefertoEnforcement_HyphenMinusKeyword_1_q;
	protected AbstractElementAlias match_ReftoPrivateData_HyphenMinusKeyword_1_q;
	protected AbstractElementAlias match_Retention___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q;
	protected AbstractElementAlias match_Retention___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q;
	protected AbstractElementAlias match_Retention___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q;
	protected AbstractElementAlias match_Service___RefersToPrivateDataKeyword_7_0_CommaKeyword_7_2__q;
	protected AbstractElementAlias match_Service___Service_PartKeyword_8_0_CommaKeyword_8_2__q;
	protected AbstractElementAlias match_Usage___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q;
	protected AbstractElementAlias match_Usage___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q;
	protected AbstractElementAlias match_Usage___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Rslil4privacyGrammarAccess) access;
		match_Attribute_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getCommaKeyword_4());
		match_Collection___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getCollectionAccess().getCommaKeyword_11_2()));
		match_Collection___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getCollectionAccess().getCommaKeyword_9_2()));
		match_Collection___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getCollectionAccess().getCommaKeyword_10_2()));
		match_Disclosure___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getCommaKeyword_14_2()));
		match_Disclosure___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getCommaKeyword_12_2()));
		match_Disclosure___RefersToRecipientKeyword_9_0_CommaKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getCommaKeyword_9_2()));
		match_Disclosure___RefersToRecipientSourceKeyword_10_0_CommaKeyword_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getCommaKeyword_10_2()));
		match_Disclosure___RefersToRecipientTargetKeyword_11_0_CommaKeyword_11_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getCommaKeyword_11_2()));
		match_Disclosure___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getDisclosureAccess().getCommaKeyword_13_2()));
		match_Informative___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getInformativeAccess().getCommaKeyword_11_2()));
		match_Informative___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getInformativeAccess().getCommaKeyword_9_2()));
		match_Informative___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getInformativeAccess().getCommaKeyword_10_2()));
		match_Partof_HyphenMinusKeyword_1_q = new TokenAlias(false, true, grammarAccess.getPartofAccess().getHyphenMinusKeyword_1());
		match_Recipient___Recipient_PartKeyword_9_0_CommaKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getRecipientAccess().getCommaKeyword_9_2()));
		match_ReferToRecipientSource_HyphenMinusKeyword_1_q = new TokenAlias(false, true, grammarAccess.getReferToRecipientSourceAccess().getHyphenMinusKeyword_1());
		match_ReferToRecipientTarget_HyphenMinusKeyword_1_q = new TokenAlias(false, true, grammarAccess.getReferToRecipientTargetAccess().getHyphenMinusKeyword_1());
		match_ReferToRecipient_HyphenMinusKeyword_1_q = new TokenAlias(false, true, grammarAccess.getReferToRecipientAccess().getHyphenMinusKeyword_1());
		match_ReferToService_HyphenMinusKeyword_1_q = new TokenAlias(false, true, grammarAccess.getReferToServiceAccess().getHyphenMinusKeyword_1());
		match_RefertoEnforcement_HyphenMinusKeyword_1_q = new TokenAlias(false, true, grammarAccess.getRefertoEnforcementAccess().getHyphenMinusKeyword_1());
		match_ReftoPrivateData_HyphenMinusKeyword_1_q = new TokenAlias(false, true, grammarAccess.getReftoPrivateDataAccess().getHyphenMinusKeyword_1());
		match_Retention___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getRetentionAccess().getCommaKeyword_14_2()));
		match_Retention___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getRetentionAccess().getCommaKeyword_12_2()));
		match_Retention___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getRetentionAccess().getCommaKeyword_13_2()));
		match_Service___RefersToPrivateDataKeyword_7_0_CommaKeyword_7_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getServiceAccess().getCommaKeyword_7_2()));
		match_Service___Service_PartKeyword_8_0_CommaKeyword_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getServiceAccess().getService_PartKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getServiceAccess().getCommaKeyword_8_2()));
		match_Usage___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getUsageAccess().getCommaKeyword_11_2()));
		match_Usage___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getUsageAccess().getCommaKeyword_9_2()));
		match_Usage___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUsageAccess().getRefersToServiceKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getUsageAccess().getCommaKeyword_10_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Attribute_CommaKeyword_4_q.equals(syntax))
				emit_Attribute_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Collection___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q.equals(syntax))
				emit_Collection___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Collection___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q.equals(syntax))
				emit_Collection___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Collection___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q.equals(syntax))
				emit_Collection___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Disclosure___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q.equals(syntax))
				emit_Disclosure___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Disclosure___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q.equals(syntax))
				emit_Disclosure___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Disclosure___RefersToRecipientKeyword_9_0_CommaKeyword_9_2__q.equals(syntax))
				emit_Disclosure___RefersToRecipientKeyword_9_0_CommaKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Disclosure___RefersToRecipientSourceKeyword_10_0_CommaKeyword_10_2__q.equals(syntax))
				emit_Disclosure___RefersToRecipientSourceKeyword_10_0_CommaKeyword_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Disclosure___RefersToRecipientTargetKeyword_11_0_CommaKeyword_11_2__q.equals(syntax))
				emit_Disclosure___RefersToRecipientTargetKeyword_11_0_CommaKeyword_11_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Disclosure___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q.equals(syntax))
				emit_Disclosure___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Informative___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q.equals(syntax))
				emit_Informative___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Informative___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q.equals(syntax))
				emit_Informative___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Informative___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q.equals(syntax))
				emit_Informative___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Partof_HyphenMinusKeyword_1_q.equals(syntax))
				emit_Partof_HyphenMinusKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Recipient___Recipient_PartKeyword_9_0_CommaKeyword_9_2__q.equals(syntax))
				emit_Recipient___Recipient_PartKeyword_9_0_CommaKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferToRecipientSource_HyphenMinusKeyword_1_q.equals(syntax))
				emit_ReferToRecipientSource_HyphenMinusKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferToRecipientTarget_HyphenMinusKeyword_1_q.equals(syntax))
				emit_ReferToRecipientTarget_HyphenMinusKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferToRecipient_HyphenMinusKeyword_1_q.equals(syntax))
				emit_ReferToRecipient_HyphenMinusKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferToService_HyphenMinusKeyword_1_q.equals(syntax))
				emit_ReferToService_HyphenMinusKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RefertoEnforcement_HyphenMinusKeyword_1_q.equals(syntax))
				emit_RefertoEnforcement_HyphenMinusKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReftoPrivateData_HyphenMinusKeyword_1_q.equals(syntax))
				emit_ReftoPrivateData_HyphenMinusKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Retention___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q.equals(syntax))
				emit_Retention___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Retention___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q.equals(syntax))
				emit_Retention___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Retention___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q.equals(syntax))
				emit_Retention___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Service___RefersToPrivateDataKeyword_7_0_CommaKeyword_7_2__q.equals(syntax))
				emit_Service___RefersToPrivateDataKeyword_7_0_CommaKeyword_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Service___Service_PartKeyword_8_0_CommaKeyword_8_2__q.equals(syntax))
				emit_Service___Service_PartKeyword_8_0_CommaKeyword_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Usage___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q.equals(syntax))
				emit_Usage___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Usage___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q.equals(syntax))
				emit_Usage___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Usage___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q.equals(syntax))
				emit_Usage___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Attribute_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Enforcement' ',')?
	 */
	protected void emit_Collection___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo PrivateData' ',')?
	 */
	protected void emit_Collection___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Service' ',')?
	 */
	protected void emit_Collection___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Enforcement' ',')?
	 */
	protected void emit_Disclosure___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo PrivateData' ',')?
	 */
	protected void emit_Disclosure___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Recipient' ',')?
	 */
	protected void emit_Disclosure___RefersToRecipientKeyword_9_0_CommaKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Recipient-Source' ',')?
	 */
	protected void emit_Disclosure___RefersToRecipientSourceKeyword_10_0_CommaKeyword_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Recipient-Target' ',')?
	 */
	protected void emit_Disclosure___RefersToRecipientTargetKeyword_11_0_CommaKeyword_11_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Service' ',')?
	 */
	protected void emit_Disclosure___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Enforcement' ',')?
	 */
	protected void emit_Informative___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo PrivateData' ',')?
	 */
	protected void emit_Informative___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Service' ',')?
	 */
	protected void emit_Informative___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_Partof_HyphenMinusKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Recipient_Part' ',')?
	 */
	protected void emit_Recipient___Recipient_PartKeyword_9_0_CommaKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_ReferToRecipientSource_HyphenMinusKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_ReferToRecipientTarget_HyphenMinusKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_ReferToRecipient_HyphenMinusKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_ReferToService_HyphenMinusKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_RefertoEnforcement_HyphenMinusKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_ReftoPrivateData_HyphenMinusKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Enforcement' ',')?
	 */
	protected void emit_Retention___RefersToEnforcementKeyword_14_0_CommaKeyword_14_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo PrivateData' ',')?
	 */
	protected void emit_Retention___RefersToPrivateDataKeyword_12_0_CommaKeyword_12_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Service' ',')?
	 */
	protected void emit_Retention___RefersToServiceKeyword_13_0_CommaKeyword_13_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo PrivateData' ',')?
	 */
	protected void emit_Service___RefersToPrivateDataKeyword_7_0_CommaKeyword_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Service_Part' ',')?
	 */
	protected void emit_Service___Service_PartKeyword_8_0_CommaKeyword_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Enforcement' ',')?
	 */
	protected void emit_Usage___RefersToEnforcementKeyword_11_0_CommaKeyword_11_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo PrivateData' ',')?
	 */
	protected void emit_Usage___RefersToPrivateDataKeyword_9_0_CommaKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RefersTo Service' ',')?
	 */
	protected void emit_Usage___RefersToServiceKeyword_10_0_CommaKeyword_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
