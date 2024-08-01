package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;



import org.testng.annotations.Test;

public class MavenParameter {
	@Test
	
public void receiveData()
	{
		Reporter.log("MavenParameter executed",true);
		
		String url = System.getProperty("url");
		
		System.out.println(url);
		

		WebDriver driver = new ChromeDriver();
				
				
				
	}
}
