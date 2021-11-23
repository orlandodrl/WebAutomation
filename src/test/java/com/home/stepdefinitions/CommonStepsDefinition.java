package com.home.stepdefinitions;

import com.home.userinterfaces.PageOption;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.home.tasks.*;

import static com.home.userinterfaces.PageOption.CALCULATOR_HOME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
        Navigate.to(CALCULATOR_HOME.url())
        );
    }

    @When("actions")
    public void actions() {
        System.out.println("Actions");
    }

    @Then("verifications")
    public void verifications() {
        System.out.println("Actions");
    }

}
