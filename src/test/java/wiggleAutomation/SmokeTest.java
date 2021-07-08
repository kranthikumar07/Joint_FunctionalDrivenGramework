package wiggleAutomation;

import org.junit.Assert;
import org.junit.Test;

public class SmokeTest extends BaseTest{
    //Test Data
    public static String URL = "https://www.wiggle.com/";
    public static String searchField = "Bike";
    public static String emailAddress = "kranthi_kavilas@yahoo.co.in";
    public static String confirmEmailAddress = "kranthi_kavilas@yahoo.co.in";
    public static String password = "Testing@123";
    public static String firstName = "kranthi";
    public static String lastName = "kumar";


    @Test
    public void tescase01(){
        automationLibrary.isUserOnHomePage();
        automationLibrary.goToYourAccountPage();
        Assert.assertTrue(automationLibrary.isUserOnAccountPage());
        automationLibrary.enterEmailAddress(emailAddress);
        Assert.assertTrue(automationLibrary.isUserOnRegistrationPage());
        automationLibrary.confirmEmailAddress(confirmEmailAddress);
        automationLibrary.createPassword(password);
        automationLibrary.enterFirstName(firstName);
        automationLibrary.enterLastName(lastName);
        automationLibrary.submitButton();
    }
}
