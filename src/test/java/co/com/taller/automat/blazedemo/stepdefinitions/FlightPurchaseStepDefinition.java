package co.com.taller.automat.blazedemo.stepdefinitions;

import co.com.taller.automat.blazedemo.questions.ConfirmationMessage;
import co.com.taller.automat.blazedemo.questions.DisplayedPrice;
import co.com.taller.automat.blazedemo.questions.InvalidDataValidation;
import co.com.taller.automat.blazedemo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
public class FlightPurchaseStepDefinition {

    public final Actor user= Actor.named("user");
    @Managed(driver="chrome",uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void config(){
        user.can(BrowseTheWeb.with(theDriver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }
    @Given("I am on the flight search page")
    public void iAmOnTheFlightSearchPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenFlightPage.open());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @When("I search for a flight and complete the payment form")
    public void iSearchForAFlightAndCompleteThePaymentForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchFlight.withDefaultData(),
                ChooseFlight.firstAvailable(),
                CompletePaymentForm.withDefaultInfo());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Then("I can see the price displayed correctly and a confirmation message")
    public void iCanSeeThePriceDisplayedCorrectlyAndAConfirmationMessage() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The price displayed", DisplayedPrice.value(), notNullValue()),
                seeThat("The confirmation message", ConfirmationMessage.text(), containsString("Thank you"))
        );
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @When("I submit the payment form with invalid data")
    public void iSubmitThePaymentFormWithInvalidData(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchFlight.withDefaultData(),
                ChooseFlight.firstAvailable(),
                CompletePaymentFormWithErrors.invalid()
        );
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Then("I can see an error message and my trip is not booked")
    public void iCanSeeAnErrorMessageAndTheTripIsNotBooked(){
        OnStage.theActorInTheSpotlight().should(
                seeThat("The validation should fail",InvalidDataValidation.failed(),is(true))
        );
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
