package com.crm.qa.testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;  

public class MavenTest1 {
	public String url="https://courses.letskodeit.com/practice";  
	String driverPath="D://SeleniumWebdrivers//chromedriver.exe";
	public WebDriver driver;

@SuppressWarnings("deprecation")
@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(url);
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
}
	
@BeforeTest
public void beforeTest()
{
	System.out.println("Before Test");
}

@AfterTest
public void afterTest()
{
	driver.close();
	System.out.println("After Test");
	driver.quit();
}
}
