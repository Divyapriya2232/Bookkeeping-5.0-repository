package com.Capium.Actions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_Reports_Locators;
import com.Capium.Utilites.HelperClass;
import com.Capium.stepDefinations.Hooks;

public class Bookkeeping_Reports_Actions {
	
	Bookkeeping_Reports_Locators Reports = null;
	   WebDriverWait wait=HelperClass.getWait();
	   WebDriver driver=HelperClass.getDriver();
	
public Bookkeeping_Reports_Actions() {
		this.Reports = new Bookkeeping_Reports_Locators();
		PageFactory.initElements(driver, Reports);
	}
	
	   JavascriptExecutor js = (JavascriptExecutor) driver;

public void reportstab() throws InterruptedException {
	
	HelperClass.waitForPageToLoad(driver);
	HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']"));
	Thread.sleep(2000);
	HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']"), "BK Automation");
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("(//a[normalize-space(text())='Reports'])[2]"));
	   Thread.sleep(1000);
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Report Dashboard']"))
				.isDisplayed());
	   System.out.println("Report Dashboard verified");
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Financials']"))
				.isDisplayed());
	   System.out.println("Financials verified");
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Additional']"))
				.isDisplayed());
	   System.out.println("Additional verified");
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customer']"))
				.isDisplayed());
	   System.out.println("Customer verified");
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Supplier']"))
				.isDisplayed());
	   System.out.println("Supplier verified");
}
public void reportdashboardtab(){
	
	   HelperClass.waitForPageToLoad(driver);
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
	   String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='All Reports']"));
	   String expected = "All Reports";
		try {
			 if (actualtext.equals(expected)) {
			      System.out.println("All Reports verified");
			  } else {
			      System.out.println("All Reports not verified");
			          }
			  } catch (Exception e) {
			      System.out.println("An error occurred while verifying All Reports: " + e.getMessage());
			  } 
}
public void allreportsinreportdashboard(){
	
	    HelperClass.waitForPageToLoad(driver);
	    HelperClass.clickUsingJS(Reports.profitandlosstab);
	    String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Profit & Loss']"));
		String expected = "Profit & Loss";
	     try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Profit & Loss verified");
			  } else {
				   System.out.println("Profit & Loss not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying Profit & Loss screen: " + e.getMessage());
			  } 
	    Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Profit & Loss");
	    HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Balance Sheet']"));
		String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Balance Sheet']"));
	    String expected1 = "Balance Sheet";
		 try {
			 if (actualtext1.equals(expected1)) {
				   System.out.println("Balance Sheet verified");
		     } else {
				   System.out.println("Balance Sheet not verified");
					}
			 } catch (Exception e) {
					   System.out.println("An error occurred while verifying Balance Sheet screen: " + e.getMessage());
		     }
		 Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Balance Sheet");
		 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
		 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Trial Balance']"));
		 String actualtext2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Trial Balance']"));
		 String expected2 = "Trial Balance";
		  try {
			  if (actualtext2.equals(expected2)) {
					System.out.println("Trial Balance verified");
			  } else {
					System.out.println("Trial Balance not verified");
					 }
			  } catch (Exception e) {
				    System.out.println("An error occurred while verifying Trial Balance screen: " + e.getMessage());
			  }
		 Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Trial Balance");
		 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
		 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Comparative Report']"));
		 String actualtext3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Comparative Report']"));
	     String expected3 = "Comparative Report";
		  try {
			  if (actualtext3.equals(expected3)) {
					System.out.println("Comparative Report verified");
			  } else {
				    System.out.println("Comparative Report not verified");
			         }
			  } catch (Exception e) {
				    System.out.println("An error occurred while verifying Comparative Report screen: " + e.getMessage());
			  }
		  Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Comparative Report");
		  HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
		  HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Day-Book']"));
	      String actualtext4 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Day-Book']"));
		  String expected4 = "Day-Book";
		   try {
			   if (actualtext4.equals(expected4)) {
			         System.out.println("Day-Book verified");
			   } else {
					 System.out.println("Day-Book not verified");
				      }
			   } catch (Exception e) {
					 System.out.println("An error occurred while verifying Day-Book screen: " + e.getMessage());
			   }
		   Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Day-Book");
		   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
		   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cash Flow']"));
		   String actualtext5 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Cash Flow']"));
		   String expected5 = "Cash Flow";
			try {
				if (actualtext5.equals(expected5)) {
				      System.out.println("Cash Flow verified");
				} else {
					  System.out.println("Cash Flow not verified");
					   }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying Cash Flow screen: " + e.getMessage());
				}
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Cash Flow");
			HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Account Details']"));
			String actualtext6 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Account Details']"));
			String expected6 = "Account Details";
			 try {
			     if (actualtext6.equals(expected6)) {
					   System.out.println("Account Details verified");
			     } else {
					   System.out.println("Account Details not verified");
						}
			     } catch (Exception e) {
					   System.out.println("An error occurred while verifying Account Details screen: " + e.getMessage());
			     }
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Account Details");
			HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Nominal Ledger']"));
		    String actualtext7 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Nominal Ledger']"));
		    String expected7 = "Nominal Ledger";
			 try {
				  if (actualtext7.equals(expected7)) {
						System.out.println("Nominal Ledger verified");
				  } else {
						System.out.println("Nominal Ledger not verified");
					     }
				  } catch (Exception e) {
						System.out.println("An error occurred while verifying Nominal Ledger screen: " + e.getMessage());
				  }
			 Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Nominal Ledger");
			 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
			 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Business Snapshot']"));
			 String actualtext8 = HelperClass.getText(By.xpath("//h3[normalize-space(text())='Income']"));
			 String expected8 = "Income";
			  try {
				  if (actualtext8.equals(expected8)) {
					    System.out.println("Business Snapshot verified");
				  } else {
					    System.out.println("Business Snapshot not verified");
						 }
				  } catch (Exception e) {
					    System.out.println("An error occurred while verifying Business Snapshot screen: " + e.getMessage());
				  }
			  Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Income");
			  HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
			  HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Account List']"));
			  String actualtext9 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Account List']"));
			  String expected9 = "Account List";
			   try {
				   if (actualtext9.equals(expected9)) {
						 System.out.println("Account List verified");
				   } else {
						 System.out.println("Account List not verified");
						   }
				   } catch (Exception e) {
						 System.out.println("An error occurred while verifying Account List screen: " + e.getMessage());
				   }
			    Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Account List");
				HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
				HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales Performance']"));
				String actualtext10 = HelperClass.getText(By.xpath("//p[contains(text(),'Sales Performance')]"));
			    String expected10 = "Sales Performance";
			    try {
					  if (actualtext10.contains(expected10)) {
						   System.out.println("Sales Performance verified");
					  } else {
						   System.out.println("Sales Performance not verified");
						      }
					  } catch (Exception e) {
						   System.out.println("An error occurred while verifying Sales Performance screen: " + e.getMessage());
					  }
			    Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Sales Performance");
			    HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
			    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Expenses Performance']"));
			    String actualtext11 = HelperClass.getText(By.xpath("//p[contains(text(),'Expense Performance')]"));
			    String expected11 = "Expense Performance";
				 try {
					 if (actualtext11.contains(expected11)) {
						   System.out.println("Expense Performance verified");
					 } else {
						   System.out.println("Expense Performance not verified");
						     }
					 } catch (Exception e) {
						   System.out.println("An error occurred while verifying Expense Performance screen: " + e.getMessage());
					 }
				Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Expense Performance");
				HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
				HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Transaction List By Date']"));
				String actualtext12 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Transaction List By Date']"));
				String expected12 = "Transaction List By Date";
				 try {
				     if (actualtext12.equals(expected12)) {
						   System.out.println("Transaction List By Date verified");
					 } else {
						   System.out.println("Transaction List By Date not verified");
							}
					 } catch (Exception e) {
						   System.out.println("An error occurred while verifying Transaction List By Date screen: " + e.getMessage());
					 }
				 Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Transaction List By Date");
				 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
				 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Recent Transactions']"));
				 String actualtext13 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Recent Transactions']"));
				 String expected13 = "Recent Transactions";
				  try {
					   if (actualtext13.equals(expected13)) {
							 System.out.println("Recent Transactions verified");
					   } else {
							 System.out.println("Recent Transactions not verified");
							  }
					   } catch (Exception e) {
							 System.out.println("An error occurred while verifying Recent Transactions screen: " + e.getMessage());
					   }
				  Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Recent Transactions");
				  HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
				  HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Balance Sheet Comparison']"));
				  String actualtext14 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Balance Sheet Comparison']"));
				  String expected14 = "Balance Sheet Comparison";
				   try {
					   if (actualtext14.equals(expected14)) {
							 System.out.println("Balance Sheet Comparison verified");
					   } else {
							 System.out.println("Balance Sheet Comparison not verified");
							  }
					   } catch (Exception e) {
							 System.out.println("An error occurred while verifying Balance Sheet Comparison screen: " + e.getMessage());
					   }
				   Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Balance Sheet Comparison");
				   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
				   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Balance Sheet Detail']"));
				   String actualtext15 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Balance Sheet Detail']"));
				   String expected15 = "Balance Sheet Detail";
					try {
						 if (actualtext15.equals(expected15)) {
						       System.out.println("Balance Sheet Detail verified");
						 } else {
							   System.out.println("Balance Sheet Detail not verified");
								 }
						 } catch (Exception e) {
							   System.out.println("An error occurred while verifying Balance Sheet Detail screen: " + e.getMessage());
						 }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Balance Sheet Detail");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Custom Report']"));
					String actualtext16 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Custom Report']"));
					String expected16 = "Custom Report";
				     try {
						 if (actualtext16.equals(expected16)) {
							   System.out.println("Custom Report verified");
						 } else {
							   System.out.println("Custom Report not verified");
								}
						 } catch (Exception e) {
							   System.out.println("An error occurred while verifying Custom Report screen: " + e.getMessage());
						 }
				    Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Custom Report");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Advance Report'])[1]"));
					String actualtext17 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Advance Report']"));
					String expected17 = "Advance Report";
				     try {
						  if (actualtext17.equals(expected17)) {
							    System.out.println("Advance Report verified");
						  } else {
								System.out.println("Advance Report not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Advance Report screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Advance Report");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales Report']"));
					String actualtext18 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales Report']"));
					String expected18 = "Sales Report";
				     try {
						  if (actualtext18.equals(expected18)) {
							    System.out.println("Sales Report verified");
						  } else {
								System.out.println("Sales Report not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Sales Report screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Sales Report");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Customer List']"));
					String actualtext19 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer List']"));
					String expected19 = "Customer List";
				     try {
						  if (actualtext19.equals(expected19)) {
							    System.out.println("Customer List verified");
						  } else {
								System.out.println("Customer List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Customer List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Customer List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Customer Ageing List']"));
					String actualtext20 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Ageing List']"));
					String expected20 = "Customer Ageing List";
				     try {
						  if (actualtext20.equals(expected20)) {
							    System.out.println("Customer Ageing List verified");
						  } else {
								System.out.println("Customer Ageing List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Customer Ageing List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Customer Ageing List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Transactions By Customer']"));
					String actualtext21 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Transactions By Customer']"));
					String expected21 = "Transactions By Customer";
				     try {
						  if (actualtext21.equals(expected21)) {
							    System.out.println("Transactions By Customer verified");
						  } else {
								System.out.println("Transactions By Customer not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Transactions By Customer screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Transactions By Customer");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales Product List']"));
					String actualtext22 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales Product List']"));
					String expected22 = "Sales Product List";
				     try {
						  if (actualtext22.equals(expected22)) {
							    System.out.println("Sales Product List verified");
						  } else {
								System.out.println("Sales Product List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Sales Product List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Sales Product List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Customer Receipts']"));
					String actualtext23 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Receipts']"));
					String expected23 = "Customer Receipts";
				     try {
						  if (actualtext23.equals(expected23)) {
							    System.out.println("Customer Receipts verified");
						  } else {
								System.out.println("Customer Receipts not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Customer Receipts screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Customer Receipts");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
				    HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), Reports.Debtorsinreportdashboard);
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Debtors']"));
					String actualtext24 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Debtors']"));
					String expected24 = "Debtors";
				     try {
						  if (actualtext24.equals(expected24)) {
							    System.out.println("Debtors verified");
						  } else {
								System.out.println("Debtors not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Debtors screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Debtors");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Customer Statement']"));
					String actualtext25 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Statement']"));
					String expected25 = "Customer Statement";
				     try {
						  if (actualtext25.equals(expected25)) {
							    System.out.println("Customer Statement verified");
						  } else {
								System.out.println("Customer Statement not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Customer Statement screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Customer Statement");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales Invoice List']"));
					String actualtext26 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales Invoice List']"));
					String expected26 = "Sales Invoice List";
				     try {
						  if (actualtext26.equals(expected26)) {
							    System.out.println("Sales Invoice List verified");
						  } else {
								System.out.println("Sales Invoice List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Sales Invoice List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Sales Invoice List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Open Invoice']"));
					String actualtext27 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Open Invoice']"));
					String expected27 = "Open Invoice";
				     try {
						  if (actualtext27.equals(expected27)) {
							    System.out.println("Open Invoice verified");
						  } else {
								System.out.println("Open Invoice not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Open Invoice screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Open Invoice");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Income by Customer Summary']"));
					String actualtext28 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Income by Customer Summary']"));
					String expected28 = "Income by Customer Summary";
				     try {
						  if (actualtext28.equals(expected28)) {
							    System.out.println("Income by Customer Summary verified");
						  } else {
								System.out.println("Income by Customer Summary not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Income by Customer Summary screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Income by Customer Summary");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Customer Balance Summary']"));
					String actualtext29 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Balance Summary']"));
					String expected29 = "Customer Balance Summary";
				     try {
						  if (actualtext29.equals(expected29)) {
							    System.out.println("Customer Balance Summary verified");
						  } else {
								System.out.println("Customer Balance Summary not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Customer Balance Summary screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Customer Balance Summary");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Deposit Details']"));
					String actualtext30 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Deposit Details']"));
					String expected30 = "Deposit Details";
				     try {
						  if (actualtext30.equals(expected30)) {
							    System.out.println("Deposit Details verified");
						  } else {
								System.out.println("Deposit Details not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Deposit Details screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Deposit Details");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Advance Ageing List']"));
					String actualtext31 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Advance Ageing List']"));
					String expected31 = "Advance Ageing List";
				     try {
						  if (actualtext31.equals(expected31)) {
							    System.out.println("Advance Ageing List verified");
						  } else {
								System.out.println("Advance Ageing List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Advance Ageing List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Advance Ageing List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Quotation By Customer']"));
					String actualtext32 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Quotation By Customer']"));
					String expected32 = "Quotation By Customer";
				     try {
						  if (actualtext32.equals(expected32)) {
							    System.out.println("Quotation By Customer verified");
						  } else {
								System.out.println("Quotation By Customer not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Quotation By Customer screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Quotation By Customer");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Invoice and Received Payments']"));
					String actualtext33 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Invoice and Received Payments']"));
					String expected33 = "Invoice and Received Payments";
				     try {
						  if (actualtext33.equals(expected33)) {
							    System.out.println("Invoice and Received Payments verified");
						  } else {
								System.out.println("Invoice and Received Payments not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Invoice and Received Payments screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Invoice and Received Payments");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales by Product/Service Detail']"));
					String actualtext34 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales by Product/Service Detail']"));
					String expected34 = "Sales by Product/Service Detail";
				     try {
						  if (actualtext34.equals(expected34)) {
							    System.out.println("Sales by Product/Service Detail verified");
						  } else {
								System.out.println("Sales by Product/Service Detail not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Sales by Product/Service Detail screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Sales by Product/Service Detail");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales by Product/Service Summary']"));
					String actualtext35 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales by Product/Service Summary']"));
					String expected35 = "Sales by Product/Service Summary";
				     try {
						  if (actualtext35.equals(expected35)) {
							    System.out.println("Sales by Product/Service Summary verified");
						  } else {
								System.out.println("Sales by Product/Service Summary not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Sales by Product/Service Summary screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Sales by Product/Service Summary");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Advance Report'])[2]"));
					String actualtext36 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Advance Report']"));
					String expected36 = "Advance Report";
				     try {
						  if (actualtext36.equals(expected36)) {
							    System.out.println("Advance Report verified");
						  } else {
								System.out.println("Advance Report not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Advance Report screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Advance Report");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Purchases Report']"));
					String actualtext37 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Purchases Report']"));
					String expected37 = "Purchases Report";
				     try {
						  if (actualtext37.equals(expected37)) {
							    System.out.println("Purchases Report verified");
						  } else {
								System.out.println("Purchases Report not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Purchases Report screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Purchases Report");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Supplier List']"));
					String actualtext38 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier List']"));
					String expected38 = "Supplier List";
				     try {
						  if (actualtext38.equals(expected38)) {
							    System.out.println("Supplier List verified");
						  } else {
								System.out.println("Supplier List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Supplier List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Supplier List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Supplier Ageing List']"));
					String actualtext39 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier Ageing List']"));
					String expected39 = "Supplier Ageing List";
				     try {
						  if (actualtext39.equals(expected39)) {
							    System.out.println("Supplier Ageing List verified");
						  } else {
								System.out.println("Supplier Ageing List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Supplier Ageing List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Supplier Ageing List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Transactions By Supplier']"));
					String actualtext40 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Transactions By Supplier']"));
					String expected40 = "Transactions By Supplier";
				     try {
						  if (actualtext40.equals(expected40)) {
							    System.out.println("Transactions By Supplier verified");
						  } else {
								System.out.println("Transactions By Supplier not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Transactions By Supplier screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Transactions By Supplier");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Payment To Supplier']"));
					String actualtext41 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Payment To Supplier']"));
					String expected41 = "Payment To Supplier";
				     try {
						  if (actualtext41.equals(expected41)) {
							    System.out.println("Payment To Supplier verified");
						  } else {
								System.out.println("Payment To Supplier not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Payment To Supplier screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Payment To Supplier");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Creditors']"));
					String actualtext42 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Creditors']"));
					String expected42 = "Creditors";
				     try {
						  if (actualtext42.equals(expected42)) {
							    System.out.println("Creditors verified");
						  } else {
								System.out.println("Creditors not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Creditors screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Creditors");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Supplier Statement']"));
					String actualtext43 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier Statement']"));
					String expected43= "Supplier Statement";
				     try {
						  if (actualtext43.equals(expected43)) {
							    System.out.println("Supplier Statement verified");
						  } else {
								System.out.println("Supplier Statement not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Supplier Statement screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Supplier Statement");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Purchases Invoice List']"));
					String actualtext44 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Purchases Invoice List']"));
					String expected44 = "Purchases Invoice List";
				     try {
						  if (actualtext44.equals(expected44)) {
							    System.out.println("Purchases Invoice List verified");
						  } else {
								System.out.println("Purchases Invoice List not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Purchases Invoice List screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Purchases Invoice List");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Unpaid Purchases']"));
					String actualtext45 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Unpaid Purchases']"));
					String expected45 = "Unpaid Purchases";
				     try {
						  if (actualtext45.equals(expected45)) {
							    System.out.println("Unpaid Purchases verified");
						  } else {
								System.out.println("Unpaid Purchases not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Unpaid Purchases screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Unpaid Purchases");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Expenses by Supplier Summary']"));
					String actualtext46 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Expenses by Supplier Summary']"));
					String expected46 = "Expenses by Supplier Summary";
				     try {
						  if (actualtext46.equals(expected46)) {
							    System.out.println("Expenses by Supplier Summary verified");
						  } else {
								System.out.println("Expenses by Supplier Summary not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Expenses by Supplier Summary screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Expenses by Supplier Summary");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Supplier Balance Summary']"));
					String actualtext47 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier Balance Summary']"));
					String expected47 = "Supplier Balance Summary";
				     try {
						  if (actualtext47.equals(expected47)) {
							    System.out.println("Supplier Balance Summary verified");
						  } else {
								System.out.println("Supplier Balance Summary not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Supplier Balance Summary screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Supplier Balance Summary");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Account Payable Ageing list']"));
					String actualtext48 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Account Payable Ageing list']"));
					String expected48 = "Account Payable Ageing list";
				     try {
						  if (actualtext48.equals(expected48)) {
							    System.out.println("Account Payable Ageing list verified");
						  } else {
								System.out.println("Account Payable Ageing list not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Account Payable Ageing list screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Account Payable Ageing list");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cheque Detail']"));
					String actualtext49 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Cheque Detail']"));
					String expected49 = "Cheque Detail";
				     try {
						  if (actualtext49.equals(expected49)) {
							    System.out.println("Cheque Detail verified");
						  } else {
								System.out.println("Cheque Detail not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Cheque Detail screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Cheque Detail");
					HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Report Dashboard']"));
					HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Purchase and Applied Payments']"));
					String actualtext50 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Purchase and Applied Payments']"));
					String expected50 = "Purchase and Applied Payments";
				     try {
						  if (actualtext50.equals(expected50)) {
							    System.out.println("Purchase and Applied Payments verified");
						  } else {
								System.out.println("Purchase and Applied Payments not verified");
								  }
						  } catch (Exception e) {
								System.out.println("An error occurred while verifying Purchase and Applied Payments screen: " + e.getMessage());
						  }
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Purchase and Applied Payments");
}
public void validatefinancialtab(){
	
	HelperClass.waitForPageToLoad(driver);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
	assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Profit & Loss']"))
			.isDisplayed());
   System.out.println("Profit & Loss verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Balance Sheet']"))
			.isDisplayed());
   System.out.println("Balance Sheet verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Trial Balance']"))
			.isDisplayed());
   System.out.println("Trial Balance verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Comparative Report']"))
			.isDisplayed());
   System.out.println("Comparative Report verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Day-Book']"))
			.isDisplayed());
   System.out.println("Day-Book Report verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Cash Flow']"))
			.isDisplayed());
   System.out.println("Cash Flow Report verified");
}

public void validateprofitandlosstab() throws IOException{
	
	HelperClass.waitForPageToLoad(driver);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Profit & Loss']"));
    String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Profit & Loss']"));
	String expected = "Profit & Loss";
    try {
		  if (actualtext.equals(expected)) {
			   System.out.println("Profit & Loss verified");
		  } else {
			   System.out.println("Profit & Loss not verified");
			      }
		  } catch (Exception e) {
			   System.out.println("An error occurred while verifying Profit & Loss screen: " + e.getMessage());	
	HelperClass.waitUntilVisible(By.xpath("//div[contains(@class,'arrow')]/div"));
	HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
}
public void profitandlossactions() throws InterruptedException {
   
	HelperClass.waitForPageToLoad(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
   String expected = "Share";
   try {
		  if (actualtext.equals(expected)) {
			   System.out.println("Mail pop up displayed");
		  } else {
			   System.out.println("Mail pop up not displayed");
			      }
		  } catch (Exception e) {
			   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
		  }
//   Thread.sleep(1000);
   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
//   Thread.sleep(1000);
   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Profit & Loss Report");
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
   Thread.sleep(5000);
   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
   String expected1 = "Mail sent successfully!";
   try {
		if (actualtext1.equals(expected1)) {
			  System.out.println("Mail sent successfully!");
	    } else {
			  System.out.println("Mail not sent");
	           }
		} catch (Exception e) {
			  System.out.println("An error occurred while verifying mail: " + e.getMessage());
		}
//   Thread.sleep(1000);
   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
   Thread.sleep(1000);
   try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
	    {
	        System.out.println("Element is still present");
	    } else {
	        System.out.println("Element is removed");
	           }
	    } catch (Exception e) {
	        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
	    }
   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
//   Thread.sleep(4000);
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountinprofitandloss() throws InterruptedException {
	
	HelperClass.waitForPageToLoad(driver);
	By spinner = By.cssSelector(".ngx-spinner-overlay");
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	WebElement accountinprofitandloss = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String Asset = accountinprofitandloss.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified" +actualtext);
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Profit & Loss']"));
	   HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[6]/td[1]//a"));
	   Thread.sleep(2000);
	   WebElement accountinprofitandloss1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
		String Asset1 = accountinprofitandloss1.getText().trim();
		String Account1 = Asset1;
		System.out.println("Account1: " + Asset1);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
		String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified" +actualtext1);
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
}
public void validatebalancesheettab() throws IOException {
	
	HelperClass.waitForPageToLoad(driver);
   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
   Reports.balancesheettab.click();
   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space()='Balance Sheet']"));
   String expected1 = "Balance Sheet";
   try {
		if (actualtext1.equals(expected1)) {
			  System.out.println("Balance Sheet verified");
	    } else {
			  System.out.println("Balance Sheet not verified");
	           }
		} catch (Exception e) {
			  System.out.println("An error occurred while verifying balance sheet screen: " + e.getMessage());
		}
   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected1);
}
public void balancesheetactions() throws InterruptedException {
	
	HelperClass.waitForPageToLoad(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
	   Reports.balancesheetactions.click();
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Balance Sheet Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountinbalancesheet() throws InterruptedException {
	
	HelperClass.waitForPageToLoad(driver);
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet']"));
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[1]//a"));
	WebElement accountinbalancesheet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = accountinbalancesheet.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified"+actualtext);
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet']"));
	   HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[6]/td[1]//a"));
	   Thread.sleep(2000);
	   WebElement accountinbalancesheet1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
		String Asset1 = accountinbalancesheet1.getText().trim();
		String Account1 = Asset1;
		System.out.println("Account1: " + Asset1);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
		String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified" +actualtext1);
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
		   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet']"));
		   HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[10]/td[1]//a"));
		   Thread.sleep(2000);
		   WebElement accountinbalancesheet2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
			String Asset2 = accountinbalancesheet2.getText().trim();
			String Account2 = Asset2;
			System.out.println("Account2: " + Asset2);
			Thread.sleep(1000);
			HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
			Thread.sleep(2000);
			String actualtext2 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
			   String expected2 =Asset2;
			   try {
					if (actualtext2.equals(expected2)) {
						  System.out.println("Account verified");
				    } else {
						  System.out.println("Account not verified" +actualtext2);
				           }
					} catch (Exception e) {
						  System.out.println("An error occurred while verifying account: " + e.getMessage());
					}
	   
}
public void validatetrialbalancetab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Trial Balance']"));
	   String expected1 = "Trial Balance";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Trial Balance verified");
		    } else {
				  System.out.println("Trial Balance not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Trial Balance screen: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected1);
}
public void trialbalanceactions() throws InterruptedException {
	   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	   Reports.trialbalancetab.click();
//	   Thread.sleep(5000);
	   Reports.trialbalanceactions.click();
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "TrialBalance Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountintrialbalance() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	Thread.sleep(2000);
	WebElement accountintrialbalance = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String Asset = accountintrialbalance.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified"+actualtext);
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
    HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[2]//a"));
    Thread.sleep(2000);
	WebElement accountintrialbalance1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset1 = accountintrialbalance1.getText().trim();
	String Accounts1 = Asset1;
	System.out.println("Accounts1: " + Asset1);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
	   String expected1 =Asset1;
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified"+actualtext1);
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
	 Thread.sleep(1000);
	 HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[2]//a"));
	 Thread.sleep(1000);
     WebElement accountintrialbalance2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[6]//span")));
     String Asset2 = accountintrialbalance2.getText().trim();
     String Accounts2 = Asset2;
     System.out.println("Accounts2: " + Asset2);
     HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
     Thread.sleep(2000);
	 String actualtext2 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	 String expected2 =Asset2;
		try {
			if (actualtext2.equals(expected2)) {
				  System.out.println("Accounts verified");
			 } else {
				  System.out.println("Accounts not verified"+actualtext2);
			         }
			 } catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			 }
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
     HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[2]//a"));
     Thread.sleep(1000);
	 WebElement accountintrialbalance3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
     String Asset3 = accountintrialbalance3.getText().trim();
	 String Accounts3 = Asset3;
	 System.out.println("Accounts3: " + Asset3);
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
	 Thread.sleep(1000);
	 String actualtext3 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	 String expected3 =Asset3;
	    try {
		    if (actualtext3.equals(expected3)) {
				  System.out.println("Accounts verified");
			} else {
				  System.out.println("Accounts not verified"+actualtext3);
				    }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
	 Thread.sleep(1000);
     HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[2]//a"));
     Thread.sleep(1000);
	 WebElement accountintrialbalance4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span")));
	 String Asset4 = accountintrialbalance4.getText().trim();
     String Accounts4 = Asset4;
	 System.out.println("Accounts4: " + Asset4);
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	 String actualtext4 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
	 String expected4 =Asset4;
	 try {
		if (actualtext4.equals(expected4)) {
			  System.out.println("Accounts verified");
		 } else {
			  System.out.println("Accounts not verified"+actualtext4);
				}
		 }catch (Exception e) {
			  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
				}
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
	 HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[4]/td[2]//a"));
	 Thread.sleep(1000);
	 WebElement accountintrialbalance5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	 String Asset5 = accountintrialbalance5.getText().trim();
	 String Accounts5 = Asset5;
	 System.out.println("Accounts5: " + Asset5);
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
	 String actualtext5 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	 String expected5 =Asset5;
     try {
	     if (actualtext5.equals(expected5)) {
				System.out.println("Accounts verified");
	      } else {
				System.out.println("Accounts not verified"+actualtext5);
	             }
		  } catch (Exception e) {
				System.out.println("An error occurred while verifying accounts: " + e.getMessage());
		  }
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Trial Balance']"));
     HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[4]/td[2]//a"));
     Thread.sleep(1000);
	 WebElement accountintrialbalance6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[6]//span")));
	 String Asset6 = accountintrialbalance6.getText().trim();
	 String Accounts6 = Asset6;
	 System.out.println("Accounts6: " + Asset6);
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
	 Thread.sleep(2000);
	 String actualtext6 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	 String expected6 =Asset6;
	 try {
		 if (actualtext6.equals(expected6)) {
			  System.out.println("Accounts verified");
		 } else {
			  System.out.println("Accounts not verified"+actualtext6);
				}
		 } catch (Exception e) {
			  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
		 }
}
public void validatecomparativereporttab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
	   Reports.comparativereporttab.click();
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Comparative Report']"));
	   String expected1 = "Comparative Report";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Comparative Report verified");
		    } else {
				  System.out.println("Comparative Report not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Comparative Report screen: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[1]"), By.xpath("(//div[normalize-space(text())='Trial Balance'])[2]"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[2]"), By.xpath("//div[normalize-space(text())='Monthly']//parent::span"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[3]"), By.xpath("//div[@role='option']"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[1]"), By.xpath("//div[normalize-space(text())='Profit & Loss']"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[2]"), By.xpath("//div[normalize-space(text())='Quarterly']//parent::span"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[3]"), By.xpath("//div[@role='option']"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[1]"), By.xpath("//div[normalize-space(text())='Balance Sheet']"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[2]"), By.xpath("//div[normalize-space(text())='Custom']//parent::span"), null, expected1);
	   String actualtext2 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Select Time Period']"));
	   String expected2 = "Select Time Period";
	   try {
			if (actualtext2.equals(expected2)) {
				  System.out.println("Select Time Period verified");
		    } else {
				  System.out.println("Select Time Period not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Select Time Period screen:");
			}
       HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Add new period']"));
       HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='delete_outline'])[1]"));
       HelperClass.clickUsingJS(By.xpath(" //span[normalize-space(text())='Generate']"));
       Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Custom");
}
public void comparativereportactions() throws InterruptedException, IOException {
	   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Comparative Report']"));
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[1]"), By.xpath("(//div[normalize-space(text())='Trial Balance'])[2]"), null, null);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[2]"), By.xpath("//div[normalize-space(text())='Monthly']//parent::span"), null, null);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//input[@aria-autocomplete='list'])[3]"), By.xpath("//div[@role='option']"), null, null);
	   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Comparative Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void validatedaybooktab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
	   Reports.daybooktab.click();
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Day-Book']"));
	   String expected1 = "Day-Book";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Day-Book verified");
		    } else {
				  System.out.println("Day-Book not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Day-Book screen: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//span[normalize-space(text())='All Years']"), null, expected1);
	   HelperClass.selectAllDropdownOptions(By.xpath("//input[@aria-autocomplete='list']"), By.xpath("(//span[normalize-space(text())='All'])[2]"), null, expected1);
}
public void searchindaybook() {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	Reports.daybooktab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")));
	String REF = Referencenumber.getText().trim();
	String Number = REF;
	System.out.println("Number: " + REF);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), REF);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")).trim();
	String expected = REF;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void daybookactions() throws InterruptedException {
	   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	Reports.daybooktab.click();
//	   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "DayBook Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountsindaybook() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	HelperClass.clickUsingJS(Reports.daybooktab);
	WebElement accountsindaybook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = accountsindaybook.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span")).trim();
	String expected = Asset;
	if (actualText.equals(expected)) {
		System.out.println("Account verified");
	} else {
		System.out.println("Account not verified" + actualText);
	}
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Day-Book']"));
	Thread.sleep(1000);
	WebElement accountsindaybook1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[6]//span")));
	String Asset1 = accountsindaybook1.getText().trim();
	String Account1 = Asset1;
	System.out.println("Account1: " + Asset1);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualText1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span")).trim();
	String expected1 = Asset1;
	if (actualText1.equals(expected1)) {
		System.out.println("Account verified");
	} else {
		System.out.println("Account not verified" + actualText1);
	}
	
}
public void daybookreferencenumberandcontact() throws InterruptedException {
	 
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
	Reports.daybooktab.click();
	  WebElement daybookreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")));
		String referencenumber = daybookreferencenumber.getText().trim();
		String RF = referencenumber;
		System.out.println("RF: " + referencenumber);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
		String expected1 = referencenumber;
		if (actualText1.equals(expected1)) {
			System.out.println("Reference number verified");
		} else {
			System.out.println("Reference number not verified" + actualText1);
		}
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		Thread.sleep(1000);
		WebElement daybookcontact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")));
		String contact = daybookcontact.getText().trim();
		String C = contact;
		System.out.println("C: " + contact);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a"));
		String actualText2 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected2 = contact;
		if (actualText2.equals(expected2)) {
			System.out.println("Contact verified");
		} else {
			System.out.println("Contact not verified" + actualText2);
		}
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void daybookpagination() throws Exception {
	

	HelperClass.validateDropdownRecordCount(driver);
}
public void daybooknextbutton() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	Reports.daybooktab.click();
//	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void daybookpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatecashflowtab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
	   Reports.cashflowtab.click();
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Cash Flow']"));
	   String expected1 = "Cash Flow";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Cash Flow verified");
		    } else {
				  System.out.println("Cash Flow not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Cash Flow screen: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected1);
}
public void cashflowactions() throws InterruptedException, IOException {
	  
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Financials']"));
//	   Reports.cashflowtab.click();
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, null);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Cash Flow");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
}
public void validateadditionaltab(){

	Reports.additionaltab.click();
	assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Account Details']"))
			.isDisplayed());
   System.out.println("Account Details verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Nominal Ledger']"))
			.isDisplayed());
   System.out.println("Nominal Ledger verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Business Snapshot']"))
			.isDisplayed());
   System.out.println("Business Snapshot verified");
   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Account List']"))
			.isDisplayed());
   System.out.println("Account List verified");
}
public void validateaccountdetailstab() throws IOException, InterruptedException {
	
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account Details']"));
	   String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Account Details']"));
		String expected = "Account Details";
	    try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Account Details verified");
			  } else {
				   System.out.println("Account Details not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying Account Details screen: " + e.getMessage());
			  }
		HelperClass.selectAllDropdownOptions(By.xpath("//div[@aria-haspopup='listbox']"), By.xpath("//span[normalize-space(text())='1010 - Sales']"), null, expected);
		HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}

public void accountdetailsactions() throws InterruptedException, IOException {
	   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account Details']"));
//	   HelperClass.selectAllDropdownOptions(By.xpath("//div[@aria-haspopup='listbox']"), By.xpath("//span[normalize-space(text())='1010 - Sales']"), null, null);
//	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, null);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "AccountDetails Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountdetailsaccounts() throws IOException, InterruptedException {
	
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account Details']"));
//	   HelperClass.selectAllDropdownOptions(By.xpath("//div[@aria-haspopup='listbox']"), By.xpath("//span[normalize-space(text())='1010 - Sales']"), null, null);
//	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, null);
       Thread.sleep(1000);
	   WebElement accountinaccountdetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	   String Asset = accountinaccountdetails.getText().trim();
       String Account = Asset;
	   System.out.println("Account: " + Asset);
	   HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	   Thread.sleep(1000);	   
	   String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']//tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
	       if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified" + actualtext);
			        }
		    } catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
		    }
}
public void accountdetailspagination() throws Exception {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account Details']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void accountdetailsnextbutton() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account Details']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void accountdetailspreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatenominalledgertab() throws IOException, InterruptedException {
	
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Nominal Ledger']"));
	   String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Nominal Ledger']"));
		String expected = "Nominal Ledger";
	    try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Nominal Ledger verified");
			  } else {
				   System.out.println("Nominal Ledger not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying Nominal Ledger screen: " + e.getMessage());
			  }
		HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//span[normalize-space(text())='All Years']"), null, expected);
		HelperClass.selectAllDropdownOptions(By.xpath("//div[@aria-haspopup='listbox']"), By.xpath("(//div[@role='option'])[1]"), null, expected);
}
public void nominalledgeractions() throws InterruptedException {
	   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Nominal Ledger']"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "NominalLedger Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void nominalledgeraccounts() throws InterruptedException {
	
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Nominal Ledger']"));
	   By spinner = By.cssSelector(".ngx-spinner-overlay");
	   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Expand Table']/tbody/mat-row[1]/mat-cell[2]/div//a"));
	   WebElement accountinnominalledger = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//table[@aria-describedby='main-list'])[1]//tbody//td[6])[1]//span")));
	   String Asset = accountinnominalledger.getText().trim();
	   String Account = Asset;
	   System.out.println("Account: " + Asset);
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
		String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
		   String expected =Asset;
		   try {
				if (actualtext.equals(expected)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Nominal Ledger']"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell)[5]/div//a"));
	   Thread.sleep(2000);
	   WebElement accountinnominalledger1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//table[@aria-describedby='main-list'])[2]//tbody//td[6])[1]//span")));
	   String Asset1 = accountinnominalledger1.getText().trim();
	   String Account1 = Asset1;
	   System.out.println("Account1: " + Asset1);
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	   Thread.sleep(1000);
		String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
			HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Nominal Ledger']"));
			HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Expand Table']/tbody/mat-row[5]/mat-cell[2]/div//a"));
			Thread.sleep(1000);
			WebElement accountinnominalledger2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//table[@aria-describedby='main-list'])[3]//tbody//td[7])[1]//span")));
			String Asset2 = accountinnominalledger2.getText().trim();
			String Account2 = Asset2;
			System.out.println("Account2: " + Asset2);
			HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
			Thread.sleep(1000);
			String actualtext2 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
			   String expected2 =Asset2;
			   try {
					if (actualtext2.equals(expected2)) {
						  System.out.println("Account verified");
				    } else {
						  System.out.println("Account not verified");
				           }
					} catch (Exception e) {
						  System.out.println("An error occurred while verifying account: " + e.getMessage());
					}
}
public void validatebusinesssnapshottab() throws IOException, InterruptedException {
	
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Business Snapshot']"));
	   String actualtext = HelperClass.getText(By.xpath("//h3[normalize-space(text())='Income']"));
		String expected = "Income";
	    try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Business Snapshot verified");
			  } else {
				   System.out.println("Business Snapshot not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying Business Snapshot screen: " + e.getMessage());
			  }
		HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void validateaccountlisttab() throws IOException, InterruptedException {
	
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	   String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Account List']"));
		String expected = "Account List";
	    try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Account List verified");
			  } else {
				   System.out.println("Account List not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying Account List screen: " + e.getMessage());
			  }
		HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void accountlistsearch() {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	WebElement accountlistname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String name = accountlistname.getText().trim();
	String Accountname = name;
	System.out.println("Accountname: " + name);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), name);
	String actualText1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected2 = name;
	if (actualText1.equals(expected2)) {
		System.out.println("Account list name verified");
	} else {
		System.out.println("Account list name not verified: " + actualText1);
	}
}	
public void accountlistactions() throws InterruptedException {
	   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "AccountList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountlistaccounts() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
	Thread.sleep(1000);
	WebElement accountlistname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String name = accountlistname.getText().trim();
	String Accountname = name;
	System.out.println("Accountname: " + name);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected = name;
	if (actualText.equals(expected)) {
		System.out.println("Account list name verified");
	} else {
		System.out.println("Account list name not verified: " + actualText);
	}
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	Thread.sleep(1000);
	WebElement accountlistname1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String name1 = accountlistname1.getText().trim();
	String Accountname1 = name1;
	System.out.println("Accountname1: " + name1);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
	Thread.sleep(2000);
	String actualText1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected1 = name1;
	if (actualText1.equals(expected1)) {
		System.out.println("Account list name verified");
	} else {
		System.out.println("Account list name not verified: " + actualText1);
	}
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[1]//a"));
	Thread.sleep(1000);
	WebElement accountlistname2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String name2 = accountlistname2.getText().trim();
	String Accountname2 = name2;
	System.out.println("Accountname2: " + name2);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualText2 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected2 = name2;
	if (actualText2.equals(expected2)) {
		System.out.println("Account list name verified");
	} else {
		System.out.println("Account list name not verified: " + actualText2);
	}
}
public void accountlistpagination() throws Exception {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	HelperClass.selectItemsPerPage(driver, wait, "5");
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
//	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
//	Thread.sleep(5000);
//	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@aria-label='dropdownlist']")));
//	HelperClass.safeSelectByVisibleText(By.xpath("//select[@aria-label='dropdownlist']/option"), "5");
//    //HelperClass.clickUsingJS(By.xpath("//select[@aria-label='dropdownlist']/option[text()='20']"));
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void accountlistnextbutton() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account List']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void accountlistpreviousbutton() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validateaccountreporttab(){
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Annual Report']"));
	assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Sales Performance']"))
			.isDisplayed());
    System.out.println("Sales Performance verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Expenses Performance']"))
			.isDisplayed());
    System.out.println("Expenses Performance verified");
}
public void validatesalesperformancetab() throws IOException{
	
	   Reports.salesperformancetab.click();
	   String actualtext = HelperClass.getText(By.xpath("//p[contains(text(),'Sales Performance')]"));
		String expected = "Sales Performance";
	    try {
			  if (actualtext.contains(expected)) {
				   System.out.println("Sales Performance verified");
			  } else {
				   System.out.println("Sales Performance not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying Sales Performance screen: " + e.getMessage());
			  }
		HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
		HelperClass.selectAllDropdownOptions(By.xpath("(//div[@aria-haspopup='listbox'])[1]"), By.xpath("//div[normalize-space(text())='10']"), null, expected);
		HelperClass.selectAllDropdownOptions(By.xpath("(//div[@aria-haspopup='listbox'])[2]"), By.xpath("//div[normalize-space(text())='Times New Roman']"), null, expected);
        HelperClass.clickUsingJS(By.xpath("//input[@formcontrolname='fontColor']"));
        HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Generate Report']"));
        String actualtext1 = HelperClass.getText(By.xpath("//mat-icon[normalize-space(text())='download']"));
		String expected1 = "download";
	    try {
			  if (actualtext1.contains(expected1)) {
				   System.out.println("Generated report verified");
			  } else {
				   System.out.println("Generated report not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying generated report: " + e.getMessage());
			  }
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='download']"));
}
public void validateexpenseperformancetab() throws IOException{
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Annual Report']"));
	   Reports.expenseperformancetab.click();
	   String actualtext = HelperClass.getText(By.xpath("//p[contains(text(),'Expense Performance')]"));
		String expected = "Expense Performance";
	    try {
			  if (actualtext.contains(expected)) {
				   System.out.println("Expense Performance verified");
			  } else {
				   System.out.println("Expense Performance not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying Expense Performance screen: " + e.getMessage());
			  }
		HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
		HelperClass.selectAllDropdownOptions(By.xpath("(//div[@aria-haspopup='listbox'])[1]"), By.xpath("//div[normalize-space(text())='10']"), null, expected);
		HelperClass.selectAllDropdownOptions(By.xpath("(//div[@aria-haspopup='listbox'])[2]"), By.xpath("//div[normalize-space(text())='Times New Roman']"), null, expected);
        HelperClass.clickUsingJS(By.xpath("//input[@formcontrolname='fontColor']"));
        HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Generate Report']"));
        String actualtext1 = HelperClass.getText(By.xpath("//mat-icon[normalize-space(text())='download']"));
		String expected1 = "download";
	    try {
			  if (actualtext1.contains(expected1)) {
				   System.out.println("Generated report verified");
			  } else {
				   System.out.println("Generated report not verified");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying generated report: " + e.getMessage());
			  }
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='download']"));
}
public void validatetransactionlistbydatetab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	Reports.transactionlistbydatetab.click();
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Transaction List By Date']"));
	String expected = "Transaction List By Date";
    try {
		  if (actualtext.contains(expected)) {
			   System.out.println("Transaction List By Date verified");
		  } else {
			   System.out.println("Transaction List By Date not verified");
			      }
		  } catch (Exception e) {
			   System.out.println("An error occurred while verifying Transaction List By Date: " + e.getMessage());
		  }
    HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchintransactionlistbydate() {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.transactionlistbydatetab.click();
	WebElement Typeintransactionlistbydate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//span")));
	String Type = Typeintransactionlistbydate.getText().trim();
	String T = Type;
	System.out.println("T: " + Type);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Type);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//span")).trim();
	String expected = Type;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with type");
	    } else {
		System.out.println("search is not verified with type: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with type: " + e.getMessage());
		}
}
public void transactionlistbydateactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.transactionlistbydatetab.click();
//	   Thread.sleep(5000);
	   Reports.transactionlistbydateactions.click();
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "TransactionListByDate Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountintransactionlistbydate() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.transactionlistbydatetab.click();
	WebElement transactionlistbydateamount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String Amount = transactionlistbydateamount.getText().trim();
	String Asset = Amount;
	System.out.println("Asset: " + Amount);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(1000);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected =Amount;
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Transaction List By Date']"));
	WebElement transactionlistbydateamount1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span")));
	String Amount1 = transactionlistbydateamount1.getText().trim();
	String Asset1 = Amount1;
	System.out.println("Asset1: " + Amount1);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
	String actualText1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected1 =Amount1;
	   try {
			if (actualText1.equals(expected1)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void transactionlistbydatereferencenumberandname() throws InterruptedException{
	
	By exportMenu = By.xpath("//mat-icon[normalize-space(text())='save_alt']");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	Reports.transactionlistbydatetab.click();
	WebElement transactionlistbydatereferencenumber= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")));
	String Referencenumber = transactionlistbydatereferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected = Referencenumber;
	if (actualText.equals(expected)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
//	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	WebElement transactionlistbydatename = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")));
	String name = transactionlistbydatename.getText().trim();
	String N = name;
	System.out.println("N: " + name);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected1 = name;
	if (actualText1.equals(expected1)) {
		System.out.println("Name verified");
	} else {
		System.out.println("Name not verified" + actualText1);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	WebElement transactionlistbydatereferencenumber1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a")));
	String Referencenumber1 = transactionlistbydatereferencenumber1.getText().trim();
	String REF1 = Referencenumber1;
	System.out.println("REF1: " + Referencenumber1);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a"));
	String actualText2 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected2 = Referencenumber1;
	if (actualText2.equals(expected2)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText2);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	WebElement transactionlistbydatename2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[4]//a")));
	String name2 = transactionlistbydatename2.getText().trim();
	String N2 = name2;
	System.out.println("N2: " + name2);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[4]//a"));
	String actualText3 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected3 = name2;
	if (actualText3.equals(expected3)) {
		System.out.println("Name verified");
	} else {
		System.out.println("Name not verified" + actualText3);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void transactionlistbydatepagination() throws Exception {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.transactionlistbydatetab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void transactionlistbydatenextbutton() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.transactionlistbydatetab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void transactionlistbydatepreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validaterecenttransactionstab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	Reports.recenttransactionstab.click();
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Recent Transactions']"));
	String expected = "Recent Transactions";
    try {
		  if (actualtext.contains(expected)) {
			   System.out.println("Recent Transactions verified");
		  } else {
			   System.out.println("Recent Transactions not verified");
			      }
		  } catch (Exception e) {
			   System.out.println("An error occurred while verifying Recent Transactions: " + e.getMessage());
		  }
    HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchinrecenttransactions() {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.recenttransactionstab.click();
	WebElement Typeinrecenttransactions = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//span")));
	String Type = Typeinrecenttransactions.getText().trim();
	String T = Type;
	System.out.println("T: " + Type);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Type);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//span")).trim();
	String expected = Type;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with type");
	    } else {
		System.out.println("search is not verified with type: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with type: " + e.getMessage());
		}
}
public void recenttransactionsactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.recenttransactionstab.click();
//	   Thread.sleep(5000);
	   Reports.recenttransactionsactions.click();
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "RecentTransactions Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void recenttransactionsreferencenumber() throws InterruptedException{
	
	By exportMenu = By.xpath("//mat-icon[normalize-space(text())='save_alt']");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.recenttransactionstab.click();
	WebElement recenttransactionsreferencenumber= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")));
	String Referencenumber = recenttransactionsreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected = Referencenumber;
	if (actualText.equals(expected)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	Thread.sleep(1000);
	WebElement recenttransactionsreferencenumber1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a")));
	String Referencenumber1 = recenttransactionsreferencenumber1.getText().trim();
	String REF1 = Referencenumber1;
	System.out.println("REF1: " + Referencenumber1);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber1;
	if (actualText1.equals(expected1)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText1);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void recenttransactionspagination() throws Exception {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.recenttransactionstab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void recenttransactionsnextbutton() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.recenttransactionstab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void recenttransactionspreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatebalancesheetcomparisontab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	Reports.balancesheetcomparisontab.click();
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Balance Sheet Comparison']"));
	String expected = "Balance Sheet Comparison";
    try {
		  if (actualtext.contains(expected)) {
			   System.out.println("Balance Sheet Comparison verified");
		  } else {
			   System.out.println("Balance Sheet Comparison not verified");
			      }
		  } catch (Exception e) {
			   System.out.println("An error occurred while verifying Balance Sheet Comparison: " + e.getMessage());
		  }
    HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void balancesheetcomparisonactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.balancesheetcomparisontab.click();
	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "BalanceSheetComparison Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountinbalancesheetcomparison() {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.balancesheetcomparisontab.click();
	WebElement balancesheetcomparisonamount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//span")));
	String Amount = balancesheetcomparisonamount.getText().trim();
	String Asset = Amount;
	System.out.println("Asset: " + Amount);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span")).trim();
	String expected =Amount;
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void validateaccountinbalancesheetcomparison() {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet Comparison']"));
	WebElement balancesheetcomparisonamount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//span")));
	String Amount = balancesheetcomparisonamount.getText().trim();
	String Asset = Amount;
	System.out.println("Asset: " + Amount);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[2]//a"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")).trim();
	String expected =Amount;
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void validatebalancesheetdetailtab() throws IOException, InterruptedException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	Reports.balancesheetdetailstab.click();
	Reports.balancesheetcomparisontab.click();
	Thread.sleep(2000);
    HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet Detail']"));
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Balance Sheet Detail']"));
	String expected = "Balance Sheet Detail";
    try {
		  if (actualtext.contains(expected)) {
			   System.out.println("Balance Sheet Detail verified");
		  } else {
			   System.out.println("Balance Sheet Detail not verified");
			      }
		  } catch (Exception e) {
			   System.out.println("An error occurred while verifying Balance Sheet Detail: " + e.getMessage());
		  }
    HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void balancesheetdetailactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.balancesheetdetailstab.click();
//	Reports.balancesheetcomparisontab.click();
//	Thread.sleep(3000);
//    HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet Detail']"));
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "BalanceSheetDetail Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountsinbalancesheetdetail() throws InterruptedException {
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.balancesheetdetailstab.click();
//	Reports.balancesheetcomparisontab.click();
//	Thread.sleep(2000);
//    HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet Detail']"));
    WebElement balancesheetdetailamount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[6]//span")));
	String Amount = balancesheetdetailamount.getText().trim();
	String Asset = Amount;
	System.out.println("Asset: " + Amount);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected =Amount;
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void balancesheetdetailparticularandreferencenumber() throws InterruptedException{
	
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
//	Reports.balancesheetdetailstab.click();
	Reports.balancesheetcomparisontab.click();
	Thread.sleep(2000);
    HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Balance Sheet Detail']"));
	WebElement balancesheetdetailparticular = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[2]//a")));
	String particular = balancesheetdetailparticular.getText().trim();
	String C = particular;
	System.out.println("C: " + particular);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[2]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected1 = particular;
	if (actualText1.equals(expected1)) {
		System.out.println("Contact verified");
	} else {
		System.out.println("Contact not verified" + actualText1);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	WebElement accountdetailsreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[5]//a")));
	String referencenumber = accountdetailsreferencenumber.getText().trim();
	String RF = referencenumber;
	System.out.println("RF: " + referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[5]//a"));
	String actualText2 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected2 = referencenumber;
	if (actualText2.equals(expected2)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText2);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
}
public void validatecustomreporttab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Additional']"));
	Reports.customreporttab.click();
	String actualText = HelperClass.getText(By.xpath(" //span[normalize-space(text())='Custom Report']")).trim();
	String expected ="Custom Report";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Custom Report verified");
		    } else {
				  System.out.println("Custom Report not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Custom Report: " + e.getMessage());
			}
	    HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void validatecustomertab() {
	
	Reports.customertab.click();
	assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Advance Report']"))
			.isDisplayed());
    System.out.println("Advance Report verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Sales Report']"))
			.isDisplayed());
    System.out.println("Sales Report verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customer List']"))
			.isDisplayed());
    System.out.println("Customer List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customer Ageing List']"))
			.isDisplayed());
    System.out.println("Customer Ageing List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Transactions By Customer']"))
	 		.isDisplayed());
    System.out.println("Transactions By Customer verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Sales Product List']"))
			.isDisplayed());
    System.out.println("Sales Product List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customer Receipts']"))
			.isDisplayed());
    System.out.println("Customer Receipts verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Debtors']"))
		.isDisplayed());
    System.out.println("Debtors verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customer Statement']"))
			.isDisplayed());
    System.out.println("Customer Statement verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Sales Invoice List']"))
			.isDisplayed());
    System.out.println("Sales Invoice List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Open Invoice']"))
			.isDisplayed());
    System.out.println("Open Invoice verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Income by Customer Summary']"))
			.isDisplayed());
    System.out.println("Income by Customer Summary verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customer Balance Summary']"))
			.isDisplayed());
    System.out.println("Customer Balance Summary verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Deposit Details']"))
			.isDisplayed());
    System.out.println("Deposit Details verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Advance Ageing List']"))
			.isDisplayed());
    System.out.println("Advance Ageing List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Quotation By Customer']"))
			.isDisplayed());
    System.out.println("Quotation By Customer verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Invoice and Received Payments']"))
			.isDisplayed());
    System.out.println("Invoice and Received Payments verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Sales by Product/Service Detail']"))
			.isDisplayed());
    System.out.println("Sales by Product/Service Detail verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Sales by Product/Service Summary']"))
			.isDisplayed());
    System.out.println("Sales by Product/Service Summary verified");
}
public void validateadvancereportincustomer() throws IOException {
	
	Reports.advancereportincustomertab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Advance Report']")).trim();
	String expected ="Advance Report";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Advance Report verified");
		    } else {
				  System.out.println("Advance Report not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Advance Report: " + e.getMessage());
			}
	    HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchinadvancereportincustomer() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.advancereportincustomertab.click();
	Thread.sleep(1000);
	WebElement Customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String Name = Customername.getText().trim();
	String N = Name;
	System.out.println("N: " + Name);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Name);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with customer name");
	    } else {
		System.out.println("search is not verified with customer name: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with customer name: " + e.getMessage());
		}
}
public void advancereportcustomerdropdown() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.advancereportincustomertab.click();
	WebElement Customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String customerName = Customername.getText().trim();
	System.out.println("Customer name from table: " + customerName);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, customerName);
	HelperClass.selectFirstSuggestedCustomer("customerName");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected = customerName;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	            }
	    } catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	    }
}
public void advancereportactionsincustomer() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.advancereportincustomertab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "CustomerAdvance Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void advancereportaccountsincustomer() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.advancereportincustomertab.click();
    WebElement balancesheetdetailamount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//span")));
	String Amount = balancesheetdetailamount.getText().trim();
	String Asset = Amount;
	System.out.println("Asset: " + Amount);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected =Amount;
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void advancereportcustomernameandreferencenumber() throws IOException, InterruptedException{
	
//	Reports.customertab.click();
	Reports.advancereportincustomertab.click();
	WebElement advancereportcustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String customername = advancereportcustomername.getText().trim();
	String name = customername;
	System.out.println("Name: " + customername);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected = customername;
	if (actualText.equals(expected)) {
		System.out.println("Contact verified");
	} else {
		System.out.println("Contact not verified" + actualText);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	WebElement advancereportreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String referencenumber = advancereportreferencenumber.getText().trim();
	String RF = referencenumber;
	System.out.println("RF: " + referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = referencenumber;
	if (actualText1.equals(expected1)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText1);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void advancereportpaginationincustomer() throws Exception {
	
//	Reports.customertab.click();
//	Reports.advancereportincustomertab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void advancereportnextbuttonincustomer() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.advancereportincustomertab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void advancereportpreviousbuttonincustomer() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatesalesreporttab() throws IOException {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Customer']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales Report']"));
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales Report']")).trim();
	String expected ="Sales Report";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Sales Report verified");
		    } else {
				  System.out.println("Sales Report not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Sales Report: " + e.getMessage());
			}
	    HelperClass.selectAllDropdownOptions(By.xpath("//input[@aria-autocomplete='list']"), By.xpath("(//div[@role='option'])[1]"), null, expected);	
}
public void salesreportactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.salesreporttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Sales Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountsinsalesreport() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.salesreporttab.click();
	Thread.sleep(1000);
    WebElement accountsinsalesreport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//span")));
	String Amount = accountsinsalesreport.getText().trim();
	String Asset = Amount;
	System.out.println("Asset: " + Amount);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")).trim();
	String expected =Amount;
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void validatecustomerlisttab(){
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Customer']"));
	Reports.customerlisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer List']")).trim();
	String expected ="Customer List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Customer List verified");
		    } else {
				  System.out.println("Customer List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Customer List: " + e.getMessage());
			}	
}
public void searchincustomerlist() {
	
//	Reports.customertab.click();
//	Reports.customerlisttab.click();
	WebElement Customernameincustomerlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Customername = Customernameincustomerlist.getText().trim();
	String Name = Customername;
	System.out.println("Name: " + Customername);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Customername);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Customername;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with customername");
	    } else {
		System.out.println("search is not verified with customername: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with customername: " + e.getMessage());
		}
} 
public void customerlistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.customerlisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "CustomerList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void customerlistcustomername() throws IOException, InterruptedException{
	
