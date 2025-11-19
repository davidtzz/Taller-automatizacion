package co.com.taller.automat.blazedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EnterPaymentField implements Interaction {

    private final Target field;
    private final String value;

    public EnterPaymentField(Target field, String value) {
        this.field = field;
        this.value = value;
    }

    // Método estático para usarlo fácilmente
    public static EnterPaymentField into(Target field, String value) {
        return Tasks.instrumented(EnterPaymentField.class, field, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(value).into(field)
        );
    }
}
