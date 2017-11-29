package com.rameshsoft.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.base.DriverEngine;

public class GmailSuccessPage extends DriverEngine {
	
	@FindBy(xpath="//div[text()='COMPOSE']")
	private WebElement btng_compse;
	
	static {
		PageFactory.initElements(getDriver(),GmailSuccessPage.class);
	}
	
	public GmailSuccessPage() {
		//PageFactory.initElements(getDriver(),GmailSuccessPage.class);
	}
	
	public GmailSuccessPage btng_compose() {
	btng_compse.click();
	return new GmailSuccessPage();

	}

}
