package myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14_DependsOnGroups {

    @Test(groups = "smoke-test")
    public void homePage(){
        System.out.println("home page");
    }

    @Test(groups = "smoke-test")
    public void searchTest(){
        System.out.println("search test");
        Assert.assertTrue(false);
    }

    @Test(groups = "regression-test")//checkout is depends on searchTest
    public void checkOutTest(){
        System.out.println("Checkout test");
    }

    @Test(dependsOnGroups = "smoke-test")//logout is dependent on smoke test//if all smoke test groups pass and then this test execute otherwise ignore.
    public void logOutTest(){
        System.out.println("Logout test");

    }
}
