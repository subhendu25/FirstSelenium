package com.MMT.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MMT.pages.FlightSearch;
import com.MMT.testbases.TestBase;
import com.MMT.util.TestUtil;

public class FlightSearchPageTest extends TestBase {
	
	FlightSearch FlightSearch;
	
	public FlightSearchPageTest() throws IOException
	
	{
		super();
	}
	
	
@BeforeMethod

public void applicationsetup() throws Exception

{
	Initialize();
	FlightSearch = new FlightSearch();

}
@Test(priority=1)
public void FlightsearchpageTitleTest()
{
String title=FlightSearch.validateSearchPageTitle();
Assert.assertEquals(title, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
driver.manage().timeouts().implicitlyWait(TestUtil.implicitwait, TimeUnit.SECONDS);
}



@Test(priority=2)
public void ValidateFlightImageTest()
{
boolean flag=FlightSearch.ValidateFlightImage();
Assert.assertTrue(flag);
}

@Test(priority=3)
public void searchfieldTest() throws InterruptedException
{
FlightSearch.searchfield(CONFIG.getProperty("sourcecityname"),CONFIG.getProperty("destinationcityname"));
}
//@AfterMethod
//
//public void appplicationkill()
//{
//	driver.quit();
//}

}