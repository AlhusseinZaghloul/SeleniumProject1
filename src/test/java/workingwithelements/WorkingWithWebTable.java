package workingwithelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithWebTable {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/tables");
	}
	@Test
	public void tesrWenTable () {
		WebElement webTable =driver.findElement(By.id("table1"));
		
		//get all rows
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		Assert.assertEquals(rows.size(), 5);
		
		//get all cells data
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.println(col.getText());
			}
			System.out.println();
		}
	}
	
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}

}
