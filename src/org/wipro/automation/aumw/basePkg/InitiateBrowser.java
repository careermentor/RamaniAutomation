package org.wipro.automation.aumw.basePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.aumw.utilitiesPkg.ReadPropFiles;

public class InitiateBrowser 
{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFiles.readconfig("ApplicationURL"));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
