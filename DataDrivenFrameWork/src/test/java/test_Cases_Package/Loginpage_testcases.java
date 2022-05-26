package test_Cases_Package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages_Package.Login_page;
import pages_Package.RegisterPage;

public class Loginpage_testcases extends base_Package.TestBase{ 
	
	Login_page loginpage;

	public Loginpage_testcases(WebDriver driver) {
		this.driver=driver;
	}
	@BeforeClass
	public void setup() throws IOException {
		//Invoke the browser
		invoke();
		loginpage = new Login_page(driver);
	}
	@Test
	public void Login_testcases() {
	
		loginpage.Loginlink();
		//click on loginlink
		loginpage.Emailfield("a1585@gmail.com");
		//enter the emailfiled
		loginpage.PasswordField("123@abc");
		//enter the password
		loginpage.Loginbtn();
		//click on passwordbtn
	}
	
}
