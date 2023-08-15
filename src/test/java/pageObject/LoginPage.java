package pageObject;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class LoginPage  {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name= "username")
private	WebElement IDfield;
	
	@FindBy(name="password")
private	WebElement Passwordfield;
	
	@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")
private	WebElement loginBtn;
	
	public WebElement IDfieald() {
		return IDfield;
		
	}
	public WebElement Passwordfield() {
		return Passwordfield;

}
	public WebElement loginBtn() {
		return loginBtn;
	}
	
	}
		
	





