package co.com.taller.automat.blazedemo.runners.runnerpackage;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flight_purchase.feature",
        glue = "co.com.taller.automat.blazedemo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerFlightPurchase {}
