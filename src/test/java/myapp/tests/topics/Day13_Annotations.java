package myapp.tests.topics;

import org.testng.annotations.*;

public class Day13_Annotations {
    /*

    @Test: used to create test cases same as Junit
    @Before and After annotations:there 5 before and 5 after annotitations
    Hierrarchy: suit>test>group>class>method
    @Ignore: Ignore or skip test case(ınstead of commented out)(sample test case 2)
    @Test(enabled = false) : disable the test case same as @Ignore
    @Test(priority = 1) priority code is used to change the tests order

     */

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before tests");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("before groups");
    }

    @BeforeClass
    public void beforeClasss(){
        System.out.println("before class");
    }
    @BeforeMethod
    public void beforeMethods(){
        System.out.println("before method");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suit");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
    @AfterGroups
    public void afterGorups(){
        System.out.println("after groups");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @Test(priority = 3)
    public void test1(){
        System.out.println("test case 1");
    }

    @Test @Ignore
    public void test2(){
        System.out.println("test case 2");
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("test case 3");
    }

    @Test(priority = 2)
    public void test4(){
        System.out.println("test case 4");
    }
    @Test(priority = 1)
    public void test5(){
        System.out.println("test case 5");
    }

}
