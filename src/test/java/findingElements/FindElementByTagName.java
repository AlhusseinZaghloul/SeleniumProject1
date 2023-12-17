package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByTagName {

	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void findEleByClass () {


		WebElement loginbBtn = driver.findElement(By.tagName("button")) ;

		System.out.println(loginbBtn.getText());
		loginbBtn.click();
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}

}
