package testngPackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ISuiteListenerCLass implements ISuiteListener {

	@Override
    public void onFinish(ISuite suite) {
        // TODO Auto-generated method stub
        System.out.println("onFinish:  after the test suite is completed:\t"+suite.getName());
        ISuiteListener.super.onFinish(suite);
    }
    @Override
    public void onStart(ISuite suite) {
        // TODO Auto-generated method stub
        System.out.println("onStart:  before the test suite is starts:\t"+suite.getName());
        ISuiteListener.super.onStart(suite);
    }
}
