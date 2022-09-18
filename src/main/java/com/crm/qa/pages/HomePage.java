package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class HomePage extends Base {

	//@FindBy(tagName="Sign In")
	//@FindBy(xpath="//img[contains(@class='img-fluid')]")
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div[1]/a/img")
	WebElement logo;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div[2]/div/div/a")
	WebElement Login;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String vdalidateHomePage()
	{
		return driver.getTitle();
	}
	
	public boolean validateHomePageImage()
	{
		return logo.isDisplayed();
	}
	
	public void clickOnSignIn()
	{
		Login.click();
	}
}
