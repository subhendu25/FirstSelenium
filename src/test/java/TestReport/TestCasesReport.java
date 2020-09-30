package TestReport;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCasesReport {
	
	
	public ExtentTest test;
	public ExtentReports reports;
	public ExtentSparkReporter sparkreports;
	
	@BeforeMethod
	
//	public void initializtion()
//	{
//		reports=new ExtentReports();
//		sparkreports= new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\");
//		test=reports.createTest("TestCasesReport");
//		
//	}
//	@AfterMethod
//	
//	public void quit()
//	
//	{
//		reports.flush();
//	}
	

	
	public void displayReport()
	{	
		reports=new ExtentReports();
		sparkreports= new ExtentSparkReporter(System.getProperty("user.dir")+".\\Reports\\reports.html");
		test=reports.createTest("TestCasesReport");
		sparkreports.config().setReportName("Reportdiplayed");
		sparkreports.config().setDocumentTitle("Hotel Test Execution");
		sparkreports.config().setTheme(Theme.STANDARD);
		sparkreports.config().setEncoding("utf-8");
		reports.attachReporter(sparkreports);
		test.log(Status.INFO,"Starting the Test Case");
		test.log(Status.INFO,"Opening the Browser");
		test.log(Status.PASS,"Test Case got Passed");
		reports.flush();
		
	}
	
	
}
