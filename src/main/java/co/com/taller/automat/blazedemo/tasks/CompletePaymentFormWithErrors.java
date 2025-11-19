package co.com.taller.automat.blazedemo.tasks;

import co.com.taller.automat.blazedemo.interactions.EnterPaymentField;
import co.com.taller.automat.blazedemo.interactions.Wait;
import co.com.taller.automat.blazedemo.userinterfaces.PaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Click;

public class CompletePaymentFormWithErrors implements Task {

    public static CompletePaymentFormWithErrors invalid() {
        return Tasks.instrumented(CompletePaymentFormWithErrors.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterPaymentField.into(PaymentPage.NAME, "123!!@@"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.ADDRESS, "!!??--"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.CITY, "99999"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.STATE, "InvalidState123"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.ZIP_CODE, "ABCDE"),
                Wait.forSeconds(2),
                SelectFromOptions.byVisibleText("Visa").from(PaymentPage.CARD_TYPE),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.CREDIT_CARD_NUMBER, "abcdEFGH"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.MONTH, "aa"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.YEAR, "20XX"),
                Wait.forSeconds(2),
                EnterPaymentField.into(PaymentPage.NAME_ON_CARD, "!@#$"),
                Wait.forSeconds(2),
                Click.on(PaymentPage.PURCHASE_FLIGHT_BUTTON),
                Wait.forSeconds(2)
        );
    }
}
