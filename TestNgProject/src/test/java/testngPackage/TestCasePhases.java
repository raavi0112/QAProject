package testngPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCasePhases {
	@Test(enabled=false)
	void test1()
	{
		System.out.println("The test case disabled");
	}
	
	@Test
	void test2()
	{
		System.out.println("The test case enabled");
	}
	
	@Test
	void test3()
	{
		System.out.println("Skip the test case");
		throw new SkipException("I am skipping the test case");
		
	}

}
