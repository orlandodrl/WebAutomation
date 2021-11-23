package com.home.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    private final String page;

    public Navigate(String page) {
        this.page = page;
    }

    @Override
    @Step("{0} navega a la opción #page")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Open.browserOn().thePageNamed(page)
        );
    }

    public static Performable to(String page) {
        return instrumented(Navigate.class, page);
    }
}
