package myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day13_SoftAssertions {

    @Test
    public void hardAssert(){
        /*
        TestNG
        Hard Assertions : if an assertion fails then test case STOPS executing
        Assert class is used for hard assertions in TESTNG
        Hard assertion is more common than soft assert
        If assert fails, then throm java.lang.Assertion
         */
        System.out.println("line 14");
        Assert.assertTrue(true);//PASS so continue
        System.out.println("line 17");//prints
        Assert.assertTrue(false);//FAILS so do not run rest of the case
        System.out.println("line 19");//doesn't print
    }
    @Test
    public void javaAssert(){
        /*
        Java
        this is also hard assertions but it's comes from Java
        If this assertion fails then test case stops executing
        Mote: We prefer testNG assertion of java assertion
         */
        System.out.println("line 30");//prints
        assert 3<5;//PASS
        System.out.println("line 32");//prints
        assert "apple"=="apple";
        System.out.println("line 34");
        assert "Apple".toLowerCase().contains("a");//fails so dont run rest of test case
        System.out.println("line 36");
        assert "java".equals("selenium");
        //if(assert "java".equals("selenium")PASS
        System.out.println("line 38");//doesnt print
    }

    @Test
    public void softAssertion(){
        /*
        Soft Assert: if a soft assertion fails, test case CONTINUE to execute
        STEPS
        1. Create soft assert object.
        2. use the soft assert for assertions
        3. use assertAll() to get the result
         */
        System.out.println("line 52");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(5,5);//PASS so continue
        System.out.println("line 56");
        softAssert.assertTrue(false);//FAILS but still continue
        System.out.println("line 58");
        softAssert.assertEquals("apple","selenium");
        System.out.println("line 60");
        softAssert.assertAll("Test Case Completed....");

    }
}