//	Reports.customertab.click();
//	Reports.customerlisttab.click();
	WebElement customerlistcustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Customername = customerlistcustomername.getText().trim();
	String Name = Customername;
	System.out.println("Name: " + Customername);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected1 = Customername;
	try {
	    if (actualText1.equals(expected1)) {
		      System.out.println("Customer name verified");
	    } else {
		      System.out.println("Customer name not verified" + actualText1);
	           }
        } catch (Exception e) {
              System.out.println("An error occurred while verifying customer name: " + e.getMessage());
        }
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	
}
public void customerlistpagination() throws Exception {
	
//	Reports.customertab.click();
//	Reports.customerlisttab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void customerlistnextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerlisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void customerlistpreviousbutton() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatecustomerageinglisttab() throws IOException{
	
	Reports.customertab.click();
	Reports.customerageinglisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Ageing List']")).trim();
	String expected ="Customer Ageing List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Customer Ageing List verified");
		    } else {
				  System.out.println("Customer Ageing List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Customer Ageing List: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//input[@aria-autocomplete='list']"), By.xpath("//div[@role='option']"), null, expected);	
}
public void searchincustomerageinglist() {
	
//	Reports.customertab.click();
//	Reports.customerageinglisttab.click();
	WebElement Customerincustomerlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Customer = Customerincustomerlist.getText().trim();
	String Name = Customer;
	System.out.println("Name: " + Customer);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Customer);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Customer;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with customername");
	    } else {
		System.out.println("search is not verified with customername: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with customername: " + e.getMessage());
		}
} 
public void  customerageinglistcustomerdropdown () throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerageinglisttab.click();
	WebElement Customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String customerName = Customername.getText().trim();
	System.out.println("Customer name from table: " + customerName);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, customerName);
	HelperClass.selectFirstSuggestedCustomer("customerName");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = customerName;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void customerageinglistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.customerageinglisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "CustomerAgeingList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void customerageinglistcustomername() throws IOException, InterruptedException{
	
