package com.MMT.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import com.MMT.testdata.*;
import com.MMT.testbases.*;
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

import com.MMT.testdata.Xls_Reader;

import org.testng.annotations.DataProvider;

public class TestUtil extends TestBase
{
	public static long PageLoadTimeout=20;
	public static long implicitwait=20;
		
//	@DataProvider
	public static Object[][] getData(String testName)
	{
		//return test data
		//read the test data from Excel
		
		if (datatable == null)
		{
			datatable= new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\MMT\\config\\Suite.xlsx");
		}
		int row=datatable.getRowCount(testName)-1;
		if(row<=0)
			{
			Object[][] testData = new Object[1][0];
			return testData;
			}
		row=datatable.getRowCount(testName);
		int cols= datatable.getColumnCount(testName);
		
		System.out.println( "Test Name--" +testName);
		System.out.println( "Test row--" +row);
		System.out.println( "Test column--" +cols);
		
		
		
		Object data[][]= new Object[row-1][cols];
		for(int rowNum= 2; rowNum<= row; rowNum++)
		{
			for (int colNum=0; colNum< cols; colNum++)
			{
				
			data[rowNum-2][colNum]=datatable.getCellData(testName, colNum,rowNum);	
		}
		
		}
	return data;
	}
}
