package util;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

    public void onStart(ISuite suite) {
        System.out.println("on Start: " + suite.getName());
    }

    public void onFinish(ISuite suite) {
        System.out.println("on Finish: " + suite.getName());
    }
}