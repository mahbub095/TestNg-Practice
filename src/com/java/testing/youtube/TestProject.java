package com.java.testing.youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestProject {
	
	WebDriver driver;	
	Screen myScreen;
	JavascriptExecutor jse;
	
	@BeforeSuite
	public void invokeBrowser() {
		
	
			try {
				System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			//	driver.get("http://t-nation.webpublisherpro.com/wp-admin");
				driver.get("http://t-nation.webpublisherpro.com");
				Pattern userID = new Pattern("E:\\Automation\\username.PNG");
				Pattern password = new Pattern("E:\\Automation\\password.PNG");
				Pattern loginnButton = new Pattern("E:\\Automation\\signin.PNG");
		
				myScreen = new Screen();
				//myScreen.wait(userID,3);
				myScreen.type(userID, "wpp");
				myScreen.type(password,"wpp");
				myScreen.click(loginnButton);
				
//				WebElement productlist = driver.findElement(By.id("#"));  
//		        productlist.sendKeys("webpublisherprobd");
//		        productlist.click();
//		        driver.findElement(By.id("user_pass")).sendKeys("#");
//		        driver.findElement(By.id("wp-submit")).click();
//		        driver.findElement(By.linkText("#"));
//		        driver.findElement(By.linkText("Log Out")).click();
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	}
 
 	 
	@Test
	public void Test()
	{
		//WebElement menuAdmin = driver.findElement(By.xpath("//a[text()='Tip: Advanced Butt Stuff']"));
		WebElement menuAdmin = driver.findElement(By.xpath("//a[text()='Menu']"));
        menuAdmin.click();
		
	}
	
	  @AfterMethod 
	  public void tearDown () 
	  {
	  System.out.println("Close Browser"); 
	 // driver.quit(); 
	  }
 

}

