package selenium_package;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://www.qed42.com/");
		
		String	originalWindow = browserObject.getWindowHandle();
		
		browserObject.switchTo().newWindow(WindowType.TAB);
		browserObject.navigate().to("https://www.google.com/");
		System.out.println("New Tab Page Title: " + browserObject.getTitle());
		
		browserObject.switchTo().newWindow(WindowType.WINDOW);
		browserObject.navigate().to("https://www.facebook.com/");
		System.out.println("New Window Page Title: " + browserObject.getTitle());
	}

}
