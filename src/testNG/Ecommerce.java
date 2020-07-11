package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeSuite;

public class Ecommerce {
	WebDriver driver;
		
	public void setUp ()
		
	{
		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://ajkerdeal.com/en");
			System.out.println("1. Open Chrome & Application");
		}
		
	public void test() {
		System.out.println("login to app 3");
		
	}

}
