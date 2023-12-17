package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithCheckBoxes {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	}
	@Test (enabled = false)
	public void testCheckbox () throws InterruptedException{
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		check1.click();
		Thread.sleep(2000);
		WebElement check2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		if(check2.isSelected()) {
			check2.click();
		}
	}
		@Test
		private boolean isElementPresent (By by) {
			try {
				driver.findElement(by);
				return true ;
			} catch (NoSuchElementException e) {
				return false ;
			}
		}
	

	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
