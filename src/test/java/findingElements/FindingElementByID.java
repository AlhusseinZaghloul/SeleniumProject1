package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindingElementByID {

	ChromeDriver driver = new ChromeDriver() ;
			
	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void findEleByID () {
		WebElement usernametxt = driver.findElement(By.id("username"));
		WebElement passwordtxt = driver.findElement(By.id("password"));
		System.out.println(usernametxt.getLocation());
		System.out.println(passwordtxt.getTagName());
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}

