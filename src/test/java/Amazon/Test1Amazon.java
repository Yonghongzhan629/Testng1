package Amazon;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class Test1Amazon {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/yongh/Driver1/chromedriver.exe");

	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //driver.manage().wait(10);
	  //driver = new InternetExplorerDriver();
	 driver.get("https://www.amazon.ca");
	 System.out.println("launch Browser");
		
		
	}

@Test
public void login() {
	
	driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]")).click();
	//driver.findElement(By.name("submit.add-to-cart")).click();
	//driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
	driver.findElement(By.name("email")).sendKeys("yonghongzhan@yahoo.com");
	driver.findElement(By.name("password")).sendKeys("Tony1130");
	driver.findElement(By.id("signInSubmit")).click();
	Assert.assertEquals(false, true);

	
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
	
}

@AfterMethod
public void teardown() {
	driver.close();
	System.out.println("Finish");
}
 @AfterTest
 public void teardown1() {
	 driver.quit();
	 System.out.println("Finish1");
 }
	

}
