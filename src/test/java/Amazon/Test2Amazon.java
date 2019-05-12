package Amazon;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners (CustomerLsn.class)
public class Test2Amazon extends Basic {
	
	@BeforeMethod
	public void setup() {
		initialization();
		
	}
	
	@Test
	public void login() {
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]")).click();
		//driver.findElement(By.name("submit.add-to-cart")).click();
		//driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
		driver.findElement(By.name("email")).sendKeys("yonghongzhan@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Tony1130");
		driver.findElement(By.id("signInSubmit")).click();

		
	}


@Test
public void search() {

	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.name("field-keywords")).sendKeys("computer");
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).sendKeys(Keys.RETURN);
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span")).click();
	driver.findElement(By.name("submit.add-to-cart")).click();
	driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
	driver.findElement(By.name("email")).sendKeys("yonghongzhan@yahoo.com");
	driver.findElement(By.name("password")).sendKeys("Tony1130");
	driver.findElement(By.id("signInSubmit")).click();
	Assert.assertEquals(false, true);
}

@AfterMethod
public void teardown() {
	driver.quit();
	System.out.println("Finish");
}

	

}
