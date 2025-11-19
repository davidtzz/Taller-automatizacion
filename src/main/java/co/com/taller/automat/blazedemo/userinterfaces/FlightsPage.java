package co.com.taller.automat.blazedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FlightsPage {

    public static final Target FIRST_CHOOSE_FLIGHT_BUTTON = Target.the("first 'Choose This Flight' button")
            .locatedBy("(//input[@value='Choose This Flight'])[1]");
}
