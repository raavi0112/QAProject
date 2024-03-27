package com.ect.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ect.pages.BaseClass;
import com.ect.pages.Loginpages;
import com.ect.utilities.ReadExcelFile;

public class LoginTest extends BaseClass {
	String fileName= System.getProperty("user.dir")+"\\TestData\\ETestData.xlsx";
	
	@Test(dataProvider="logindataProvider")
	public void verify(String user,String pass) throws IOException
	{
		Loginpages lp= new Loginpages(driver);
		lp.protalLogin(user, pass);
		
		if(user.equals("ravi@dhiyotech.in") && pass.equals("Demo"))
		{
			Assert.assertTrue(true);
			lp.logout();
		}
		else
		{
			captureScreenShot(driver, "verify");
			Assert.assertTrue(false);
			
		}
	}
	
	@DataProvider
	public String[][] logindataProvider()
	{
		int row=ReadExcelFile.getRowCount(fileName, "Login");
		int col=ReadExcelFile.getColCount(fileName, "Login");
		
		String [][] data=new String[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellvalue(fileName, "Login", i, j);
			}
		}
		
		return data;
	}

}
