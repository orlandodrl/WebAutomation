package com.home.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/two_number_calculator.feature",
        glue = "com.home.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class TwoNumberCalculatorRunner {

}
