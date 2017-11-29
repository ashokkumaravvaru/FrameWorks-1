package com.rameshsoft.businessScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ramesh.Pojo.GmailPojo;
import com.rameshsoft.automation.reports.ReportsFunctions;
import com.rameshsoft.base.DriverEngine;
import com.rameshsoft.constants.GmailConstants;
import com.rameshsoft.pageobjects.GmailHomePage;
import com.rameshsoft.pageobjects.GmailPaswordPage;
import com.relevantcodes.extentreports.LogStatus;

public class OwnClass extends DriverEngine{

	@Test
	public void m1() throws IOException, EncryptedDocumentException, InvalidFormatException{
		
		//DriverEngine d = new DriverEngine();
		
		getDriver().get(GmailPojo.getConfigFile().readProperty("url"));
		gettest().log(LogStatus.INFO, "browser is opened successfullyyyyy");
		getlog().info("url is entered successfullyyyyy");
		
		//GmailHomePage g = new GmailHomePage();
		
		//PageFactory.initElements(getDriver(), GmailHomePage.class);
		GmailHomePage.tex_emailOrPhone(GmailPojo.getExcelReader().getCellValue("sheet1", 0, 0));
		
		GmailHomePage.btng_next();
		
		GmailPaswordPage.tex_password(GmailPojo.getExcelReader().getCellValue("sheet1", 0, 1));
		GmailPaswordPage.btng_pwdNext();
		
		//check by declaring methods as non static and call by creating object[gmailhomepage, gmailpasswdpage,] and perform the action 
	}
	
}
