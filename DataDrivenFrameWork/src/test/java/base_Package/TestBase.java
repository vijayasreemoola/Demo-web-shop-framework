package base_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
//import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {


	/*configuration to browsers
	 * all reusable methods
	 * reporting utilities
	 * property readers
	 * xml readers
	 */
	//invokeBrowser("Chrome");
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static DesiredCapabilities cap;
	public static ExtentTest test;
	public static ExtentReports extent;

	static {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		extent=new ExtentReports(System.getProperty("user.dir")+"/testreport/"+formatter.format(cal.getTime())+".html",false);
	}
	public void properties() throws IOException {

		prop=new Properties();
		try {
			fis=new FileInputStream("E:\\Eclipse\\Files\\DataDrivenFrameWork\\src\\test\\java\\configarationFile\\Config_Properties");
			prop.load(fis);


		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Property file data:"+prop);

	}
	public static void click(WebDriver driver,By ElementLocator,String name) {
		try {
			WebElement ele=driver.findElement(ElementLocator);
			if(ele.isDisplayed()) {
				ele.click();
				test.log(LogStatus.PASS,"To verify user able to click on"+name,name+" clicked succesfully");

			}
		}catch(Exception e) {
			test.log(LogStatus.FAIL,"To verify"+name+"is visible or clickable in provided time" +"An exception occured wait for element"+name+"to click");

		}
	}
	public static void enterText(WebDriver driver,By ElementLocator,String value,String name) {
		try {
			WebElement ele=driver.findElement(ElementLocator);
			if(ele.isDisplayed()) {
				ele.clear();
				ele.sendKeys(value);
				test.log(LogStatus.PASS,"To verify user able to value  in "+name,value+" entered succesfully");

			}
		}catch(Exception e) {
			test.log(LogStatus.FAIL,"To verify"+name+"is visible or enter in provided time" +"An exception occured wait for element"+name+"to enter");

		}
	}
	public void invoke() throws IOException {
		properties();
		System.out.println("properties success");
		invokeBrowser(prop.getProperty("browserName"));
		//to maximize the browser
		driver.manage().window().maximize();
		//to  naviagte to url
		driver.get("http://demowebshop.tricentis.com/");
	}
	public static String randomEmail() {
		Random rand = new Random();
		int num=rand.nextInt(1000);
		String email="test"+num+"@"+"gmail.com";
		return email;
	}
	public void invokeBrowser(String browser) {

		System.out.println("Browser Name");

		if(prop.getProperty("browserName").contains("chrome")){
			System.out.println("Browser Chrome");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			cap=new DesiredCapabilities().chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver=new ChromeDriver(cap);

		}else if(prop.getProperty("browserName").contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fp=new FirefoxOptions();
			String path="C:\\Program Files\\Firefox Developer Edition";
			fp.setBinary(path);
			driver=new FirefoxDriver(fp);
		}else {

		}
	}		

}