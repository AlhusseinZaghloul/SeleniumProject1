package workingwithelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Message;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithPromptAlert {

	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://cookbook.seleniumacademy.com/Alerts.html");
	}
	@Test
     public void testPromptAlert() throws InterruptedException {
		WebElement promptbttn=driver.findElement(By.id("prompt"));
		promptbttn.click();
	    Thread.sleep(1000);
	    Alert alert =driver.switchTo().alert();
	    alert.sendKeys("Hussein");
	    alert.accept();
	    Thread.sleep(1000);
	    WebElement message=driver.findElement(By.id("prompt_demo"));
	    String txtmess=message.getText();
	    System.out.println(txtmess);
	    Assert.assertEquals(txtmess, "Hello Hussein! How are you today?");
	    
	}

	@AfterTest
	public void closeDriver () {
		driver.quit();
	}

}
