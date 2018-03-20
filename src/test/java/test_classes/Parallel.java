package test_classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseSuite;

public class Parallel extends BaseSuite {

    @BeforeClass()
    public void doBeforeClass() {
        System.out.println("Parallel: before class");
    }

    @AfterClass
    public void doAfterClass() {
        System.out.println("Parallel: after class");
    }

    @BeforeMethod
    public void doBeforeMethod() {
        System.out.println("Parallel: before method");
    }

    @AfterMethod
    public void doAfterMethod() {
        System.out.println("Parallel: after method");
    }

    @Test
    public void unitLevel1() throws InterruptedException {
        System.out.println("Parallel: Starting unit level1 testing");
        Thread.sleep(6000);
        System.out.println("Parallel: Ending unit level1 testing");
    }

    @Test
    public void unitLevel2() throws InterruptedException {
        System.out.println("Parallel: Starting unit level2 testing");
        Thread.sleep(6000);
        System.out.println("Parallel: Ending unit level2 testing");
    }
}