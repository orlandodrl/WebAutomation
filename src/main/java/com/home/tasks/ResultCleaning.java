package com.home.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static com.home.userinterfaces.CalculatorPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ResultCleaning implements Task {

	@Step("{0} clean the result obtained")
	public <T extends Actor> void performAs(T theActor) {
		theActor.attemptsTo(
				Click.on(CLEAR_RESULT)
		);
	}

	public static ResultCleaning obtained() {
		return instrumented(ResultCleaning.class);
	}

}



