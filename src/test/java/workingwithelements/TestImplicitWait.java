package workingwithelements;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestImplicitWait {
	
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://cookbook.seleniumacademy.com/AjaxDemo.html");	
	}

	@Test
	public void testimplicitWait () {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Page 4")).click();
		WebElement message =driver.findElement(By.id("Page 4"));
		
		assertTrue(message.getText().contains("Hello"));
	}
	

	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
