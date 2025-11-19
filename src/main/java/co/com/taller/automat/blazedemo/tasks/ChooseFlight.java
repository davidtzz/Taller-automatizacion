package co.com.taller.automat.blazedemo.tasks;

import co.com.taller.automat.blazedemo.interactions.Wait;
import co.com.taller.automat.blazedemo.userinterfaces.FlightsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChooseFlight implements Task {

    public static ChooseFlight firstAvailable() {
        return new ChooseFlight();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FlightsPage.FIRST_CHOOSE_FLIGHT_BUTTON),
                Wait.forSeconds(2)
        );
    }
}

