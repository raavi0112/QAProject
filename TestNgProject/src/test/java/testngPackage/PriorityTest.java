package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTest {

	WebDriver browserObject;
	
	@Test(priority =3)
	public void openingGoogleSite()  {

	 System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	    browserObject = new ChromeDriver();
	   

	    browserObject.get("https://www.google.com/");
	    browserObject.close();
	}
	
	@Test(priority =1)
	public void openingtwitterSite()  {

	 System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	    browserObject = new ChromeDriver();
	     browserObject.get("https://twitter.com/");
	    browserObject.close();
	}
	
	@Test(priority =2)
	public void openingAmazonSite()  {

		  System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
    browserObject = new ChromeDriver();
    System.out.println("Open /close  amazon.com in chrome browser");

    browserObject.get("https://www.amazon.com/");
    browserObject.close();
}

}
