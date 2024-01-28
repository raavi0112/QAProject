package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		
		Boolean en= browserObject.findElement(By.xpath("//*[@id=\"plans\"]/li[2]/ul/li[4]/a")).isEnabled();
	
		if(en)
		{
			System.out.println("The button is enabled");
		}
		else
		{
			System.out.println("The button is disabled");
		}
	}

}
