package workingwithelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithDropDownList {
	ChromeDriver driver = new ChromeDriver() ;

	@BeforeTest
	public void openURL() {
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
		
	}
	@Test
	public void testdropdownList() throws InterruptedException {
		Thread.sleep(2000);
		WebElement optionList = driver.findElement(By.id("dropdown"));
		Select selectOptions = new Select(optionList) ;
		Assert.assertFalse(selectOptions.isMultiple());
		Assert.assertEquals(3, selectOptions.getOptions().size());
		selectOptions.selectByVisibleText("Option 2");
		Thread.sleep(2000);
		selectOptions.selectByValue("1");
		Thread.sleep(2000);
		selectOptions.selectByIndex(2);
		Thread.sleep(2000);

		System.out.println(selectOptions.getOptions().size());
	}



	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}
