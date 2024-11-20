package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage

   
{
	WebDriver driver;
	//setup
	public  Homepage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement btn_Myaccount;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement btn_Regisration;
	
	//Action method
	public void ClickMyaccount() 
	{
		btn_Myaccount.click();
		
	}
	public void ClickRegisration() 
	{
		btn_Regisration.click();
		
	}

}
