package com.Capium.TestRunFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(features = "D:\\Bookkeeping_5.0\\Bookkeeping_5.0\\Bookkeeping_5.0\\src\\test\\resources\\Feature_CapiumPurchase\\BK_MTD.feature",

			glue = "com.Capium.ReportstepDefinations", 
			tags = "@MTD", 
			plugin = { "pretty",
					"html:target/cucumber-reports/CucumberReport.html", "json:target/cucumber-reports/CucumberReport.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class Bookkeeping_MTD_runnerfile extends AbstractTestNGCucumberTests {
		
	}
