package selenium_package;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenEdgeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\msedgedriver.exe"); 
		EdgeDriver browserObject = new EdgeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	}

}
