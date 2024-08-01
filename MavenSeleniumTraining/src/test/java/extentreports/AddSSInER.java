package extentreports;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddSSInER {
	@Test
	
	public void screenshot()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String errorShot = ts.getScreenshotAs(OutputType.BASE64);
		

		//step1:create Extentsparkreporter object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/extentreport2.html");
		
		//step2:create ExtentReport OBJECT
		ExtentReports report = new ExtentReports();
		
		//STEP3:Attach spark report inside ExtentReports
		report.attachReporter(spark);
		
		//step4:Create ExtentTestInstace to log messages
		ExtentTest test = report.createTest("screenshot");
		
		//step5:call log()to log messages inside extentt report
	
		test.addScreenCaptureFromBase64String(errorShot,"errorimage");
		
		//step6:call flush() to write statements inside destination report
		report.flush();
	
		
		
		
		
	}

}
