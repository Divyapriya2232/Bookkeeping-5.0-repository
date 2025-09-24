package com.Capium.TestRunFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="D:\\Bookkeeping_5.0\\Bookkeeping_5.0\\Bookkeeping_5.0\\src\\test\\resources\\Feature_CapiumPurchase\\Capiumlogin.feature",
glue="com.Capium.stepDefinations" ,
plugin= {"pretty",
		"html:target/cucumber-reports/CucumberReport.html", "json:target/cucumber-reports/CucumberReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
