package selenium_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhPTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://www.phptravels.net/");
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		browserObject.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/a/strong")).click();
		
		browserObject.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/ul/li[2]/a")).click();
		
		browserObject.findElement(By.id("firstname")).sendKeys("Jack");
		
		browserObject.findElement(By.id("last_name")).sendKeys("Naes");
		
		browserObject.findElement(By.xpath("//*[@id=\"signup\"]/div/div/div/div[3]/div[1]/div/div/button/div/div/div")).click();
		
		browserObject.findElement(By.xpath("//*[@id=\"bs-select-1-99\"]/span")).click();
		
		browserObject.findElement(By.id("phone")).sendKeys("9909495696");
		
		browserObject.findElement(By.id("user_email")).sendKeys("abc@gmail.com");
		
		browserObject.findElement(By.id("password")).sendKeys("1234");
		
		browserObject.navigate().back();
		
		browserObject.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/a/strong")).click();
		
		
	}

}
