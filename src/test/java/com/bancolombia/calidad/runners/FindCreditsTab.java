package com.bancolombia.calidad.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.bancolombia.calidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class FindCreditsTab {
}
