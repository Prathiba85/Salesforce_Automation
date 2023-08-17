package StepDefinition;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PositionsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class SalesforceStepDefinition {
	WebDriver driver = Hooks.driver;
	LoginPage lp = new LoginPage(driver);
	HomePage hp = new HomePage(driver);
	PositionsPage pp = new PositionsPage(driver);
	
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		lp.launchApplicaiton();
		
	}

	

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		
		lp.enterUsername(username);	
	  
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) throws InterruptedException {
		
		lp.enterPassword(password);
	  
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		
		lp.clickLogin();
	  
	}
	@Then("I should be able to see the Home page.")
	public void i_should_be_able_to_see_the_Home_page() throws InterruptedException {
		
		String actual__homepage= lp.sendHomeText();
		System.out.println(actual__homepage);
		Assert.assertEquals(actual__homepage, "Home");
		
		
	  
	}

	@When("I click apps and search for recruting app")
	public void i_click_apps_and_search_for_recruting_app() throws InterruptedException {
		Thread.sleep(5000);
		hp.clickApps();
	}

	@When("I search and select {string}")
	public void i_search_and_select(String app) throws InterruptedException {
	
		//hp.searchRecruiting(app);
		hp.clickApps();
		Thread.sleep(2000);
		hp.clickRecruitingApp();
	}
	    

	
	@When("I create new Position record")
	public void i_create_new_position_record() throws InterruptedException {
		
		
		pp.clickPositiontab();
		pp.clickNewPositons();
	
	    
	}

	@When("I enter position title as {string}")
	public void i_enter_position_title_as(String positiontitle) throws InterruptedException {
		pp.enterTitle(positiontitle);
	    
	}

	@When("I enter minimum pay as {string}")
	public void i_enter_minimum_pay_as(String minpay) throws InterruptedException {
		pp.enterMinimumPay(minpay);
	    
	}

	@When("I enter maximum pay as {string}")
	public void i_enter_maximum_pay_as(String maxpay) {
	    pp.enterMaximumPay(maxpay);
	}

	@When("Click on save")
	public void click_on_save() throws InterruptedException {
		pp.clickSave();
	    
	}

	@Then("I should see the error message {string}.")
	public void i_should_see_the_error_message(String expectederrormessage) {
		
		String actual_errormessage= pp.get_Errormessage();
		Assert.assertEquals(actual_errormessage,expectederrormessage);
	    
	}
	
	
}
