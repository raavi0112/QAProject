package selenium_package;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Website_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\geckodriver.exe"); 
		FirefoxDriver browserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	}

}
