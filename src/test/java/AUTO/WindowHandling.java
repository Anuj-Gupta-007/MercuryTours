package AUTO;

import java.awt.Point;
import java.util.ResourceBundle.Control;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sudhir Kumar\\Music\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/"); 
		String title = driver.getTitle(); 
		System.out.println(title); 
		//driver.get("http://www.google.co"); 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		driver.findElement(By.cssSelector("#search-inp")).sendKeys("Selenium Certification Course"); 
		js.executeScript("window.scrollBy(0,40)"); 
		driver.findElement(By.xpath("//span[@class='typeahead__button']")).click(); 
		 
		WebElement link = driver.findElement(By.xpath("//li[@class = 'ga-allcourses']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.SHIFT).perform();
		
		Thread.sleep(3000); 
		
		Set<String> windows = driver.getWindowHandles(); 
		System.out.println(windows); 
		System.out.println("Parent Window"); 
		for (String window : windows) 
		{ 
		driver.switchTo().window(window); 
		if (driver.getTitle().contains("Best Training & Certification Courses for Professionals | Edureka")) 
		{ 
		System.out.println("Next Tab"); 
		js.executeScript("window.scrollBy(0,1000)"); 
		System.out.println("b1"); 
		driver.findElement(By.xpath("//*[@id='allc_catlist']/li[3]/a")).click(); 
		js.executeScript("window.scrollBy(0,400)");
		} 
		} 
		Thread.sleep(3000); 
		Set<String> windows1 = driver.getWindowHandles(); 
		System.out.println(windows1); 
		System.out.println("a3"); 
		for (String window : windows1) 
		{ 
		driver.switchTo().window(window); 
		System.out.println("a4"); 
		js.executeScript("window.scrollBy(0,400)"); 
		}   
		} 
	}


