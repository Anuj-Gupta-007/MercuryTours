package AUTO;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sudhir Kumar\\Music\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home");
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
			int C1 = count.size();
			System.out.println("Count of iFrames: " +C1);
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//body//a//img")).click();
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}

}
