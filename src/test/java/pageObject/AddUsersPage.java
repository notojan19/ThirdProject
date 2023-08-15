package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUsersPage {
	
	
	WebDriver driver;
	 
	public AddUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy( xpath =  "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
private	WebElement UserRole;
	
	@FindBy(xpath =  "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
private	WebElement EmployeeName;
	
	@FindBy(xpath =  "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]")
private	WebElement Status;
	
	@FindBy(xpath =  "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
private	WebElement  UserName;
	
	@FindBy(xpath =  "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
private	WebElement Password;
	
	@FindBy(xpath =  "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
private	WebElement ConfirmPWD;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
private	WebElement clickSaveBtn;
	
	
	
	
public WebElement EmployeeName() {
	return EmployeeName;
	
}

public WebElement UserRole() {
	return UserRole;
	
}
public WebElement Status() {
	return Status;
	
	
}
public WebElement  UserName() {
	return UserName;
	
}

public WebElement Password() {
	return Password;
	
}
public WebElement  ConfirmPWD() {
	return ConfirmPWD;

}

public WebElement clickSaveBtn() {
	return clickSaveBtn;
	

}
}


