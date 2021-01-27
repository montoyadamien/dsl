/*
 * generated by Xtext 2.14.0
 */
package polytech.dsl.spaceteam.spaml.serializer;

import arduinoML.Actuator;
import arduinoML.ArduinoMLPackage;
import arduinoML.Program;
import arduinoML.SensorAnalog;
import arduinoML.SensorDigital;
import arduinoML.State;
import arduinoML.Transition;
import arduinoML.TransitionHandler;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import polytech.dsl.spaceteam.spaml.services.SpamlGrammarAccess;

@SuppressWarnings("all")
public class SpamlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpamlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ArduinoMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ArduinoMLPackage.ACTION:
				sequence_Action(context, (arduinoML.Action) semanticObject); 
				return; 
			case ArduinoMLPackage.ACTUATOR:
				if (rule == grammarAccess.getActuatorRule()) {
					sequence_Actuator(context, (Actuator) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPluggedElementRule()) {
					sequence_Actuator_PluggedElement(context, (Actuator) semanticObject); 
					return; 
				}
				else break;
			case ArduinoMLPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case ArduinoMLPackage.SENSOR_ANALOG:
				if (rule == grammarAccess.getPluggedElementRule()) {
					sequence_PluggedElement_SensorAnalog(context, (SensorAnalog) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSensorRule()
						|| rule == grammarAccess.getSensorAnalogRule()) {
					sequence_SensorAnalog(context, (SensorAnalog) semanticObject); 
					return; 
				}
				else break;
			case ArduinoMLPackage.SENSOR_DIGITAL:
				if (rule == grammarAccess.getPluggedElementRule()) {
					sequence_PluggedElement_SensorDigital(context, (SensorDigital) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSensorRule()
						|| rule == grammarAccess.getSensorDigitalRule()) {
					sequence_SensorDigital(context, (SensorDigital) semanticObject); 
					return; 
				}
				else break;
			case ArduinoMLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case ArduinoMLPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case ArduinoMLPackage.TRANSITION_HANDLER:
				sequence_TransitionHandler(context, (TransitionHandler) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (actuator=[Actuator|EString] value=SIGNAL)
	 */
	protected void sequence_Action(ISerializationContext context, arduinoML.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.ACTION__ACTUATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.ACTION__ACTUATOR));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.ACTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_0_0_1(), semanticObject.eGet(ArduinoMLPackage.Literals.ACTION__ACTUATOR, false));
		feeder.accept(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Actuator returns Actuator
	 *
	 * Constraint:
	 *     {Actuator}
	 */
	protected void sequence_Actuator(ISerializationContext context, Actuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PluggedElement returns Actuator
	 *
	 * Constraint:
	 *     (name=EString pin=EInt)
	 */
	protected void sequence_Actuator_PluggedElement(ISerializationContext context, Actuator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.PLUGGED_ELEMENT__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.PLUGGED_ELEMENT__PIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPluggedElementAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPluggedElementAccess().getPinEIntParserRuleCall_3_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PluggedElement returns SensorAnalog
	 *
	 * Constraint:
	 *     (name=EString pin=EInt)
	 */
	protected void sequence_PluggedElement_SensorAnalog(ISerializationContext context, SensorAnalog semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.PLUGGED_ELEMENT__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.PLUGGED_ELEMENT__PIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPluggedElementAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPluggedElementAccess().getPinEIntParserRuleCall_3_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PluggedElement returns SensorDigital
	 *
	 * Constraint:
	 *     (name=EString pin=EInt)
	 */
	protected void sequence_PluggedElement_SensorDigital(ISerializationContext context, SensorDigital semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.PLUGGED_ELEMENT__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.PLUGGED_ELEMENT__PIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPluggedElementAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPluggedElementAccess().getPinEIntParserRuleCall_3_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (name=EString initialState=[State|EString] pluggedElements+=PluggedElement+ states+=State+)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns SensorAnalog
	 *     SensorAnalog returns SensorAnalog
	 *
	 * Constraint:
	 *     {SensorAnalog}
	 */
	protected void sequence_SensorAnalog(ISerializationContext context, SensorAnalog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns SensorDigital
	 *     SensorDigital returns SensorDigital
	 *
	 * Constraint:
	 *     {SensorDigital}
	 */
	protected void sequence_SensorDigital(ISerializationContext context, SensorDigital semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=EString actions+=Action actions+=Action* transition=Transition)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionHandler returns TransitionHandler
	 *
	 * Constraint:
	 *     (sensor=[Sensor|ID] value=SIGNAL)
	 */
	protected void sequence_TransitionHandler(ISerializationContext context, TransitionHandler semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.TRANSITION_HANDLER__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.TRANSITION_HANDLER__SENSOR));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.TRANSITION_HANDLER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.TRANSITION_HANDLER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionHandlerAccess().getSensorSensorIDTerminalRuleCall_0_0_1(), semanticObject.eGet(ArduinoMLPackage.Literals.TRANSITION_HANDLER__SENSOR, false));
		feeder.accept(grammarAccess.getTransitionHandlerAccess().getValueSIGNALEnumRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (handlers+=TransitionHandler handlers+=TransitionHandler*) | 
	 *             (operation=OPERATION handlers+=TransitionHandler handlers+=TransitionHandler*) | 
	 *             delay=EInt
	 *         ) 
	 *         next=[State|EString]
	 *     )
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
