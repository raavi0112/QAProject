package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
WebDriver browserObject;
	
	@Test()
	public void openingGoogleSite()  {

	 System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	    browserObject = new ChromeDriver();
	   

	    browserObject.get("https://go/");
	    browserObject.close();
	}
	
	@Test(dependsOnMethods ="openingGoogleSite")
	public void openingtwitterSite()  {

	 System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	    browserObject = new ChromeDriver();
	     browserObject.get("https://twitter.com/");
	    browserObject.close();
	}
	
	@Test(dependsOnMethods ="openingtwitterSite")
	public void openingAmazonSite()  {

		  System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
    browserObject = new ChromeDriver();
    System.out.println("Open /close  amazon.com in chrome browser");

    browserObject.get("https://www.amazon.com/");
    browserObject.close();
}

}
