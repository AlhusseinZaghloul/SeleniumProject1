package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByClass {
ChromeDriver driver = new ChromeDriver() ;
	
	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void findEleByClass () {
		try {
		WebElement usernametxt = driver.findElement(By.name("username"));
		WebElement passwordtxt = driver.findElement(By.name("password"));
		WebElement loginbBtn = driver.findElement(By.className("radius")) ;
		System.out.println(usernametxt.getLocation());
		System.out.println(passwordtxt.getTagName());
		System.out.println(loginbBtn.getText());
		}
		catch(NoSuchElementException e) {
			System.out.println("The Element is not found please try another attribute");
		}
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
	
}
