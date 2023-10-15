package myapp.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    //calls driver
    public static WebDriver getDriver(){
        if (driver==null) {//if driver is not in use (driver==null), there create a new driver, otherwise just return the same driver

            switch (ConfigReader.getPropert("browser")){
                case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().addArguments("--headless=new"));
                    break;
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.manage().window().maximize();
        }
        return driver;
    }

//Close driver
    public static void classDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
