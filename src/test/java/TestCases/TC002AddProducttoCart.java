package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.AddproductPage;
import TestBase.Baseclass;

public class TC002AddProducttoCart extends Baseclass
{
	
	@Test
	public void Addproducttocart() throws InterruptedException
	{
	AddproductPage Ap=new AddproductPage(driver);
	Ap.SetBtnDesktop();
	Ap.SetBtnMac();
	//Ap.SetBtnMac();
	driver.findElement(By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//button[1]")).click();
	Thread.sleep(3000);
	String configmg=Ap.getConfirmationMgs();
	Assert.assertEquals(configmg,"Success: You have added iMac to your shopping cart!");
	}
	}


	

