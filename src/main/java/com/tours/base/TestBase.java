package com.tours.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestBase {

	public WebDriver driver;
	Properties prop;

	public void preCondition() throws IOException

	{ 
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sudhir Kumar\\eclipse-workspace\\MercuryTours\\"
				+ "src\\main\\java\\config\\properties\\properties");
		prop.load(fis);
		String bname = prop.getProperty("browser");
		String uniform = prop.getProperty("url");
		System.out.println("Browser Name:" + bname);

		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Drivers\\1\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser is launched");

		}

		else if (bname.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Sudhir Kumar\\Music\\work\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Browser is launched");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(uniform);
		 String title = driver.getTitle();
		System.out.println("Website Title: " + title);
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}

}
