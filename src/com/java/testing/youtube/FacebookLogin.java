package com.java.testing.youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FacebookLogin {

	WebDriver driver;	
//	ArrayList locatorList = new ArrayList<By>();
	Screen myScreen;
	JavascriptExecutor jse;
	
	//@BeforeClass
	public void invokeBrowser() {
		
	 
			try {
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				driver = new ChromeDriver();
				
				// manage use for browser property
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	}
	
	public void signInUsingSikuli()     {
		try {
			Pattern userID = new Pattern("E:\\Testing Images\\FB_ID.PNG");
			Pattern password = new Pattern("E:\\Testing Images\\FB_PASS.PNG");
			Pattern loginnButton = new Pattern("E:\\Testing Images\\FB_Login.PNG");
			//Pattern ebayDeals = new Pattern("E:\\Testing Images\\Ebay_deals.PNG");
			
			myScreen = new Screen();
			
			myScreen.wait(userID,3);
			myScreen.type(userID, "mahbub.095@gmail.com");
			
			
//			myScreen.wait(password,10);
			myScreen.type(password,"password1234");
			//myScreen.wait(searchButton,10);
			myScreen.click(loginnButton);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		FacebookLogin obj =new FacebookLogin();
		obj.invokeBrowser();
		obj.signInUsingSikuli();
	}

}
