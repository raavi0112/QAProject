package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.google.com/");
		
		WebElement text=browserObject.findElement(By.linkText("Gmail"));
		
		if(text.isDisplayed())
		{
			System.out.println("The text is a link");
		}
		else 
		{
			System.out.println("This is not a link");
		}
		
		browserObject.close();
		
		
	}

}
