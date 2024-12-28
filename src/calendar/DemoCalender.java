package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoCalender 
{

	@Test
	public void learnCalenar()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		
		driver.findElement(By.name("fld_username")).sendKeys("Ramani");
		driver.findElement(By.id("datepicker")).sendKeys("12/12/2006");
		driver.findElement(By.xpath("//a[text()='12']")).click();
		
		Select cont = new Select(driver.findElement(By.name("country")));
		cont.selectByVisibleText("United States");
		
		
	}
	
}
