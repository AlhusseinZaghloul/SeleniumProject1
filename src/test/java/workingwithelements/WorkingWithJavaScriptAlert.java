package workingwithelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithJavaScriptAlert {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://cookbook.seleniumacademy.com/Alerts.html");
	}

	@Test 
	public void testAlert () throws InterruptedException {
    WebElement btnAlert =driver.findElement(By.id("simple"));
    btnAlert.click();
    Thread.sleep(1000); 
    Alert alert = driver.switchTo().alert();
    String alertText=alert.getText();
    Assert.assertEquals(alertText,"Hello! I am an alert box!");
    alert.accept();
    Thread.sleep(1000);
    
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
