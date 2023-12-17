package workingwithelements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMultipleWindows {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://cookbook.seleniumacademy.com/Config.html");
	}
	
	@Test
	public void testWindowUsingName () throws InterruptedException {
		//Store Window Handle of parent window
	String currentWindowID=driver.getWindowHandle();
	driver.findElement(By.id("visitbutton")).click();
	driver.switchTo().window("VisitUsWindow");
	System.out.println(driver.getTitle());
	assertEquals(driver.getTitle(), "Visit Us");
	Thread.sleep(1000);
	driver.switchTo().window(currentWindowID);
	driver.findElement(By.id("chatbutton")).click();
	Thread.sleep(1000);
	driver.close();
	Thread.sleep(1000);
	
	}
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
	
}
