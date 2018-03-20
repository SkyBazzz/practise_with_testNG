package test_classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseSuite;

public class SimpleTestNGAnnotation extends BaseSuite {

    @BeforeClass
    public void doBeforeClass() {
        System.out.println("SimpleTestNGAnnotation: before class");
    }

    @AfterClass
    public void doAfterClass() {
        System.out.println("SimpleTestNGAnnotation: after class");
    }

    @BeforeMethod
    public void doBeforeMethod() {
        System.out.println("SimpleTestNGAnnotation: before method");
    }

    @AfterMethod
    public void doAfterMethod() {
        System.out.println("SimpleTestNGAnnotation: after method");
    }

    @Test
    public void unitLevel1() {
        System.out.println("SimpleTestNGAnnotation: Unit level1 testing");
    }

    @Test
    public void unitLevel2() {
        System.out.println("SimpleTestNGAnnotation: Unit level2 testing");
    }

    @Test
    public void unitLevel3() {
        System.out.println("SimpleTestNGAnnotation: Unit level3 testing");
    }

    @Test(priority = 1)
    public void unitLevel4() {
        System.out.println("SimpleTestNGAnnotation: Unit level4 testing");
    }
}