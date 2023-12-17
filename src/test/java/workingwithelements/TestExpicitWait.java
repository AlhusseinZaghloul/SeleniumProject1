package workingwithelements;


import org.testng.annotations.Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestExpicitWait {
	ChromeDriver driver = new ChromeDriver() ;
	

	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");	
	}
	@Test 
	public void testExplicitWait () {
		WebElement querytxt= driver.findElement(By.id("APjFqb"));
		querytxt.sendKeys("Selenium WebDriver");
		querytxt.submit();
	    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement mylink= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Getting started")));
	    mylink.click();
	}
	
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
