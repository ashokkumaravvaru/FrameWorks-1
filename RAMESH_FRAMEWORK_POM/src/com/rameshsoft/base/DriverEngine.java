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

import com.rameshsoft.constants.GmailConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverEngine  {
	private static WebDriver driver;
	private static ExtentTest extest;
	private static ExtentReports ex;
	private static Logger log;

	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("firefox") String browser) {
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
	public void extentrep(Method m){
		ex = new ExtentReports(GmailConstants.getExtentpathh());
		extest =  ex.startTest(m.getName());
		PropertyConfigurator.configure(GmailConstants.getLogpath());
		log = Logger.getLogger(m.getName());
	}

	@AfterMethod
	public void closereports(){
		ex.endTest(extest);
		ex.flush();
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static ExtentReports getreports(){
		return ex;
	}
	
	public static ExtentTest gettest(){
		return extest;
	}
	
	public static Logger getlog(){
		return log;
	}
	
	
	
}
