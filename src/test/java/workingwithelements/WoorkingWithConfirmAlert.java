package workingwithelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WoorkingWithConfirmAlert {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://cookbook.seleniumacademy.com/Alerts.html");
	}
	@Test (priority = 1)
	public void testPromptConfirmAlert() throws InterruptedException {
		WebElement promptbttn=driver.findElement(By.id("confirm"));
		promptbttn.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		WebElement message = driver.findElement(By.id("demo"));
		String txtmess=message.getText();
	    System.out.println(txtmess);
	    Assert.assertEquals(txtmess, "You Accepted Alert!");
	}

	@Test (priority = 2)
	public void testPromptDismissAlert() throws InterruptedException {
		WebElement promptbttn=driver.findElement(By.id("confirm"));
		promptbttn.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(1000);
		WebElement message = driver.findElement(By.id("demo"));
		String txtmess=message.getText();
	    System.out.println(txtmess);
	    Assert.assertEquals(txtmess, "You Dismissed Alert!");
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}

}
