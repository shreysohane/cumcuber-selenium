package com.selenium.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Logintest {
	WebDriver w;
	
	 @BeforeTest
	  public void preCondition() {
		  System.setProperty("webdriver.chrome.driver",".\\BrowerDriver\\chromedriver.exe");
	  w = new ChromeDriver();
	 }
	
  @Test(priority = 0,description = "test user to verify'admin'")
  public void loginTestAdmin() throws Exception {
	  w.get("https://www.altoromutual.com/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
  Thread.sleep(30000);
  
	  Reporter.log("admin login functionality working as expected",true);
	 }
  
  
  @Test(priority = 1,description = "test case to verify 'admin' user to logout functionality ")
  public void logintestAdminlogout() throws Exception {
	  w.findElement(By.xpath("//*[@id=\"LoginLink\"]")).click();
	  Thread.sleep(3000);  
	  Reporter.log("admin login functionality working as expected",true);
	  
  }

  @Test(priority = 2,description = "test user to verify 'tuser'")
  public void loginTesttuser() throws Exception {
	  w.get("https://www.altoromutual.com/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("tuser");
		w.findElement(By.id("passw")).sendKeys("tuser");
		w.findElement(By.name("btnSubmit")).click();
  Thread.sleep(30000);
  w.findElement(By.xpath("//*[@id=\"LoginLink\"]")).click();
	  Thread.sleep(3000);
	  Reporter.log("tuser login functionlity working as expected",true);
	 }
 
  
  
  @Test(priority = 3,description = "test user to verify 'tuser'")
  public void loginTestuser() throws Exception {
	  w.get("https://www.altoromutual.com/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("user");
		w.findElement(By.id("passw")).sendKeys("user");
		w.findElement(By.name("btnSubmit")).click();
  Thread.sleep(30000);
  w.findElement(By.linkText("//*[@id=\"LoginLink\"]")).click();
	  Thread.sleep(3000);
	  Reporter.log("user login functionlity working as expected",true);
	 }

  @AfterTest
  public void postCondition() {
	  w.close();
	  
  }

}
