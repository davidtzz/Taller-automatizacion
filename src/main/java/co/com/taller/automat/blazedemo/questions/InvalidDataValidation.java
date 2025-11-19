package co.com.taller.automat.blazedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class InvalidDataValidation implements Question<Boolean> {

    private static final Target CONFIRMATION_ID =
            Target.the("Confirmation ID")
                    .locatedBy("//td[text()='Id']/following-sibling::td");

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean confirmationVisible = false;

        try {
            confirmationVisible = CONFIRMATION_ID.resolveFor(actor).isVisible();
        } catch (Exception e) {
            confirmationVisible = false;
        }

        return !confirmationVisible;
    }

    public static InvalidDataValidation failed() {
        return new InvalidDataValidation();
    }
}

