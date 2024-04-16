package testngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupLogin {

	ChromeDriver browserObject;
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		browserObject = new ChromeDriver();
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		browserObject.get("http://demo.itlearn360.com/");
	}
	
	@Test(priority =1,groups="login")
	public void verify()
	{
		WebElement loginImage= browserObject.findElement(By.id("loginlabel"));
		loginImage.click();
		String username="Demo12";
		String password ="Test123456$";
		WebElement user= browserObject.findElement(By.id("user_login"));
		user.sendKeys(username);
		
		
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys(password);
		
		if(username.equals("Demo12")&& password.equals("Test123456$"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		WebElement sub= browserObject.findElement(By.name("wp-submit"));
		sub.click();
	}
	
	@Test(priority =2,groups="dash")
	public void checkdash()
	{
		String expectedValue="Dashboar";
		String actualValue = browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
		
		Assert.assertEquals(actualValue,expectedValue );
	}
	
	@Test(priority =3)
	public void serachCourse()
	{
		browserObject.findElement(By.name("search_course")).sendKeys("Html for beginners");
		browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button"));
	}
}
