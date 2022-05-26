package test_Cases_Package;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import pages_Package.RegisterPage;
import base_Package.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class Registerpage_testcases extends base_Package.TestBase{
	RegisterPage registerPage;
	@BeforeClass
	public void setup() throws IOException {
		//Invoke the browser
		invoke();
		registerPage=new RegisterPage(driver);
	}
	@Test
	public void demoWebShop_Register() {
		test=extent.startTest("TC_01_VerifyDemoWebShopRegisterWithValidData");
		
		registerPage.clickRegisterLink();
		
		
		String title=registerPage.getTitle();
		Assert.assertEquals(title, "Demo Web Shop. Register");
		//click on Male radio button
		
		
		registerPage.clickGenderMale();
		//Enter the first name
		
		registerPage.enterFirstName("Surya");
		//enter the last name
		
		registerPage.enterLastName("teja");
		//enter the email
		
		registerPage.enterEmail();
		//enter the password
		
		registerPage.enterPassword("test123");
		//enter the onfirm password
		
		registerPage.enterConfirmPassword("test123");
		//click on register button
		
		registerPage.clickRegisterButton();
	}
	@AfterClass
	public void closeBrowser() {
		extent.flush();
		extent.endTest(test);
		//driver.close();
	}
	
	
}
