package pages_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_Package.TestBase;
  
public class RegisterPage {
	/*Page object model
	 * page factory or pom
	 * pom will be used
	 */
	WebDriver driver;
	By registerlink=By.xpath("//a[@class='ico-register']");
	By gendermalerbtn=By.id("gender-male");
	By firstNametxt=By.id("FirstName");
	By lastNametxt=By.id("LastName");
	By emailtxt=By.id("Email");
	By passtxt=By.id("Password");
	By confirmpasstxt=By.id("ConfirmPassword");
	By registerbtn=By.id("register-button");
	
	String registerLinknm="Register Link";
	String gendermalerbtnnm="Gender Male";
	String firstNametxtnm="First Name";
	String lastNametxtnm="Last Name";
	String emailtxtnm="Email";
	String passtxtnm="Password";
	String confirmpasstxtnm="Confirm Password";
	String registerbtnnm="Register Button";
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	public String getTitle() {
		return driver.getTitle();
	}
	public String getCurrentUrlPage() {
		return driver.getCurrentUrl();
	}
	public void clickRegisterLink() {
		TestBase.click(driver,registerlink,registerLinknm);
	}
	public void clickGenderMale() {
		TestBase.click(driver,gendermalerbtn,gendermalerbtnnm);
	}
	public void enterFirstName(String fname) {
		TestBase.enterText(driver,firstNametxt,fname,firstNametxtnm );
	}
	public void enterLastName(String lname) {
		TestBase.enterText(driver,lastNametxt,lname,lastNametxtnm );
	}
	public void enterEmail() {
		
		TestBase.enterText(driver, emailtxt,TestBase.randomEmail() ,emailtxtnm );
	}
	public void enterPassword(String pwd) {
		TestBase.enterText(driver, passtxt,pwd , passtxtnm);
	}
	public void enterConfirmPassword(String conpwd) {
		TestBase.enterText(driver,confirmpasstxt ,conpwd , confirmpasstxtnm);
	}
	public void clickRegisterButton() {
		TestBase.click(driver, registerbtn,registerbtnnm );
	
	}
	
	
}

