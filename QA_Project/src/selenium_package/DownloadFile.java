package selenium_package;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Users\\truba\\Downloads\\sample");
		options.setExperimentalOption("prefs", prefs);
		
		ChromeDriver driver = new ChromeDriver(options);
	   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   	 driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
//	   	 driver.manage().window().maximize();
	   	 
	   	driver.findElement(By.linkText("chromedriver_win32.zip")).click();
	}

}
