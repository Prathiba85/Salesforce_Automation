package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PositionsPage extends BasePage {
	public PositionsPage(WebDriver driver) {
		super(driver);
		
	}

	
	//WebElements
	
	@FindBy(xpath = "//span[text()='Positions']") private WebElement lnk_positions;
	@FindBy(xpath = "//a[@title='New']") private WebElement btn_newposition;
	@FindBy(xpath = "//span[text()='Next']") private WebElement btn_ITrecordnext;
	@FindBy(xpath = "//input[@name='Name']") private WebElement txt_positionTitle;
	@FindBy(xpath = "//input[@name='Min_Pay__c']") private WebElement txt_minpay;
	@FindBy(xpath = "//input[@name='Max_Pay__c']") private WebElement txt_maxpay;
	@FindBy(xpath = "//button[text()='Save']") private WebElement btn_save;
	
	@FindBy(xpath = "//div[contains(text(),'Minimum Pay')]") private WebElement txt_errormessage;
	
	public void clickPositiontab() throws InterruptedException
	
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",lnk_positions);
		
				
	}
	
	public void clickNewPositons() throws InterruptedException
	{
		Thread.sleep(3000);
		btn_newposition.click();
		btn_ITrecordnext.click();
		
	}
	
	public void enterTitle(String title) throws InterruptedException
	{
		Thread.sleep(3000);
		txt_positionTitle.sendKeys(title);
	}


	public void enterMinimumPay(String minpay) throws InterruptedException {
		Thread.sleep(3000);
		txt_minpay.sendKeys(minpay);
		
	}
	public void enterMaximumPay(String maxpay) {
		
		txt_maxpay.sendKeys(maxpay);
		
	}
	
public void clickSave() throws InterruptedException {
	Thread.sleep(3000);
		btn_save.click();
		
	}

public String get_Errormessage()
{
	return txt_errormessage.getText();
	
}
}
