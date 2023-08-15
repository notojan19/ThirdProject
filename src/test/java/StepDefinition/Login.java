package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.github.dockerjava.api.model.Driver;

import Resorce.Base;
import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AccountPage;
import pageObject.LoginPage;


public class Login extends Base {
	
	WebDriver driver;
	LoginPage login;
	
	 @Given("^Open any Browser$")
	    public void open_any_browser() throws IOException, InterruptedException  {
		 
		 driver=intializerDriver();
		driver.get(prop.getProperty("url"));
			
			Thread.sleep(1*5000);
			
		 
		
	     
	    }
	 
	 @And("^Navigate to Login page$")
	    public void navigate_to_login_page()  {
	       
	    }

	    @When("^Userenters userID as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	    public void userenters_userid_as_something_and_password_as_something_into_the_fields(String ID, String password)  {
	    	
	    	  login= new LoginPage(driver);
			  login.IDfieald().sendKeys(ID);
			  login.Passwordfield().sendKeys(password);
				
					
					
					
	        
	    }
	    

	    @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button()  {
	    	
	    	login.loginBtn().click();
	        
	    }

	    @Then("^Verify user is able to successfully login$")
	    public void verify_user_is_able_to_successfully_login() {
	       
	    }
@After

public void closeBrowser() {
	driver.close();
}
	   


	}