package com.utility;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;                      //com.utility.Listener
import com.aventstack.extentreports.Status;

public class Listener extends Baseclass implements ITestListener{
	
	ExtentReports extent =Extendsreportgenrator.getReport();
	
	ThreadLocal<ExtentTest>extenttest = new ThreadLocal<ExtentTest>();  

	public void onTestStart(ITestResult result) {
		
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test Case pass");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
	
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test Case fail");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case skip");
	
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

	public static String getScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.BASE64);
	}	
	

}
