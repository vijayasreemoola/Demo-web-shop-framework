package test_Cases_Package;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_Package.Login_page;
import pages_Package.Shoppingcart_page;
import test_Cases_Package.Loginpage_testcases;

public class Shoppingcart_testcases extends base_Package.TestBase {
	
   Shoppingcart_page shoppingcart;
   Loginpage_testcases lp;
	
	
	@BeforeClass
	public void setup() throws IOException {
		//invoking the browser
		invoke();
		shoppingcart = new Shoppingcart_page(driver);
		          lp = new Loginpage_testcases(driver);
	}
	@Test(priority = 1)
	public void Login()
    {
    lp.Login_testcases();
    }
   
	@Test(priority = 2)
	public void Shoppingcart_testcases() {
	
	shoppingcart.Shoppingcartlink();
	
	shoppingcart.removeCheckbox1();
	
	shoppingcart.removecheckbox2();
	
	shoppingcart.updateshoppingcart();
	
	shoppingcart.continueshoppingbtn();
	
	shoppingcart.addingitemtocart();
	
	shoppingcart.selectcountry("India");
	
	shoppingcart.zipcodetxtbox();
	
	shoppingcart.estomateshippingbtn();
	
	shoppingcart.acknowledgebox();
	
	shoppingcart.checkoutbtn();

}
}