
package com.Transcat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestV3.BaseClass;

public class SALESINVOICE extends BaseClass
{
	@BeforeMethod
	public void handleWindowPopup() throws AWTException, InterruptedException
	{
		driver.manage().window().maximize();
         	Thread.sleep(3000);
		Robot r1=new Robot();	
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyPress(KeyEvent.VK_ENTER);	
	}
   @Test
   public void testsalesinvoice() throws InterruptedException
   {
	   WebDriverWait w11=new WebDriverWait(driver,30); 
	 	w11.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Sales Invoices']")));
		driver.findElement(By.xpath("//div[text()='Sales Invoices']")).click();
	    driver.findElement(By.id("btnCreateNew")).click();
	    WebElement contactname=w11.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-txtAutoComplete_110144181001023_OrgContactId-container")));
	    contactname.click();
	   WebElement name=w11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='krishna pvt ltd']")));
	   name.click();
	   driver.findElement(By.id("select2-txtAutoComplete_110144181001038_PaymentTermId-container")).click();
	   WebElement paymentterm=w11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Default Payment Term']")));
	   Thread.sleep(3000);
	   paymentterm.click();
	   Thread.sleep(3000);
	   WebElement additem=w11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Add Item'")));
	   additem.click();
	   driver.findElement(By.id("select2-dfhf-container")).click();
	   driver.findElement(By.xpath("//li[text()='MOBIL 1 ESP FORM5W30 GSP 4X4L EU-SEE (134637)']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[text()='Select MRP']")).click();
	   driver.findElement(By.id("select2-ys0n-container")).click();
	   driver.findElement(By.xpath("//li[text()='544.00 ( 90.000 )']")).click();
	   driver.findElement(By.className("Quantity text-center form-control")).sendKeys("1");
	   driver.findElement(By.linkText("Save")).click();
	   driver.findElement(By.id("select2-txt_AdjustmentAccountName-container")).click();
	   driver.findElement(By.xpath("//li[text()='ASDEDEDEA']")).click();
	   driver.findElement(By.xpath("//button[text()='Save']")).click();
	    //double  TAX= 1320*18/100;
	    
	   
   }
}
