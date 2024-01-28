package selenium_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		browserObject.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		
		WebElement email= browserObject.findElement(By.id("user_login"));
		email.sendKeys("Demo12");
		
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys("Test123456$");
		
		browserObject.findElement(By.id("wp-submit")).click();
	}

}
