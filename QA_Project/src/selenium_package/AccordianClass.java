package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccordianClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		
		browserObject.findElement(By.xpath("//*[@id=\"section1Heading\"]")).click();
		
		browserObject.findElement(By.xpath("//*[@id=\"section2Heading\"]")).click();
		
		
	}

}
