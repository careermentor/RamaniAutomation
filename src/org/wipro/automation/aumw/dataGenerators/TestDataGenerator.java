package org.wipro.automation.aumw.dataGenerators;

import org.testng.annotations.DataProvider;

public class TestDataGenerator
{

	@DataProvider(name="userdata1")
	public Object[][] testdata()
	{
		//String data = "user1";
		//Object[] data1 = {"user1","pass1"};  //1-D array
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D array
		return data2;
	}
	
	
	@DataProvider(name="userdata2")
	public Object[][] testdata2()
	{
		//String data = "user1";
		//Object[] data1 = {"user1","pass1"};  //1-D array
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D array
		return data2;
	}
}
