package testngPackage;

import org.testng.IExecutionListener;

public class IExecutionListenerClass implements IExecutionListener{

	private long startTime;
	@Override
    public void onExecutionFinish() {
        // TODO Auto-generated method stub
        System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");
        IExecutionListener.super.onExecutionFinish();
    }
    @Override
    public void onExecutionStart() {
        // TODO Auto-generated method stub
        startTime = System.currentTimeMillis();
        System.out.println("TestNG is going to start");  
        IExecutionListener.super.onExecutionStart();
    }
}
