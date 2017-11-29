package com.rameshsoft.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.base.DriverEngine;

public class GmailHomePageOne extends DriverEngine{

	
	static
	{
		PageFactory.initElements(getDriver(), GmailHomePageOne.class);
	}
	
	@FindBy(id="identifierId")
	private WebElement un;
	
	@FindBy(xpath="//input[@id='identifierNext']")
	private WebElement next;
	
	
	public GmailHomePageOne enterDataOnUserName(String testdata){
		if (un.isDisplayed()&&un.isEnabled()) {
			un.clear();
			un.sendKeys(testdata);
		}
		return new GmailHomePageOne();
	}
	
	public PasswordPage clickOnNextBtn(){
		next.click();
		return new PasswordPage();
	}
	
}
