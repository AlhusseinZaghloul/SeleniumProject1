package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByXPath {

	ChromeDriver driver = new ChromeDriver() ;
			
	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test ()
	public void findEleByXpath () {
		WebElement usernametxt = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement passwordtxt = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		System.out.println(usernametxt.getTagName());
		System.out.println(passwordtxt.getTagName());
		System.out.println(loginbtn.getText());
	}
	
	@Test
	public void findEleByRelativeXpath () {
		WebElement usernametxt = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordtxt = driver.findElement(By.xpath("//input"));
		WebElement loginbtn = driver.findElement(By.xpath("//button"));
		System.out.println(usernametxt.getTagName());
		System.out.println(passwordtxt.getTagName());
		System.out.println(loginbtn.getText());
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}

}
