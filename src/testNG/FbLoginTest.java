package testNG;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FbLoginTest  extends TestBase{
	
	@Test
	public void init() throws Exception{
		FBLoginPage loginpage=PageFactory.initElements(driver, FBLoginPage.class);
		loginpage.setEmail(" ");
		loginpage.setPassword(" ");
		loginpage.clickOnLoginButton();
	}

}
