package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddproductPage extends BasePage
{   
	public WebDriver driver;
	public AddproductPage(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(xpath="//a[normalize-space()='Desktops']")
	WebElement Btn_Desktop;
	
	public void SetBtnDesktop()
	{
		Btn_Desktop.click();
		
	}
	@FindBy(xpath="//a[normalize-space()='Mac (1)']")
	WebElement Btn_Mac;
	public void SetBtnMac()
	{
		Btn_Mac.click();
		
	}
	//span[normalize-space()='Add to Cart']
	@FindBy(xpath="//button[@onclick=\"cart.add('41', '1');\"]")
	WebElement Btn_Addtocart; 
	public void SetBtnAddtocart()
	{
		Btn_Addtocart.click();
		Btn_Addtocart.submit();
		Actions Act=new Actions(driver);
		Act.moveToElement(Btn_Addtocart).click().perform();
		Btn_Addtocart.sendKeys(Keys.RETURN);	
		WebDriverWait mywait=new WebDriverWait(driver ,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(Btn_Addtocart)).click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement mgsConfirmation;
	
	
	public String getConfirmationMgs()
	{
		try {
			return(mgsConfirmation.getText());
		}
		catch(Exception e) 
		{
			return(e.getMessage());
		}
	}
}
