package com.tours.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tours.base.TestBase;
import com.tours.pages.Welcome_OR;

public class Dashboard extends TestBase implements Welcome_OR{
	
	@BeforeClass
	void initialize() throws IOException {
		preCondition();
		
	}
	@Test
	void basePage() {
		// HomePage thp = new HomePage(driver);
		// thp.regist().click();
		WebElement userName = driver.findElement(By.xpath(user));

		userName.click();
		String Title = driver.getTitle();
		System.out.println("Register Page Title: " + Title);
		Assert.assertEquals(Title, "Welcome: Mercury Tours");
	}
	
 
	@AfterMethod
	public void wrapUp() {

	//	driver.quit();

}
}
