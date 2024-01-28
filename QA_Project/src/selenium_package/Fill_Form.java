package selenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\truba\\eclipse-docker\\QA_Project\\Driver\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.name("name")).sendKeys("Infotek");
		
		browserObject.findElement(By.name("email")).sendKeys("Infotek_solution@gmail.com");
		
		browserObject.findElement(By.name("website")).sendKeys("www.infotek.com");
		
		browserObject.findElement(By.name("comment")).sendKeys("This is a new website");
		
		browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		
		browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
		
		browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
		
		browserObject.findElement(By.name("bike")).click();
		
		browserObject.findElement(By.name("car")).click();
		
		browserObject.findElement(By.name("boat")).click();
		
		browserObject.findElement(By.name("horse")).click();
		
		
		Select cn= new Select(browserObject.findElement(By.name("country")));
		cn.selectByVisibleText("India");
		
		
		browserObject.findElement(By.name("submit")).click();
		
		Select skill = new Select(browserObject.findElement(By.name("skill")));
		skill.selectByVisibleText("Quality Assurance");
		skill.selectByVisibleText("Programming");
		
		 browserObject.findElement(By.id("alert")).click();
		Alert alert1 = browserObject.switchTo().alert();
		alert1.accept();
		Thread.sleep(4000);
		
		browserObject.findElement(By.id("confirm")).click();
		Alert alert2= browserObject.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(4000);
		
		  browserObject.findElement(By.id("prompt")).click();
		  Alert alert3=browserObject.switchTo().alert();
		  alert3.sendKeys("Mr Bond");
		  alert3.accept();
		
		
	}

}
