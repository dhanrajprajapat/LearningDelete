package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class MyCoursesPage extends Base {
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div[2]/ul/li[4]/a")
	WebElement MyCourses;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div[2]/div[1]/div/div/button/a")
	WebElement DropArrow;
	
	@FindBy(xpath="//a[contains(text(), 'My Account')]")
	WebElement MyAccountMenu;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div[2]/ul/li[2]/a")
	WebElement AllCoursesPage;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div[2]/ul/li[3]/a")
	WebElement SupportPage;
	
	public MyCoursesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public AllCoursesPage clickOnAllCourses()
	{
		AllCoursesPage.click();
		return new AllCoursesPage();
	}
	
	public SupportPage clickOnSupportPage()
	{
		SupportPage.click();
		return new SupportPage();
	}
	
	public MyAccountPage clickOnMyAccount()
	{
		DropArrow.click();
		MyAccountMenu.click();
		return new MyAccountPage();
	}
}
