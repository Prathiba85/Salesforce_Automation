package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
			
	}
	
	//WebElements

	@FindBy(xpath = "//input[@id='username']") private WebElement txt_username;
	@FindBy(xpath = "//input[@id='password']")private WebElement txt_password;
	@FindBy(xpath = "//input[@type='submit']")private WebElement btn_login;
	@FindBy(xpath="//ul[@class='tabBarItems slds-grid']//a[@title='Home']") WebElement btn_home;
	
	
	public void enterUsername(String username)
	{
		txt_username.clear();
		txt_username.sendKeys(username);
		
		
	}
	
	public void enterPassword(String password)
	{
		
		txt_password.clear();
		txt_password.sendKeys(password);
		
		
	}
	public void clickLogin()
	{
		
		btn_login.click();
		
		
	}
	
	public String sendHomeText()
		{
					
		//System.out.println(btn_home.getText());
		return btn_home.getText();
		
	}
}
