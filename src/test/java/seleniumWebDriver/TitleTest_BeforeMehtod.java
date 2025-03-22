package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleTest_BeforeMehtod {
	WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
 @Test
	private void doTitleTest() {
         String expectedTitle="Facebook - log in or sign up";
         String actualTitle =driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
	}
@Test
	private void getUrlTest() {
	String ExpectedUrl="https://www.facebook.com/";
	String actualUrl=driver.getCurrentUrl();
	Assert.assertEquals(ExpectedUrl, actualUrl);
		
	}


@AfterMethod
private void closeApplication() {
  //driver.quit();
}
}
