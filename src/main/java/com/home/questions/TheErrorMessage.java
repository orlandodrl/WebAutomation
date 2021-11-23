package com.home.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextValue;
import static com.home.userinterfaces.CalculatorPage.ERROR_MESSAGE;

public class TheErrorMessage implements Question<String> {

	public String answeredBy(Actor theActor) {
		return TextValue.of(ERROR_MESSAGE).asString().answeredBy(theActor);
	}

	public static TheErrorMessage onTheScreen() {
		return new TheErrorMessage();
	}

}
