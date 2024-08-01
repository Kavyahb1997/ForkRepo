package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipkartTest {
	@Test(groups="system")
	public void launch() 
	{


		WebDriver driver = new EdgeDriver();	
	driver.get("https://www.flipkart.com/");
	Reporter.log("Flipkart test executed",true);
	}
	}


