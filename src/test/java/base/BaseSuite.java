package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseSuite {
    @BeforeSuite(alwaysRun = true)
    public void doBeforeSuite() {
        System.out.println("before suite");
    }

    @AfterSuite
    public void doAfterSuite() {
        System.out.println("after suite");
    }

    @BeforeTest
    public void doBeforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    public void doAfterTest() {
        System.out.println("after test");
    }
}
