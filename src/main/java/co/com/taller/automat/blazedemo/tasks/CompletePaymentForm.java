package co.com.taller.automat.blazedemo.tasks;

import co.com.taller.automat.blazedemo.interactions.EnterPaymentField;
import co.com.taller.automat.blazedemo.interactions.Wait;
import co.com.taller.automat.blazedemo.userinterfaces.PaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Click;

public class CompletePaymentForm implements Task {

    public static CompletePaymentForm withDefaultInfo() {
        return Tasks.instrumented(CompletePaymentForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterPaymentField.into(PaymentPage.NAME, "David Tovar"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.ADDRESS, "Calle 123"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.CITY, "Medellin"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.STATE, "Antioquia"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.ZIP_CODE, "050001"),
                Wait.forSeconds(2),
                SelectFromOptions.byVisibleText("Visa").from(PaymentPage.CARD_TYPE),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.CREDIT_CARD_NUMBER, "1234567890123456"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.MONTH, "12"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.YEAR, "2028"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.NAME_ON_CARD, "David Tovar"),
                Wait.forSeconds(2),
                Click.on(PaymentPage.PURCHASE_FLIGHT_BUTTON),
                Wait.forSeconds(2)
        );
    }
}

