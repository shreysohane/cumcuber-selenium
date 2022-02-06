package com.selenium.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDeposite_page {
	
	WebDriver w;

	@FindBy(id = "principal")
	public WebElement principle_Txtbox;

	@FindBy(name = "interest")
	public WebElement interest_Txtbox;

	@FindBy(id = "tenure")
	public WebElement tenure_Txtbox;

	@FindBy(css = "select#tenurePeriod")
	public WebElement tenurePeriod_DropDown;

	@FindBy(id = "frequency")
	public WebElement frequency_DropDown;

	@FindBy(xpath = "//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")
	public WebElement calculate_Btn;

	@FindBy(id = "resp_matval")
	public WebElement maturity_value;

	public void openBrowser(String br) {

		if (br.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			w = new ChromeDriver();
			w.manage().window().maximize();
			w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		else if (br.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			w = new FirefoxDriver();

		}

	}

	public void closeBrowser() {
		w.close();
	}

	public void quitBrowser() {
		w.quit();
	}

	public void openApplication(String url) {

		w.get(url);
	}

	public void handle_TextBox(WebElement we, String value) {

		we.clear();
		we.sendKeys(value);

	}

	public void handle_ClickEvent(WebElement we) {

		we.click();

	}

	public void wait_2_Seconds() throws InterruptedException {

		Thread.sleep(2000);
	}

	public void handle_dropDown(WebElement we, String value) {

		Select sel = new Select(we);
		sel.selectByVisibleText(value);
	}

	public void takeScreenshot(String fileName) throws Exception {
		String projectPath = System.getProperty("user.dir"); // return project path
		String screenshotPath = projectPath + "\\Screenshot\\" + fileName + ".png";

		TakesScreenshot ts = (TakesScreenshot) w;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(screenshotPath));
	}

	public String readValueFromPropertyFile(String key) throws Exception {

		String projectPath = System.getProperty("user.dir"); // return project path

		FileInputStream fin = new FileInputStream(projectPath + "\\config.properties");

		Properties prop = new Properties();

		prop.load(fin);

		String returnKey_Value=prop.getProperty(key);
		
		fin.close();
		
		return returnKey_Value;

	}

	public void exportPageFactory() {

		// driver + class containing webobject
		PageFactory.initElements(w, this);
	}
}
