package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindLinksByLinkText {
	
ChromeDriver driver = new ChromeDriver() ;
	
	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/login");}
	
	@Test	
	public void findLinksBylinkTxt () {
	WebElement thelink = driver.findElement(By.linkText("Elemental Selenium"));
	System.out.println(thelink.getAttribute("href"));
}
	@Test	
	public void findLinksByPartialLinktxt () {
	WebElement thelink1 = driver.findElement(By.partialLinkText("Elemental"));
	System.out.println(thelink1.getAttribute("href"));
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
	
}
