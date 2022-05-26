package pages_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base_Package.TestBase;


public class Shoppingcart_page {
	
	WebDriver driver;
	// click on shopping cart link
	By Shpcrt_lnk = By.xpath("//*[@class='ico-cart'][1]");
	// remove the items in check box 1
	By Shpcrtremove_checkboc1 = By.xpath("(//input[@name='removefromcart'])[5]");
	//remove the items in check box 2
	By Shpcrtremove_checkboc2 = By.xpath("(//input[@name='removefromcart'])[3]");
	//click on update cart
	By Shpcrt_updtcrt = By.xpath("//input[@name='updatecart']");
	//click on continue shopping
	By Shpcrt_contnshp = By.xpath("//input[@name='continueshopping']");
	//adding items to the cart
	By Shpcrt_addingitem = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[7]/div/div[2]/div[3]/div[2]/input");
	//creating object to the select class
	//Select select_cuntry = new Select (driver.findElement(By.xpath("//*[@id='CountryId']")));    
	// entering pincode
	By zipcode_txtbox = By.xpath("//input[@id='ZipPostalCode']");
	//click on estimate shipping button
	By est_shiping = By.xpath("//input[@name='estimateshipping']");
	//click on acknowledge box
	By ack_box = By.xpath("//input[@id='termsofservice']");
	//click on checkout button
	By chkout_btn = By.xpath("//button[@id='checkout']");

	public Shoppingcart_page(WebDriver driver) {
		this.driver=driver;	
	}
	public void Shoppingcartlink() {	
		driver.findElement(Shpcrt_lnk).click();
	}
	public void removeCheckbox1() {	
		driver.findElement(Shpcrtremove_checkboc1).click();
	}
	public void removecheckbox2() {	
		driver.findElement(Shpcrtremove_checkboc2).click();
	}
	public void updateshoppingcart() {	
		driver.findElement(Shpcrt_updtcrt).click();
	}
	public void continueshoppingbtn() {
		driver.findElement(Shpcrt_contnshp).click();
	}
	public void addingitemtocart() {
		driver.findElement(Shpcrt_addingitem).clear();
	}
	public void selectcountry(String countryname) {
		Select select_cuntry = new Select (driver.findElement(By.xpath("//*[@id='CountryId']")));
		select_cuntry.selectByVisibleText(countryname);
	}
	public void zipcodetxtbox() {
		driver.findElement(zipcode_txtbox);
	}
	public void estomateshippingbtn() {
		driver.findElement(est_shiping);
	}
	public void acknowledgebox() {
		driver.findElement(ack_box);
	}
	public void checkoutbtn() {
		driver.findElement(chkout_btn);
	}
	

}
