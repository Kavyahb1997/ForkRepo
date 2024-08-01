package com.tricentis.basetest;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tricentis.javautility.JavaUtility;

public class BaseClass {
	
	JavaUtility jLib=new JavaUtility();
	@BeforeSuite
	
	public void reportConfig()
	{
		String time=jLib.getTime();
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/extentreport"+time.html");
		ExtentReports report = new ExtentReports ();
		report.attachReporter(spark);
		ExtentTest test = report.createTest("reportConfig");
		test.log(Status.INFO, "----");
		report.flush();
	}
	
	

}
