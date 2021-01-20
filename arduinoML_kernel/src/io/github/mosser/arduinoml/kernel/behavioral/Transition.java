package io.github.mosser.arduinoml.kernel.behavioral;

import java.util.List;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

public class Transition implements Visitable {

	private List<TransitionHandler> handlers;
	private State next;
	

	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}

	public List<TransitionHandler> getHandlers() {
		return handlers;
	}

	public void setHandlers(List<TransitionHandler> handlers) {
		this.handlers = handlers;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}