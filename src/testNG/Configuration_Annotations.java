package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Configuration_Annotations  {
	
  
	 @BeforeSuite
	  public void beforeSuite()
	  {
		System.out.println("Chrome - Set Up System beforeSuite");
	  } 
	      
	  @BeforeTest
	  public void beforeTest()
	  {
		System.out.println("Open Chrome 1");
	  }
	  
	  @BeforeClass
	  public void beforeClass() 
	  {
		System.out.println("Open Test @BeforeClass");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		System.out.println("Sign In 2");
	  }
	  
	  @Test
	  public void searchCustomer()
	  {
		System.out.println("Search For Customer ,This is real Check");
	  }
	  
	  @Test
	  public void searchProduct()
	  {
		System.out.println("Search For Product Menu");
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		System.out.println("Sign Out");
	  }

	  @AfterClass
	  public void afterClass()
	  {
		System.out.println("Close Test Application");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		System.out.println("Close Chrome");
	  }
	  
	  @AfterSuite
	  public void afterSuite() 
	  {
		System.out.println("Chrome - Clean Up All Cookies");
	  }
	}