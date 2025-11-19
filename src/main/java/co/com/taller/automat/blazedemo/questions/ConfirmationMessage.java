package co.com.taller.automat.blazedemo.questions;

import co.com.taller.automat.blazedemo.userinterfaces.ConfirmationPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmationMessage {

    public static Question<String> text() {
        return actor -> Text.of(ConfirmationPage.TITLE).answeredBy(actor);
    }
}
