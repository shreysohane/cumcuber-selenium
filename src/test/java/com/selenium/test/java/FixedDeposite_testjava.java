package com.selenium.test.java;

import org.testng.annotations.Test;

import com.selenium.pageobject.FixedDeposite_page;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FixedDeposite_testjava {
	FixedDeposite_page fd =new FixedDeposite_page();

	 @BeforeTest
  public void beforeTest() {
		 fd.openBrowser("chrome");
		 fd.exportPageFactory();
		
  }
  @Test
  public void f() throws Exception{
	  fd.openApplication(fd.readValueFromPropertyFile("url"));
	    
	    fd.handle_TextBox(fd.principle_Txtbox, "100000");
	    fd.handle_TextBox(fd.interest_Txtbox, "6.5");
	    fd.handle_TextBox(fd.tenure_Txtbox, "5");
	    
	    fd.handle_dropDown(fd.tenurePeriod_DropDown, "year(s)");
	    
	    fd.handle_dropDown(fd.frequency_DropDown, "Simple Interest");
	    
	    fd.handle_ClickEvent(fd.calculate_Btn);
		
	    fd.wait_2_Seconds();
	    
	   // System.out.println("Maturity Value Rs 1 lac : " +fd.maturity_value.getText());
	
	  //  fd.takeScreenshot("one_lacFD");
	  
	  
  }
 

  @AfterTest
  public void afterTest() {
  }

}
