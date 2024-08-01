package extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
	@Test
	public void demoTest()
	{
		//step1:create Extentsparkreporter object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/extentreport.html");
		
		//step2:create ExtentReports OBJECT
		ExtentReports report = new ExtentReports();
		
		//STEP3:Attach spark report inside ExtentReports
		report.attachReporter(spark);
		
		//step4:Create ExtentTestInstace to log messages
		ExtentTest test = report.createTest("demoTest");
		
		//step5:call log()to log messages inside extentt report
		test.log(Status.INFO,"added log statements inside extent reports");
		
		//step6:call flush() to write statements inside destination report
		report.flush();
		

		


	}

}
