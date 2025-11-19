package co.com.taller.automat.blazedemo.tasks;

import co.com.taller.automat.blazedemo.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

public class SearchFlight implements Task {

    private static final Target DEPARTURE_CITY = Target.the("departure city dropdown")
            .locatedBy("//select[@name='fromPort']");
    private static final Target DESTINATION_CITY = Target.the("destination city dropdown")
            .locatedBy("//select[@name='toPort']");
    private static final Target FIND_FLIGHTS_BUTTON = Target.the("find flights button")
            .locatedBy("//input[@value='Find Flights']");

    public static SearchFlight withDefaultData() {
        return Tasks.instrumented(SearchFlight.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Mexico City").from(DEPARTURE_CITY),
                Wait.forSeconds(2),
                SelectFromOptions.byVisibleText("London").from(DESTINATION_CITY),
                Wait.forSeconds(2),
                Click.on(FIND_FLIGHTS_BUTTON),
                Wait.forSeconds(2)
        );
    }
}

