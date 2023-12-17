package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextContextMenu {
	ChromeDriver driver = new ChromeDriver() ;
	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");	
	}
	@Test
	public void testContextMenu() throws InterruptedException {
		WebElement clickMeBtn= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		WebElement menu= driver.findElement(By.xpath("/html/body/ul/li[3]"));
		Actions actions= new Actions(driver);
		actions.contextClick(clickMeBtn).moveToElement(menu).click().perform();
		Thread.sleep(2000);
	}
	
	
	
		@AfterTest
		public void closeDriver () {
			driver.quit();
			System.out.println("done!!!!!!!");
		}
	}
	
	

