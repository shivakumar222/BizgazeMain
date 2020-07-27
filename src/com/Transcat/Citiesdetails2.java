package com.Transcat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestV3.BaseClass;

public class Citiesdetails2 extends BaseClass
{

	//cities details Testing 
	@Test(priority=1)
	public void testCityDetails() throws AWTException, InterruptedException
	{
		driver.manage().window().maximize();      
		Thread.sleep(5000);
		Robot r1=new Robot();	
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyPress(KeyEvent.VK_ENTER);
		WebDriverWait w1=new WebDriverWait(driver,30); 
		w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Cities']")));
	driver.findElement(By.xpath("//div[text()='Cities']")).click();
	driver.findElement(By.xpath("//strong[text()='town Guntu2']")).click();//list screen element code	
	}
	//cities Edit page Testing 
	@Test(priority=2)
	public void editCity() throws InterruptedException, AWTException
	{	
		WebDriverWait w1=new WebDriverWait(driver,30); 
	    w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='btnUpdate']")));
	    driver.findElement(By.xpath("//*[@id='btnUpdate']/span")).click();
	}
}
