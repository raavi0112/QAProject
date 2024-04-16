package testngPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokeMethodListenerClass  implements IInvokedMethodListener{

	@Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // TODO Auto-generated method stub
        System.out.println("after invocation " + method.getTestMethod().getMethodName());
        IInvokedMethodListener.super.afterInvocation(method, testResult);
    }
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // TODO Auto-generated method stub
        System.out.println("before invocation of " + method.getTestMethod().getMethodName());
        IInvokedMethodListener.super.beforeInvocation(method, testResult);
    }
}
