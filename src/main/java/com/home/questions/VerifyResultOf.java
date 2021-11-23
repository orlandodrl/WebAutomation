package com.home.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextValue;
import static com.home.userinterfaces.CalculatorPage.RESULT_OPERATION;

public class VerifyResultOf implements Question<String> {

	public String answeredBy(Actor theActor) {
		return TextValue.of(RESULT_OPERATION).asString().answeredBy(theActor);
	}

	public static VerifyResultOf theOperation() {
		return new VerifyResultOf();
	}

}
