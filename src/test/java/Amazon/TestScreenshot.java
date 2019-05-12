package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
@Listeners (CustomerLsn.class)
public class TestScreenshot extends Basic {
	
	@BeforeMethod
	public void setup() {
		initialization();
		
	}
	
	@AfterMethod 
	public void Teardown(){
		driver.quit();
		
	}
	
	@Test
	public void Takescreenshot()
	{
		
		Assert.assertEquals(false, true);
	}
@Test
	public void Takescreenshot1()
	{
		Assert.assertEquals(false, true);
	}
@Test
	public void Takescreenshot2()
	{
		Assert.assertEquals(false, true);
	}
}
