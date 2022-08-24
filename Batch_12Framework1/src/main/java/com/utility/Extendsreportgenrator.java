package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendsreportgenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
     String		path = "C:\\Users\\dell\\eclipse-workspace\\Batch_12Framework1\\Report";
     ExtentSparkReporter reporter= new ExtentSparkReporter (path);
     reporter.config().setDocumentTitle("Automation Test Report");
     reporter.config().setReportName("Test Batch 12 Report");
     reporter.config().setTheme(Theme.DARK);
     
      extent = new  ExtentReports ();
     extent.attachReporter(reporter);
     extent.setSystemInfo("Project Name" , "The Batch Project");
	 extent.setSystemInfo("O.S", "Windows");	
     extent.setSystemInfo("Tool", "WebDriver");
     extent.setSystemInfo("QA", "ABC");
     return extent;
     
	}

}
