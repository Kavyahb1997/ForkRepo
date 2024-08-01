package extentreportspractise;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddSSInExtentReportsprc {


			ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentreportsprc.html");
		
			ExtentReports reports=new ExtentReports();
		

			reports.attachReporter(spark);
			

			ExtentTest test = reports.createTest("demoTest");
					
			

			test.log(Status.INFO, "added log statements inside extent reports");
		


			reports.flush();




	



	
	
	


}
