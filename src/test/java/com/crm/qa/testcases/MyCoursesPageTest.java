package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.AllCoursesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyCoursesPage;

public class MyCoursesPageTest extends Base{
	HomePage homepage;
	LoginPage loginpage;
	MyCoursesPage mycoursepage;
	String expecourseTitle=prop.getProperty("courseTitle");
	String actualmyCoursePage;
	
	public MyCoursesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homepage=new HomePage();	
		loginpage=new LoginPage();
		mycoursepage=new MyCoursesPage();
		homepage.clickOnSignIn();
		mycoursepage = loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
		actualmyCoursePage=mycoursepage.verifyPageTitle();
	}

	
	@Test(priority=1)
	public void MycoursePageValidate()
	{
		//String myCoursePage= mycoursepage.verifyPageTitle();
		Assert.assertEquals(actualmyCoursePage, expecourseTitle);
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}
	
	
}
