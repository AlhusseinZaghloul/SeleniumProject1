package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFleuntWait {
ChromeDriver driver = new ChromeDriver() ;
	

	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");	
	}
	@Test 
	public void testFleuntWait () {
		driver.findElement(By.id("APjFqb"));
		/*	Wait<WebDriver> fwait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofSeconds(2))
		            .ignoring(ElementNotInteractableException.class);
		
		WebElement link = fwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Getting started")));
		link.click();
		*/
	}
	
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
