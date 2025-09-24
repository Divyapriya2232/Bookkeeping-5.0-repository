package com.Capium.Actions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_MTD_Locators;
import com.Capium.Utilites.HelperClass;
import com.Capium.stepDefinations.Hooks;

public class Bookkeeping_MTD_Actions {
	
	Bookkeeping_MTD_Locators MTD = null;
	   WebDriverWait wait=HelperClass.getWait();
	   WebDriver driver=HelperClass.getDriver();
	
public Bookkeeping_MTD_Actions() {
		this.MTD = new Bookkeeping_MTD_Locators();
		PageFactory.initElements(driver, MTD);
	}
	
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	public void validatemtdtab() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']"));
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']"), "BK Automation");
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
		Thread.sleep(2000);
		   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
		   Thread.sleep(5000);
		   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='MTD']"));
//		   Thread.sleep(1000);
		   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[ normalize-space(text())='Submit VAT']"))
					.isDisplayed());
		   System.out.println("Submit VAT verified");
		   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[ normalize-space(text())='Bridging VAT']"))
					.isDisplayed());
		   System.out.println("Bridging VAT verified");
		   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[ normalize-space(text())='View VAT Details']"))
					.isDisplayed());
		   System.out.println("View VAT Details verified");
		   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[ normalize-space(text())='VAT Transactions Detail']"))
					.isDisplayed());
		   System.out.println("VAT Transactions Detail verified");
		   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[ normalize-space(text())= 'VAT Settings']"))
					.isDisplayed());
		   System.out.println("VAT Settings verified");
	}
	public void validatesubmitvattab() {
		
		HelperClass.waitForPageToLoad(driver);
		MTD.submitvattab.click();
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='VAT Period']"));
		String expected = "VAT Period";
			try {
				 if (actualtext.equals(expected)) {
				      System.out.println("VAT Period verified");
				  } else {
				      System.out.println("VAT Period not verified");
				          }
				  } catch (Exception e) {
				      System.out.println("An error occurred while verifying VAT Period: " + e.getMessage());
				  }
	}
	public void validatevatperiodinsubmitvat() throws IOException{
		
		MTD.submitvattab.click();
		HelperClass.clickUsingJS(By.xpath("//span[ normalize-space(text())='VAT Period']"));
//		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.submitvatfromdate,"01/04/2025");
//		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.submitvattodate,"01/05/2025");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save & Next']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Include']"));
		HelperClass.selectAllDropdownOptions(By.xpath("(//div[contains(@class,'arrow')]/div)[1]"), By.xpath("(//mat-option[@role='option'])[1]"), null, null);	
		HelperClass.selectAllDropdownOptions(By.xpath("(//div[contains(@class,'arrow')]/div)[2]"), By.xpath("(//mat-option[@role='option'])[1]"), null, null);
		HelperClass.clickUsingJS(By.xpath("(//Input[@type='checkbox'])[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
		HelperClass.captureScreenshot("Include records");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Purchase VAT']"));
		HelperClass.captureScreenshot("Include records");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save & Next']"));
		HelperClass.captureScreenshot("Review returns");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Prev']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save & Next']"));
		HelperClass.clickUsingJS(By.xpath("(//input[@type='checkbox'])[2]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Submit To Capium']"));
		String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='VAT return has been submitted to Capium successfully']")).trim();
		String expected ="VAT return has been submitted to Capium successfully";
		   try {
				if (actualText.equals(expected)) {
					  System.out.println("Submit to capium verified");
			    } else {
					  System.out.println("Submit to capium not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying Submit to capium: " + e.getMessage());
				}
		 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Submit To HMRC']"));
		 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
	     String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']")).trim();
	     String expected1 ="The operation completed Successfully!";
			   try {
					if (actualText1.equals(expected1)) {
						  System.out.println("Submit to HMRC verified");
				    } else {
						  System.out.println("Submit to HMRC not verified");
				           }
					} catch (Exception e) {
						  System.out.println("An error occurred while verifying Submit to HMRC: " + e.getMessage());
					}	
	}
	 
	public void mousehoveractionsinsubmitvat() throws InterruptedException, IOException {
		
		MTD.submitvattab.click();
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='View']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='View']"));
		Thread.sleep(2000);
		String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='VAT Audit Report']"));
		String expected = "VAT Audit Report";
			try {
				 if (actualtext.equals(expected)) {
				      System.out.println("VAT Audit Report verified");
				  } else {
				      System.out.println("VAT Audit Report not verified");
				          }
				  } catch (Exception e) {
				      System.out.println("An error occurred while verifying VAT Audit Report: " + e.getMessage());
				  }
		HelperClass.captureScreenshot("Vat return screen");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales VAT']"));
		HelperClass.captureScreenshot("Sales vat screen");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Purchase VAT']"));
		HelperClass.captureScreenshot("Purchase vat screen");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Sales No VAT']"));
		HelperClass.captureScreenshot("Sales no vat screen");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Purchase No VAT']"));
		HelperClass.captureScreenshot("Purchase no vat screen");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Export']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='Export']"));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Flat Rate Adjustment']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='Flat Rate Adjustment']"));
		Thread.sleep(2000);
		String actualtext1 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Flat Rate Adjustment Journal']"));
		String expected1 = "Flat Rate Adjustment Journal";
			try {
				 if (actualtext1.equals(expected1)) {
				      System.out.println("Flat Rate Adjustment Journal verified");
				  } else {
				      System.out.println("Flat Rate Adjustment Journal not verified");
				          }
				  } catch (Exception e) {
				      System.out.println("An error occurred while verifying Flat Rate Adjustment Journal: " + e.getMessage());
				  }
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.flatrateadjustmentjournaldate,"10/09/2025");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
		HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Email']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='Email']"));
		String actualtext2 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
		String expected2 = "Share";
		   try {
				  if (actualtext2.equals(expected2)) {
					   System.out.println("Mail pop up displayed");
				  } else {
					   System.out.println("Mail pop up not displayed");
					      }
				  } catch (Exception e) {
					   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
				  }
		   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
		   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
		   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "Report");
		   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
		   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		   Thread.sleep(5000);
		   String actualtext3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
		   String expected3 = "Mail sent successfully!";
		   try {
				if (actualtext3.equals(expected3)) {
					  System.out.println("Mail sent successfully!");
			    } else {
					  System.out.println("Mail not sent");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying mail: " + e.getMessage());
				}
			HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Email']")));
			HelperClass.clickUsingJS(By.xpath("//button[@title='Email']"));
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
	}
	public void paginationinsubmitvat() throws InterruptedException {
		
		MTD.submitvattab.click();
		HelperClass.validateDropdownRecordCount(driver);
	}
	public void nextbuttoninsubmitvat() {
		
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
	}
	 
	public void previousbuttoninsubmitavt() throws InterruptedException {
		
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
	}
	public void validatebridgingvat() {
		
		MTD.bridgingvattab.click();
		String actualtext = HelperClass.getText(By.xpath("//span[ normalize-space(text())='VAT Period']"));
		String expected = "VAT Period";
			try {
				 if (actualtext.equals(expected)) {
				      System.out.println("VAT Period verified");
				  } else {
				      System.out.println("VAT Period not verified");
				          }
				  } catch (Exception e) {
				      System.out.println("An error occurred while verifying VAT Period: " + e.getMessage());
				  }
	}
	public void validatevatperiodinbridgingvat() throws IOException, InterruptedException, AWTException{
		
	    MTD.bridgingvattab.click();
		HelperClass.clickUsingJS(By.xpath("//span[ normalize-space(text())='VAT Period']"));
//		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendarfromdate,"01/04/2025");
//		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendartodate,"01/05/2025");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save & Next']"));
		WebDriver driver = HelperClass.getDriver(); // ✅ get driver here
	    WebElement chooseFileButton = driver.findElement(By.xpath("//button[normalize-space(text())='Browse']"));
	    chooseFileButton.click();
	    Thread.sleep(2000);
	 
	    String filePath = "C:\\Users\\user\\Documents\\MTD_VAT_Template.xlsx";
	 
	    Robot robot = new Robot();
	    StringSelection selection = new StringSelection(filePath);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	 
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	 
	    Thread.sleep(500);
	 
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Import']"));
	    String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='File uploaded successfully']"));
		String expected = "File uploaded successfully";
			try {
				 if (actualtext.equals(expected)) {
				      System.out.println("File import verified");
				  } else {
				      System.out.println("File import not verified");
				          }
				  } catch (Exception e) {
					  System.out.println("An error occurred while verifying File import: " + e.getMessage());
				  }
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Submit To Capium']"));
		String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']")).trim();
		String expected1 ="The operation completed Successfully!";
		   try {
				if (actualText1.equals(expected1)) {
					  System.out.println("Submit to capium verified");
			    } else {
					  System.out.println("Submit to capium not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying Submit to capium: " + e.getMessage());
				}
		 HelperClass.clickUsingJS(By.xpath("(//input[@type='checkbox'])[2]"));
		 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Submit To HMRC']"));
	     String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']")).trim();
	     String expected2 ="The operation completed Successfully!";
			   try {
					if (actualText2.equals(expected2)) {
						  System.out.println("Submit to HMRC verified");
				    } else {
						  System.out.println("Submit to HMRC not verified");
				           }
					} catch (Exception e) {
						  System.out.println("An error occurred while verifying Submit to HMRC: " + e.getMessage());
					}	
	}
	public void mousehoveractionsinbridgingvat() throws InterruptedException, IOException {
		
		MTD.bridgingvattab.click();
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='View']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='View']"));
		Thread.sleep(2000);
		String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='VAT Audit Report']"));
		String expected = "VAT Audit Report";
			try {
				 if (actualtext.equals(expected)) {
				      System.out.println("VAT Audit Report verified");
				  } else {
				      System.out.println("VAT Audit Report not verified");
				          }
				  } catch (Exception e) {
				      System.out.println("An error occurred while verifying VAT Audit Report: " + e.getMessage());
				  }
		HelperClass.captureScreenshot("Vat return screen");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));	
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']"));
		HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Export']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='Export']"));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Flat Rate Adjustment']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='Flat Rate Adjustment']"));
		Thread.sleep(2000);
		String actualtext1 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Flat Rate Adjustment Journal']"));
		String expected1 = "Flat Rate Adjustment Journal";
			try {
				 if (actualtext1.equals(expected1)) {
				      System.out.println("Flat Rate Adjustment Journal verified");
				  } else {
				      System.out.println("Flat Rate Adjustment Journal not verified");
				          }
				  } catch (Exception e) {
				      System.out.println("An error occurred while verifying Flat Rate Adjustment Journal: " + e.getMessage());
				  }
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.flatrateadjustmentjournaldate,"10/09/2025");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
		HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Email']")));
		HelperClass.clickUsingJS(By.xpath("//button[@title='Email']"));
		String actualtext2 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Share']"));
		String expected2 = "Share";
		   try {
				  if (actualtext2.equals(expected2)) {
					   System.out.println("Mail pop up displayed");
				  } else {
					   System.out.println("Mail pop up not displayed");
					      }
				  } catch (Exception e) {
					   System.out.println("An error occurred while verifying mail pop up: " + e.getMessage());
				  }
		   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='to']"), "divyapriya.boppani@capium.com");
		   HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='subject']"));
		   HelperClass.sendKeys(By.xpath("//input[@formcontrolname='subject']"), "VAT Return");
		   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']//parent::button"));
		   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		   Thread.sleep(5000);
		   String actualtext3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Mail sent successfully!']"));
		   String expected3 = "Mail sent successfully!";
		   try {
				if (actualtext3.equals(expected3)) {
					  System.out.println("Mail sent successfully!");
			    } else {
					  System.out.println("Mail not sent");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying mail: " + e.getMessage());
				}
			HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[1]"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Email']")));
			HelperClass.clickUsingJS(By.xpath("//button[@title='Email']"));
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
	}
	public void validateviewvatdetails() throws InterruptedException, IOException {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='View VAT Details']"));
		String actualtext1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='Company is authorised.']"));
		String expected1 = "Company is authorised.";
		   try {
				if (actualtext1.equals(expected1)) {
					  System.out.println("Pop up verified");
			    } else {
					  System.out.println("Pop up not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying Pop up verified: " + e.getMessage());
				}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Obligations']"));
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendarfromdate,"21/06/2025");
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendartodate,"19/09/2025");
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//span[normalize-space()='All']", "Open");
		  Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
		HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space(text())='O']", "Open");
		  Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//span[normalize-space()='All']", "Fulfilled");
		  Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
		HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space(text())='F']", "Fulfilled");
		  Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='View VAT Return']"));
	    HelperClass.selectAllDropdownOptions(By.xpath("(//span[contains(@class,'arrow')]/span)[2]"), By.xpath("//div[@role='option']"), null, null);	
	    HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Retrieve VAT Liabilities']"));
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendarfromdate,"04/06/2025");
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendartodate,"10/09/2025");
	    HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Retrieve VAT Payments']"));
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendarfromdate,"21/06/2025");
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendartodate,"19/09/2025");
	    HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	}
	public void validatevattransactionsdetailtab() throws IOException {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Transactions Detail']"));
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='VAT Report']"));
		String expected = "VAT Report";
		   try {
				if (actualtext.equals(expected)) {
					  System.out.println("VAT Report verified");
			    } else {
					  System.out.println("VAT Report not verified");
			           }
				} catch (Exception e) {
					  System.out.println("An error occurred while verifying VAT Report verified: " + e.getMessage());
				}
	    HelperClass.captureScreenshot("Vat Report");
	    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No VAT Report']"));
	    HelperClass.captureScreenshot("No Vat Report");
	    HelperClass.selectAllDropdownOptions(By.xpath("(//div[contains(@class,'arrow')]/div)[1]"), By.xpath("//mat-option[@role='option']"), null, null);	
	}
	public void vattransactionsdetailinactions() {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Transactions Detail']"));
		WebElement vattransactionsdetail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@aria-describedby='list Table']/tbody/tr[1]/td[3]//a")));
		String Referencenumber = vattransactionsdetail.getText().trim();
		String REF = Referencenumber;
		System.out.println("REF: " + Referencenumber);
		HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Referencenumber);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
		String actualText = HelperClass.getText(By.xpath("//table[@aria-describedby='list Table']/tbody/tr[1]/td[3]//a")).trim();
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
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	}
	public void paginationinvattransactionsdetail() throws InterruptedException {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Transactions Detail']"));
		HelperClass.validateDropdownRecordCount(driver);
	}
	public void nextbuttoninvattransactionsdetail() {
		
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
	}
	public void previousbuttoninvattransactionsdetail() throws InterruptedException {
		
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
	}
	public void validatevatsettingstab() throws InterruptedException {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Settings']"));
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='VAT Settings']")).trim();
		String expected = "VAT Settings";
		try {
		    if (actualText.equals(expected)) {
			System.out.println("VAT Settings verified");
		    } else {
			System.out.println("VAT Settings not verified: " + actualText);
		            }
		    } catch (Exception e) {
			    System.out.println(" An error occurred while verifying VAT Settings: " + e.getMessage());
			}
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//input[@aria-autocomplete='list'])[1]", "Flat Rate Accrual Based");
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.vatsettingsregistrationdate,"01/01/2025");
		HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='registrationNo']"));
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='registrationNo']"), "163051985");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//input[@aria-autocomplete='list'])[2]", "Monthly");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
		String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']")).trim();
		String expected1 = "The operation completed Successfully!";
		try {
		    if (actualText1.equals(expected1)) {
			System.out.println("pop up verified");
		    } else {
			System.out.println("pop up not verified: " + actualText1);
		            }
		    } catch (Exception e) {
			    System.out.println(" An error occurred while verifying popup: " + e.getMessage());
			}
	}
	public void nonmandatoryfieldsinvatsettings() throws InterruptedException, IOException {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Settings']"));
		HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='registrationNo']"));
		HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='flatRate']"));
		HelperClass.sendKeys(By.xpath("//input[@formcontrolname='flatRate']"), "10");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
		HelperClass.captureScreenshot("Error");
	}
	public void discountperiodcheckbox() {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Settings']"));
		HelperClass.clickUsingJS(By.xpath("//input[@type='checkbox']"));
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendarfromdate,"01/04/2025");
		HelperClass.setDateAsText(HelperClass.getDriver(), MTD.calendartodate,"01/05/2025");
		HelperClass.sendKeys(By.xpath("//input[@formcontrolname='discountedRate']"), "10");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
		String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']")).trim();
		String expected1 = "The operation completed Successfully!";
		try {
		    if (actualText1.equals(expected1)) {
			System.out.println("pop up verified");
		    } else {
			System.out.println("pop up not verified: " + actualText1);
		            }
		    } catch (Exception e) {
			    System.out.println(" An error occurred while verifying popup: " + e.getMessage());
			}
	}
	public void validatevatcodes() {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Settings']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='VAT Codes']"));
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add VAT Code']")).trim();
		String expected = "Add VAT Code";
		try {
		    if (actualText.equals(expected)) {
			System.out.println("Add VAT Code verified");
		    } else {
			System.out.println("Add VAT Code not verified: " + actualText);
		            }
		    } catch (Exception e) {
			    System.out.println("⚠️ An error occurred while verifying Add VAT Code: " + e.getMessage());
			}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add VAT Code']"));
		HelperClass.sendKeys(By.xpath("//input[@formcontrolname='vatName']"), "Flate rate");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[@aria-autocomplete='list']", "Normal");
		HelperClass.sendKeys(By.xpath("//input[@formcontrolname='abbreviation']"), "Abbrevation");
		HelperClass.sendKeys(By.xpath("//input[@formcontrolname='rate']"), "10");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']")).trim();
		String expected1 = "The operation completed Successfully!";
		try {
		    if (actualText1.equals(expected1)) {
			System.out.println("pop up verified");
		    } else {
			System.out.println("pop up not verified: " + actualText1);
		            }
		    } catch (Exception e) {
			    System.out.println(" An error occurred while verifying popup: " + e.getMessage());
			}
	}
	public void vatcodesactions() {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Settings']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='VAT Codes']"));
		WebElement vatcodesactions = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//span")));
		String Name = vatcodesactions.getText().trim();
		String N = Name;
		System.out.println("N: " + Name);
		HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@placeholder)='Search here...']"), Name);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
		String actualText = HelperClass.getText(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//span")).trim();
		String expected = Name;
		try {
		    if (actualText.equals(expected)) {
			System.out.println("Search verified with name");
		    } else {
			System.out.println("search is not verified with name: " + actualText);
		            }
		    } catch (Exception e) {
			    System.out.println(" An error occurred while verifying search with name: " + e.getMessage());
			}
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));	
	}
	public void selectedactionsinvatcodes() {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Settings']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='VAT Codes']"));
		HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Delete']"));	
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='Record deleted successfully']")).trim();
		String expected = "Record deleted successfully";
		try {
		    if (actualText.equals(expected)) {
			System.out.println("Record deleted successfully");
		    } else {
			System.out.println("Record not deleted: " + actualText);
		            }
		    } catch (Exception e) {
			    System.out.println(" An error occurred while verifying record delete: " + e.getMessage());
			}
		HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Excel']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='CSV']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='PDF']/ancestor::button"));
		HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Inactive']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space()='Record inactivated successfully']")).trim();
		String expected1 = "Record inactivated successfully";
		try {
		    if (actualText1.equals(expected1)) {
			System.out.println("Record inactivated successfully");
		    } else {
			System.out.println("Record not inactivated: " + actualText1);
		            }
		    } catch (Exception e) {
			    System.out.println("An error occurred while verifying record inactivate: " + e.getMessage());
			}
		HelperClass.clickUsingJS(By.xpath("(//table[@class='e-table']/tbody/tr[1]/td[1]//span)[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Active']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']"));
		String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space()='Record activated successfully']")).trim();
		String expected2 = "Record activated successfully";
		try {
		    if (actualText2.equals(expected2)) {
			System.out.println("Record activated successfully");
		    } else {
			System.out.println("Record not activated: " + actualText2);
		            }
		    } catch (Exception e) {
			    System.out.println(" An error occurred while verifying record activate: " + e.getMessage());
			}
	}
	public void paginationinvatcodes() throws InterruptedException {
		
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='VAT Settings']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='VAT Codes']"));
		HelperClass.validateDropdownRecordCount(driver);
	}
	public void nextbuttoninvatcodes() {
		
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
	}
	public void previousbuttoninvatcodes() throws InterruptedException {
		
		Thread.sleep(1000);
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
		HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
	}
	}
	 
	 
	 