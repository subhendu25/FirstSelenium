package com.MMT.pages;

import com.MMT.testbases.TestBase;
import com.MMT.util.TestUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch extends TestBase

{
	
// page repository=OR.properties
	
@FindBy(xpath="//*[@id=\"fromCity\"]")
public WebElement sourcename;

//@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
//public WebElement cityName_field_From_click;

@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
public WebElement cityName_From_values;

@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")
public WebElement citynamefrom;



@FindBy(xpath="//*[@id=\"toCity\"]")
public WebElement destinationname;

//@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")
//public WebElement cityName_field_To_click;

@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/input")
public WebElement cityName_To_values;

@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-1-item-1\"]/div")
public WebElement citynameto;


@FindBy(xpath="//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[1]")
public WebElement flightlogo;

// initialize the page objects

public  FlightSearch() throws IOException

{
	PageFactory.initElements(driver, this);
}
// action need to be performed

public String validateSearchPageTitle()

{
	return driver.getTitle();
}

public boolean ValidateFlightImage()
{
	return flightlogo.isDisplayed();	
}

public void searchfield (String FromCityName, String ToCityName) throws InterruptedException
{
	sourcename.click();
	Thread.sleep(3000);
//	cityName_field_From_click.click();
	cityName_From_values.sendKeys(FromCityName);
	Thread.sleep(3000);
//	citynamefrom.click();
	
	destinationname.click();
	Select ToCity =new Select(cityName_To_values);
	ToCity.selectByVisibleText(ToCityName);
//	cityName_field_To_click.click();
//	cityName_To_values.sendKeys(ToCityName);
//	Thread.sleep(3000);
//	citynameto.click();
	
	
}

}

	

