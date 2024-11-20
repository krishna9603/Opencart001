package TestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	 public WebDriver driver;
		@BeforeClass
		public void setup()
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://tutorialsninja.com/demo/");
		}
		@AfterClass
		public void teardown() 
		{
			driver.quit();
		}

		public String randomString()
		{
			String generatstring=RandomStringUtils.randomAlphabetic(6);
			return generatstring;
		}
		
		public String randomNumber()
		{
			String generatstring=RandomStringUtils.randomNumeric(10);
			return generatstring;
		}
		
		
	    public  String genPwd=("randomString"+"randomNumber"+"@");

		}


