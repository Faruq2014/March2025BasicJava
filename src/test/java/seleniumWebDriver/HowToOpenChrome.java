package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToOpenChrome {
	
	//instance variable
	WebDriver driver;
	
	@Test
	public void loginTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void maximizeWindow() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
	}
	@Test
	public void closeApplication() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.quit();
		
	}
	@Test
	public void getApplicationTitle() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		   //    expected =actual==pass
			//	expected != actual==fail
	String expectedTitle="Facebook - log in or sign up";
	String actualTitle=driver.getTitle();
	System.out.println("face book title is >>> "+actualTitle);
	Assert.assertEquals(expectedTitle, actualTitle);
	driver.quit();
		
	}
	
	@Test
	public void getApplicationUrl() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// url test
		String expectedUrl="https://www.facebook.com/";
		String actualUrl= driver.getCurrentUrl();
		System.out.println("facebook url is ... "+actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl);
		driver.quit();
	}

}












