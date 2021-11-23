package com.home.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;
import static com.home.userinterfaces.CalculatorPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationPerfomance implements Task {

	private String firstNumber;
	private String secondNumber;
	private String operation;

	public OperationPerfomance(String firstNumber, String secondNumber, String operation) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operation = operation;
	}

	@Step("{0} perfom the operation #operation between #firstNumber and #secondNumber")
	public <T extends Actor> void performAs(T theActor) {
		theActor.attemptsTo(
				Enter.theValue(firstNumber).into(FIRST_NUMBER),
				Enter.theValue(secondNumber).into(SECOND_NUMBER),
				SelectFromOptions.byVisibleText(operation).from(OPERATION),
				Click.on(CALCULATE_BUTTON)
		);
	}

	public static OperationPerfomance with(String firstNumber, String secondNumber, String operation) {
		return instrumented(OperationPerfomance.class, firstNumber, secondNumber, operation);
	}

}



