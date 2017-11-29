package com.rameshsoft.businessScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ramesh.Pojo.POJO;
import com.rameshsoft.base.DriverEngine;
import com.rameshsoft.constants.GmailConstants;
import com.rameshsoft.pageobjects.GmailHomePage;
import com.rameshsoft.pageobjects.GmailPaswordPage;
import com.relevantcodes.extentreports.LogStatus;

public class OwnClass extends DriverEngine{

	@Test
	public void m1() throws IOException, EncryptedDocumentException, InvalidFormatException{
		
		
		getDriver().get(POJO.getPR(GmailConstants.getConfigPath()).readProperty("url"));

		gettest().log(LogStatus.INFO, "url is entered successfully");
		getlog().info("url is entered");
		GmailHomePage.tex_emailOrPhone(POJO.getER(GmailConstants.getExcelPath()).getCellValue("sheet1", 0, 0));
		gettest().log(LogStatus.INFO, "username is entered successffully");
		getlog().info("username is entered");
		GmailHomePage.btng_next();
		gettest().log(LogStatus.INFO, "next is entered successfully");
		getlog().info("next is entered");
		
		GmailPaswordPage.tex_password(POJO.getER(GmailConstants.getExcelPath()).getCellValue("sheet1", 0, 1));
		gettest().log(LogStatus.INFO, "password is entered successfully");
		getlog().info("password is entered");
		GmailPaswordPage.btng_pwdNext();
		gettest().log(LogStatus.INFO, "signin is entered successfully");
		getlog().info("signed is entered");
	 
	}
	
}
