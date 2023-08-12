package StepDefinition;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class SalesforceStepDefinition {
	WebDriver driver = Hooks.driver;
	LoginPage lp = new LoginPage(driver);
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		driver.get("https://login.salesforce.com/");
		
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

}
