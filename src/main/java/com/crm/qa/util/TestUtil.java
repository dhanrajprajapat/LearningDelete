package com.crm.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.Base;

public class TestUtil extends Base {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT=10;
	
	
	public void takeScreenshotAtEndOfTest() throws IOException{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		if(currentDir.startsWith("Moc")) //currentDir is temporary not real just to write this function without error
		{
			FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis()+ ".png"));
		}
		else
		{
			FileUtils.copyFile(srcFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis()+ ".png"));
		}
	}
	
}