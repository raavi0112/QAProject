package selenium_package;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		
		browserObject.manage().window().maximize();
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		browserObject.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		
		String username= "Demo";
		String password="Test123456$";
		
		
		WebElement email= browserObject.findElement(By.id("user_login"));
		email.sendKeys(username);
		
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys(password);
		
		
		browserObject.findElement(By.id("wp-submit")).click();
		
		System.out.println("Screenshot section");
		File sc= ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
		Files.copy(sc, new File("C:\\Users\\truba\\Desktop\\sample\\username.jpg"));
		
		
	}

}
