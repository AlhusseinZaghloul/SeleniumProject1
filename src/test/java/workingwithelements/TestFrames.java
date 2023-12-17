package workingwithelements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFrames {

	
	
ChromeDriver driver = new ChromeDriver() ;
	

	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://cookbook.seleniumacademy.com/Frames.html");	
	}
	@Test
	public void TestFramesWithIDorName () {
		driver.switchTo().frame("left");
		WebElement msg = driver.findElement(By.tagName("p"));
		System.out.println(msg.getText());
		assertEquals(msg.getText(), "This is Left Frame");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("right");
		WebElement msg2 = driver.findElement(By.tagName("p"));
		System.out.println(msg2.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement msg3 = driver.findElement(By.tagName("p"));
		System.out.println(msg3.getText());
		
	}
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
