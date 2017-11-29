package com.rameshsoft.businessScript;

import org.testng.annotations.Test;

import com.rameshsoft.base.DriverEngine;
import com.rameshsoft.pageobjects.GmailHomePageOne;
import com.rameshsoft.pageobjects.PasswordPage;

public class TestDemo extends DriverEngine{

	@Test
	public void login() {
		getDriver().get("https://www.gmail.com");
		GmailHomePageOne gnmail = new GmailHomePageOne();
		GmailHomePageOne un=	gnmail.enterDataOnUserName("");
		PasswordPage pwd=gnmail.clickOnNextBtn();
	}
	
}
