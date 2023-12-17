package workingwithelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClickandHold {


	ChromeDriver driver = new ChromeDriver() ;


	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");	
	}
	@Test
	public void moveEle() throws InterruptedException {
		WebElement boxA = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		WebElement boxD = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));
		Actions actions = new Actions(driver);
		/*actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxD);
		*/
		actions.contextClick(boxD);
		actions.build().perform();
		Thread.sleep(2000);
		
		
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
		System.out.println("done!!!!!!!");
	}
}
