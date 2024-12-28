package org.wipro.automation.aumw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.aumw.utilitiesPkg.ReadPropFiles;

public class LoginPage 
{
	WebDriver driver;  //global

	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("login_loginbttn_css"))).click();
	}
	
}
