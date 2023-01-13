package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Elements;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static pages.BasePage.clickElement;
import static pages.BasePage.waitBySeconds;
import static utilities.DriverManager.driver;
import static utilities.DriverManager.setUpDriver;

public class QAPage {

public static void qaPage(){

    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1600)");
    waitBySeconds(4);
    clickElement(Elements.selectQualityAssurance);
    waitBySeconds(4);
    clickElement(Elements.seeAllQaJobs);

    Select select = new Select(driver.findElement(Elements.locationFilter));
    select.selectByVisibleText(ConfigReader.jobLocation);

    js.executeScript("window.scrollBy(0,600)");
    waitBySeconds(4);
    List<WebElement> positions = driver.findElements(Elements.positions);
    for(WebElement element : positions) {
        Assert.assertTrue(element.getText().contains(ConfigReader.jobTitle));
    }

    List<WebElement> titles = driver.findElements(Elements.titles);
    for(WebElement element : titles) {
        Assert.assertEquals(element.getText(), ConfigReader.jobTitle);
    }


    List<WebElement> locations = driver.findElements(Elements.locations);
    for(WebElement element : locations) {
        Assert.assertEquals(element.getText(), ConfigReader.jobLocation);
    }

}
    public static void applyNow(){
        WebElement applyNow = driver.findElement(By.xpath("//*[contains(text(),'Apply Now')]"));
        Actions action = new Actions(driver);
        action.moveToElement(applyNow).perform();
        applyNow.click();

    }

    public static void switchToNewTab(){

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        waitBySeconds(2);
        clickElement(Elements.applyForThisJob);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(Elements.application)).isDisplayed());


    }
}
