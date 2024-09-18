package com.shoppoint.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.shoppoint.generic.Fileutility.ExcelUtility;
import com.shoppoint.generic.Fileutility.FileUtility;
import com.shoppoint.generic.objectrepository.Homepage;
import com.shoppoint.generic.objectrepository.Loginpage;
import com.shoppoint.generic.webdriverutility.WebdriverUtility;

public class Baseclass {
	
	 FileUtility fLib=new FileUtility();
	 ExcelUtility eLib=new ExcelUtility();
	 WebdriverUtility wLib=new WebdriverUtility();
	 public WebDriver driver = null;
	 
	 @BeforeClass
	 public void beforeclass() throws IOException {
		String browser = fLib.getDataFromPropertyFile("browser");
		String url = fLib.getDataFromPropertyFile("url");
		
	    wLib.waitForPageToLoad(driver);
}
	 @BeforeMethod
	 public void beforeMethod() throws Exception
		{
		
			
			String email = fLib.getDataFromPropertyFile("email");
			String password = fLib.getDataFromPropertyFile("password");
			Loginpage lp=new Loginpage(driver);
			lp.setLogin(email, password);
			
		}
	 @AfterMethod
		public void afterMethod()
		{
		Homepage h = new Homepage(driver);
			h.logOut();
		}
	 
	 @AfterClass
	 public void afterClass()
		{
	        driver.quit();
		}
		
	 

}
