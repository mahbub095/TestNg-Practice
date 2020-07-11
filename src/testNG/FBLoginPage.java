package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBLoginPage {
	
	
	WebDriver driver;
	
	public FBLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how= How.XPATH,using="//*[@id='email']") WebElement emailTestBox;
	@FindBy(how= How.XPATH,using="//*[@id='pass']") WebElement passwordTestBox;
	@FindBy(how= How.XPATH,using="//*[@id='loginbutton']") WebElement signinButton;
	
	public void setEmail(String strEmail) {
		emailTestBox.sendKeys(strEmail);
	}
	public void setPassword(String strPassword) {
		passwordTestBox.sendKeys(strPassword);
	}
	public void clickOnLoginButton() {
		signinButton.click();
	}

}
