package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Elements;
import java.time.Duration;

import static pages.BasePage.clickElement;
import static utilities.DriverManager.driver;

public class HomePage {
    public static void homePage(){
        driver.navigate().to(ConfigReader.homePageUrl);
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-notifications");
    }

    public static void checkHomePageIsOpened(){
        Assert.assertTrue(driver.getCurrentUrl().equals(ConfigReader.homePageUrl));
        Assert.assertTrue( driver.findElement(Elements.loginControl).isDisplayed());
    }

    public static void acceptCookies(){
        clickElement(Elements.acceptCookies);
    }

}
