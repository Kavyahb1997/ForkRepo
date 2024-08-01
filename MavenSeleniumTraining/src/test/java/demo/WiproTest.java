package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WiproTest {
@Test(groups="smoke")
public void launch() 
{
	WebDriver driver = new EdgeDriver();	
driver.get("https://www.wipro.com/");
Reporter.log("Wipro test executed",true);;
}
}
//https://www.infosys.com/
	//https://www.apple.com/
	//	https://www.flipkart.com/
		