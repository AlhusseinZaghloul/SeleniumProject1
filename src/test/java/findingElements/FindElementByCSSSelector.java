package findingElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByCSSSelector {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void findElementByCSSselector () {
		WebElement headerLbl = driver.findElement(By.cssSelector("h2"));
		WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));
		System.out.println(loginBtn.getText());
		System.out.println(headerLbl.getText());


	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
