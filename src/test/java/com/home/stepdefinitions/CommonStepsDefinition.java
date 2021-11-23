package com.home.stepdefinitions;

import com.home.questions.VerifyResultOf;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.home.tasks.*;
import static com.home.userinterfaces.PageOption.CALCULATOR_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CommonStepsDefinition {

    private static final String ORLANDO = "Orlando";

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ORLANDO);
    }

    @Given("precondictions")
    public void precondictions() {
        theActorInTheSpotlight().wasAbleTo(
             Navigate.to(CALCULATOR_PAGE)
        );
    }

    @When("actions")
    public void actions() {
        theActorInTheSpotlight().attemptsTo(
            OperationPerfomance.with("2", "2", "Add")
        );

    }

    @Then("verifications")
    public void verifications() {
        theActorInTheSpotlight().should(
                seeThat(VerifyResultOf.theOperation(), equalTo("4"))
        );
    }

}
