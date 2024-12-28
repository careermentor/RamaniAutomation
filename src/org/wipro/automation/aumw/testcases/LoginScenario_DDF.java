package org.wipro.automation.aumw.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.dataGenerators.TestDataGenerator;
import org.wipro.automation.aumw.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="userdata1",dataProviderClass=TestDataGenerator.class)
	public void tc01_loginfunct(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
	
}
