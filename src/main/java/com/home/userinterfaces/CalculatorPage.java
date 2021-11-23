package com.home.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculatorPage {

	public static final Target FIRST_NUMBER = Target.the("campo del primer número").located(By.id("number1Field"));
	public static final Target SECOND_NUMBER = Target.the("campo del segundo número").located(By.id("number2Field"));
	public static final Target OPERATION = Target.the("lista de operaciones").located(By.id("selectOperationDropdown"));
	public static final Target CALCULATE_BUTTON = Target.the("botón de calcular").located(By.id("calculateButton"));
	public static final Target RESULT_OPERATION = Target.the("resultado de la operación").located(By.id("numberAnswerField"));
	public static final Target ERROR_MESSAGE = Target.the("mensaje de error").located(By.id("errorMsgField"));
	public static final Target CLEAR_RESULT = Target.the("boton de limpieza de resultado").located(By.id("clearButton"));

}
