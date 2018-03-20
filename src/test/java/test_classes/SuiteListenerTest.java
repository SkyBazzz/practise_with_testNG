package test_classes;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuiteListenerTest {

    @BeforeClass
    public void doBeforeClass() {
        System.out.println("SuiteListenerTest: before class");
    }

    @AfterClass
    public void doAfterClass() {
        System.out.println("SuiteListenerTest: after class");
    }

    @Test
    public void unitLevel1() {
        System.out.println("SuiteListenerTest: Starting unit level1 testing");
        Assert.assertTrue(true);
    }

    @Test
    public void unitLevel2() {
        System.out.println("SuiteListenerTest: Starting unit level2 testing");
        Assert.assertTrue(true);
    }
}