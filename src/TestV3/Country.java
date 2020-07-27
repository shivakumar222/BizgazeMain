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

public class Country extends BaseClass
{

	@Test(priority=1)//specific method will run 
   public void createCountry() throws InterruptedException, AWTException
   {
//craete country and click on save
		
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
        driver.findElement(By.xpath("//*[@id='layout-list-settings']/a[1]")).click();
	    driver.findElement(By.id("btnCreateNew")).click();//country + button 
	    WebElement CountryName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_CountryName']")));
        CountryName.sendKeys("new indianww1");//enter cityname code
	   //driver.findElement(By.xpath("//input[@id='txt_CountryName']")).sendKeys("new india");//country create code
	    driver.findElement(By.xpath("//input[@id='txt_CountryCode']")).sendKeys("1w27321");//country code
	    driver.findElement(By.xpath("	//*[@id='formFooter']/div/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
        w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='bizgaze_body']/div[8]/div")));
	    Reporter.log(driver.findElement(By.xpath("//*[@id='bizgaze_body']/div[8]/div")).getText());

	    
   }

/*@Test(priority=2)
public void testCreatecountry1()
{
	//without giving country name and click on save 
	
	  driver.findElement(By.id("btnCreateNew")).click();//country + button 
	  	WebDriverWait w1=new WebDriverWait(driver,30); 
	  WebElement Countrycode=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_CountryCode']")));
      Countrycode.sendKeys("123");//enter cityname code
	  driver.findElement(By.xpath("	//*[@id='formFooter']/div/button[2]")).click();
	  driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	  Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	   driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
}
@Test(priority=3)
public void testCreatecountry2()
{
	//without giving country code and click on save
	
	  driver.findElement(By.id("btnCreateNew")).click();//country + button 
	  	WebDriverWait w1=new WebDriverWait(driver,30); 
	  WebElement CountryName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_CountryName']")));
      CountryName.sendKeys("new india");//enter cityname code
      driver.findElement(By.xpath("	//*[@id='formFooter']/div/button[2]")).click();
	  driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	  Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	   driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
      
}
@Test(priority=4)
public void testCreatecountry3()
{
	//without giving any details and click on save 
	
	 driver.findElement(By.id("btnCreateNew")).click();
	 	WebDriverWait w1=new WebDriverWait(driver,30); 
	 	WebElement save=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formFooter']/div/button[2]")));
      save.click();//enter cityname code
	  //driver.findElement(By.xpath("	//*[@id='formFooter']/div/button[2]")).click();
	  driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();
	  Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	  driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
}
@Test(priority=5)
public void testCreatecountry4()
{
	//giving country name duplicate
	
	    driver.findElement(By.id("btnCreateNew")).click();
	    	WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement CountryName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_CountryName']")));
        CountryName.sendKeys("new india");//enter cityname code
        driver.findElement(By.xpath("//input[@id='txt_CountryCode']")).sendKeys("123");//country code
	    driver.findElement(By.xpath("	//*[@id='formFooter']/div/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();   
	    Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	     driver.findElement(By.xpath("//a[text()=' Close']")).click();	  
}
@Test(priority=6)
public void testCreatecountry5()
{
	//duplicate country code
	
	   driver.findElement(By.id("btnCreateNew")).click();
	   	WebDriverWait w1=new WebDriverWait(driver,30); 
	    WebElement CountryName=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_CountryName']")));
        CountryName.sendKeys("new usa");//enter cityname code
        driver.findElement(By.xpath("//input[@id='txt_CountryCode']")).sendKeys("123");//country code
	    driver.findElement(By.xpath("	//*[@id='formFooter']/div/button[2]")).click();
	    driver.findElement(By.xpath("//*[@id='formFooter']/div/div/a[1]")).click();   
	    Reporter.log(driver.findElement(By.id("Bizgaze-messageInfo")).getText());
	    
}*/
}

