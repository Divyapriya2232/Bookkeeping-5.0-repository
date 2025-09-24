package com.Capium.TestRunFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Feature_CapiumPurchase\\BK_Reports.feature",

		glue = "com.Capium.ReportstepDefinations", tags = "@Test", plugin = { "pretty",
				"html:target/cucumber-reports/CucumberReport.html", "json:target/cucumber-reports/CucumberReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class Bookkepping_Reports_runnerfile extends AbstractTestNGCucumberTests {

}
