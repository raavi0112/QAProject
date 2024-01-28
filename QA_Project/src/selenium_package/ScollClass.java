package selenium_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor) browserObject;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		JavascriptExecutor js = (JavascriptExecutor) browserObject;
		js.executeScript("window.scrollBy(0,100)");
		
		
		
	}

}
