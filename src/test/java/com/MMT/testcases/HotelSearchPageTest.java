package com.MMT.testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.HotelBook;
import com.MMT.pages.HotelPayment;
import com.MMT.pages.HotelSearch;
import com.MMT.pages.HotelSelect;
import com.MMT.testbases.TestBase;
import com.MMT.util.TestUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import static com.MMT.testbases.TestBase.APP_LOGS;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import TestReport.*;
//import dataProvider.TestDataProvider;


public class HotelSearchPageTest extends TestBase 

{

Logger APP_LOGS= Logger.getLogger("devpinoyLogger");
HotelSearch hotelsearch;
HotelSelect hotelselect;
HotelBook hotelbook;
HotelPayment hotelpayment;
//public String FirstName;
//public String LastName;
//public String Emailid;
//public String mobileNumber;
TestCasesReport testcasesreport;

	
public HotelSearchPageTest() throws IOException
	
{
	super();
}
	
	
@BeforeMethod

public void setup() throws Exception

{
	Initialize();
	hotelsearch = new HotelSearch();
	hotelselect = new HotelSelect();
	hotelbook = new HotelBook();
	hotelpayment= new HotelPayment();
	testcasesreport=new TestCasesReport();
}


@Test(priority=1)

public void HotelSearchTest() throws InterruptedException
{
	
	APP_LOGS.debug("Initialze the Hotel Search Test Case");
	hotelsearch.findhotel();
	testcasesreport.displayReport();
	Thread.sleep(3000);
	APP_LOGS.debug("Report has been created for the Test Case");
}


@Test(priority=2)
public void hotelklickinternational() throws InterruptedException
{

APP_LOGS.debug("Initialze the Hotel Select Test Case");
hotelselect.selecthotel();
Thread.sleep(3000);
}

@Test(priority=3)
public void bookhotel() throws InterruptedException
{

APP_LOGS.debug("Initialze the Hotel Booking Test Case");
hotelbook.bookhotel();
}

@DataProvider
public static Object[][] dataSupplier()
{
	Object [][] testData= TestUtil.getData("paythehotel");
	return testData;
}

@Test(priority=4,dataProviderClass=HotelSearchPageTest.class,dataProvider="dataSupplier")
//@Test(priority=4)
public void paythehotel(String FirstName, String LastName,String Emailid, String mobileNumber) throws InterruptedException
{
APP_LOGS.debug("Initialze the Hotel Payment Test Case");
hotelpayment.payhotel(FirstName, LastName, Emailid, mobileNumber);
}
}