//	Reports.customertab.click();
//	Reports.customerageinglisttab.click();
	WebElement customerageinglistcustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Customername = customerageinglistcustomername.getText().trim();
	String Name = Customername;
	System.out.println("Name: " + Customername);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected1 = Customername;
	try {
	    if (actualText1.equals(expected1)) {
		      System.out.println("Customer name verified");
	    } else {
		      System.out.println("Customer name not verified" + actualText1);
	           }
        } catch (Exception e) {
              System.out.println("An error occurred while verifying customer name: " + e.getMessage());
        }
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void customerageinglistpagination() throws Exception {
	
//	Reports.customertab.click();
//	Reports.customerageinglisttab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void customerageinglistnextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerageinglisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void customerageinglistpreviousbutton() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatetransactionbycustomertab() throws IOException{
	
	Reports.customertab.click();
	Reports.transactionbycustomertab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Transactions By Customer']")).trim();
	String expected ="Transactions By Customer";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Transactions By Customer verified");
		    } else {
				  System.out.println("Transactions By Customer not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Transactions By Customer: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchintransactionbycustomer() {
	
//	Reports.customertab.click();
//	Reports.transactionbycustomertab.click();
	WebElement Referencenumberintransactionbycustomer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
	String Referencenumber = Referencenumberintransactionbycustomer.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Referencenumber);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")).trim();
	String expected = Referencenumber;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with referencenumber");
	    } else {
		System.out.println("search is not verified with referencenumber: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with referencenumber: " + e.getMessage());
		}
} 
public void  customerdropdownintransactionbycustomer() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.transactionbycustomertab.click();
	WebElement Customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'ng-value')]//span")));
	String customerName = Customername.getText().trim();
	System.out.println("Customer: " + customerName);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
	String actualText = HelperClass.getText(By.xpath("//div[text()='Sent to']/following-sibling::div[1]")).trim();
	String expected = customerName;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
}
public void transactionbycustomeractions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.transactionbycustomertab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "TransactionsByCustomer Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountintransactionsbycustomer() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.transactionbycustomertab.click();
	WebElement accountintransactionsbycustomer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = accountintransactionsbycustomer.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Transactions By Customer']"));
	WebElement accountintransactionsbycustomer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[3]/td[7]//span")));
	String Asset1 = accountintransactionsbycustomer1.getText().trim();
	String Accounts = Asset1;
	System.out.println("Accounts: " + Asset1);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
	Thread.sleep(2000);
	String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected1 =Asset1;
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void transactionsbycustomerreferencenumber() throws IOException, InterruptedException{
	
//	 Reports.customertab.click();
	 HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Transactions By Customer']"));
	 WebElement transactionsbycustomerreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
	 String Referencenumber = transactionsbycustomerreferencenumber.getText().trim();
	 String REF = Referencenumber;
	 System.out.println("REF: " + Referencenumber);
	 HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
	 String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	 String expected = Referencenumber;
	  try {
	     if (actualText.equals(expected)) {
		       System.out.println("Reference number verified");
	      } else {
		       System.out.println("Reference number not verified" + actualText);
	             }
          } catch (Exception e) {
	           System.out.println("An error occurred while verifying Reference number: " + e.getMessage());
          }
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
}
public void transactionsbycustomerpagination() throws Exception {
	
//	Reports.customertab.click();
//	Reports.transactionbycustomertab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void transactionsbycustomernextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.transactionbycustomertab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void transactionsbycustomerpreviousbutton() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatesalesproductlisttab() throws IOException{
	
	Reports.customertab.click();
	Reports.salesproductlisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales Product List']")).trim();
	String expected ="Sales Product List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Sales Product List verified");
		    } else {
				  System.out.println("Sales Product List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Sales Product List: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchinsalesproductlist() {
	
//	Reports.customertab.click();
//	Reports.salesproductlisttab.click();
	WebElement Referencenumberinsalesproductlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Referencenumber = Referencenumberinsalesproductlist.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Referencenumber);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Referencenumber;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with referencenumber");
	    } else {
		System.out.println("search is not verified with referencenumber: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with referencenumber: " + e.getMessage());
		}
} 
public void  productdropdowninsalesproductlist() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.salesproductlisttab.click();
	WebElement Productname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//span")));
	String productName = Productname.getText().trim();
	System.out.println("Customer name from table: " + productName);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, productName);
	HelperClass.selectFirstSuggestedCustomer("productName");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//span")).trim();
	String expected = productName;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void salesproductlistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.salesproductlisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SalesProductList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountinsalesproductlist() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.salesproductlisttab.click();
	WebElement accountinsalesproductlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span")));
	String Asset = accountinsalesproductlist.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void salesproductlistreferencenumber() throws IOException, InterruptedException{
	
//	 Reports.customertab.click();
	 Reports.salesproductlisttab.click();
	 WebElement salesproductlistreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	 String Referencenumber = salesproductlistreferencenumber.getText().trim();
	 String REF = Referencenumber;
	 System.out.println("REF: " + Referencenumber);
	 HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	 String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	 String expected = Referencenumber;
	  try {
	     if (actualText.equals(expected)) {
		       System.out.println("Reference number verified");
	      } else {
		       System.out.println("Reference number not verified" + actualText);
	             }
         } catch (Exception e) {
	           System.out.println("An error occurred while verifying Reference number: " + e.getMessage());
         }
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
}
public void salesproductlistpagination() throws Exception {
	
//	 Reports.customertab.click();
//	 Reports.salesproductlisttab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//    System.out.println("20 records are there");
//} else {
//    System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void salesproductlistnextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.salesproductlisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void salesproductlistpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatecustomerreceipttab() throws IOException{
	
	Reports.customertab.click();
	Reports.customerreceipttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Receipts']")).trim();
	String expected ="Customer Receipts";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Customer Receipts verified");
		    } else {
				  System.out.println("Customer Receipts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Customer Receipts: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchincustomerreceipt() {
	
//	Reports.customertab.click();
//	Reports.customerreceipttab.click();
	WebElement Referencenumberincustomerreceipt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Referencenumber = Referencenumberincustomerreceipt.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Referencenumber);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Referencenumber;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with referencenumber");
	    } else {
		System.out.println("search is not verified with referencenumber: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with referencenumber: " + e.getMessage());
		}
} 
public void  customerdropdownincustomerreceipt() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerreceipttab.click();
	WebElement Referencenumberincustomerreceipt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
	String Referencenumber = Referencenumberincustomerreceipt.getText().trim();
	System.out.println("Customer name from table: " + Referencenumber);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Referencenumber);
	HelperClass.selectFirstSuggestedCustomer("Referencenumber");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")).trim();
	String expected = Referencenumber;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void customerreceiptactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.customerreceipttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "CustomerReceipts Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountincustomerreceipt() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerreceipttab.click();
	WebElement accountincustomerreceipt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = accountincustomerreceipt.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
	Thread.sleep(1000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void customerreceiptreferencenumberandcustomername() throws IOException, InterruptedException{
	
//	Reports.customertab.click();
	Reports.customerreceipttab.click();
	WebElement customerreceiptreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Referencenumber = customerreceiptreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber;
	if (actualText1.equals(expected1)) {
		System.out.println("Referencenumber verified");
	} else {
		System.out.println("Referencenumber not verified" + actualText1);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	WebElement customerreceiptcustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
	String Customername = customerreceiptcustomername.getText().trim();
	String Customer = Customername;
	System.out.println("Customer: " + Customername);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
	String actualText2 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected2 = Customername;
	if (actualText2.equals(expected2)) {
		System.out.println("Customer name verified");
	} else {
		System.out.println("Customer name not verified" + actualText2);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void customerreceiptpagination() throws Exception {
	
//	 Reports.customertab.click();
//	 Reports.customerreceipttab.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	Thread.sleep(2000);
   HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
   List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
   System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//   System.out.println("20 records are there");
//} else {
//   System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void customerreceiptnextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerreceipttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void customerreceiptpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatedebtorstab() throws IOException{
	
	Reports.customertab.click();
	Reports.debtorstab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Debtors']")).trim();
	String expected ="Debtors";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Debtors verified");
		    } else {
				  System.out.println("Debtors not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Debtors: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void  customerdropdownindebtors() throws InterruptedException {
	
	By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.debtorstab.click();
	WebElement Customernameincustomerreceipt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[4]")));
	String Customername = Customernameincustomerreceipt.getText().trim();
	System.out.println("Customer name from table: " + Customername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	HelperClass.safeSendKeys(dropdownInput, Customername);
	HelperClass.selectFirstSuggestedCustomer("Customername");
	String actualText = HelperClass.getText(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[4]")).trim();
	String expected = Customername;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void debtorsactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.debtorstab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Debtors Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As PDF(OutStanding Bal.)']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF(OutStanding Bal.)']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As Excel(OutStanding Bal.)']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As Excel(OutStanding Bal.)']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As CSV(OutStanding Bal.)']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As CSV(OutStanding Bal.)']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountindebtors() throws InterruptedException {
	
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.debtorstab.click();
	HelperClass.clickUsingJS(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[3]"));
	Thread.sleep(3000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	WebElement accountindebtors = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//table[@aria-describedby='main-list'])[1]//tbody//td[4])[1]//span")));
	String Asset = accountindebtors.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Debtors']"));
	HelperClass.clickUsingJS(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[3]"));
	Thread.sleep(1000);
	WebElement accountindebtors1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//table[@aria-describedby='main-list'])[1]//tbody//td[5])[3]//span")));
	String Asset1 = accountindebtors1.getText().trim();
	String Accounts = Asset1;
	System.out.println("Accounts: " + Asset1);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
	Thread.sleep(1000);
	String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected1 =Asset1;
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Accounts verified");
		    } else {
				  System.out.println("Accounts not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
			}
}
public void debtorsreferencenumber() throws IOException, InterruptedException{
	
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Debtors']"));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	HelperClass.clickUsingJS(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[3]"));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	Thread.sleep(3000);
	WebElement debtorsreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//table[@aria-describedby='main-list'])[1]//tbody//td[3])[1]//span")));
	String Referencenumber = debtorsreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("((//table[@aria-describedby='main-list'])[1]//tbody//td[3])[1]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected = Referencenumber;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying accounts: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));  
}
public void validatecustomerstatementtab() throws IOException{
	
	Reports.customertab.click();
	Reports.customerstatementtab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Statement']")).trim();
	String expected ="Customer Statement";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Customer Statement verified");
		    } else {
				  System.out.println("Customer Statement not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Customer Statement: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
	   HelperClass.selectAllDropdownOptions(By.xpath("(//ng-select[@appendto='body'])[1]"), By.xpath("//div[@role='option']"), null, expected);	
}
public void searchincustomerstatement() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerstatementtab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String REF = Referencenumber.getText().trim();
	String Number = REF;
	System.out.println("Number: " + REF);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), REF);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected = REF;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void  customerdropdownincustomerstatement() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerstatementtab.click();
	WebElement Customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'ng-value')]//span)[2]")));
	String customerName = Customername.getText().trim();
	System.out.println("Customer: " + customerName);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("//div[text()='Sent to']/following-sibling::div[1]")).trim();
	String expected = customerName;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
}
public void customerstatementactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.customerstatementtab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "CustomerStatement Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void customerstatementpagination() throws Exception {
	
//	 Reports.customertab.click();
//	 Reports.customerstatementtab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
     HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
     List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
     System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//  System.out.println("20 records are there");
//} else {
//  System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void customerstatementnextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerstatementtab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void customerstatementpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatesalesinvoicelisttab() throws IOException{
	
	Reports.customertab.click();
	Reports.salesinvoicelisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales Invoice List']")).trim();
	String expected ="Sales Invoice List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Sales Invoice List verified");
		    } else {
				  System.out.println("Sales Invoice List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Sales Invoice List: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchinsalesinvoicelist() {
	
//	Reports.customertab.click();
//	Reports.salesinvoicelisttab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String REF = Referencenumber.getText().trim();
	String Number = REF;
	System.out.println("Number: " + REF);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), REF);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = REF;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void  customerdropdowninsalesinvoicelist() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.salesinvoicelisttab.click();
	WebElement Customernameinsalesinvoicelist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
	String Customername = Customernameinsalesinvoicelist.getText().trim();
	System.out.println("Customer name from table: " + Customername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Customername);
	HelperClass.selectFirstSuggestedCustomer("Customername");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")).trim();
	String expected = Customername;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void salesinvoicelistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.salesinvoicelisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SalesInvoiceList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void salesinvoicelistaccounts() throws InterruptedException {
	
//    Reports.customertab.click();
//    Reports.salesinvoicelisttab.click();
	WebElement accountinnominalledger = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span")));
	String Asset = accountinnominalledger.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void salesinvoicelistreferencenumberandcustomername() throws InterruptedException{
	
//	Reports.customertab.click();
	Reports.salesinvoicelisttab.click();
	WebElement salesinvoicelistreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String referencenumber = salesinvoicelistreferencenumber.getText().trim();
	String REF = referencenumber;
	System.out.println("REF: " + referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected = referencenumber;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement salesinvoicelistcustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
		String customername = salesinvoicelistcustomername.getText().trim();
		String C = customername;
		System.out.println("C: " + customername);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected1 = customername;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("customername verified");
		       } else {
			         System.out.println("customername not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying customername: " + e.getMessage());
	           } 
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));  
}
public void salesinvoicelistpagination() throws Exception {
	
//	 Reports.customertab.click();
//	 Reports.salesinvoicelisttab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
    HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
    System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
// System.out.println("20 records are there");
//} else {
// System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void salesinvoicelistnextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.salesinvoicelisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void salesinvoicelistpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validateopeninvoicetab() throws IOException{
	
	Reports.customertab.click();
	Reports.openinvoicetab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Open Invoice']")).trim();
	String expected ="Open Invoice";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Open Invoice verified");
		    } else {
				  System.out.println("Open Invoice not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Open Invoice: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchinopeninvoice() {
	
//	Reports.customertab.click();
//	Reports.openinvoicetab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")));
	String REF = Referencenumber.getText().trim();
	String Number = REF;
	System.out.println("Number: " + REF);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), REF);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")).trim();
	String expected = REF;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void  customerdropdowninopeninvoice() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.openinvoicetab.click();
	WebElement Customernameinopeninvoice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")));
	String Customername = Customernameinopeninvoice.getText().trim();
	System.out.println("Customer name from table: " + Customername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Customername);
	HelperClass.selectFirstSuggestedCustomer("Customername");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")).trim();
	String expected = Customername;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void openinvoiceactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.openinvoicetab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Open Invoice Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void openinvoiceaccounts() throws InterruptedException {
	
//    Reports.customertab.click();
//    Reports.openinvoicetab.click();
	WebElement accountinnominalledger = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = accountinnominalledger.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void openinvoicereferencenumberandcustomer() throws InterruptedException{
	
//	Reports.customertab.click();
	Reports.openinvoicetab.click();
	WebElement openinvoicereferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")));
	String referencenumber = openinvoicereferencenumber.getText().trim();
	String REF = referencenumber;
	System.out.println("REF: " + referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected = referencenumber;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement openinvoicecustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")));
		String customername = openinvoicecustomername.getText().trim();
		String C = customername;
		System.out.println("C: " + customername);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected1 = customername;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("customername verified");
		       } else {
			         System.out.println("customername not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying customername: " + e.getMessage());
	           } 
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));  
}
public void openinvoicepagination() throws Exception {
	
//	 Reports.customertab.click();
//	 Reports.openinvoicetab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
   HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
   List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
   System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void openinvoicenextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.openinvoicetab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void openinvoicepreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validateincomebycustomersummarytab() throws IOException{
	
	Reports.customertab.click();
	Reports.incomebycustomersummarytab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Income by Customer Summary']")).trim();
	String expected ="Income by Customer Summary";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Income by Customer Summary verified");
		    } else {
				  System.out.println("Income by Customer Summary not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Income by Customer Summary: " + e.getMessage());
			}	
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void searchinincomebycustomersummary () {
	
//	Reports.customertab.click();
//	Reports.incomebycustomersummarytab.click();
	WebElement Customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String Name = Customername.getText().trim();
	String N = Name;
	System.out.println("N: " + Name);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Name);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with customer name");
	    } else {
		System.out.println("search is not verified with customer name: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with customer name: " + e.getMessage());
		}
}
public void incomebycustomersummaryactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.incomebycustomersummarytab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "IncomeByCustomerSummary Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void incomebycustomersummaryaccounts() throws InterruptedException {
	
