package com.tours.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sudhir Kumar\\Music\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));
		
		for (int i = 0; i < 1; i++) {
			clickElement.click();
			Thread.sleep(3000);
		}

		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindowHandle = "";
		for (String handle : allWindowHandles) {
			System.out.println("Switching to window - > " + handle);
			System.out.println("Navigating to google.com");
			driver.switchTo().window(handle); // Switch to the desired window first and then execute commands using
												// driver
			driver.get("http://google.com");
			lastWindowHandle = handle;
		}
		
		//Switch to the parent window
		driver.switchTo().window(parentWindowHandle);
		//close the parent window
		driver.close();
		//at this point there is no focused window, we have to explicitly switch back to some window.
		driver.switchTo().window(lastWindowHandle);
		driver.get("http://toolsqa.com");
	}

}
