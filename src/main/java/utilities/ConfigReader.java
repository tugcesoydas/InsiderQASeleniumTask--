package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static String homePageUrl;
    public static String browser;
    public static int defaultTimeout;
    public static String jobTitle;
    public static String jobLocation;
    public static String careerUrl;
    public static String jobsLeverUrl;

    public static Properties getProperties(){
        Properties properties = new Properties();

        try {
            InputStream inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
            return properties;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    public static void readProperties(){
        Properties properties = ConfigReader.getProperties();
        homePageUrl = properties.getProperty("homePageUrl");
        browser = properties.getProperty("browser");
        defaultTimeout = Integer.parseInt((properties.getProperty("defaultTimeout")));
        jobTitle = properties.getProperty("jobTitle");
        jobLocation = properties.getProperty("jobLocation");
        careerUrl = properties.getProperty("careerUrl");
        jobsLeverUrl = properties.getProperty("jobsLeverUrl");
    }
}
