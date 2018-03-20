package util;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Before invocation " + testResult.getTestClass()
                                     .getName() + " " + method.getTestMethod()
                                                              .getMethodName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("After invocation " + testResult.getTestClass()
                                     .getName() + " " + method.getTestMethod()
                                                              .getMethodName());
    }
}
