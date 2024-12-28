package org.wipro.automation.aumw.utilitiesPkg;

import java.io.File;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{

	public static void screenresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //print screen
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		Calendar cal = Calendar.getInstance();
		//String cal1 = cal.getTime().toString().replace(" ", "");
		
		
		File fd = new File("./TestResults/" + name +"_"+cal.getTime().toString().replace(" ","")+ ".png");
		
		FileUtils.copyFile(f, fd);
	}
	
}
