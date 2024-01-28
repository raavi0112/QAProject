package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\geckodriver.exe"); 
		FirefoxDriver browserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	        
	        WebElement element = browserObject.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")) ;
	        
	        Actions act= new Actions(browserObject);
	        
	        act.moveToElement(element).build().perform();
		
	}

}
