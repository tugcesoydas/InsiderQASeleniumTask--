package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {

    public static By loginControl=By.partialLinkText("Login");
    public static By acceptCookies= By.xpath("//a[text()='Accept All']");
    public static By moreTab=By.xpath("//*[text()='More']");
    public static By careers=By.xpath("//h5[contains(text(),'Careers')]");
    public static By lifeAtInsider=By.xpath("//h2[contains(text(),'Life at Insider')]");
    public static By findYourCalling=By.xpath("//h3[contains(text(),'Find your calling')]");
    public static By ourLocations=By.xpath("//*[contains(text(),'Our Locations')]");
    public static By seeAllTeams=By.xpath("//a[contains(text(),'See all teams')]");
    public static By selectQualityAssurance=By.xpath("//h3[contains(text(),'Quality Assurance')]");
    public static By seeAllQaJobs=By.xpath("//*[contains(text(),'See all QA jobs')]");
    public static By locationFilter=By.id("filter-by-location");
    public static By positions=By.className("position-title");
    public static By titles=By.className("position-department");
    public static By locations=By.className("position-location");
    public static By application=By.className("application-label");
    public static By applyForThisJob=By.xpath("//*[contains(text(),'Apply for this job')]");


}
