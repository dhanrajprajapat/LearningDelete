package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class LoginPage extends Base{

	//page Factory -OR
	@FindBy(id="email")
	WebElement UserName_email;
	@FindBy(id="password")
	WebElement Password;
	//@FindBy(xpath="//html/body/div[1]/div[2]/div/div/div/div/form/div[4]/div[1]/input")
	@FindBy(xpath="//input[@type='submit']")
	WebElement SubmitBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public MyCoursesPage login(String uname, String pwd)
	{
		UserName_email.sendKeys(uname);
		Password.sendKeys(pwd);
		SubmitBtn.click();
		return new MyCoursesPage();
	}
	
	}
