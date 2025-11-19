package co.com.taller.automat.blazedemo.tasks;

import co.com.taller.automat.blazedemo.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenFlightPage implements Task {

    public static OpenFlightPage open() {
        return Tasks.instrumented(OpenFlightPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://blazedemo.com"),
                Wait.forSeconds(2));
    }
}
