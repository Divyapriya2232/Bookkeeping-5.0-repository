package com.Capium.TestRunFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "D:\\Bookkeeping_5.0\\Bookkeeping_5.0\\Bookkeeping_5.0\\src\\test\\resources\\Feature_CapiumPurchase\\BK_Contacts.feature",

glue="com.Capium.stepDefinations" ,
tags = "@Test", 
plugin= {"pretty",
		"html:target/cucumber-reports/CucumberReport.html", "json:target/cucumber-reports/CucumberReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
         )

public class Bookkepping_Contacts_runnerfile extends AbstractTestNGCucumberTests {

}
