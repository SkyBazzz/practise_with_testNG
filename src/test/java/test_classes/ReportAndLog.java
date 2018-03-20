package test_classes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseSuite;

public class ReportAndLog extends BaseSuite {

    @BeforeClass()
    public void doBeforeClass() {
        Reporter.log("ReportAndLog -> This runs once before class", true);
    }

    @AfterClass
    public void doAfterClass() {
        Reporter.log("ReportAndLog -> This runs once after class", true);
    }

    @BeforeMethod
    public void doBeforeMethod() {
        Reporter.log("ReportAndLog -> This runs before every method class", true);
    }

    @AfterMethod
    public void doAfterMethod() {
        Reporter.log("ReportAndLog -> This runs after every method class", true);
    }

    @Test
    public void unitLevel1() {
        Reporter.log("ReportAndLog: Starting unit level1 testing", true);
        Assert.assertTrue(true);
    }

    @Test
    public void unitLevel2() {
        Reporter.log("ReportAndLog: Starting unit level2 testing", true);
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "unitLevel2")
    public void unitLevel3() {
        Reporter.log("ReportAndLog: Starting unit level3 testing", true);
    }
}