//    Reports.customertab.click();
//    Reports.incomebycustomersummarytab.click();
	WebElement accountinincomebycustomersummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//span")));
	String Asset = accountinincomebycustomersummary.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void incomebycustomersummarycustomer() throws InterruptedException{
	
//	Reports.customertab.click();
	Reports.incomebycustomersummarytab.click();
	WebElement incomebycustomersummarycustomer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String customer = incomebycustomersummarycustomer.getText().trim();
	String C = customer;
	System.out.println("C: " + customer);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected = customer;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Customer verified");
	       } else {
		         System.out.println("Customer not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying customer: " + e.getMessage());
           } 
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void incomebycustomersummarypagination() throws Exception {
	
//	 Reports.customertab.click();
//	 Reports.incomebycustomersummarytab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
  HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
  System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void incomebycustomersummarynextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.incomebycustomersummarytab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void incomebycustomersummarypreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatecustomerbalancesummarytab(){
	
	Reports.customertab.click();
	Reports.customerbalancesummarytab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Customer Balance Summary']")).trim();
	String expected ="Customer Balance Summary";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Customer Balance Summary verified");
		    } else {
				  System.out.println("Customer Balance Summary not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Customer Balance Summary: " + e.getMessage());
			}	
}
public void searchincustomerbalancesummary () {
	
//	Reports.customertab.click();
//	Reports.customerbalancesummarytab.click();
	WebElement Customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Name = Customername.getText().trim();
	String N = Name;
	System.out.println("N: " + Name);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Name);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with customer name");
	    } else {
		System.out.println("search is not verified with customer name: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with customer name: " + e.getMessage());
		}
}
public void customerbalancesummaryactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.customerbalancesummarytab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "CustomerBalanceSummary Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void customerbalancesummarycustomer() throws InterruptedException{
	
