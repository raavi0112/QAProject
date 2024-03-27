package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPages {
	
	WebDriver driver;
	public SearchPages(WebDriver ldriver)
	{
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Home")  WebElement hometxt;
	
	@FindBy(name="frm_search")  WebElement srchProduct;
	
	@FindBy(id="btn_search")  WebElement serachbtn;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[2]/div/div/p/a")  WebElement productClick;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a") WebElement addcart;
	
	@FindBy(xpath="//*[@id=\"cart\"]/div[2]/div/a") WebElement checkout;
	
	public void searchProduct()
	{
		hometxt.click();
		srchProduct.sendKeys("Android Tv");
		serachbtn.click();
		productClick.click();
		addcart.click();
		checkout.click();
	}

}
