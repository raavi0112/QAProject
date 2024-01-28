package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProductSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\geckodriver.exe"); 
		FirefoxDriver browserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
		
		browserObject.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook");
		
		browserObject.findElement(By.id("nav-search-submit-button")).click();
	}

}
