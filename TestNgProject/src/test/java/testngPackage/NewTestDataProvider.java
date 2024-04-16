package testngPackage;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


public class NewTestDataProvider {
	
ChromeDriver browserObject;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		browserObject = new ChromeDriver();
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	}
	
  @Test(dataProvider = "dp",priority =1)
  public void verify(String user,String password)
	{
	  browserObject.get("http://demo.itlearn360.com/");
	  
		WebElement loginImage= browserObject.findElement(By.id("loginlabel"));
		loginImage.click();
		
		WebElement username= browserObject.findElement(By.id("user_login"));
		username.sendKeys(user);
		
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys(password);
		
		WebElement sub= browserObject.findElement(By.name("wp-submit"));
		sub.click();
	}
  
  @Test(priority =2)
	public void logoutProcess()
	{
		WebElement logoutImage= browserObject.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i"));
		logoutImage.click();
		
		WebElement logoutclick= browserObject.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a"));
		logoutclick.click();
   }

  @AfterClass
	public void tearDown()
	{
		browserObject.close();
	}
  
}
