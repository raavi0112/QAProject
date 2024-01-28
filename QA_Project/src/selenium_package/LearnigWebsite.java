package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnigWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) browserObject;
		js.executeScript("window.scrollBy(0,500)");
		
		browserObject.findElement(By.xpath("//*[@id=\"training_process\"]/div[1]/p/a")).click();
		
		browserObject.findElement(By.id("user_login")).sendKeys("infotek12");
		
		browserObject.findElement(By.id("user_email")).sendKeys("infotek12@gmail.com");
		
		browserObject.findElement(By.id("user_fname")).sendKeys("infotek");
		
		browserObject.findElement(By.id("user_lname")).sendKeys("Solution");
		
		browserObject.findElement(By.id("country")).sendKeys("India");
		
		
		browserObject.findElement(By.id("contactno")).sendKeys("90966969667");
		
		browserObject.findElement(By.name("wp-submit")).click();
	}

}
