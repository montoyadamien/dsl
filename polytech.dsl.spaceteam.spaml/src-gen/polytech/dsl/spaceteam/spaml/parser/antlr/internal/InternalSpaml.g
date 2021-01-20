/*
 * generated by Xtext 2.14.0
 */
grammar InternalSpaml;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package polytech.dsl.spaceteam.spaml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package polytech.dsl.spaceteam.spaml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import polytech.dsl.spaceteam.spaml.services.SpamlGrammarAccess;

}

@parser::members {

 	private SpamlGrammarAccess grammarAccess;

    public InternalSpamlParser(TokenStream input, SpamlGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected SpamlGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Program'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"polytech.dsl.spaceteam.spaml.Spaml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='initialState'
		{
			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getInitialStateKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='pluggedElements'
			{
				newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0());
			}
			    |
			otherlv_6='pluggedElements:'
			{
				newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getPluggedElementsPluggedElementParserRuleCall_6_0());
				}
				lv_pluggedElements_7_0=rulePluggedElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"pluggedElements",
						lv_pluggedElements_7_0,
						"polytech.dsl.spaceteam.spaml.Spaml.PluggedElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getPluggedElementsPluggedElementParserRuleCall_7_0());
				}
				lv_pluggedElements_8_0=rulePluggedElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"pluggedElements",
						lv_pluggedElements_8_0,
						"polytech.dsl.spaceteam.spaml.Spaml.PluggedElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_9='states'
			{
				newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getStatesKeyword_8_0());
			}
			    |
			otherlv_10='states:'
			{
				newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getStatesKeyword_8_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_9_0());
				}
				lv_states_11_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"states",
						lv_states_11_0,
						"polytech.dsl.spaceteam.spaml.Spaml.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_10_0());
				}
				lv_states_12_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"states",
						lv_states_12_0,
						"polytech.dsl.spaceteam.spaml.Spaml.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRulePluggedElement
entryRulePluggedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPluggedElementRule()); }
	iv_rulePluggedElement=rulePluggedElement
	{ $current=$iv_rulePluggedElement.current; }
	EOF;

// Rule PluggedElement
rulePluggedElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getPluggedElementAccess().getActuatorParserRuleCall_0_0());
			}
			this_Actuator_0=ruleActuator
			{
				$current = $this_Actuator_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getPluggedElementAccess().getSensorParserRuleCall_0_1());
			}
			this_Sensor_1=ruleSensor
			{
				$current = $this_Sensor_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPluggedElementAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPluggedElementRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"polytech.dsl.spaceteam.spaml.Spaml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='onPin'
			{
				newLeafNode(otherlv_3, grammarAccess.getPluggedElementAccess().getOnPinKeyword_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPluggedElementAccess().getPinEIntParserRuleCall_3_0());
				}
				lv_pin_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPluggedElementRule());
					}
					set(
						$current,
						"pin",
						lv_pin_4_0,
						"polytech.dsl.spaceteam.spaml.Spaml.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"polytech.dsl.spaceteam.spaml.Spaml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"polytech.dsl.spaceteam.spaml.Spaml.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
				}
				lv_actions_3_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actions",
						lv_actions_3_0,
						"polytech.dsl.spaceteam.spaml.Spaml.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0());
				}
				lv_transition_4_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"transition",
						lv_transition_4_0,
						"polytech.dsl.spaceteam.spaml.Spaml.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSensorAccess().getSensorAction_0(),
					$current);
			}
		)
		otherlv_1='Sensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
		}
	)
;

// Entry rule entryRuleActuator
entryRuleActuator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActuatorRule()); }
	iv_ruleActuator=ruleActuator
	{ $current=$iv_ruleActuator.current; }
	EOF;

// Rule Actuator
ruleActuator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActuatorAccess().getActuatorAction_0(),
					$current);
			}
		)
		otherlv_1='Actuator'
		{
			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getEqualsSignKeyword_1_0());
			}
			    |
			otherlv_2='setTo'
			{
				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getSetToKeyword_1_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_0());
				}
				lv_value_3_0=ruleSIGNAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"polytech.dsl.spaceteam.spaml.Spaml.SIGNAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='when'
			{
				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getWhenKeyword_0());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEqualsSignKeyword_2_0());
			}
			    |
			otherlv_3='is'
			{
				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getIsKeyword_2_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getValueSIGNALEnumRuleCall_3_0());
				}
				lv_value_4_0=ruleSIGNAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"polytech.dsl.spaceteam.spaml.Spaml.SIGNAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='->'
			{
				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
			}
			    |
			otherlv_6='then'
			{
				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getThenKeyword_4_1());
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule SIGNAL
ruleSIGNAL returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LOW'
			{
				$current = grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='HIGH'
			{
				$current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
