package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Elements;

import java.util.concurrent.TimeUnit;

import static pages.BasePage.clickElement;
import static pages.BasePage.waitBySeconds;
import static utilities.DriverManager.driver;
import static utilities.DriverManager.setUpDriver;

public class CareerPage {

    public static void careerPage(){
        clickElement(Elements.moreTab);
        clickElement(Elements.careers);
    }

    public static void checkTheCareerPage(){
        Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.careerUrl);
        Assert.assertTrue(driver.findElement(Elements.lifeAtInsider).isDisplayed());
        Assert.assertTrue(driver.findElement(Elements.findYourCalling).isDisplayed());
        Assert.assertTrue(driver.findElement(Elements.ourLocations).isDisplayed());
    }

    public static void clickSeeAllTeams() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2500)");
        waitBySeconds(4);
        clickElement(Elements.seeAllTeams);
    }

}
