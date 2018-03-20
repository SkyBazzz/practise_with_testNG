package test_classes;


import org.testng.annotations.Test;

import base.BaseSuite;

public class DataProviderTest extends BaseSuite {

    @Test(dataProvider = "inputs", dataProviderClass = TestData.class)
    public void unitLevel1(String input1, String input2) throws InterruptedException {
        Thread.sleep(6000);
        System.out.println("Test1: Unit level1 testing");
        System.out.println("Input 1 : " + input1);
        System.out.println("Input 1 : " + input2);
    }
}