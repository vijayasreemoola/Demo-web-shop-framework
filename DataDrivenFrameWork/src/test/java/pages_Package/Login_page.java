package pages_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import base_Package.TestBase;

public class Login_page extends TestBase {
	
		WebDriver driver;
		By login_lnk = By.xpath("//*[text()='Log in']");
		By loginpage_emailfield = By.xpath("//input[@class='email']");
		By loginpage_passwordfield = By.xpath("//input[@class='password']");
		By loginpage_loginbtn = By.xpath("//input[@value='Log in']");
		
		public Login_page(WebDriver driver) {
			this.driver=driver;
			
		}
			
		public void Loginlink() {
			
			driver.findElement(login_lnk).click();    
		}
		public void Emailfield(String email) {
			
			driver.findElement(loginpage_emailfield).sendKeys(email);
		}
		
		public void PasswordField(String pwd) {
			
			driver.findElement(loginpage_passwordfield).sendKeys(pwd);
		
		}
		
		public void Loginbtn() {
			
			driver.findElement(loginpage_loginbtn).click();
		}
		
		
	}
	
	

