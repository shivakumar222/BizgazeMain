package com.Transcat;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid
{  
	public static RemoteWebDriver driver;
  public static void main(String[] args) throws MalformedURLException
  {
       
	DesiredCapabilities  cap=new DesiredCapabilities().chrome();
	cap.setPlatform(Platform.WIN10);
	cap.setBrowserName("chrome");
	
	driver=new RemoteWebDriver(new URL(" http://192.168.43.247:4444/wd/hub"),cap);
	driver.get("https://testv3.bizgaze.com");
	driver.findElement(By.id("InputEmail")).sendKeys("8500665284");	
	driver.findElement(By.id("InputPassword")).sendKeys("123456");
	driver.findElement(By.id("BtnLogin")).click();
	  
}
}
