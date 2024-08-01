package extentreportspractise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReportsPrc {
	@Test
	public void demoTest() 
	{
		
		//create an instance for ExtentSparkReporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentreportsprc.html");
		
		//create an instance for ExtentReport
		ExtentReports reports=new ExtentReports();
		
		//attachesparkreporter inside Extentreport
		reports.attachReporter(spark);
		
		//Create an Extenttest instance to log messages
		ExtentTest test = reports.createTest("demoTest");
				
		
		//call ,log method to log messages inside extent report
		test.log(Status.INFO, "added log statements inside extent reports");
		
		//  call flush to write statements inside destination reports
		reports.flush();


		
		
		
		
		
		
		
	}

}
