package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HowToOpenEdge {
	
	WebDriver driver;
	
	@Test
	public void openEdge() {
		// how to open a browser
		driver = new EdgeDriver();
		// how to open an application-- using get method-->get()
		driver.get("https://chromewebstore.google.com/");
		
		
	}

}
