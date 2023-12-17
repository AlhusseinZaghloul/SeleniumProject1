package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClickWithActions {

	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://cookbook.seleniumacademy.com/DoubleClickDemo.html");
	}
	@Test
	public void DoubleClickTest() throws InterruptedException {
		WebElement message = driver.findElement(By.id("message"));
		System.out.println(message.getCssValue("background"));
		Actions builder = new Actions(driver);
		builder.doubleClick(message).perform();
		System.out.println(message.getCssValue("background"));
		Thread.sleep(1000);
	}
	
	
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
	
}
