package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RighClickClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rc = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act= new Actions(browserObject);
		act.contextClick(rc).build().perform();
	}

}
