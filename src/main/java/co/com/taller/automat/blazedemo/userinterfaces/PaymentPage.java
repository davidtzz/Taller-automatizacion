package co.com.taller.automat.blazedemo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {

    public static final Target NAME = Target.the("name field")
            .locatedBy("//input[@id='inputName']");

    public static final Target ADDRESS = Target.the("address field")
            .locatedBy("//input[@id='address']");

    public static final Target CITY = Target.the("city field")
            .locatedBy("//input[@id='city']");

    public static final Target STATE = Target.the("state field")
            .locatedBy("//input[@id='state']");

    public static final Target ZIP_CODE = Target.the("zip code field")
            .locatedBy("//input[@id='zipCode']");

    public static final Target CARD_TYPE = Target.the("card type field")
            .locatedBy("//select[@id='cardType']");

    public static final Target CREDIT_CARD_NUMBER = Target.the("credit card number field")
            .locatedBy("//input[@id='creditCardNumber']");

    public static final Target MONTH = Target.the("month field")
            .locatedBy("//input[@id='creditCardMonth']");

    public static final Target YEAR = Target.the("year field")
            .locatedBy("//input[@id='creditCardYear']");

    public static final Target NAME_ON_CARD = Target.the("name on card field")
            .locatedBy("//input[@id='nameOnCard']");

    public static final Target PURCHASE_FLIGHT_BUTTON = Target.the("purchase flight button")
            .locatedBy("//input[@value='Purchase Flight']");
}

