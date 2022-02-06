package com.selenium.assignmentassert;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class assignment1 {
	WebDriver w;
	 @BeforeTest
	  public void preCondition() {
		 WebDriverManager.chromedriver().setup();
		 
			w = new ChromeDriver();
		
		 
		 
	  }
  @Test
  public void f() {
	  w.get("https://juliemr.github.io/protractor-demo/");
	  w.findElement(By.xpath("//input[@type = 'text']")).sendKeys("5");
    w.findElement(By.xpath("/html/body/div/div/form/select")).sendKeys("-");
    w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("2");
    w.findElement(By.xpath("//button[@id = 'gobutton']")).click();
  
  
  
  }
 

  @AfterTest
  public void postCondition() {
  }

}
