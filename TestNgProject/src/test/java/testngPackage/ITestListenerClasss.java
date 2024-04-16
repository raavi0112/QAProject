package testngPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClasss implements ITestListener{

	@Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        System.out.println("*************All the Tests are Completed: "+context.getName());
       
        
    }
    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
    	
    	System.out.println("The test execution started");
       
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("*************Test Failed: "+result.getName());
        
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("*************Test Skipped: "+result.getName());
        
    }
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("*************Test Started: "+result.getName());
        
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("*************Test is success: "+result.getName());
        
    }
}
