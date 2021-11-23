package com.home.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.home.tasks.*;
import static com.home.userinterfaces.PageOption.CALCULATOR_PAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CommonStepsDefinition {

    private static final String ORLANDO = "Orlando";

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ORLANDO);
    }

    @Given("that the user is in the calculator page")
    public void thatTheUserIsInTheCalculatorPage() {
        theActorInTheSpotlight().wasAbleTo(
             Navigate.to(CALCULATOR_PAGE)
        );
    }

}
