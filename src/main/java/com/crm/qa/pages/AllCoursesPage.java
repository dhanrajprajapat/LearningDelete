package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.Base;

public class AllCoursesPage extends Base{

	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div[1]/select")
	@CacheLookup
	WebElement Category;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div/div[3]/div/div/a/div[2]/h4")
	@CacheLookup
	WebElement SearchedItem;
	
	public AllCoursesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateAllCoursesPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public void SearchCourses(String searchText) {
		WebElement selectObj=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div[1]/select"));
		Select selectobjdropdown=new Select(selectObj);
		selectobjdropdown.selectByIndex(1);
		//selectobjdropdown.selectByValue(searchText);
		// TODO Auto-generated method stub
	}

	public boolean ValidateSeachCourse(String SearchedText)
	{
		return SearchedItem.isDisplayed();
	}
}
