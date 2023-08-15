package test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resorce.Base;
import pageObject.AddUsersPage;
import pageObject.GotoAddUsers;
import pageObject.LoginPage;

public class AddUserTest extends Base {
	

	
	
	Logger log;
	
    public WebDriver driver;
	
	
	
	@Test
	
	public void login() throws IOException, InterruptedException {
		
	 log=LogManager.getLogger(LoginTest.class.getName());
	
	
	LoginPage login= new LoginPage(driver);
	login.IDfieald().sendKeys(prop.getProperty("ID"));
	login.Passwordfield().sendKeys(prop.getProperty("password"));
	
	
	login.loginBtn().click();
	
	
	Thread.sleep(1*5000);
	
	
	
	
	GotoAddUsers aduser=new GotoAddUsers(driver);
	
	Assert.assertTrue(aduser.AddUser().isDisplayed());
	
	aduser.AddUser().click();
	log.info("'Admin' Buttum got clicked....");
	
	
	Thread.sleep(1*5000);
	
GotoAddUsers addBtn=new GotoAddUsers(driver);
	
	Assert.assertTrue(addBtn.ClickAddBtn().isDisplayed());
	
	aduser.ClickAddBtn().click();
	log.info("'Add' Buttum got clicked....");
	Thread.sleep(1*5000);
	
	AddUsersPage adduser= new AddUsersPage(driver);
	
	adduser.UserRole().click();
	adduser.EmployeeName().sendKeys(prop.getProperty("EmployeeName"));
	
	adduser.Status().click();
	adduser.UserName().sendKeys(prop.getProperty("UserName"));
	
	adduser.Password().sendKeys(prop.getProperty("Password"));
	adduser.ConfirmPWD().sendKeys(prop.getProperty("ConfirmPWD"));
//	adduser.clickSaveBtn().click();
	
	}
	
	
	
@BeforeMethod
	
	public void openApplicaiton() throws  IOException, InterruptedException {
	
	log=LogManager.getLogger(LoginTest.class.getName());
	
	driver=intializerDriver();
	log.info("Borwser got launched......");
	driver.get(prop.getProperty("url"));
	
	Thread.sleep(1*5000);
	log.debug("Navigate to application URL....");
	
	
	}
	
	@AfterMethod
	
	public void aftermethod() {
		
	driver.close();
	log.debug("Browser got closed");
	
		
	}
	

}
	
	