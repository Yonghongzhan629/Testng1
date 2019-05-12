package Amazon;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	public static WebDriver driver;
	
	public static void initialization() {
		
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

	public  void failed(String failMethodName) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date(0);
	
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:/Users/yongh/eclipse-workspace/testng1/Screenshot/"+failMethodName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
