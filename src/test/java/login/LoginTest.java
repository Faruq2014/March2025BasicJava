package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	  @Test
	private void doLoginTest() {
		  // there are two parts
		  // find it
		  // do something with it
		//driver.findElement(By.id("email")).sendKeys("hh@tmail.com");
		driver.findElement(By.id("email")).sendKeys("r@bmail.com");	
		driver.findElement(By.id("pass")).sendKeys("gfgfh");
		driver.findElement(By.name("login")).click();
		
	}
		
	
	@AfterMethod
	private void closeApplication() {
      driver.quit();
	}
}
