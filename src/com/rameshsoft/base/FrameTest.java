package com.rameshsoft.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new FirefoxDriver();
	d.get("http://jqueryui.com/");
	d.findElement(By.linkText("Autocomplete")).click();
	List<WebElement> frames = d.findElements(By.tagName("iframe"));
	System.out.println("Total frames are : " +frames.size());
	d.switchTo().frame(0);
	d.findElement(By.id("tags")).sendKeys("java");
	Thread.sleep(3000);
	d.switchTo().defaultContent();
	d.findElement(By.linkText("Draggable")).click();
	d.switchTo().frame(0);
	WebElement draggable=d.findElement(By.id("draggable"));
	Actions a = new Actions(d);
	a.dragAndDropBy(draggable, 150, 150).build().perform();
	d.switchTo().defaultContent();
	d.findElement(By.linkText("Droppable")).click();
	d.switchTo().frame(0);
	WebElement source = d.findElement(By.id("draggable"));
	WebElement target = d.findElement(By.id("droppable"));
	a.dragAndDrop(source, target).build().perform();
	
}
}










