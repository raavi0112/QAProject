package selenium_package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	        ChromeDriver browserObject = new ChromeDriver();
	
	      
	     
	     // 4.  Open the web page https://www.google.com/
	      browserObject.get("http://google.com" );
	      //Maximizes the browser window
	      WebDriverWait wait= new WebDriverWait(browserObject, Duration.ofSeconds(30));
	      WebElement gmailLink;
		// 5. Locate the gmail element and apply the wait and until method to the element.
	      gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
	      gmailLink.click();
	     // 6. close the browser
	   browserObject.quit();
		
		
	}
}
