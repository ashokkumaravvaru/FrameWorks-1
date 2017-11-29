package com.rameshsoft.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumActionsEngine extends DriverEngine{
	private WebElement element;
	public void enterTextById(String id ,String data)
	{
		element= getDriver().findElement(By.id(id));
		 if(element.isDisplayed() && element.isEnabled())
		 {
			 element.clear();
			 element.sendKeys(data);
		 }
		 else
		 {
			 System.out.println("element not found");
		 }	
	}
	
	public void enterTextByName(String name ,String data)
	{
		 element= getDriver().findElement(By.name(name));
		 if(element.isDisplayed() && element.isEnabled())
		 {
			 element.clear();
			 element.sendKeys(data);
		 }
		 else
		 {
			 System.out.println("element not found");
		 }
	}

	public void enterTextByXpath(String xpath ,String data)
	{
		 element= getDriver().findElement(By.xpath(xpath));
		 if(element.isDisplayed() && element.isEnabled())
		 {
			 element.clear();
			 element.sendKeys(data);
		 }
		 else
		 {
			 System.out.println("element not found");
		 }
		
	}
	
	public void clickById(String id)
	{
		 element= getDriver().findElement(By.id(id));
		 if(element.isDisplayed() && element.isEnabled())
		 {
		 element.click();
		 }
		 else
		 {
			 System.out.println("element not clickable");
		 }	}
	public void clickByName(String name)
	{
		 element= getDriver().findElement(By.name(name));
		 if(element.isDisplayed() && element.isEnabled())
		 {
		 element.click();
		 }
		 else
		 {
			 System.out.println("element not clickable");
		 }
	}

	public void clickByXpath(String xpath)
	{
		 element= getDriver().findElement(By.xpath(xpath));
		 if(element.isDisplayed() && element.isEnabled())
		 {
		 element.click();
		 }
		 else
		 {
			 System.out.println("element not clickable");
		 }
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
