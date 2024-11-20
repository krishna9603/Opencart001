package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Regsitrationpage extends BasePage {
	
	WebDriver driver;
	
	public Regsitrationpage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_Username;
	
	public void SetFirstusername(String Fname) 
	{
		txt_Username.sendKeys(Fname);;
	}
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_lastname;
	
	public void SetLastrname(String Lname) 
	{
		txt_lastname.sendKeys(Lname);
	}

	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	public void SetEmail(String Email) 
	{
		txt_email.sendKeys(Email);
	}

	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_telephone;
	public void Settelephone(String telephone) 
	{
		txt_telephone.sendKeys(telephone);
	}

	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_password;
	
	public void Setpassword(String password) 
	{
		txt_password.sendKeys(password);
	}

	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_confirmPwd;
	
	public void SetconfirmPwd(String confirmPwd) 
	{
		txt_confirmPwd.sendKeys(confirmPwd);
	}

	
	@FindBy(xpath="//input[@name='agree']")
	WebElement btn_agree;
	public void Clickagree() 
	{
		btn_agree.click();
	}

	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_Continue;
	
	public void ClickContinue() 
	{
		btn_Continue.click();
		
	}
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	
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

	
//input[@id='input-lastname']"undefined
	//input[@id='input-firstname']"//input[@id='input-email']"undefined
	//input[@id='input-firstname']"//input[@id='input-telephone']"undefined
	//input[@id='input-firstname']"//input[@id='input-password']"undefined
	//input[@id='input-firstname']"//input[@id='input-confirm']"undefined
	//input[@id='input-firstname']"//input[@name='agree']"undefined
	//input[@id='input-firstname']"//input[@value='Continue']"undefined
}