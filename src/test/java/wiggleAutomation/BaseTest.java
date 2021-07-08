package wiggleAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest extends BaseClass{
    public static AutomationLibrary automationLibrary;

 public void openBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            //Create the browser profile and provide the path
            WebDriverManager.chromedriver().setup();
            //assigning the browser object to WebDriver instance
            driver = new ChromeDriver();
        }
        if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            //assigning the browser object to WebDriver instance
            driver = new FirefoxDriver();
        }
        if (browserName.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            //assigning the browser object to WebDriver instance
            driver = new InternetExplorerDriver();
        }
        //Open the URL
        driver.get(URL);
        //Maximise the browser
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#truste-consent-button")).click();
        Utils.waitToLoad(2);
    }
    @BeforeClass
    public static void startUp(){
        automationLibrary = new AutomationLibrary();
    }
    @Before
    public void startBrowser(){
         openBrowser(browserName);

    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
