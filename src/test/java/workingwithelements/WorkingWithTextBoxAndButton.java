package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTextBoxAndButton {
	ChromeDriver driver = new ChromeDriver() ;
	
	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void loginscreen () {
		WebElement usernametxt = driver.findElement(By.id("username"));
		WebElement passwordtxt = driver.findElement(By.id("password"));
		WebElement buttomlogin = driver.findElement(By.className("radius"));
		
		usernametxt.clear();
		usernametxt.sendKeys("tomsmith");
		
		passwordtxt.clear();
		passwordtxt.sendKeys("SuperSecretPassword!");
	
		buttomlogin.click();
		
		WebElement successfulNotification =driver.findElement(By.id("flash"));
		System.out.println(successfulNotification.getText());
		Assert.assertTrue(successfulNotification.getText().contains("You logged into a secure area!"));
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}

	
	
	
}
