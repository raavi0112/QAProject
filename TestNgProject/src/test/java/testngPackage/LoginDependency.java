package testngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDependency {
ChromeDriver browserObject;
	
	@Test()
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		browserObject = new ChromeDriver();
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		browserObject.get("http://demo.itlearn360.com/");
	}
	
	@Test(dependsOnMethods="setUp")
	public void verify()
	{
		WebElement loginImage= browserObject.findElement(By.id("loginlabel"));
		loginImage.click();
		
		WebElement username= browserObject.findElement(By.id("user_login"));
		username.sendKeys("Demo");
		
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys("Test123456$");
		
		WebElement sub= browserObject.findElement(By.name("wp-submit"));
		sub.click();
	}
	
	@Test(dependsOnMethods="verify")
	public void logoutProcess()
	{
		WebElement logoutImage= browserObject.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i"));
		logoutImage.click();
		
		WebElement logoutclick= browserObject.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a"));
		logoutclick.click();
	}
}
