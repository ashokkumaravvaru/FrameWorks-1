package com.rameshsoft.businessScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.base.DriverEngine;

public class PagesOne extends DriverEngine {
	
	static
	{
		PageFactory.initElements(getDriver(), PagesOne.class);
	}

	@FindBy(id="identifierId")
	private static WebElement username;
	
	@FindBy(id="identifierNext")
	private static WebElement next;
	
	public PagesOne  username(String data){
		username.clear();
		username.sendKeys(data);
		return new PagesOne();
	}
	
	public static void next(){
		next.click();
	}
}
