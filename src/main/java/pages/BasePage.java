package pages;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import utilities.DriverFactory;
import utilities.*;
import org.testng.ITestResult;
import org.testng.annotations.*;


public class BasePage extends DriverFactory {

    @Parameter
    @BeforeTest()
    public void initialize(@Optional String browser) {
        ConfigReader.readProperties();
        DriverFactory.setUpDriver(ConfigReader.browser);
    }

}
