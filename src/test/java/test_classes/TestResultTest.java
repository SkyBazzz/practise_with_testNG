package test_classes;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestResultTest {

    @Test
    public void unitLevel1() {
        System.out.println("TestResultTest: Starting unit level1 testing");
        Assert.assertTrue(false);
    }

    @Test
    public void unitLevel2() {
        System.out.println("TestResultTest: Starting unit level2 testing");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void doAfterMethod(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed: " + testResult.getName());
        } else {
            System.out.println("Success: " + testResult.getName());
        }
    }
}
