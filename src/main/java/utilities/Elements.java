package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {



    @FindBy(partialLinkText = "Login")
    private WebElement loginControl;

    @FindBy(xpath = "//a[text()='Accept All']")
    private WebElement acceptCookies;



    @FindBy(xpath = "//h5[contains(text(),'Careers')]")
    public static WebElement careers;

    @FindBy(xpath = "//h2[contains(text(),'Life at Insider')]")
    private WebElement lifeAtInsider;

    @FindBy(xpath = "//h3[contains(text(),'Find your calling')]")
    private WebElement findYourCalling;

    @FindBy(xpath = "//*[contains(text(),'Our Locations')]")
    private WebElement ourLocations;

    @FindBy(xpath = "//a[contains(text(),'See all teams')]")
    private WebElement seeAllTeams;

    @FindBy(xpath = "//h3[contains(text(),'Quality Assurance')]")
    private WebElement selectQualityAssurance;

    @FindBy(xpath = "//*[contains(text(),'See all QA jobs')]")
    private WebElement SeeAllQaJobs;
}
