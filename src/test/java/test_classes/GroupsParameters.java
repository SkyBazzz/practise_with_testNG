package test_classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseSuite;

public class GroupsParameters extends BaseSuite {

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser", "platform"})
    public void doBeforeClass(String browser, String platform) {
        System.out.println("GroupsParameters: before class");
        System.out.println("Using: " + browser + " and platform: " + platform);
    }

    @AfterClass
    public void doAfterClass() {
        System.out.println("GroupsParameters: after class");
    }

    @BeforeMethod
    public void doBeforeMethod() {
        System.out.println("GroupsParameters: before method");
    }

    @AfterMethod
    public void doAfterMethod() {
        System.out.println("GroupsParameters: after method");
    }

    @Test(groups = {"smoke"}, priority = 3)
    public void unitLevel1() {
        System.out.println("GroupsParameters: Unit level1 testing");
    }

    @Parameters({"response"})
    @Test(groups = {"ui"}, priority = 2)
    public void unitLevel2(String response) {
        System.out.println("GroupsParameters: Unit level2 testing");
        System.out.println("Response is " + response);
    }

    @Test(groups = {"regression"}, priority = 1)
    public void unitLevel3() {
        System.out.println("GroupsParameters: Unit level3 testing");
    }

    @Test(groups = {"ui", "smoke"}, priority = 1)
    public void unitLevel4() {
        System.out.println("GroupsParameters: Unit level4 testing");
    }

    @Test(groups = {"parallel"})
    public void unitLevel5() {
        System.out.println("GroupsParameters: Unit level5 testing");
    }

    @Test(groups = {"parallel"})
    public void unitLevel6() {
        System.out.println("GroupsParameters: Unit level6 testing");
    }
}