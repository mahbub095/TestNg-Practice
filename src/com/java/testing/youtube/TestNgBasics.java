package com.java.testing.youtube;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	//1
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup System property for chorom 1");
	}
	//2
	
	@BeforeTest
	public void lanuchBrowser() {
		System.out.println("lanuchBrowser 2");
		
	}
	//3
	
	@BeforeClass
	public void login() {
		System.out.println("login to app 3");
		
	}
	//4
	
	@BeforeMethod
	public void enterURL() {
 	System.out.println("Enter URL 4");
		
	}
	//5
	
	@Test
	public void googleTitleTest() {
		System.out.println("googleTitleTest Title Test 5");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Search Title Test 5-a");
	}
	
	//1st run
	
	@Test
	public void googleLogoTest() {
		System.out.println("Google Logo Title Test 5-b");
	}
	
	
	
	//6
	
	@AfterMethod
	public void logOut() {
		System.out.println("logOut Title Test 6");
	}
	//7
	
	@AfterTest
	public void delteAllCookies() {
		System.out.println("delteAllCookies Title Test 7");
	}
	//8
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser Title Test 8");
	}
	//9
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generateTestReport Title Test 9");
	}
	
	
	
	
}
