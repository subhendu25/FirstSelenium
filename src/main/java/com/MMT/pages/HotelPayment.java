package com.MMT.pages;

import com.MMT.testbases.TestBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import com.MMT.util.TestUtil; 

public class HotelPayment extends TestBase{
	
	public String FirstName;
	public String LastName;
	public String Emailid;
	public String mobileNumber;
	
	@FindBy(xpath="//*[@id=\"fName\"]")
	public WebElement Fname_sendkeys;
	
	@FindBy(xpath="//*[@id=\"lName\"]")
	public WebElement Lname_sendkeys;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement email_sendkeys;
	
	@FindBy(xpath="//*[@id=\"mNo\"]")
	public WebElement mobile_sendkeys;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div[2]/div/div[2]/div[1]/div/a/div")
	public WebElement paybutton_click;
	
	
	
	public HotelPayment() throws IOException

	{
		PageFactory.initElements(driver, this);
	}
	// action need to be performed



public void payhotel(String FirstName, String LastName,String Emailid, String mobileNumber) throws InterruptedException
	

	//public void payhotel() throws InterruptedException
	{
		
		Fname_sendkeys.click();
		Thread.sleep(3000);
		Fname_sendkeys.sendKeys(FirstName);
		//Fname_sendkeys.sendKeys("ABC");
		Thread.sleep(3000);
		Lname_sendkeys.click();
		Thread.sleep(3000);
		Lname_sendkeys.sendKeys(LastName);
		//Lname_sendkeys.sendKeys("XYX");
		Thread.sleep(3000);
		email_sendkeys.click();
		Thread.sleep(3000);
		email_sendkeys.sendKeys(Emailid);
		//email_sendkeys.sendKeys("123@gmail.com");
		Thread.sleep(3000);
		mobile_sendkeys.click();
		Thread.sleep(3000);
		//mobile_sendkeys.sendKeys("124");
		mobile_sendkeys.sendKeys(mobileNumber);
		paybutton_click.click();
			
	}


}
