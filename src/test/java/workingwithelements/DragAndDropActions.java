package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropActions {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://cookbook.seleniumacademy.com/DragDropDemo.html");
	}
	@Test
	public void testDragAndDrop() throws InterruptedException {
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		System.out.println(target.getText());
		Thread.sleep(1000); 
		Assert.assertEquals(target.getText(), "Dropped!");
	}
	
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
