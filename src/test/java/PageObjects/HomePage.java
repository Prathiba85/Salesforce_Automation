package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	//WebElements
	@FindBy(xpath = "//div[@class='slds-icon-waffle']") private WebElement lnk_apps;
	//@FindBy(xpath = "//input[@id='input-99']") private WebElement txt_search;
	@FindBy(xpath = "//button[@aria-label='View All Applications']") private WebElement btn_viewall;
	@FindBy(xpath = "//p[text()='Recruiting']") private WebElement btn_Recruiting;
	
	@FindBy(xpath = "//a[@title='Positions']") private WebElement lnk_position;
	@FindBy(xpath = "//div[@title='New']") private WebElement btn_new;
	@FindBy(xpath = "//span[text()='IT Record']") private WebElement rbtn_ITrecord;
	@FindBy(xpath = "//span[text()='Next']") private WebElement btn_Next;
	//@FindBy(xpath = "//b[text()='Recruiting']") private WebElement btn_Recruiting;
	
	
	
	public void clickApps()
	{
		lnk_apps.click();
				
	}
	public void clickRecruitingApp()
	{
		//driver.switchTo().alert().dismiss();
		//txt_search.click();
	  //txt_search.sendKeys(app);
		btn_viewall.click();
		btn_Recruiting.click();
	}
	
	

}
