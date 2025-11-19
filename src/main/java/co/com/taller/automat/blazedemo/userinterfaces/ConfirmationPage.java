package co.com.taller.automat.blazedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationPage {

    public static final Target TITLE = Target.the("confirmation title")
            .locatedBy("/html/body/div[2]/div/h1");

    public static final Target PRICE = Target.the("final price")
            .locatedBy("/html/body/div[2]/div/table/tbody/tr[3]/td[2]");
}
