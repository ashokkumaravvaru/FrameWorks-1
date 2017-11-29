package com.rameshsoft.businessScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.ramesh.Pojo.GmailPojo;
import com.rameshsoft.base.DriverEngine;
import com.rameshsoft.constants.GmailConstants;
import com.rameshsoft.pageobjects.GmailHomePage;
import com.rameshsoft.pageobjects.GmailPaswordPage;
import com.rameshsoft.pageobjects.GmailSuccessPage;
import com.rameshsoft.utilites.PropertiesReusabilites;

public class Test1 extends DriverEngine{
	
	@Test
	public void GmailLogin() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
		PropertiesReusabilites p=GmailPojo.getBrowserUtilFile();
		String url=p.readProperty("url");
		getDriver().get(url);
		GmailHomePage ghp=new GmailHomePage();
		String one = GmailPojo.getExcelReader().getCellValue("sheet1", 0, 0);
			
		System.out.println("the data in that one cell is : " +one);
		
		ghp.tex_emailOrPhone(GmailPojo.getExcelReader().getCellValue("Sheet1", 0,0));
		ghp.btng_next();
		Thread.sleep(3000);
		GmailPaswordPage gpp = new GmailPaswordPage();
		gpp.tex_password(GmailPojo.getExcelReader().getCellValue("Sheet1", 0, 1));
		gpp.btng_pwdNext();
		Thread.sleep(3000);
		GmailSuccessPage gsp=new GmailSuccessPage();
		//gsp.btng_compose();
		
	} 

}
