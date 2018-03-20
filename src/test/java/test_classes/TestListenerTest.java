package test_classes;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.CustomListener2;

@Listeners(CustomListener2.class)
public class TestListenerTest {

    @BeforeClass
    public void doBeforeClass() {
        System.out.println("TestListenerTest: before class");
    }

    @AfterClass
    public void doAfterClass() {
        System.out.println("TestListenerTest: after class");
    }

    @Test
    public void unitLevel1() {
        System.out.println("TestListenerTest: Starting unit level1 testing");
        Assert.assertTrue(true);
    }

    @Test
    public void unitLevel2() {
        System.out.println("MethodListenerTest: Starting unit level2 testing");
        Assert.assertTrue(true);
    }
}