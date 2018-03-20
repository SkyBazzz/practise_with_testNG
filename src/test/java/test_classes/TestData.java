package test_classes;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "inputs", parallel = true)
    public Object[][] getData() {
        return new Object[][]
                {
                        {"bmw", "m3"},
                        {"audi", "a6"},
                        {"benz", "c300"}
                };
    }
}