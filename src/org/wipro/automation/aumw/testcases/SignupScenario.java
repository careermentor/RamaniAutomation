package org.wipro.automation.aumw.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc02_validatsignupfunct() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		sign.select_dob_day("18");
		sign.click_gender_male();
		sign.click_signupBttn();
	}
	
}
