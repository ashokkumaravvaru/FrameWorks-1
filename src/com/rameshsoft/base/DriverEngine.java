package com.rameshsoft.base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverEngine  {
	private static WebDriver driver;
	private static ExtentReports ex ;
	private static ExtentTest et;
	private static Logger log ;

	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("firefox") String browser) {
		ex = new ExtentReports("E:\\extent reports\\POMrepo.html");
		PropertyConfigurator.configure("C:\\Users\\Ashok\\Desktop\\class\\RAMESH_FRAMEWORK_POM\\src\\log4j.properties");
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		}
		else if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
	}
	@BeforeMethod
	public void reportstatus(Method m){
		et = ex.startTest(m.getName());
		log = Logger.getLogger(m.getName());
	}
	@AfterMethod
	public void closetest(){
		ex.endTest(et);
		ex.flush();
	}
	@AfterSuite
	public void afterSuite() {
		if (!(driver==null)) {
			driver.quit();
		}
		
	}
	public static ExtentTest gettest(){
		return et;
	}
	public static Logger getlog(){
		return log;
	}
	public static WebDriver getDriver() {
		return driver;
	}
}
