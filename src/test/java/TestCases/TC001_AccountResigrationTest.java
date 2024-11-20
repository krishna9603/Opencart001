package TestCases;

import org.testng.Assert;
import org.testng.annotations.*;

import Pageobjects.Homepage;
import Pageobjects.Regsitrationpage;
import TestBase.Baseclass;

public class TC001_AccountResigrationTest extends Baseclass {
	
	
	@Test
	public void Verify_Account_Registration()
	{
		Homepage hp=new Homepage(driver);
		hp.ClickMyaccount();
		hp.ClickRegisration();
		
		Regsitrationpage Rp=new Regsitrationpage(driver);
		Rp.SetFirstusername(randomString().toUpperCase());
		Rp.SetLastrname(randomString().toUpperCase());
		Rp.SetEmail(randomString().toUpperCase()+"@gmail.com");
		Rp.Settelephone(randomNumber());
		
		Rp.Setpassword(genPwd);
		Rp.SetconfirmPwd(genPwd);
		Rp.Clickagree();
		Rp.ClickContinue();
		
		String configmg=Rp.getConfirmationMgs();
		
		Assert.assertEquals(configmg,"Your Account Has Been Created!");
		
	}
	
}
