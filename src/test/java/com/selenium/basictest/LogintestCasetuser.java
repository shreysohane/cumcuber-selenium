package com.selenium.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintestCasetuser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\BrowerDriver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
w.get("https://www.altoromutual.com/login.jsp");
  w.findElement(By.id("txtUsername")).sendKeys("Admin");
	w.findElement(By.id("txtPassword")).sendKeys("admin123");
	w.findElement(By.id("btnLogi")).click();

	Thread.sleep(3000);

	w.findElement(By.id("welcome")).click();

	Thread.sleep(3000);
	
	w.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
	w.close();
}


  
	}


