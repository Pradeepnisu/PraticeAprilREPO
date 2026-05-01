package PractApril;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import base.BaseTest; //Importing Base class From package




public class LaunchURL_Test extends BaseTest{
	
	
	@Test(priority = 3)
	public void LaunchBlazeMeter()
	
	{ 
		test = extent.createTest("Launch Google Test");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.blazemeter.com/");
	        driver.quit(); // always close browser at end
	}
	
	@Test(priority = 1)
	public void LaunchRanorex()
	
	{ 
		test = extent.createTest("Launch Google Test");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.ranorex.com/");
	        driver.quit(); // always close browser at end
	}
	
	@Test(priority = 2)
	public void LaunchGoogle()
	
	{ 
		test = extent.createTest("Launch Google Test");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com/");
	        driver.quit(); // always close browser at end
	}
	
	
	
	

}
