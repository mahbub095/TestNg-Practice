package testNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	WebDriver driver =null;
	 
	@BeforeSuite
		public void initialize () throws IOException
		{
		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println("1. Open Chrome & Application");
		}
	
	  @AfterMethod 
	  public void tearDown () {
	  System.out.println("5. Close Chrome & Application"); 
	 // driver.quit();
	  }
	 
}
