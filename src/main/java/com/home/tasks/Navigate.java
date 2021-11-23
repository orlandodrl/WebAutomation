package com.home.tasks;

import com.home.userinterfaces.PageOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    private final PageOption pageOption;

    public Navigate(PageOption pageOption) {
        this.pageOption = pageOption;
    }

    @Override
    @Step("{0} navigate to the page: #page")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Open.browserOn().thePageNamed(pageOption.url())
        );
    }

    public static Performable to(PageOption pageOption) {
        return instrumented(Navigate.class, pageOption);
    }
}
