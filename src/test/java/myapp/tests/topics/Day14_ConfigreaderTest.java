package myapp.tests.topics;

import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14_ConfigreaderTest {
    @Test
    public void configReaderTest(){

        //        driver.get("https://www.google.com");
//        driver => Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getPropert("amazon_url"));

        //        get the page title
        String title = Driver.getDriver().getTitle();
        //Assert.assertTrue(title.contains("Amazon"));
        Assert.assertTrue(title.contains(ConfigReader.getPropert("amazon_title")));
//        closing driver
        Driver.getDriver().close();
        //Driver.closeDriver();
    }
}
