package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyCoursesPage;

public class HomePageTest extends Base {
	HomePage homepage;
	LoginPage loginpage;
	MyCoursesPage mycoursepage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homepage=new HomePage();	
	//	loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void HomePageTitleTest()
	{
		String title=homepage.vdalidateHomePage(); //Validate the Homepage Title
		Assert.assertEquals(title, "Home Page");
	}
	
	@Test(priority=2)
	public void HomePageLogoTest()
	{
		boolean imageFlag=homepage.validateHomePageImage();
		Assert.assertTrue(imageFlag);
	}
	
	/*@Test(priority=3)
	public void loginTest()
	{
		mycoursepage = loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
	} */
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}
	
	
}
