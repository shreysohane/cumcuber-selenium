package com.selenium.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NewTest {
  WebDriver w;
  @BeforeTest
  public void perCondition() {
	  System.setProperty("webdriver.chrome.driver",".\\BrowerDriver\\chromedriver.exe");
	  w = new ChromeDriver();
  }
  
  
  
  
@Test
  public void f() throws Exception {
	w.get("https://www.facebook.com");
  w.findElement(By.id("email")).sendKeys("9617510397");
	w.findElement(By.id("pass")).sendKeys("shrey196");
	w.findElement(By.xpath("//*[@id=\"u_0_l_Ib\"]")).click();
Thread.sleep(30000);
w.findElement(By.xpath("//*[@id=\"mount_0_0_s8\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
  Thread.sleep(30000);
  Reporter.log("961751397 login functionlity working as expected",true);
	 }

  @AfterTest
  public void postCondition() {
	  w.close();
  }

}
