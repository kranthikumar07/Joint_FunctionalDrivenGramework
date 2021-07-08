package wiggleAutomation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AutomationLibrary extends BaseClass{

public void isUserOnHomePage(){
     String actualTile = driver.getTitle();
     String expectedTitle = "Cycle | Run | Swim | Tri-Sports & Bike Shop | wiggle.com";
     Assert.assertEquals(actualTile,expectedTitle);
    }
public void goToYourAccountPage(){
        //WebElement yourAccountPage = driver.findElement(By.cssSelector("#accountLink"));
       //yourAccountPage.click();
        Utils.click(driver.findElement(By.cssSelector("#accountLink")));
        Utils.waitToLoad(2);
}
public boolean isUserOnAccountPage(){
        return Utils.isDisplayed(driver.findElement(By.cssSelector(".bem-checkout__container-block")));
}
public void enterEmailAddress(String email){
        WebElement enterEmailAddressField = driver.findElement(By.cssSelector("#DualRegisterEmailModel_Email"));
        Utils.sendText(enterEmailAddressField,email);
        //enterEmailAddressField.sendKeys(email);
        Utils.click(driver.findElement(By.xpath("//button[@id='qa-dual-register']")));
        //driver.findElement(By.xpath("//button[@id='qa-dual-register']")).click();
        //driver.findElement(By.linkText("Continue"));
        Utils.waitToLoad(2);
    }

public boolean isUserOnRegistrationPage(){
    return Utils.isDisplayed(driver.findElement(By.cssSelector("#NewCustomer")));
 }
public void confirmEmailAddress(String confirmEmail){

        WebElement confirmEmailAddressField = driver.findElement(By.cssSelector("#RegisterModel_EmailConfirm"));
        Utils.sendText(confirmEmailAddressField,confirmEmail);
        //confirmEmailAddressField.sendKeys(confirmEmail);
    }
public void createPassword(String pwd){
        WebElement createPasswordField = driver.findElement(By.cssSelector("#RegisterModel_Password"));
        Utils.sendText(createPasswordField,pwd);
        //createPasswordField.sendKeys(pwd);
    }
public void enterFirstName(String fName){
        WebElement firstNameField = driver.findElement(By.cssSelector("#RegisterModel_FirstName"));
        firstNameField.sendKeys(fName);
    }

public void enterLastName(String lName) {
        WebElement lastNameField = driver.findElement(By.cssSelector("#RegisterModel_Surname"));
        Utils.sendText(lastNameField,lName);
        //lastNameField.sendKeys(lName);
    }

 public void submitButton(){
        WebElement continueButtonField = driver.findElement((By.cssSelector("#qa-register")));
        Utils.click(continueButtonField);
       // continueButtonField.click();
    }

 public boolean verifyUserRegistered(){
    return Utils.isDisplayed(driver.findElement(By.cssSelector("")));
 }

}