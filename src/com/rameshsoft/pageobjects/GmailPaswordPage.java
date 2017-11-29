package com.rameshsoft.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.base.DriverEngine;

public class GmailPaswordPage extends DriverEngine {
	@FindBy(name="password")
	private static WebElement tex_password;
	
	@FindBy(id="passwordNext")
	private static WebElement btng_pwdNext;
	
	static{
		PageFactory.initElements(getDriver(),GmailPaswordPage.class);
	}
	
	public GmailPaswordPage() {
		//PageFactory.initElements(getDriver(),GmailPaswordPage.class);
	}
	
	public static GmailPaswordPage tex_password(String data)
	{
		tex_password.clear();
		tex_password.sendKeys(data);
		return new GmailPaswordPage();
	}
	
	public static GmailSuccessPage btng_pwdNext()
	{
		btng_pwdNext.click();
		return new GmailSuccessPage();
	}
	

}
