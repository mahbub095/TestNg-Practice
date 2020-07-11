package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.testing.youtube.FacebookLogin;

public class Ajkerdeal {

	
	WebDriver driver;
	Screen myScreen;
	@BeforeSuite
		public void setUp ()
		{
		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://ajkerdeal.com/en");
			System.out.println("1. Open Chrome & Application");
		}
	
	@BeforeTest
	public void signIn ()
	{	
	 //*[@id='NotSignInListMenu']//*[contains(@class, 'dropdown-toggle')]
	    driver.findElement(By.xpath("//*[@id='NotSignInListMenu']//*[contains(@class, 'dropdown-toggle')]")).click();
		WebElement textUsername = driver.findElement(By.id("headerUserNameTextBox"));
		textUsername.sendKeys("admin3211@gmail.com");	
		WebElement textPassword = driver.findElement(By.id("headerPasswordTextBox"));
		textPassword.sendKeys("m.12345678");	
		WebElement buttonLogin = driver.findElement(By.id("customerloginbuttondivbn"));
		buttonLogin.click();
		 
	}
	
	@BeforeClass
	  public void Click() 
	  {
    	driver.findElement(By.linkText("Cosmetics")).click();
		 
	  }
	@BeforeMethod
    public void image()     {
		try {
			Pattern userID = new Pattern("E:\\Testing Images\\bell.PNG");
			myScreen = new Screen();
			myScreen.click(userID);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	  public void image2()   
	    {
		driver.findElement(By.xpath("//*[@id='BuyCoupon']")).click();
		}

 
	  @AfterMethod 
	  public void tearDown () {
	  System.out.println("5. Close Chrome & Application"); 
	 // driver.quit(); 
	  }
}
