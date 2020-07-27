package TestV3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class States extends BaseClass
{
 
@Test(priority=1)
public void testState() throws InterruptedException, AWTException
{
	//create state and click on save 
	  driver.manage().window().maximize();      
	  Thread.sleep(5000);
	  Robot r1=new Robot();	
	  r1.keyPress(KeyEvent.VK_TAB);
      r1.keyPress(KeyEvent.VK_TAB);
	  r1.keyPress(KeyEvent.VK_ENTER);
	  WebDriverWait w1=new WebDriverWait(driver,30); 
	  w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Cities']")));
      driver.findElement(By.xpath("//div[text()='Cities']")).click();
      driver.findElement(By.className("icon-arrow-up")).click();
      driver.findElement(By.xpath("//*[@id='layout-list-settings']/a[3]")).click();
   /*driver.findElement(By.id("btnCreateNew")).click();//state add button
     WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_StateName']")));
     StateName.sendKeys("new anpradesh1");
     driver.findElement(By.id("txt_StateCode")).sendKeys("245");
	 driver.findElement(By.id("select2-txtAutoComplete_110144181001195_CountryId-container")).click();
	 WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Afghanistan']")));
	 dropdown.click();//dropdown code
	 driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
     driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();  	
     Reporter.log(driver.findElement(By.xpath("//*[@id='bizgaze_body']/div[8]/div")).getText());*/
    
}
/*@Test(priority=2)
public void testCreatestate1()
{
	//without giving state name and click on save 
	
	    driver.findElement(By.id("btnCreateNew")).click();//country + button 
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement Statecode=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_StateCode']")));
	    Statecode.sendKeys("2456");
		driver.findElement(By.id("select2-txtAutoComplete_110144181001195_CountryId-container")).click();
		WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Afghanistan']")));
		dropdown.click();//dropdown code
		driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
	   driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
		//driver.findElement(By.xpath("//button[text()='Save']")).click();
	    Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	    driver.findElement(By.xpath("//a[text()=' Close']")).click();	    	
}
@Test(priority=3)
public void testCreatestate2()
{
	//without giving state code and click on save
	
	    driver.findElement(By.id("btnCreateNew")).click();//country + button 
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_StateName']")));
	    StateName.sendKeys("new anpradeshiu1");
	    driver.findElement(By.id("select2-txtAutoComplete_110144181001195_CountryId-container")).click();
		WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Afghanistan']")));
		dropdown.click();//dropdown code
		driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
		//driver.findElement(By.xpath("//button[text()='Save']")).click();
	    Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	    driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
}*/
@Test(priority=4)
public void testCreatestate3()
{
	//without giving any details and click on save 
	
	    driver.findElement(By.id("btnCreateNew")).click();
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement Save=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formFooter']/div/button[2]")));
	    Save.click();
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	  /*  WebElement Save=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Save']")));
	    Save.click();
	   driver.findElement(By.xpath("//button[text()='Save & New']")).click();*/
	    Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	    driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
}
/*@Test(priority=5)
public void testCreatestate4()
{
	//giving state name duplicate
	
	    driver.findElement(By.id("btnCreateNew")).click();//state add button
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_StateName']")));
	    StateName.sendKeys("new anpradesh1");
	    driver.findElement(By.id("txt_StateCode")).sendKeys("2845");
		driver.findElement(By.id("select2-txtAutoComplete_110144181001195_CountryId-container")).click();
		WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Afghanistan']")));
		dropdown.click();//dropdown code
		driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	    w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Bizgaze-messageInfo")));
	    Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	    driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
}
@Test(priority=6)
public void testCreatestate5()
{
	//duplicate state code
	  
       driver.findElement(By.id("btnCreateNew")).click();//state add button
       WebDriverWait w1=new WebDriverWait(driver,30); 
       WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_StateName']")));
       StateName.sendKeys("new anpradeshu1");
       driver.findElement(By.id("txt_StateCode")).sendKeys("245");
	   driver.findElement(By.id("select2-txtAutoComplete_110144181001195_CountryId-container")).click();
	   WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Afghanistan']")));
	   dropdown.click();//dropdown code
	   driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
       driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
       Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
       driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
}
@Test(priority=7)
public void testCreatestate6()
{
	 //without giving country name dropdown and click on save 
	
	    driver.findElement(By.id("btnCreateNew")).click();//state add button
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_StateName']")));
	    StateName.sendKeys("new anpradeshi1");
	    driver.findElement(By.id("txt_StateCode")).sendKeys("2845");
		driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	    Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	    	
}*/
}

