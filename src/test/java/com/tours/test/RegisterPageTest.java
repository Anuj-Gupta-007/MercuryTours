package com.tours.test;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tours.base.TestBase;
import com.tours.pages.RegisterPageByInterface_OR;
import com.tours.pages.RegisterPage_OR;

public class RegisterPageTest extends TestBase implements RegisterPageByInterface_OR {

	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000);

	@BeforeMethod
	void initialize() throws IOException {
		preCondition();

	}

	@Test 
	void register() {
		WebElement fnameElement = driver.findElement(By.name(fname));
		fnameElement.click();
		fnameElement.sendKeys("Firstname" + randomInt);

		WebElement lnameElement = driver.findElement(By.name(lname));
		lnameElement.click();
		lnameElement.sendKeys("Lastname" + randomInt);

		WebElement phoneElement = driver.findElement(By.name(phone));
		phoneElement.click();
		phoneElement.sendKeys("Lastname" + randomInt);

		WebElement emailElement = driver.findElement(By.name(email));
		emailElement.click();
		emailElement.sendKeys("Lastname" + randomInt);
	}

}
