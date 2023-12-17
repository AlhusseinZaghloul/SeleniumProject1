package findingElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindByElements {

	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com");
	}

	@Test
	public void testFindElements () {
		//Get all the links displayed in the page
		List<WebElement> links= driver.findElements(By.tagName("a"));
		//Verify size
		System.out.println(links.size());
		Assert.assertEquals(links.size(), 46);
		
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
			
		}


	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
