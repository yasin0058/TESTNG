package myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day13_DependsOnMethods {
    @Test
    public void homePage(){
        System.out.println("home page");
    }

    @Test
    public void searchTest(){
        System.out.println("search test");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "searchTest")//checkout is depends on searchTest
    public void checkOutTest(){
        System.out.println("Checkout test");
    }







}
