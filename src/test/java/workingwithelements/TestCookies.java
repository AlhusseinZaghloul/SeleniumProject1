package workingwithelements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCookies {

	
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://magento2-demo.scandiweb.com/");
		
	}
	
	@Test
	public void testCookies () {
		
	}
	
	
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
