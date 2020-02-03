package com.tours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tours.base.TestBase;

public class RegisterPage_OR extends TestBase {
	WebDriver driver;

	@FindBy(name = "firstName")
	WebElement fname;
	@FindBy(name = "lastName")
	WebElement lname;
	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(name = "userName")
	WebElement email;

	@FindBy(name = "address1")
	WebElement address;
	@FindBy(name = "city")
	WebElement city;
	@FindBy(name = "state")
	WebElement State;
	@FindBy(name = "postalCode")
	WebElement PostalCode;
	@FindBy(name = "country")
	WebElement CountryDrp;
	@FindBy(id = "email")
	WebElement UserName;
	@FindBy(name = "password")
	WebElement Password;
	@FindBy(name = "confirmPassword")
	WebElement ConfirmPassord;

	public RegisterPage_OR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement firstnam() {

		return fname;
	}

	public WebElement lastname() {

		return lname;
	}

	public WebElement phone() {

		return phone;
	}

	public WebElement mail() {

		return email;
	}

	public WebElement city() {

		return city;
	}

	public WebElement state() {

		return State;
	}

	public WebElement postalcode() {

		return PostalCode;
	}

	public WebElement UserName() {

		return UserName;
	}

	public WebElement Password() {

		return Password;
	}

	public WebElement ConfirmPassord() {

		return ConfirmPassord;
	}

}
