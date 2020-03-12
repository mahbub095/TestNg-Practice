package testNG;

import javax.swing.text.Highlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class HRM {
	
	
WebDriver driver;
@BeforeSuite
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("1. Open Chrome & Application");
	}
	
@BeforeTest
	public void signIn ()
	{		
		WebElement textUsername = driver.findElement(By.id("txtUsername"));
	
		textUsername.sendKeys("Admin");
		
		WebElement textPassword = driver.findElement(By.id("txtPassword"));

		textPassword.sendKeys("admin123");
		
		WebElement buttonLogin = driver.findElement(By.id("btnLogin"));

		buttonLogin.click();
		
		System.out.println("2. Sign In");
	}
	
@BeforeClass
	public void userSearch ()
	{		
        WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
      
        menuAdmin.click();
    
        WebElement textUserName = driver.findElement(By.id("searchSystemUser_userName"));
    
        textUserName.sendKeys("john.smith");
    
        WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
 
        buttonSearch.click();
    
        System.out.println("3. Search For User");
	}
	
	 
	
@BeforeMethod
	public void userSignOut () 
	{
        WebElement linkWelcome = driver.findElement(By.id("welcome"));
      
        linkWelcome.click();
    
       // WebElement linkLogout = driver.findElement(By.linkText("Logout"));    
       // driver.findElement(By.linkText("Logout")).click();
      
    
         
	}
	
	
      @Test
	  public void Logout() 
	  {
	     driver.findElement(By.linkText("Logout")).click();
	  }
	
	
	  @AfterMethod 
	  public void tearDown () {
	  System.out.println("5. Close Chrome & Application"); 
	  driver.quit(); }
	 
}