//	Reports.customertab.click();
//	Reports.customerbalancesummarytab.click();
	WebElement incomebycustomersummarycustomer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String customer = incomebycustomersummarycustomer.getText().trim();
	String C = customer;
	System.out.println("C: " + customer);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected = customer;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Customer verified");
	       } else {
		         System.out.println("Customer not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying customer: " + e.getMessage());
           } 
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void customerbalancesummarypagination() throws Exception {
	
//	 Reports.customertab.click();
//	 Reports.customerbalancesummarytab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
 HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
 List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
 System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void customerbalancesummarynextbutton() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.customerbalancesummarytab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void customerbalancesummarypreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatedepositedetailstab(){
	
	Reports.customertab.click();
	Reports.depositedetailstab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Deposit Details']")).trim();
	String expected ="Deposit Details";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Deposit Details verified");
		    } else {
				  System.out.println("Deposit Details not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Deposit Details: " + e.getMessage());
			}	
}
public void depositedetailsactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.depositedetailstab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "DepositDetails Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void depositedetailsaccounts() {

//	   Reports.customertab.click();
//	   Reports.depositedetailstab.click();
       WebElement accountindetailsaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//span")));
       String Asset1 = accountindetailsaccounts.getText().trim();
       String Accounts = Asset1;
       System.out.println("Accounts: " + Asset1);
       HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
       HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
       String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
       String expected1 =Asset1;
       try {
		if (actualtext1.equals(expected1)) {
			  System.out.println("Accounts verified");
	    } else {
			  System.out.println("Accounts not verified");
	           }
		} catch (Exception e) {
			  System.out.println("An error occurred while verifying accounts: " + e.getMessage());
		}
}
public void depositedetailsreferencenumber() throws InterruptedException{
	
//	Reports.customertab.click();
	Reports.depositedetailstab.click();
	WebElement depositedetailsreferencenumber= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a")));
	String Referencenumber = depositedetailsreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected = Referencenumber;
	if (actualText.equals(expected)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void validateadvanceageinglisttab() throws IOException, InterruptedException{
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Customer']"));
	Reports.advanceageinglisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Deposit Details']"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Advance Ageing List']"));
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Advance Ageing List']")).trim();
	String expected ="Advance Ageing List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Advance Ageing List verified");
		    } else {
				  System.out.println("Advance Ageing List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Advance Ageing List: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);	
}
public void advanceageinglistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.advanceageinglisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "AdvanceAgeingList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void advanceageinglistaccounts() throws InterruptedException {
	
//    Reports.customertab.click();
//    Reports.advanceageinglisttab.click();
	WebElement accountinadvanceageinglist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[2]/td[6]//span)[1]")));
	String Asset = accountinadvanceageinglist.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void advanceageinglistreferencenumberandcustomer() throws InterruptedException{
	
//	Reports.customertab.click();
	Reports.advanceageinglisttab.click();
	WebElement advanceageinglistreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[2]/td[1]//a)[1]")));
	String referencenumber = advanceageinglistreferencenumber.getText().trim();
	String REF = referencenumber;
	System.out.println("REF: " + referencenumber);
	HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[2]/td[1]//a)[1]"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected = referencenumber;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement advanceageinglistcustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[2]/td[5]//a)[1]")));
		String customername = advanceageinglistcustomername.getText().trim();
		String C = customername;
		System.out.println("C: " + customername);
		HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[2]/td[5]//a)[1]"));
		String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected1 = customername;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("customername verified");
		       } else {
			         System.out.println("customername not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying customername: " + e.getMessage());
	           } 
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));  
}
public void validatequotationbycustomertab() throws IOException, InterruptedException {
	
	Reports.customertab.click();
	Reports.quotationbycustomertab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Open Invoice']"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Quotation By Customer']"));
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Quotation By Customer']")).trim();
	String expected ="Quotation By Customer";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Quotation By Customer verified");
		    } else {
				  System.out.println("Quotation By Customer not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Quotation By Customer: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void  customerdropdowninquotationbycustomer() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.quotationbycustomertab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Open Invoice']"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Quotation By Customer']"));
	WebElement Customernameinquotationbycustomer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[5]")));
	String Customername = Customernameinquotationbycustomer.getText().trim();
	System.out.println("Customer name from table: " + Customername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Customername);
	HelperClass.selectFirstSuggestedCustomer("Customername");
	String actualText = HelperClass.getText(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[5]")).trim();
	String expected = Customername;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void quotationbycustomeractions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.quotationbycustomertab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "QuotationByCustomer Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void quotationbycustomeraccounts() throws InterruptedException {
	
//    Reports.customertab.click();
//    Reports.quotationbycustomertab.click();
	WebElement accountinadvanceageinglist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//span")));
	String Asset = accountinadvanceageinglist.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Quotations']"));
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//div/span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void quotationbycustomerreferencenumber() throws InterruptedException{
	
//	Reports.customertab.click();
	Reports.quotationbycustomertab.click();
	WebElement quotationbycustomerreferencenumber= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a")));
	String Referencenumber = quotationbycustomerreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected = Referencenumber;
	if (actualText.equals(expected)) {
		System.out.println("Reference number verified");
	} else {
		System.out.println("Reference number not verified" + actualText);
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
	Thread.sleep(8000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void validateinvoiceandreceivedpaymentstab() throws IOException, InterruptedException {
	
	Reports.customertab.click();
	Reports.invoiceandreceivedpaymentstab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Open Invoice']"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoice and Received Payments']"));
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Invoice and Received Payments']")).trim();
	String expected ="Invoice and Received Payments";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Invoice and Received Payments verified");
		    } else {
				  System.out.println("Invoice and Received Payments not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Invoice and Received Payments: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void  customerdropdownininvoiceandreceivedpayments() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.invoiceandreceivedpaymentstab.click();
//	Thread.sleep(1000);
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Open Invoice']"));
//	Thread.sleep(2000);
//	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoice and Received Payments']"));
	WebElement Customernameininvoiceandreceivedpayments = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a")));
	String Customername = Customernameininvoiceandreceivedpayments.getText().trim();
	System.out.println("Customer name from table: " + Customername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Customername);
	HelperClass.selectFirstSuggestedCustomer("Customername");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a")).trim();
	String expected = Customername;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void invoiceandreceivedpaymentsactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.invoiceandreceivedpaymentstab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "InvoiceAndReceivedPayments Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void invoiceandreceivedpaymentsaccounts() throws InterruptedException {
	
//    Reports.customertab.click();
//    Reports.invoiceandreceivedpaymentstab.click();
	WebElement accountininvoiceandreceivedpayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String Asset = accountininvoiceandreceivedpayment.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	    HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoice and Received Payments']"));
	    Thread.sleep(2000);
		WebElement accountininvoiceandreceivedpayment1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span")));
		String Asset1 = accountininvoiceandreceivedpayment1.getText().trim();
		String Account1 = Asset1;
		System.out.println("Account1: " + Asset1);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Receipts']"));
		Thread.sleep(2000);
		String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}

}
public void invoiceandreceivedpaymentsreferencenumberandcustomername() throws InterruptedException{
	
//	Reports.customertab.click();
	Reports.invoiceandreceivedpaymentstab.click();
	WebElement invoiceandreceivedpaymentsreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a")));
	String referencenumber = invoiceandreceivedpaymentsreferencenumber.getText().trim();
	String REF = referencenumber;
	System.out.println("REF: " + referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected = referencenumber;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		WebElement invoiceandreceivedpaymentscustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a")));
		String customername = invoiceandreceivedpaymentscustomername.getText().trim();
		String C = customername;
		System.out.println("C: " + customername);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected1 = customername;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("customername verified");
		       } else {
			         System.out.println("customername not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying customername: " + e.getMessage());
	           } 
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));  
}
public void validatesalesbyproductservicedetailtab() throws InterruptedException, IOException{
	
	Reports.customertab.click();
	Reports.salesbyproductservicedetailtab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Open Invoice']"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales by Product/Service Detail']"));
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales by Product/Service Detail']")).trim();
	String expected ="Sales by Product/Service Detail";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Sales by Product/Service Detail verified");
		    } else {
				  System.out.println("Sales by Product/Service Detail not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Sales by Product/Service Detail: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void  customerdropdowninsalesbyproductservicedetails() throws InterruptedException {
	
//	Reports.customertab.click();
//	Reports.salesbyproductservicedetailtab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Open Invoice']"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales by Product/Service Detail']"));
	WebElement Customernameinsalesbyproductservicedetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a")));
	String Customername = Customernameinsalesbyproductservicedetails.getText().trim();
	System.out.println("Customer name from table: " + Customername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Customername);
	HelperClass.selectFirstSuggestedCustomer("Customername");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a")).trim();
	String expected = Customername;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void salesbyproductservicedetailactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.salesbyproductservicedetailtab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SalesByProductDetail Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void salesbyproductservicedetailaccounts() throws InterruptedException {
	
//    Reports.customertab.click();
//    Reports.salesbyproductservicedetailtab.click();
	WebElement accountinsalesbyproductservicedetail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[2]/td[8]//span)[1]")));
	String Asset = accountinsalesbyproductservicedetail.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales by Product/Service Detail']"));
	   WebElement accountinsalesbyproductservicedetail1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[3]/td[8]//span)[1]")));
		String Asset1 = accountinsalesbyproductservicedetail1.getText().trim();
		String Account1 = Asset1;
		System.out.println("Account1: " + Asset1);
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Invoices']"));
		Thread.sleep(2000);
		String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
}
public void salesbyproductservicedetailreferencenumberandcustomername() throws InterruptedException{
	
//	Reports.customertab.click();
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales by Product/Service Detail']"));
	Thread.sleep(1000);
	WebElement salesbyproductservicedetailreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[4]//a")));
	String referencenumber = salesbyproductservicedetailreferencenumber.getText().trim();
	String REF = referencenumber;
	System.out.println("REF: " + referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[4]//a"));
	String actualText = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[2]/td[2])[1]")).trim();
	String expected = referencenumber;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement salesbyproductservicedetailcustomername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a")));
		String customername = salesbyproductservicedetailcustomername.getText().trim();
		String C = customername;
		System.out.println("C: " + customername);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected1 = customername;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("customername verified");
		       } else {
			         System.out.println("customername not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying customername: " + e.getMessage());
	           } 
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));  
}
public void validatesalesbyproductservicesummarytab() throws IOException{
	
	Reports.customertab.click();
	Reports.salesbyproductservicesummarytab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Sales by Product/Service Summary']")).trim();
	String expected ="Sales by Product/Service Summary";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Sales by Product/Service Summary verified");
		    } else {
				  System.out.println("Sales by Product/Service Summary not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Sales by Product/Service Summary: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void searchinsalesbyproductservicesummary () {
	
//	Reports.customertab.click();
//	Reports.salesbyproductservicesummarytab.click();
	WebElement productname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//span")));
	String Product = productname.getText().trim();
	String P = Product;
	System.out.println("P: " + Product);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Product);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//span")).trim();
	String expected = Product;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with customer name");
	    } else {
		System.out.println("search is not verified with customer name: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with customer name: " + e.getMessage());
		}
}
public void salesbyproductservicesummaryactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.customertab.click();
//	Reports.salesbyproductservicesummarytab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SalesByProductSummary Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void validatesuppliertab() {
	
	Reports.suppliertab.click();
	assertTrue(HelperClass.getDriver().findElement(By.xpath("(//a[normalize-space(text())='Advance Report'])[2]"))
			.isDisplayed());
    System.out.println("Advance Report verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Purchases Report']"))
			.isDisplayed());
    System.out.println("Purchases Report verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Supplier List']"))
			.isDisplayed());
    System.out.println("Supplier List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Supplier Ageing List']"))
			.isDisplayed());
    System.out.println("Supplier Ageing List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Transactions By Supplier']"))
	 		.isDisplayed());
    System.out.println("Transactions By Supplier verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Payment To Supplier']"))
			.isDisplayed());
    System.out.println("Payment To Supplier verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Creditors']"))
			.isDisplayed());
    System.out.println("Creditors verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Supplier Statement']"))
		.isDisplayed());
    System.out.println("Supplier Statement verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Purchases Invoice List']"))
			.isDisplayed());
    System.out.println("Purchases Invoice List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Unpaid Purchases']"))
			.isDisplayed());
    System.out.println("Unpaid Purchases List verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Expenses by Supplier Summary']"))
			.isDisplayed());
    System.out.println("Expenses by Supplier Summary verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Supplier Balance Summary']"))
			.isDisplayed());
    System.out.println("Supplier Balance Summary verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Account Payable Ageing list']"))
			.isDisplayed());
    System.out.println("Account Payable Ageing list verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Cheque Detail']"))
			.isDisplayed());
    System.out.println("Cheque Detail verified");
    assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Purchase and Applied Payments']"))
			.isDisplayed());
    System.out.println("Purchase and Applied Payments verified");
}
public void validateadvancereportinsupplier() throws IOException {
	
	Reports.advancereportinsuppliertab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Advance Report']")).trim();
	String expected ="Advance Report";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Advance Report verified");
		    } else {
				  System.out.println("Advance Report not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Advance Report: " + e.getMessage());
			}
	    HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, expected);	
}
public void searchinadvancereportinsupplier() {
	
//	Reports.suppliertab.click();
//	Reports.advancereportinsuppliertab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String Name = Suppliername.getText().trim();
	String N = Name;
	System.out.println("N: " + Name);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Name);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with supplier name");
	    } else {
		System.out.println("search is not verified with supplier name: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with supplier name: " + e.getMessage());
		}
}
public void advancereportsupplierdropdown() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.advancereportinsuppliertab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String Name = Suppliername.getText().trim();
	System.out.println("Supplier name from table: " + Suppliername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Name);
	HelperClass.selectFirstSuggestedCustomer("Suppliername");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	            }
	    } catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	    }
}
public void advancereportactionsinsupplier() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.advancereportinsuppliertab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SupplierAdvance Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void advancereportaccountsinsupplier() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.advancereportinsuppliertab.click();
	WebElement advancereportaccountsinsupplier = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//span")));
	String Asset = advancereportaccountsinsupplier.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void advancereportsupplierreferencenumberinsupplier() throws InterruptedException{
	
//	Reports.suppliertab.click();
	Reports.advancereportinsuppliertab.click();
	WebElement advancereportsupplier = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String supplier = advancereportsupplier.getText().trim();
	String S = supplier;
	System.out.println("S: " + supplier);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected = supplier;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Supplier verified");
	       } else {
		         System.out.println("Supplier not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		WebElement advancereportreferencenumberinsupplier = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
		String Referencenumber = advancereportreferencenumberinsupplier.getText().trim();
		String REF = Referencenumber;
		System.out.println("REF: " + Referencenumber);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
		String expected1 = Referencenumber;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("Customername verified");
		       } else {
			         System.out.println("Customername not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying customername: " + e.getMessage());
	           } 
		    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
			Thread.sleep(8000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
			Thread.sleep(1000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void advancereportpaginationinsupplier() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.advancereportinsuppliertab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void advancereportnextbuttoninsupplier() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.advancereportinsuppliertab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void advancereportpreviousbuttoninsupplier() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatepurchasesreport() throws IOException{
	
	Reports.suppliertab.click();
	Reports.purchasesreporttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Purchases Report']")).trim();
	String expected ="Purchases Report";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Purchases Report verified");
		    } else {
				  System.out.println("Purchases Report not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Purchases Report: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//input[@aria-autocomplete='list']"), By.xpath("(//div[@role='option'])[1]"), null, expected);
}
public void purchasesreportactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.purchasesreporttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Purchases Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void purchasesreportaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.purchasesreporttab.click();
	WebElement purchasesreportaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//span")));
	String Asset = purchasesreportaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void validatesupplierlist(){
	
	Reports.suppliertab.click();
	Reports.supplierlisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier List']")).trim();
	String expected ="Supplier List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Supplier List verified");
		    } else {
				  System.out.println("Supplier List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Supplier List: " + e.getMessage());
			}
}
public void searchinsupplierlist() {
	
//	Reports.suppliertab.click();
//	Reports.supplierlisttab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Supplier = Suppliername.getText().trim();
	String S = Supplier;
	System.out.println("S: " + Supplier);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Supplier);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Supplier;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with supplier");
	    } else {
		System.out.println("search is not verified with supplier: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with supplier: " + e.getMessage());
		}
}
public void supplierlistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.supplierlisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SupplierList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void supplierlistsuppliername(){
	
//	Reports.suppliertab.click();
//	Reports.supplierlisttab.click();
	WebElement supplierlistsuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String supplier = supplierlistsuppliername.getText().trim();
	String S = supplier;
	System.out.println("S: " + supplier);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected = supplier;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Supplier verified");
	       } else {
		         System.out.println("Supplier not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void supplierlistpagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.supplierlisttab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void supplierlistnextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierlisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void supplierlistpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatesupplierageinglist(){
	
	Reports.suppliertab.click();
	Reports.supplierageinglisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier Ageing List']")).trim();
	String expected ="Supplier Ageing List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Supplier Ageing List verified");
		    } else {
				  System.out.println("Supplier Ageing List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Supplier Ageing List: " + e.getMessage());
			}
}
public void searchinsupplierageinglist() {
	
//	Reports.suppliertab.click();
//	Reports.supplierageinglisttab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Supplier = Suppliername.getText().trim();
	String S = Supplier;
	System.out.println("S: " + Supplier);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Supplier);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Supplier;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with supplier");
	    } else {
		System.out.println("search is not verified with supplier: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with supplier: " + e.getMessage());
		}
}
public void supplierageinglistsupplierdropdown() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierageinglisttab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Name = Suppliername.getText().trim();
	System.out.println("Customer name from table: " + Name);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Name);
	HelperClass.selectFirstSuggestedCustomer("customerName");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified supplier name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in supplier name. Expected: " + expected + ", but found: " + actualText);
	            }
	    } catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	    }
}
public void supplierageinglistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.supplierageinglisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SupplierAgeingList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void supplierageinglistaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierageinglisttab.click();
	WebElement purchasesreportaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//span")));
	String Asset = purchasesreportaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void supplierageinglistsuppliername(){
	
//	Reports.suppliertab.click();
	Reports.supplierageinglisttab.click();
	WebElement supplierageinglistsuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String supplier = supplierageinglistsuppliername.getText().trim();
	String S = supplier;
	System.out.println("S: " + supplier);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
	String expected = supplier;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Supplier verified");
	       } else {
		         System.out.println("Supplier not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void supplierageinglistpagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.supplierageinglisttab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void supplierageinglistnextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierageinglisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void supplierageinglistpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatetransactionsbysupplier() throws IOException{
	
	Reports.suppliertab.click();
	Reports.transactionsbysuppliertab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Transactions By Supplier']")).trim();
	String expected ="Transactions By Supplier";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Transactions By Supplier verified");
		    } else {
				  System.out.println("Transactions By Supplier not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Transactions By Supplier: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, expected);
}
public void searchintransactionsbysupplier() {
	
//	Reports.suppliertab.click();
//	Reports.transactionsbysuppliertab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
	String Reference = Referencenumber.getText().trim();
	String REF = Reference;
	System.out.println("S: " + Reference);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Reference);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")).trim();
	String expected = Reference;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
	
}
public void transactionsbysuppliersupplierdropdown(){
	
//	Reports.suppliertab.click();
//	Reports.transactionsbysuppliertab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'ng-value')]//span")));
	String SupplierName = Suppliername.getText().trim();
	System.out.println("Supplier: " + SupplierName);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
	String actualText = HelperClass.getText(By.xpath("//div[text() = 'Sent by :']/following-sibling::b")).trim();
	String expected = SupplierName;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified supplier name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in supplier name. Expected: " + expected + ", but found: " + actualText);
	           }
	    } catch (Exception e) {
	        System.out.println("⚠️ Error during verification: " + e.getMessage());
	    }
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
}
public void transactionsbysupplieractions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.transactionsbysuppliertab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "TransactionsBySupplier Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void transactionsbysupplieraccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.transactionsbysuppliertab.click();
	WebElement transactionsbysupplieraccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String Asset = transactionsbysupplieraccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void transactionsbysupplieraccountnamereferencenumber() throws InterruptedException{
	
//	Reports.suppliertab.click();
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Transactions By Supplier']"));
	Thread.sleep(1000);
	WebElement transactionsbysupplieraccountname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Account = transactionsbysupplieraccountname.getText().trim();
	String Accountname = Account;
	System.out.println("Accountname: " + Account);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	Thread.sleep(4000);
	String actualText = HelperClass.getText(By.xpath("(//div[contains(@class,'ng-value')]//span)[2]")).trim();
	String expected = Account;
	   try {
	       if (actualText.equals(expected)) {
		         System.out.println("Accountname verified");
	       } else {
		         System.out.println("Accountname not verified" + actualText);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Accountname: " + e.getMessage());
           } 
      HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Transactions By Supplier']"));
      Thread.sleep(1000);
		WebElement transactionsbysupplierreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
		String Referencenumber = transactionsbysupplierreferencenumber.getText().trim();
		String REF = Referencenumber;
		System.out.println("REF: " + Referencenumber);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
		String expected1 = Referencenumber;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("Referencenumber verified");
		       } else {
			         System.out.println("Referencenumber not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
	           } 
		    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
			Thread.sleep(8000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
			Thread.sleep(2000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void transactionsbysupplierpagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.transactionsbysuppliertab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void transactionsbysuppliernextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.transactionsbysuppliertab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void transactionsbysupplierpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatepaymenttosupplier() throws IOException{
	
	Reports.suppliertab.click();
	Reports.paymenttosuppliertab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Payment To Supplier']")).trim();
	String expected ="Payment To Supplier";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Payment To Supplier verified");
		    } else {
				  System.out.println("Payment To Supplier not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Payment To Supplier: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, expected);
}
public void searchinpaymenttosuppliertab() {
	
//	Reports.suppliertab.click();
//	Reports.paymenttosuppliertab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Reference = Referencenumber.getText().trim();
	String REF = Reference;
	System.out.println("S: " + Reference);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Reference);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Reference;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void paymenttosuppliersupplierdropdown(){
	
//	Reports.suppliertab.click();
//	Reports.paymenttosuppliertab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Name = Suppliername.getText().trim();
	System.out.println("Suppplier name from table: " + Name);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Name);
	HelperClass.selectFirstSuggestedCustomer("Name");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified supplier name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in supplier name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void paymenttosupplieractions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.paymenttosuppliertab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "PaymentToSupplier Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void paymenttosupplieraccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.paymenttosuppliertab.click();
	WebElement paymenttosupplieraccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = paymenttosupplieraccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void paymenttosupplierreferencenumbersuppliername() throws InterruptedException{
	
//	    Reports.suppliertab.click();
	    Reports.paymenttosuppliertab.click();
		WebElement paymenttosupplierreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
		String Referencenumber = paymenttosupplierreferencenumber.getText().trim();
		String REF = Referencenumber;
		System.out.println("REF: " + Referencenumber);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
		String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
		String expected1 = Referencenumber;
		   try {
		       if (actualText1.equals(expected1)) {
			         System.out.println("Referencenumber verified");
		       } else {
			         System.out.println("Referencenumber not verified" + actualText1);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
	           } 
		    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
			Thread.sleep(8000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
			Thread.sleep(1000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
			WebElement paymenttosuppliersuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
			String Supplier = paymenttosuppliersuppliername.getText().trim();
			String Suppliername = Supplier;
			System.out.println("Suppliername: " + Supplier);
			HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
			Thread.sleep(4000);
			String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
			String expected = Supplier;
			   try {
			       if (actualText.equals(expected)) {
				         System.out.println("Suppliername verified");
			       } else {
				         System.out.println("Suppliername not verified" + actualText);
			              }
		           } catch (Exception e) {
			             System.out.println("An error occurred while verifying Suppliername: " + e.getMessage());
		           } 
			   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
			   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void paymenttosupplierpagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.paymenttosuppliertab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void paymenttosuppliernextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.paymenttosuppliertab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void paymenttosupplierpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatecreditorstab() throws IOException{
	
HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Supplier']"));
	Reports.creditorstab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Creditors']")).trim();
	String expected ="Creditors";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Creditors verified");
		    } else {
				  System.out.println("Creditors not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Creditors: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void creditorssupplierdropdown() throws InterruptedException{
	
	By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.creditorstab.click();
	WebElement Suppliernameincreditors = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[4]")));
	String Suppliername = Suppliernameincreditors.getText().trim();
	System.out.println("Supplier name from table: " + Suppliername);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	HelperClass.safeSendKeys(dropdownInput, Suppliername);
	HelperClass.selectFirstSuggestedCustomer("Suppliername");
	String actualText = HelperClass.getText(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[4]")).trim();
	String expected = Suppliername;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void creditorsactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.creditorstab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Creditors Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As PDF(OutStanding Bal.)']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF(OutStanding Bal.)']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As Excel(OutStanding Bal.)']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As Excel(OutStanding Bal.)']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export As CSV(OutStanding Bal.)']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As CSV(OutStanding Bal.)']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void creditorsaccounts() throws InterruptedException {
	
	By spinner = By.cssSelector(".ngx-spinner-overlay");
//	Reports.suppliertab.click();
//	Reports.creditorstab.click();
//	Thread.sleep(1000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	HelperClass.clickUsingJS(By.xpath("(//table[@aria-describedby='Expand Table']/tbody/mat-row/mat-cell//div)[3]"));
	Thread.sleep(4000);
	WebElement creditorsaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@aria-describedby='main-list']/tbody/tr[1]/td[5]//span)[1]")));
	String Asset = creditorsaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void validatesupplierstatementtab() throws IOException{
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Supplier']"));
	Reports.supplierstatementtab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier Statement']")).trim();
	String expected ="Supplier Statement";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Supplier Statement verified");
		    } else {
				  System.out.println("Supplier Statement not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Supplier Statement: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, expected);
	   HelperClass.selectAllDropdownOptions(By.xpath("(//ng-select[@appendto='body'])[1]"), By.xpath("//div[@role='option']"), null, expected);	
}
public void searchinsupplierstatement() {
	
//	Reports.suppliertab.click();
//	Reports.supplierstatementtab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String REF = Referencenumber.getText().trim();
	String Number = REF;
	System.out.println("Number: " + REF);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), REF);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")).trim();
	String expected = REF;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void  supplierdropdowninsupplierstatement() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierstatementtab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'ng-value')]//span)[2]")));
	String Name = Suppliername.getText().trim();
	System.out.println("Supplier: " + Name);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
	String actualText = HelperClass.getText(By.xpath("//div[text() = 'Sent by :']/following-sibling::b")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified customer name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in customer name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
}
public void supplierstatementactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//  Reports.suppliertab.click();
//	Reports.supplierstatementtab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SupplierStatement Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void supplierstatementaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierstatementtab.click();
	Thread.sleep(2000);
	WebElement supplierstatementaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String Asset = supplierstatementaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}

}
public void supplierstatementreferencenumber() throws InterruptedException{
	
//	Reports.suppliertab.click();
	Reports.supplierstatementtab.click();
	WebElement supplierstatementreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
	String Referencenumber = supplierstatementreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber;
	   try {
	       if (actualText1.equals(expected1)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText1);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void supplierstatementpagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.supplierstatementtab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void supplierstatementnextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierstatementtab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void supplierstatementpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatepurchasesinvoicelisttab() throws IOException{
	
	Reports.suppliertab.click();
	Reports.purchasesinvoicelisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Purchases Invoice List']")).trim();
	String expected ="Purchases Invoice List";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Purchases Invoice List verified");
		    } else {
				  System.out.println("Purchases Invoice List not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Purchases Invoice List: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, expected);
}
public void searchinpurchasesinvoicelist() {
	
//	Reports.suppliertab.click();
//	Reports.purchasesinvoicelisttab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[2]//a")));
	String REF = Referencenumber.getText().trim();
	String Number = REF;
	System.out.println("Number: " + REF);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), REF);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[2]//a")).trim();
	String expected = REF;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void  supplierdropdowninpurchasesinvoicelist() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.purchasesinvoicelisttab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
	String Name = Suppliername.getText().trim();
	System.out.println("Suppplier name from table: " + Name);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Name);
	HelperClass.selectFirstSuggestedCustomer("Name");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified supplier name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in supplier name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void purchasesinvoicelistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//    Reports.suppliertab.click();
//	Reports.purchasesinvoicelisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "PurchasesInvoiceList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void purchasesinvoicelistaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.purchasesinvoicelisttab.click();
	WebElement purchasesinvoicelistaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span")));
	String Asset = purchasesinvoicelistaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	    Reports.purchasesinvoicelisttab.click();
	    Thread.sleep(1000);	
	    WebElement purchasesinvoicelistaccounts1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span")));
		String Asset1 = purchasesinvoicelistaccounts1.getText().trim();
		String Account1 = Asset1;
		System.out.println("Account1: " + Asset1);
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
		Thread.sleep(2000);
		String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
}
public void purchasesinvoicelistreferencenumberandsuppliername() throws InterruptedException{
	
//	Reports.suppliertab.click();
	Reports.purchasesinvoicelisttab.click();
	WebElement purchasesinvoicelistreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
	String Referencenumber = purchasesinvoicelistreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber;
	   try {
	       if (actualText1.equals(expected1)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText1);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement purchasesinvoicelistsuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a")));
		String supplier = purchasesinvoicelistsuppliername.getText().trim();
		String S = supplier;
		System.out.println("S: " + supplier);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[5]//a"));
		String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected = supplier;
		   try {
		       if (actualText.equals(expected)) {
			         System.out.println("Supplier verified");
		       } else {
			         System.out.println("Supplier not verified" + actualText);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
	           } 
		    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		WebElement purchasesinvoicelistreferencenumber1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[2]//a")));
		String Referencenumber1= purchasesinvoicelistreferencenumber1.getText().trim();
		String REF1 = Referencenumber1;
		System.out.println("REF1: " + Referencenumber1);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[2]//a"));
		String actualText2 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
		String expected2 = Referencenumber1;
		   try {
		       if (actualText2.equals(expected2)) {
			         System.out.println("Referencenumber verified");
		       } else {
			         System.out.println("Referencenumber not verified" + actualText2);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
	           } 
		    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
			Thread.sleep(8000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
			Thread.sleep(2000);
			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
			 WebElement supplierstatementreferencenumber2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a")));
				String Referencenumber2= supplierstatementreferencenumber2.getText().trim();
				String REF2 = Referencenumber2;
				System.out.println("REF2: " + Referencenumber2);
				HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a"));
				String actualText3 = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
				String expected3 = supplier;
				   try {
				       if (actualText3.equals(expected3)) {
					         System.out.println("Supplier verified");
				       } else {
					         System.out.println("Supplier not verified" + actualText);
				              }
			           } catch (Exception e) {
				             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
			           } 
				    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
				    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void purchasesinvoicelistpagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.purchasesinvoicelisttab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void purchasesinvoicelistnextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.purchasesinvoicelisttab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void purchasesinvoicelistpreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validateunpaidpurchasestab() throws IOException{
	
	Reports.suppliertab.click();
	Reports.unpaidpurchasestab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Unpaid Purchases']")).trim();
	String expected ="Unpaid Purchases";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Unpaid Purchases verified");
		    } else {
				  System.out.println("Unpaid Purchases not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Unpaid Purchases: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("(//mat-option[@role='option'])[1]"), null, expected);
}
public void searchinunpaidpurchases() {
	
//	Reports.suppliertab.click();
//	Reports.unpaidpurchasestab.click();
	WebElement Referencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[3]//a")));
	String REF = Referencenumber.getText().trim();
	String Number = REF;
	System.out.println("Number: " + REF);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), REF);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[3]//a")).trim();
	String expected = REF;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with reference number");
	    } else {
		System.out.println("search is not verified with reference number: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with reference number: " + e.getMessage());
		}
}
public void supplierdropdowninunpaidpurchases() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.unpaidpurchasestab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")));
	String Name = Suppliername.getText().trim();
	System.out.println("Suppplier name from table: " + Name);
	By dropdownInput = By.xpath("//input[@aria-autocomplete='list']");
	HelperClass.safeSendKeys(dropdownInput, Name);
	HelperClass.selectFirstSuggestedCustomer("Name");
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Verified supplier name with dropdown: " + actualText);
	    } else {
	        System.out.println("❌ Mismatch in supplier name. Expected: " + expected + ", but found: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ Error during verification: " + e.getMessage());
	}
}
public void unpaidpurchasesactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//  Reports.suppliertab.click();
//	Reports.unpaidpurchasestab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Unpaid Purchases Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void unpaidpurchasesaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.unpaidpurchasestab.click();
	WebElement purchasesinvoicelistaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = purchasesinvoicelistaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void unpaidpurchasesreferencenumberandsuppliername() throws InterruptedException{
	
//	Reports.suppliertab.click();
	Reports.unpaidpurchasestab.click();
	WebElement unpaidpurchasesreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a")));
	String Referencenumber = unpaidpurchasesreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber;
	   try {
	       if (actualText1.equals(expected1)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText1);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
//		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		WebElement unpaidpurchasessuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a")));
		String supplier = unpaidpurchasessuppliername.getText().trim();
		String S = supplier;
		System.out.println("S: " + supplier);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[4]//a"));
		String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected = supplier;
		   try {
		       if (actualText.equals(expected)) {
			         System.out.println("Supplier verified");
		       } else {
			         System.out.println("Supplier not verified" + actualText);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
	           } 
		    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void unpaidpurchasespagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.purchasesinvoicelisttab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void unpaidpurchasesnextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.unpaidpurchasestab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void unpaidpurchasespreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validateexpensesbysuppliersummarytab() throws IOException{
	
	Reports.suppliertab.click();
	Reports.expensesbysuppliersummarytab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Expenses by Supplier Summary']")).trim();
	String expected ="Expenses by Supplier Summary";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Expenses by Supplier Summary verified");
		    } else {
				  System.out.println("Expenses by Supplier Summary not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Expenses by Supplier Summary: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void searchinexpensesbysuppliersummary() {
	
//	Reports.suppliertab.click();
//	Reports.expensesbysuppliersummarytab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[1]//a")));
	String Name = Suppliername.getText().trim();
	String S = Name;
	System.out.println("Number: " + Name);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Name);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[1]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with supplier name");
	    } else {
		System.out.println("search is not verified with supplier name: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with supplier name: " + e.getMessage());
		}
}
public void expensesbysuppliersummaryactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//    Reports.suppliertab.click();
//	Reports.expensesbysuppliersummarytab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "ExpensesBySupplierSummary Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void expensesbysuppliersummaryaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.expensesbysuppliersummarytab.click();
	Thread.sleep(1000);
	WebElement expensesbysuppliersummaryaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//span")));
	String Asset = expensesbysuppliersummaryaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void expensesbysuppliersummarysuppliername() throws InterruptedException{
	
//Reports.suppliertab.click();
HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Expenses by Supplier Summary']"));
Thread.sleep(1000);
WebElement expensesbysuppliersummarysuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a")));
String supplier = expensesbysuppliersummarysuppliername.getText().trim();
String S = supplier;
System.out.println("S: " + supplier);
HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[1]//a"));
String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
String expected = supplier;
   try {
       if (actualText.equals(expected)) {
	         System.out.println("Supplier verified");
       } else {
	         System.out.println("Supplier not verified" + actualText);
              }
       } catch (Exception e) {
             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
       } 
    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void expensesbysuppliersummarypagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.expensesbysuppliersummarytab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void expensesbysuppliersummarynextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.expensesbysuppliersummarytab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void expensesbysuppliersummarypreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validatesupplierbalancesummarytab(){
	
	Reports.suppliertab.click();
	Reports.supplierbalancesummarytab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Supplier Balance Summary']")).trim();
	String expected ="Supplier Balance Summary";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Supplier Balance Summary verified");
		    } else {
				  System.out.println("Supplier Balance Summary not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Supplier Balance Summary: " + e.getMessage());
			}
}
public void searchinsupplierbalancesummary() {
	
//	Reports.suppliertab.click();
//	Reports.supplierbalancesummarytab.click();
	WebElement Suppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[2]//a")));
	String Name = Suppliername.getText().trim();
	String S = Name;
	System.out.println("Number: " + Name);
	HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Name);
	String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]//td[2]//a")).trim();
	String expected = Name;
	try {
	    if (actualText.equals(expected)) {
		System.out.println("Search verified with supplier name");
	    } else {
		System.out.println("search is not verified with supplier name: " + actualText);
	            }
	    } catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying search with supplier name: " + e.getMessage());
		}
}
public void supplierbalancesummaryactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//    Reports.suppliertab.click();
//	Reports.supplierbalancesummarytab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "SupplierBalanceSummary Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void supplierbalancesummaryaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierbalancesummarytab.click();
	WebElement supplierbalancesummaryaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[6]//span")));
	String Asset = supplierbalancesummaryaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void supplierbalancesummarysuppliername() throws InterruptedException{
	
//Reports.suppliertab.click();
Reports.supplierbalancesummarytab.click();
WebElement supplierbalancesummarysuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a")));
String supplier = supplierbalancesummarysuppliername.getText().trim();
String S = supplier;
System.out.println("S: " + supplier);
HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[2]//a"));
String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
String expected = supplier;
   try {
       if (actualText.equals(expected)) {
	         System.out.println("Supplier verified");
       } else {
	         System.out.println("Supplier not verified" + actualText);
              }
       } catch (Exception e) {
             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
       } 
    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void supplierbalancesummarypagination() throws Exception {
	
//	Reports.suppliertab.click();
//	Reports.supplierbalancesummarytab.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	 HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	 Thread.sleep(2000);
HelperClass.sendKeys(By.xpath("//input[@aria-label='dropdownlist']"), "5");
	
List<WebElement> rows = driver.findElements(By.xpath("//table[@class='e-table']//tbody/tr"));
System.out.println(rows.size());
	String expected = "5";
//	if (actualText.equals(expected)) {
//	    System.out.println("5 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText1);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='20']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
String expected2 = "Records: 20";

//if (actualText2.equals(expected2)) {
//System.out.println("20 records are there");
//} else {
//System.out.println("Text not matched. Actual: " + actualText);
//}
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	
	String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
	String expected3 = "Records: 100";

//	if (actualText3.equals(expected3)) {
//	    System.out.println("100 records are there");
//	} else {
//	    System.out.println("Text not matched. Actual: " + actualText);
//	}
}
public void supplierbalancesummarynextbutton() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.supplierbalancesummarytab.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void supplierbalancesummarypreviousbutton() throws InterruptedException {
	
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void validateaccountpayableageinglisttab(){
	
	Reports.suppliertab.click();
	Reports.accountpayableageinglisttab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Account Payable Ageing list']")).trim();
	String expected ="Account Payable Ageing list";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Account Payable Ageing list verified");
		    } else {
				  System.out.println("Account Payable Ageing list not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Account Payable Ageing list: " + e.getMessage());
			}
}
public void accountpayableageinglistactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//    Reports.suppliertab.click();
//	Reports.accountpayableageinglisttab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "AccountPayableList Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void accountpayableageinglistaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.accountpayableageinglisttab.click();
	WebElement accountpayableageinglistaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[2]/td[6]//span)[1]")));
	String Asset = accountpayableageinglistaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	  HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account Payable Ageing list']"));
		WebElement accountpayableageinglistaccounts1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='e-table']/tbody/tr[3]/td[6]//span)[1]")));
		String Asset1 = accountpayableageinglistaccounts1.getText().trim();
		String Account1 = Asset1;
		System.out.println("Account1: " + Asset1);
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
		Thread.sleep(2000);
		String actualtext1 = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
}
public void accountpayableageinglistreferencenumberandsuppliername() throws InterruptedException{
	
//	Reports.suppliertab.click();
HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Account Payable Ageing list']"));
	WebElement accountpayableageinglistreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a")));
	String Referencenumber = accountpayableageinglistreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber;
	   try {
	       if (actualText1.equals(expected1)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText1);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	    Thread.sleep(2000);
		WebElement accountpayableageinglistsuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a")));
		String supplier = accountpayableageinglistsuppliername.getText().trim();
		String S = supplier;
		System.out.println("S: " + supplier);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//a"));
		String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected = supplier;
		   try {
		       if (actualText.equals(expected)) {
			         System.out.println("Supplier verified");
		       } else {
			         System.out.println("Supplier not verified" + actualText);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
	           } 
		  Thread.sleep(1000);
		  HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		  Thread.sleep(1000);
		  HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void validatechequedetailtab(){
	
	Reports.suppliertab.click();
	Reports.chequedetailtab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Cheque Detail']")).trim();
	String expected ="Cheque Detail";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Cheque Detail verified");
		    } else {
				  System.out.println("Cheque Detail not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Cheque Detailx: " + e.getMessage());
			}
}
public void chequedetailactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//    Reports.suppliertab.click();
//	Reports.chequedetailtab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "ChequeDetails Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void chequedetailaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.chequedetailtab.click();
	WebElement chequedetailaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[5]//span")));
	String Asset = chequedetailaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
}
public void chequedetailreferencenumber() throws InterruptedException{
	
//	Reports.suppliertab.click();
	Reports.chequedetailtab.click();
	WebElement accountpayableageinglistreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a")));
	String Referencenumber = accountpayableageinglistreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber;
	   try {
	       if (actualText1.equals(expected1)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText1);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void validatepurchaseandappliedpaymentstab() throws IOException{
	
	Reports.suppliertab.click();
	Reports.purchaseandappliedpaymentstab.click();
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Purchase and Applied Payments']")).trim();
	String expected ="Purchase and Applied Payments";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("Purchase and Applied Payments verified");
		    } else {
				  System.out.println("Purchase and Applied Payments not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying Purchase and Applied Payments: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void purchaseandappliedpaymentsactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//    Reports.suppliertab.click();
//	Reports.purchaseandappliedpaymentstab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "PurchaseAndAppliedPayments Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
public void purchaseandappliedpaymentsaccounts() throws InterruptedException {
	
//	Reports.suppliertab.click();
//	Reports.purchaseandappliedpaymentstab.click();
	WebElement purchaseandappliedpaymentsaccounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span")));
	String Asset = purchaseandappliedpaymentsaccounts.getText().trim();
	String Account = Asset;
	System.out.println("Account: " + Asset);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchases']"));
	Thread.sleep(2000);
	String actualtext = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[8]//span"));
	   String expected =Asset;
	   try {
			if (actualtext.equals(expected)) {
				  System.out.println("Account verified");
		    } else {
				  System.out.println("Account not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying account: " + e.getMessage());
			}
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Purchase and Applied Payments']"));
		WebElement purchaseandappliedpaymentsaccounts1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[7]//span")));
		String Asset1 = purchaseandappliedpaymentsaccounts1.getText().trim();
		String Account1 = Asset1;
		System.out.println("Account1: " + Asset1);
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Payments']"));
		Thread.sleep(2000);
		String actualtext1= HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[7]//span"));
		   String expected1 =Asset1;
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Account verified");
			    } else {
					  System.out.println("Account not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying account: " + e.getMessage());
				}
}
public void purchaseandappliedpaymentsreferencenumberandsuppliername() throws InterruptedException{
	
//	Reports.suppliertab.click();
	Reports.purchaseandappliedpaymentstab.click();
	WebElement purchaseandappliedpaymentsreferencenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a")));
	String Referencenumber = purchaseandappliedpaymentsreferencenumber.getText().trim();
	String REF = Referencenumber;
	System.out.println("REF: " + Referencenumber);
	HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[1]//a"));
	String actualText1 = HelperClass.getText(By.xpath("(//table[@align='right']/tbody/tr[1]/td[2])[1]")).trim();
	String expected1 = Referencenumber;
	   try {
	       if (actualText1.equals(expected1)) {
		         System.out.println("Referencenumber verified");
	       } else {
		         System.out.println("Referencenumber not verified" + actualText1);
	              }
           } catch (Exception e) {
	             System.out.println("An error occurred while verifying Referencenumber: " + e.getMessage());
           } 
	    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='save_alt']"));
		Thread.sleep(8000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		WebElement purchaseandappliedpaymentssuppliername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a")));
		String supplier = purchaseandappliedpaymentssuppliername.getText().trim();
		String S = supplier;
		System.out.println("S: " + supplier);
		HelperClass.clickUsingJS(By.xpath("//table[@class='e-table']/tbody/tr[2]/td[3]//a"));
		String actualText = HelperClass.getText(By.xpath("(//span[@class='clamp'])[1]")).trim();
		String expected = supplier;
		   try {
		       if (actualText.equals(expected)) {
			         System.out.println("Supplier verified");
		       } else {
			         System.out.println("Supplier not verified" + actualText);
		              }
	           } catch (Exception e) {
		             System.out.println("An error occurred while verifying supplier: " + e.getMessage());
	           } 
		    HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
}
public void validateVATtab() throws IOException{
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT']"));
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='VAT']")).trim();
	String expected ="VAT";
	   try {
			if (actualText.equals(expected)) {
				  System.out.println("VAT verified");
		    } else {
				  System.out.println("VAT not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying VAT: " + e.getMessage());
			}
	   HelperClass.selectAllDropdownOptions(By.xpath("//div[contains(@class,'arrow')]/div"), By.xpath("//mat-option[@role='option']"), null, expected);
}
public void VATactions() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    By exportMenu = By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]");
    By spinner = By.cssSelector(".ngx-spinner-overlay");
//    Reports.suppliertab.click();
//	Reports.VATtab.click();
//	   Thread.sleep(5000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   Thread.sleep(5000);
	   String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
	   String expected = "Share";
	   try {
			  if (actualtext.equals(expected)) {
				   System.out.println("Mail pop up displayed");
			  } else {
				   System.out.println("Mail pop up not displayed");
				      }
			  } catch (Exception e) {
				   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
			  }
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
	   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
	   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "VAT Report");
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   Thread.sleep(5000);
	   String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
	   String expected1 = "Mail sent successfully!";
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("Mail sent successfully!");
		    } else {
				  System.out.println("Mail not sent");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying mail: " + e.getMessage());
			}
	//   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send Mail']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	   Thread.sleep(1000);
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Share']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		           }
		    } catch (Exception e) {
		        System.out.println("An error occurred while verifying cancel in mail: " + e.getMessage());
		    }
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	//   Thread.sleep(4000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
//	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
//	   Thread.sleep(4000);
//	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
//	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
//	   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
}
}