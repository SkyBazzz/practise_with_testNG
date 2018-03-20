import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

    @BeforeSuite
    public void doBeforeSuite() {
        System.out.println("before suite");
    }

    @AfterSuite
    public void doAfterSuite() {
        System.out.println("after suite");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("Once before all methods");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("Once after all methods");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void method1() {
        System.out.println("Running method1");
    }

    @Test
    public void method2() {
        System.out.println("Running method2");
    }
}
