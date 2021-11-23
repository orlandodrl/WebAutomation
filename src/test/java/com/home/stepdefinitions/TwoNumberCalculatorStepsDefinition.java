package com.home.stepdefinitions;

import com.home.exceptions.OperationAssertion;
import com.home.questions.VerifyResultOf;
import com.home.tasks.OperationPerfomance;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.home.exceptions.ExceptionMessages.UNEXPECTED_RESULT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class TwoNumberCalculatorStepsDefinition {

    @When("he perform a operation of {string} between the number {string} and {string}")
    public void hePerformAOperationOfBetweenTheNumberAnd(String operation, String firstNumber, String secondNumber) {
        theActorInTheSpotlight().attemptsTo(
                OperationPerfomance.with(firstNumber, secondNumber, operation)
        );
    }

    @Then("he should that the result is {string}")
    public void heShouldThatTheResultIs(String result) {
        theActorInTheSpotlight().should(
                seeThat(VerifyResultOf.theOperation(), equalTo(result))
                .orComplainWith(OperationAssertion.class, UNEXPECTED_RESULT.getMessage())
        );
    }

}
