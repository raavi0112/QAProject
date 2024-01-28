package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.google.com/");
		
		browserObject.findElement(By.className("gLFyf")).sendKeys("Seenium Python");
	}

}
