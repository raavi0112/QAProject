package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 ChromeDriver  browserObject = new ChromeDriver();
		
	        browserObject.get("https://www.facebook.com/");
	        
		    browserObject.navigate().to("http://www.instagram.com/");
		        
		    browserObject.navigate().to("http://www.twitter.com/");
		    
			browserObject.navigate().back();
			        
			System.out.println("this is " + browserObject.getTitle() + " website");
			System.out.println("url is: " + browserObject.getCurrentUrl());
			       
		    browserObject.navigate().back();
				
		    browserObject.navigate().forward();
			    
	}

}
