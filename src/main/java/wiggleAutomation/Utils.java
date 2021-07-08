package wiggleAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Utils extends BaseClass {

    public static void click(WebElement element){
        element.click();
    }

    public static void sendText(WebElement element, String text){
        element.sendKeys(text);

    }
    public static void waitToLoad(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }

    public static void selectByText(WebElement element,String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }
    public static void selectByValue(WebElement element,String value){
        Select select = new Select(element);
        select.selectByValue(value);

    }
    public static void selectByIndex(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);

    }
    public static boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }
    public static boolean containsText(WebElement element,String text){
        return element.getText().contains(text);
    }
    public static String isEquals(WebElement element){
        return element.getText();
    }
    public static void mouseOver(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }

}
