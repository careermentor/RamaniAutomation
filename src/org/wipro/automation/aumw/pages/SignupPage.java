package org.wipro.automation.aumw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.aumw.utilitiesPkg.ReadPropFiles;

public class SignupPage 
{
	WebDriver driver;  //global

	public SignupPage(WebDriver driver)  //local variable
	{
		this.driver=driver;
		
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFiles.readelement("signup_dob_day_name"))));
		dob_day.selectByVisibleText(day);
		
	}
	
	public void click_gender_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("signup_gender_male_xpath"))).click();
	}
	
	public void click_signupBttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_signupbttn_name"))).click();
	}
		
}
