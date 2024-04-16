package testngPackage;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "login")
	  public void openWebsite() {
	      System.out.println("openWebsite");
	  }
	  @Test(groups = "login")
	  public void enterData() {
	      System.out.println("enterData");
	  }
	  @Test(groups = "login")
	  public void pressLogin() {
	      System.out.println("pressLogin");
	  }
	  @Test(groups = "explore")
	  public void explorePage() {
	      System.out.println("explorePage");
	  }
}
