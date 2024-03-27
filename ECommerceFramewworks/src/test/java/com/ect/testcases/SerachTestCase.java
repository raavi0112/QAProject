package com.ect.testcases;

import org.testng.annotations.Test;

import com.ect.pages.BaseClass;
import com.ect.pages.Loginpages;
import com.ect.pages.SearchPages;

public class SerachTestCase extends BaseClass {
	
	@Test
	public void searchProduct()
	{
		lp= new Loginpages(driver);
		lp.protalLogin(username, password);
		
		SearchPages sp=new SearchPages(driver);
		sp.searchProduct();
	}
	
	

}
