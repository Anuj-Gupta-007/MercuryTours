package com.tours.test;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tours.base.TestBase;

import com.tours.pages.HomePage;
import com.tours.pages.Home_OR;
import com.tours.pages.RegisterPageByInterface_OR;

public class TestHomePage extends TestBase implements Home_OR, RegisterPageByInterface_OR {

	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000);

	@BeforeClass
	public void initialize() throws IOException

	{
		preCondition();
	}

	@Test 
	void basePage() {
		// HomePage thp = new HomePage(driver);
		// thp.regist().click();

		WebElement reg = driver.findElement(By.xpath(registerlink));

		reg.click();
		String regTitle = driver.getTitle();
		System.out.println("Register Page Title: " + regTitle);
		Assert.assertEquals(regTitle, "Register: Mercury Tours");
	}

	@AfterMethod
	public void wrapUp() {

		// driver.quit();
	}
	 public static void main(String[] args){
		 RegisterPageTest class1 = new RegisterPageTest();
	        class1.register();
	    }

}
// http://qualitypointtech.net/timesheetdemo/index.php?logout=true#logoutstatus