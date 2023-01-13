package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverManager;
import utilities.*;
import org.testng.annotations.*;
import java.time.Duration;



public class BasePage extends DriverManager {

    @Parameters({"browser"})
    @BeforeTest()
    public void initialize(@Optional String browser) {
        ConfigReader.readProperties();
        DriverManager.setUpDriver(ConfigReader.browser);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }

    public static WebElement waitElementVisible(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return webElement;
    }

    public static void clickElement(By element){
        waitElementVisible(element).click();
    }

    public static void waitBySeconds ( int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
