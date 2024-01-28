package selenium_package;



import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;


public class FLUCLass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        driver.manage().window().maximize();
                
        driver.findElement(By.name("q")).sendKeys("Selenium");
                
        Thread.sleep(2000);
                
        driver.findElement(By.name("btnK")).click();

        @SuppressWarnings({ "deprecation" })
        
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                
.pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);
        
        WebElement element = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            
            
            
            public WebElement apply(WebDriver arg0) {
                            
            WebElement linkelement = driver.findElement(By.partialLinkText("Selenium"));

                            if (linkelement.isEnabled()) {

                                System.out.println("Element is Found");
                            }

                            return linkelement;
                        }
                    });

                    element.click();
               
	}

}
