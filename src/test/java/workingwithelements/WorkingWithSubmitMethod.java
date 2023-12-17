package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithSubmitMethod {
	ChromeDriver driver = new ChromeDriver() ;
	
	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
	}
	@Test
	public void testSubmit () {
		WebElement searchtxt = driver.findElement(By.id("APjFqb"));
		searchtxt.clear();
		searchtxt.sendKeys("Selenium Web");
		searchtxt.submit();
		WebElement searchtxt1 = driver.findElement(By.id("APjFqb"));
		searchtxt1.clear();
		searchtxt1.sendKeys("Selenium Book");
		searchtxt1.submit();
		
		
	}
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
