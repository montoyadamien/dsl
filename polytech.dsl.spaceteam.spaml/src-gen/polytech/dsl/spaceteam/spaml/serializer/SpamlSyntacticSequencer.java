/*
 * generated by Xtext 2.14.0
 */
package polytech.dsl.spaceteam.spaml.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import polytech.dsl.spaceteam.spaml.services.SpamlGrammarAccess;

@SuppressWarnings("all")
public class SpamlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SpamlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Action_EqualsSignKeyword_1_0_or_SetToKeyword_1_1;
	protected AbstractElementAlias match_LogicalCondition_EqualsSignKeyword_1_0_or_IsKeyword_1_1;
	protected AbstractElementAlias match_PluggedElement_OnPinKeyword_2_q;
	protected AbstractElementAlias match_Program_PluggedElementsKeyword_5_0_or_PluggedElementsKeyword_5_1;
	protected AbstractElementAlias match_Program_StatesKeyword_7_0_or_StatesKeyword_7_1;
	protected AbstractElementAlias match_Transition_HyphenMinusGreaterThanSignKeyword_1_0_or_ThenKeyword_1_1;
	protected AbstractElementAlias match_Transition_WhenKeyword_0_0_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SpamlGrammarAccess) access;
		match_Action_EqualsSignKeyword_1_0_or_SetToKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getActionAccess().getSetToKeyword_1_1()));
		match_LogicalCondition_EqualsSignKeyword_1_0_or_IsKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLogicalConditionAccess().getEqualsSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getLogicalConditionAccess().getIsKeyword_1_1()));
		match_PluggedElement_OnPinKeyword_2_q = new TokenAlias(false, true, grammarAccess.getPluggedElementAccess().getOnPinKeyword_2());
		match_Program_PluggedElementsKeyword_5_0_or_PluggedElementsKeyword_5_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_1()));
		match_Program_StatesKeyword_7_0_or_StatesKeyword_7_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getProgramAccess().getStatesKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getProgramAccess().getStatesKeyword_7_1()));
		match_Transition_HyphenMinusGreaterThanSignKeyword_1_0_or_ThenKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTransitionAccess().getThenKeyword_1_1()));
		match_Transition_WhenKeyword_0_0_0_q = new TokenAlias(false, true, grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0());
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
			if (match_Action_EqualsSignKeyword_1_0_or_SetToKeyword_1_1.equals(syntax))
				emit_Action_EqualsSignKeyword_1_0_or_SetToKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LogicalCondition_EqualsSignKeyword_1_0_or_IsKeyword_1_1.equals(syntax))
				emit_LogicalCondition_EqualsSignKeyword_1_0_or_IsKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PluggedElement_OnPinKeyword_2_q.equals(syntax))
				emit_PluggedElement_OnPinKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Program_PluggedElementsKeyword_5_0_or_PluggedElementsKeyword_5_1.equals(syntax))
				emit_Program_PluggedElementsKeyword_5_0_or_PluggedElementsKeyword_5_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Program_StatesKeyword_7_0_or_StatesKeyword_7_1.equals(syntax))
				emit_Program_StatesKeyword_7_0_or_StatesKeyword_7_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Transition_HyphenMinusGreaterThanSignKeyword_1_0_or_ThenKeyword_1_1.equals(syntax))
				emit_Transition_HyphenMinusGreaterThanSignKeyword_1_0_or_ThenKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Transition_WhenKeyword_0_0_0_q.equals(syntax))
				emit_Transition_WhenKeyword_0_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '=' | 'setTo'
	 *
	 * This ambiguous syntax occurs at:
	 *     actuator=[Actuator|EString] (ambiguity) value=SIGNAL
	 */
	protected void emit_Action_EqualsSignKeyword_1_0_or_SetToKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '=' | 'is'
	 *
	 * This ambiguous syntax occurs at:
	 *     sensor=[Sensor|ID] (ambiguity) value=SIGNAL
	 */
	protected void emit_LogicalCondition_EqualsSignKeyword_1_0_or_IsKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'onPin'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) pin=EInt
	 */
	protected void emit_PluggedElement_OnPinKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'pluggedElements' | 'pluggedElements:'
	 *
	 * This ambiguous syntax occurs at:
	 *     initialState=[State|EString] '{' (ambiguity) pluggedElements+=PluggedElement
	 */
	protected void emit_Program_PluggedElementsKeyword_5_0_or_PluggedElementsKeyword_5_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'states' | 'states:'
	 *
	 * This ambiguous syntax occurs at:
	 *     pluggedElements+=PluggedElement (ambiguity) states+=State
	 */
	protected void emit_Program_StatesKeyword_7_0_or_StatesKeyword_7_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '->' | 'then'
	 *
	 * This ambiguous syntax occurs at:
	 *     conditions+=Condition ')' (ambiguity) next=[State|EString]
	 *     conditions+=Condition (ambiguity) next=[State|EString]
	 */
	protected void emit_Transition_HyphenMinusGreaterThanSignKeyword_1_0_or_ThenKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'when'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) conditions+=Condition
	 */
	protected void emit_Transition_WhenKeyword_0_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
