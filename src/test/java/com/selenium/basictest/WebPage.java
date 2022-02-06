package com.selenium.basictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\BrowerDriver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
  w.get("https://www.altoromutual.com/login.jsp" );
  

	}

}
