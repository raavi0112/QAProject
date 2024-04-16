package testngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCode {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		// 2. Initialize Webdriver object through ChromeDriver class. 

	        ChromeDriver browserObject = new ChromeDriver();

	        browserObject.get("http://demo.itlearn360.com/");

	        browserObject.manage().window().maximize();
	        browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	        browserObject.findElement(By.id("loginlabel")).click();

	        browserObject.findElement(By.name("log")).sendKeys("Demo12");

	        browserObject.findElement(By.name("pwd")).sendKeys("Test123456$");

	        browserObject.findElement(By.name("wp-submit")).click();

	        browserObject.findElement(By.name("search_course")).sendKeys("courses");

	        browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/nav[1]/form/button")).click();

	        Thread.sleep(3000);

	        browserObject.navigate().back();

	        browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/nav[2]/ul/li[1]/a")).click();

	        browserObject.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/main/article/div/div[1]/div/div[1]/ul/li[3]/a")).click();

	        browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button")).click();
	}

}
