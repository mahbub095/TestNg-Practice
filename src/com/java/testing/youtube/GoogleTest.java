package com.java.testing.youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
 
	//1
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// manage use for browser property
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	//2
	@Test(priority=1,groups="Title")
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups="Logo")
	public void googleLogoTest() {
		 boolean b= driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority=2,groups="Link Test")
	public void mailLinkTest() {
		 boolean b= driver.findElement(By.linkText("GMAIL")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("test1");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test1");
	}
	
	
	//3 //6
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	/*
	 * public static void main(String[] args) { System.out.println("Hello Google");
	 * GoogleTest obj =new GoogleTest(); }
	 */
}
