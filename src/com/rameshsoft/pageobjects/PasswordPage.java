package com.rameshsoft.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.base.DriverEngine;

public class PasswordPage extends DriverEngine{

	@FindBy(id="")
	private WebElement pwd;
	
	@FindBy(name="")
	private WebElement signIn;
	
	public void enterPwd(String testdata){
		pwd.clear();
		pwd.sendKeys(testdata);
	}
	
	public void clickOnSignInBtn(){
	signIn.click();
	}
	static
	{
		PageFactory.initElements(getDriver(), PasswordPage.class);
	}
}
