package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleAndUrlTest {
	WebDriver driver;
	@BeforeTest
	public void openApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void doTitleTest() {
		String expectedTitle="Facebook - log in or sign up";
		String actualTitle=driver.getTitle();
		//Assert.assertSame(actualTitle, expectedTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test
	public void getUrlTest() {
		
		String ExpectedUrl="https://www.facebook.com/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(ExpectedUrl, actualUrl);
	}
    
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}
}
