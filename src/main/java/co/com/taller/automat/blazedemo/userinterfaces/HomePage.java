package co.com.taller.automat.blazedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target DEPARTURE_CITY = Target.the("departure city dropdown")
            .locatedBy("//select[@name='fromPort']");

    public static final Target DESTINATION_CITY = Target.the("destination city dropdown")
            .locatedBy("//select[@name='toPort']");

    public static final Target FIND_FLIGHTS_BUTTON = Target.the("find flights button")
            .locatedBy("//input[@value='Find Flights']");
}

