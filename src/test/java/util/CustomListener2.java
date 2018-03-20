package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {


    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart -> Test name: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess -> Test name: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure -> Test name: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped -> Test name: " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // ignored
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart -> Test name: " + context.getName());
        ITestNGMethod methods[] = context.getAllTestMethods();
        System.out.println("These methods will be executed in this test tag:");

        for (ITestNGMethod method : methods) {
            System.out.println(method.getMethodName());
        }
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish -> Test name: " + context.getName());
    }
}
