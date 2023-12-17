package findingElements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBrowserCommand {
	
	ChromeDriver driver = new ChromeDriver() ;
	
	@BeforeTest
	public void openURL() {
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com");
		
	}
	@Test ()
	public void BrowserCommand () {
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
