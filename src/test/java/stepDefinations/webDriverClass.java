package stepDefinations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class webDriverClass {
    public static WebDriver driver;


    public void openBrowser() throws IOException {

        String browser = System.getProperty("browser");
        String environment = System.getProperty("environment");

        if (browser.equalsIgnoreCase("CHROME")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FIREFOX1")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
//
//
        System.out.println(System.getProperty("user.dir"));

        String fileName = System.getProperty("user.dir") + "/src/test/java/properties/environment_%s.properties";
        String fileNameFinal = null;

        if (environment.equalsIgnoreCase("UAT")) {
            fileNameFinal = String.format(fileName, "uat");
        } else if (environment.equalsIgnoreCase("QA")) {
            fileNameFinal = String.format(fileName, "qa");
        } else if (environment.equalsIgnoreCase("STAGE")) {
            fileNameFinal = String.format(fileName, "stage");
        }



        File file = new File(fileNameFinal);

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("URL"));


        driver.get(properties.getProperty("URL"));
    }


    public void closeBrowser() {
        driver.quit();
    }


}
