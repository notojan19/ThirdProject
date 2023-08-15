package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class GotoAddUsers {
	
	
	WebDriver driver;
	 
	public GotoAddUsers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =  "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
private	WebElement AddUser;
	
	@FindBy(xpath =  "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
private	WebElement ClickAddBtn;
	
public WebElement AddUser() {
	return AddUser;
	
}
public WebElement ClickAddBtn() {
	return ClickAddBtn;
	

}
}
