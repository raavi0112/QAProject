package testngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void searchValue() {
	  System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.google.com/");
		
		browserObject.findElement(By.id("APjFqb")).sendKeys("Selenium");
  }
}
