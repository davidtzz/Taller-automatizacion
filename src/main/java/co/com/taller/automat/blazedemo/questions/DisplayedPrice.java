package co.com.taller.automat.blazedemo.questions;

import co.com.taller.automat.blazedemo.userinterfaces.ConfirmationPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DisplayedPrice {

    public static Question<String> value() {
        return actor -> Text.of(ConfirmationPage.PRICE).answeredBy(actor);
    }
}
