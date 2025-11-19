package co.com.taller.automat.blazedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {

    private final int milliseconds;

    public Wait(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public static Wait forSeconds(int seconds) {
        return Tasks.instrumented(Wait.class, seconds * 1000);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
