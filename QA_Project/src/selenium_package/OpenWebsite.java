package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
	
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.amazon.com/");
	}

}
