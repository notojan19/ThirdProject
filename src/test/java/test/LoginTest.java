package test;

import java.io.IOException;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Resorce.Base;
import pageObject.AccountPage;
import pageObject.LoginPage;

public class LoginTest extends Base {
	
	
	
		
   public WebDriver driver;
   Logger log;
	
	
	
	@Test(dataProvider = "getLoginData")
	
	public void login(String ID, String password,String expectedResult) throws IOException, InterruptedException {
		
		
	LoginPage login= new LoginPage(driver);
	login.IDfieald().sendKeys(ID);
	log.info("ID got Entered........");
	login.Passwordfield().sendKeys(password);
	log.info("Password got Entered........");
		login.loginBtn().click();
		
		log.info("Click on Login Button........");
	
	Thread.sleep(1*5000);
	
//	
	AccountPage accountPage=new AccountPage(driver);
//	
	String actualResult=null;
//	
	try {
		if(accountPage.editAccountInformationOption().isDisplayed()) {
			log.info("User got logged in");
			actualResult="Successfull";
		}
//		
	} catch (Exception e) {
		log.info("User got logged in");
		actualResult="Failure";	
////	
////		
		Assert.assertEquals(actualResult, expectedResult);
////		
////		
//////	
////
	}
//	
	Thread.sleep(1*5000);
	}
//	

	
	
@BeforeMethod
	
	public void openApplicaiton() throws  IOException, InterruptedException {
	
	log=LogManager.getLogger(LoginTest.class.getName());
	
	driver=intializerDriver();
	log.info("Browser got launched......");
	driver.get(prop.getProperty("url"));
	
	Thread.sleep(1*5000);
	log.info("Navigate to application URL....");
	
	
	}
	
	@AfterMethod
	
	public void aftermethod() {
		
	driver.close();
	log.info("Browser got closed");
	
		
	}
	@DataProvider
	public Object[][] getLoginData(){
		
		Object[][] data= {{"Admin","admin123","Successfull"},{"suker","suker123","Failure"}};
		return data;
	}

}
	
	
