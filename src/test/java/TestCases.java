import org.testng.annotations.*;
import pages.BasePage;

import static pages.CareerPage.*;
import static pages.HomePage.*;
import static pages.QAPage.*;

public class TestCases extends BasePage {

    @BeforeMethod
    public void userIsOnHomePage() throws InterruptedException {
        homePage();
        checkHomePageIsOpened();
        acceptCookies();
    }

    @Test
    public void applyForQaPosition() throws InterruptedException {
        careerPage();
        checkTheCareerPage();
        clickSeeAllTeams();
        qaPage();
        applyNow();
        switchToNewTab();
    }




}
