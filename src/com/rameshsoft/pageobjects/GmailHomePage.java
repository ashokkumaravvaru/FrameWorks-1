package com.rameshsoft.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.base.DriverEngine;

public class GmailHomePage extends DriverEngine{
	@FindBy(id="identifierId")
	private static WebElement tex_emailOrPhone; 
	
	@FindBy(id="identifierNext")
	private static WebElement btng_next;
	static
	{
		PageFactory.initElements(getDriver(), GmailHomePage.class);
		
	}
	
public GmailHomePage() {
	//PageFactory.initElements(getDriver(), GmailHomePage.class);
	
}
static
{
	PageFactory.initElements(getDriver(), GmailHomePage.class);
}
public static GmailHomePage tex_emailOrPhone(String data)
{
	tex_emailOrPhone.clear();
	tex_emailOrPhone.sendKeys(data);
	return new GmailHomePage();
}
public static GmailPaswordPage btng_next()
{
	btng_next.click();
	return new GmailPaswordPage();
}

}

