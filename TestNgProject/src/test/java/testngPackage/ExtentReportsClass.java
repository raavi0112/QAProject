package testngPackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsClass {
	
	@Test
	public void logintest()
	{
		ExtentSparkReporter sprk= new ExtentSparkReporter("./extentReport/extent.html");
		
		 ExtentReports extent = new ExtentReports();
		extent.attachReporter(sprk);
		
		ExtentTest logger = extent.createTest("The Login Test");
		
		logger.log(Status.INFO, "The steps is login Process");
		logger.log(Status.PASS, "Testing Passed");
		
		extent.flush();
		
		
	}

}
