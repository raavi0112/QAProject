package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\geckodriver.exe"); 
		FirefoxDriver browserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	        

	        WebElement uploadFile=browserObject.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[1]"));
	        
	        uploadFile.sendKeys("C:\\Users\\truba\\Desktop\\UpdateCode.txt");
	        
	        browserObject.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/table/tbody/tr/td[5]/button[1]")).click();

	}

}
