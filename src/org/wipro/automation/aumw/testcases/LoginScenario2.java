package org.wipro.automation.aumw.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.dataGenerators.TestDataGenerator;
import org.wipro.automation.aumw.pages.LoginPage;

public class LoginScenario2 extends InitiateBrowser
{

	@Test
	public void tc01_loginfunct_validcred() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.click_loginbttn();
		
	
	}
	
	@Test
	public void tc01_loginfunct_invalidcred() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");  //correct username
		login.enter_password("pass1234");  //wrong password
		login.click_loginbttn();   //not login and error message displayed "Log in as Cheikh Ouangraoua"
		
			
		String ExpResult_error = "Log in as Cheikh Ouangraoua";
		String ActResult_error = driver.findElement(By.xpath("//span[text()='Log in as Cheikh Ouangraoua']")).getText();
		
		Assert.assertEquals(ActResult_error, ExpResult_error);
		
	}
	
	
	
	
}
