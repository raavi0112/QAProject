package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://jqueryui.com/droppable/");
		
		browserObject.switchTo().frame(0);
		
		 WebElement source = browserObject.findElement(By.xpath("//div[@id='draggable']"));
		 
		 WebElement target = browserObject.findElement(By.xpath("//div[@id='droppable']"));
		 
		 Actions act= new Actions(browserObject);
		 
		 act.dragAndDrop(source, target).build().perform();
				 
	}

}
