package com.selenium.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class loginpagepolicy {
	WebDriver w;
	
	@BeforeTest
  public void preCondition() {
	System.setProperty("webdriver.chrome.driver",".\\BrowerDriver\\chromedriver.exe");
	w = new ChromeDriver();
  }
 @Test
  public void Loginpagepolicy() throws Exception {
	 w.get("https://www.policyx.com/");
	 String PageTitle = w.getTitle();
	 Assert.assertTrue(PageTitle.contains("Insurance"));
	 String pageURL = w.getCurrentUrl();
	 Assert.assertEquals(pageURL, "https://www.policyx.com/");
	 w.findElement(By.xpath("//*[@id=\"page1\"]/header/div/div[4]/div[4]/a")).click();
	  String pageLabel = w.findElement(By.xpath("//*[@id=\"page1\"]/div[2]/div/div/div[1]/h1")).getText();
	 Assert.assertEquals(pageLabel,"CLAIM ASSISTANCE");
	 String PageTitleclam = w.getTitle();
	 Assert.assertTrue(PageTitleclam.contains("Claim Process"));
	 w.findElement(By.xpath("//*[@id=\"page1\"]/header/div/div[4]/div[2]/a")).click();
	 w.findElement(By.xpath("//*[@id=\"form_life_wrapper\"]/div[2]/div/div[6]/a/div/img")).click();
	//Thread.sleep(3000); 
	w.findElement(By.id("user_name")).sendKeys("admin");
		w.findElement(By.id("password")).sendKeys("admin");
		w.findElement(By.xpath("//*[@id=\"Let_Me_In\"]")).click();

	 
	 
	 
  }
 

  @AfterTest
  public void postCondition() {
	// w.close();
  }

}
