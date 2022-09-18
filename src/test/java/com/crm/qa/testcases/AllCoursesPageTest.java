package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.AllCoursesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyCoursesPage;

public class AllCoursesPageTest extends Base{
	HomePage homepage;
	LoginPage loginpage;
	MyCoursesPage mycoursepage;
	AllCoursesPage allcoursepage;
	
	public AllCoursesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homepage=new HomePage();	
		loginpage=new LoginPage();
		mycoursepage=new MyCoursesPage();
		allcoursepage=new AllCoursesPage();
		homepage.clickOnSignIn();
		mycoursepage = loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
		mycoursepage.clickOnAllCourses();	
	}

	
	//@Test(priority=1)

	public void AllCoursePageTitleTest()
	{
		String title=allcoursepage.validateAllCoursesPageTitle(); //Validate the Homepage Title
		Assert.assertEquals(title, "All Courses");
	}

	@Test(priority=1)
	public void searchOperation()
	{
		//allcoursepage.SearchCourses(prop.getProperty("SearchText"));
		allcoursepage.SearchCourses("Software Testing");
		//System.out.println(prop.getProperty("SearchText"));
		allcoursepage.ValidateSeachCourse("Selenium WebDriver With Java");
	} 
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}
	
	
}
