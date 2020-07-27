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

public class Districts extends BaseClass
{
	
@Test(priority=1)
public void TestDistricts() throws InterruptedException, AWTException
{
	//create distrcit and click on save 
	
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
    driver.findElement(By.xpath("//*[@id='layout-list-settings']/a[2]")).click();
}
   /* driver.findElement(By.id("btnCreateNew")).click();//states add button 
    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_DistrictName']")));
    StateName.sendKeys("new kkd 1");
    driver.findElement(By.id("txt_DistrictCode")).sendKeys("815");
	driver.findElement(By.id("select2-txtAutoComplete_110144181001111_StateId-container")).click();
	WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Andhra Pradesh']")));
	dropdown.click();//dropdown code
	driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
	driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	//Reporter.log(driver.findElement(By.xpath("//*[@id='bizgaze_body']/div[25]/div")).getText());
	
	//*[@id="bizgaze_body"]/div[25]/div
	//*[@id="bizgaze_body"]/div[25]/div/span[1]
	//*[@id="bizgaze_body"]/div[25]/div/span[2]
	//*[@id="bizgaze_body"]/div[25]/div/h2

}*/
/*@Test(priority=2)
public void testCreatedistrict1()
{
	//without giving district name and click on save 
	
	    driver.findElement(By.id("btnCreateNew")).click();//country + button
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement  distrcitcode=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_DistrictCode']")));
	    distrcitcode.sendKeys("2574");//enter district code
		driver.findElement(By.id("select2-txtAutoComplete_110144181001111_StateId-container")).click();
		WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Andhra Pradesh']")));
		dropdown.click();//dropdown code
		driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
		Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
		driver.findElement(By.xpath("//a[text()=' Close']")).click();
	    
}
@Test(priority=3)
public void testCreatedistrict2()
{
	//without giving district code and click on save
	
	    driver.findElement(By.id("btnCreateNew")).click();//country + button 
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_DistrictName']")));
	    StateName.sendKeys("new vsp 1");
		driver.findElement(By.id("select2-txtAutoComplete_110144181001111_StateId-container")).click();
		WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Andhra Pradesh']")));
		dropdown.click();//dropdown code
		driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
		Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
		driver.findElement(By.xpath("//a[text()=' Close']")).click();
	
}*/
@Test(priority=4)
public void testCreatedistrict3()
{
	//without giving any details and click on save 
	
	   driver.findElement(By.id("btnCreateNew")).click();
	   WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement Save=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formFooter']/div/button[2]")));
	    Save.click();
		driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
		Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
		driver.findElement(By.xpath("//a[text()=' Close']")).click();
}
/*@Test(priority=5)
public void testCreatedistrict4()
{
	//giving distrcit name duplicate
	
	    driver.findElement(By.id("btnCreateNew")).click();//district  add button
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_DistrictName']")));
	    StateName.sendKeys("new vsp 1");
	    driver.findElement(By.id("txt_DistrictCode")).sendKeys("24785");
		driver.findElement(By.id("select2-txtAutoComplete_110144181001111_StateId-container")).click();
		WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Andhra Pradesh']")));
		dropdown.click();//dropdown code
		driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
		Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
		driver.findElement(By.xpath("//a[text()=' Close']")).click();
	    
}
@Test(priority=6)
public void testCreatedistrcit5()
{
	//duplicate district code
	  
    driver.findElement(By.id("btnCreateNew")).click();//district  add button
    WebDriverWait w1=new WebDriverWait(driver,30); 
    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_DistrictName']")));
    StateName.sendKeys("new vsp11");
    driver.findElement(By.id("txt_DistrictCode")).sendKeys("245");
	driver.findElement(By.id("select2-txtAutoComplete_110144181001111_StateId-container")).click();
	WebElement dropdown =w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Andhra Pradesh']")));
	dropdown.click();//dropdown code
	driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
	driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	driver.findElement(By.xpath("//a[text()=' Close']")).click();
    
}
@Test(priority=7)
public void testCreatedistrcit6()
{
	 //without giving state name dropdown and click on save 
	
	    driver.findElement(By.id("btnCreateNew")).click();//district add button
	    WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement StateName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_DistrictName']")));
	    StateName.sendKeys("new vsp112");
	    driver.findElement(By.id("txt_DistrictCode")).sendKeys("2452");
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
		Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());   
}*/
}
