package com.Capium.Actions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_Quickentry_Locators;
import com.Capium.Utilites.ExcelReader;
import com.Capium.Utilites.HelperClass;


public class Bookkeeping_Quickentry_Actions {
	
	Bookkeeping_Quickentry_Locators Quickentry = null;
	   
		public Bookkeeping_Quickentry_Actions() {
			this.Quickentry = new Bookkeeping_Quickentry_Locators();
			PageFactory.initElements(HelperClass.getDriver(),Quickentry);
		}
		String QuickentryFilePath = "D:\\Bookkeeping_5.0\\Bookkeeping_5.0\\Bookkeeping_5.0\\src\\test\\resources\\Excel_files\\Quick entry.xlsx";
		WebDriverWait wait=HelperClass.getWait();
		   WebDriver driver=HelperClass.getDriver();
		
		
public void verifyQuickentrytab() throws InterruptedException{
	
	HelperClass.waitForPageToLoad(driver);
	HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']"));
	Thread.sleep(2000);
	HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']"), "BK Automation");
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   Thread.sleep(5000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Quick Entry']"));
	Thread.sleep(1000);
    String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Quick Entry']"));
	String expected = "Add Quick Entry";

	try {
	    if (actualtext.equals(expected)) {
	        System.out.println("Add Quick Entry verified");
	    } else {
	        System.out.println("Add Quick Entry not verified");
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Add Quick Entry: " + e.getMessage());
	}
}
public void addquickentryandvalidate() {
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='Add Quick Entry']"));
	String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Quick Entry']"));
	String expected = "Add New Quick Entry";
	try {
	    if (actualtext.equals(expected)) {
	        System.out.println("Add New Quick Entry verified");
	    } else {
	        System.out.println("Add New Quick Entry not verified");
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Add New Quick Entry: " + e.getMessage());
	}
}
public void Entermandatoryfieldsinquickentry() throws InterruptedException {
	
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-select[normalize-space(@formcontrolname)='type']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[normalize-space(text())='Receipt']//parent::span"));
	  Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//input[normalize-space(@formcontrolname)='account']", "1010 - Sales");
	  Thread.sleep(2000);
	  String[][] data = ExcelReader.getSheetData(QuickentryFilePath, "Sheet1");
      String [] quickentry = data[0];
      Quickentry.Netamountinquickentry.sendKeys(quickentry [0]+Keys.ENTER);
      wait.until(ExpectedConditions.visibilityOf(Quickentry.Totalamountinaddnewlinequickentry));
      Quickentry.Totalamountinaddnewlinequickentry.click();
      
      String actualtext = HelperClass.getText(By.xpath("//input[@formcontrolname='amount']"));
  	  String expected = "100";
  	try {
  	    if (actualtext.equals(expected)) {
  	        System.out.println("Total Amount verified");
  	    } else {
  	        System.out.println("Total Amount not verified"+actualtext);
  	    }
  	} catch (Exception e) {
  	    System.out.println("An error occurred while verifying Total Amount: " + e.getMessage());
  	}
  	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@formcontrolname)='vatRate']", "Standard Rated(20.00%)");
  	String actualtext1 = HelperClass.getText(By.xpath("//input[normalize-space(@formcontrolname)='vatAmount']"));
  	String expected1 = "20.00";
  	try {
  	    if (actualtext1.equals(expected1)) {
  	        System.out.println("vatAmount verified");
  	    } else {
  	        System.out.println("vatAmount not verified");
  	    }
  	} catch (Exception e) {
  	    System.out.println("An error occurred while verifying Total Amount: " + e.getMessage());
  	}
  	Quickentry.Saveandexitinaddquickentry.click();
  	Thread.sleep(1000);
  	String actualtext2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
  	String expected2 = "The operation completed Successfully!";
  	try {
  	    if (actualtext2.equals(expected2)) {
  	        System.out.println("The operation completed Successfully!");
  	    } else {
  	        System.out.println("The operation not completed");
  	    }
  	} catch (Exception e) {
  	    System.out.println("An error occurred while verifying success message: " + e.getMessage());
  	}
  	}
public void Enternonmandatoryfieldsinquickentry() throws InterruptedException, IOException {

//	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//input[normalize-space(@aria-autocomplete)='list'])[1]","Net");
//	HelperClass.selectFirstSuggestedCustomer("Net to Gross");
//	   Thread.sleep(2000);
//	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@formcontrolname)='payDateType']", "Same as Invoice Date");
//	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@formcontrolname)='accountId']", "Cash in hand");
//	String actualtext2 = HelperClass.getText(By.xpath("//mat-select[normalize-space(@formcontrolname)='paymentAccountId']"));
//  	String expected2 = "paymentAccountId";
//  	try {
//  	    if (actualtext2.equals(expected2)) {
//  	        System.out.println("paymentAccountId Successfully!");
//  	    } else {
//  	        System.out.println("paymentAccountId not completed");
//  	    }
//  	} catch (Exception e) {
//  	    System.out.println("An error occurred while verifying paymentAccountId: " + e.getMessage());
//  	}
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@formcontrolname)='customerSupplierId']", "RAVI");
	Thread.sleep(1000);
	HelperClass.selectFirstSuggestedCustomer("RAVI");
	Quickentry.Saveandnewinaddquickentry.click();
	HelperClass.captureScreenshot("Non mandatory fields");
}
public void clickonclearforminquickentry() throws InterruptedException{
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//input[normalize-space(@formcontrolname)='reference']"));
	String[][] data = ExcelReader.getSheetData(QuickentryFilePath, "Sheet1");
    String [] quickentry = data[0];
    Quickentry.referenceinaddquickentry.sendKeys(quickentry [1]);
	Quickentry.clearforminaddquickentry.click();
	Thread.sleep(1000);
	String actualText = HelperClass.getText(By.xpath("//input[normalize-space(@formcontrolname)='reference']")).trim();
    String expected = "";
    try {
        if (actualText.equals(expected)) {
            System.out.println("✅ Reference cleared successfully");
        } else {
            System.out.println("❌ Reference not cleared: " + actualText);
        }
    } catch (Exception e) {
        System.out.println("⚠️ An error occurred during verification: " + e.getMessage());
    }
}
public void addnewlineinquickentry() throws InterruptedException{
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[normalize-space(text())='Add New Line']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-select[normalize-space(@formcontrolname)='type'])[2]"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[normalize-space(text())='Payment']//parent::span"));
	HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[7]"), "JOHN", By.xpath("//div[normalize-space(text())='JOHN']"));
	Thread.sleep(1000);
	String[][] data = ExcelReader.getSheetData(QuickentryFilePath, "Sheet1");
    String [] quickentry = data[0];
    Quickentry.referenceinaddnewlineaddquickentry.sendKeys(quickentry [1]);
    HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[normalize-space(@formcontrolname)='account'])[2]"), "1210", By.xpath("//span[normalize-space(text())='1210 - Closing Stock - Raw Materials']"));
    Quickentry.Descriptioninaddnewlineaddquickentry.sendKeys(quickentry [2]);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@aria-label='Open calendar'])[3]"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-live='polite']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='2025']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='JUL']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='09/07/2025']"));
    Quickentry.Netamountinaddnewlinequickentry.sendKeys(quickentry[0]);
    HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[9]"), "Standard", By.xpath("//span[normalize-space(text())='Standard Rated(20.00%)']"));
    HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@aria-label='Open calendar'])[4]"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-live='polite']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='2025']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='JUL']"));
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[@aria-label='12/07/2025']"));
    HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//mat-select[@formcontrolname='paymentAccountId'])[2]"), "Cash", By.xpath("//div[normalize-space(text())='Cash in hand']"));
    Thread.sleep(1000);
    HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-icon[normalize-space(text())='delete_outline'])[2]"));
}
public void searchinaddnewquickentry() throws InterruptedException {
	Quickentry.searchinaddnewquickentry.click();
	   String actualText = HelperClass.getText(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]")).trim();
	   String expected = "search";

		if (actualText.equals(expected)) {
		    System.out.println("Search box is displayed");
		} else {
		    System.out.println("Search box is not displayed");
		}
 	 HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "QE - 22");
 	 Thread.sleep(2000);
 	String actualText1 = HelperClass.getText(By.xpath("//a[normalize-space(text())='QE - 22']")).trim();
	String expected1 = "QE - 22";

	if (actualText1.equals(expected1)) {
	    System.out.println("✅ 'QE - 22' name verified");
	} else {
	    System.out.println("❌ 'QE - 22' name is not verified" + actualText);
	}
	   Quickentry.searchcrossinaddnewquickentry.click();
	   String actualText2 = HelperClass.getText(By.xpath("//input[normalize-space(@placeholder)='Search']")).trim();
	   if (HelperClass.isElementPresent(By.xpath("//input[normalize-space(@placeholder)='Search']"))) {
		    System.out.println("✅ QE - 22 name erased");
		} else {
		    System.out.println("❌ QE - 22 name is not erased: " + actualText);
		}
  
}
public void addbuttoninaddnewquickentry() throws InterruptedException {
	Thread.sleep(2000);
	   HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//table[@aria-describedby='side-list']/tbody/tr[1]/td[1]/div/div/a"));
	   Thread.sleep(3000);
	   String actualtext=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Quick Entry']"));
	   String expected="Edit Quick Entry";
        if (actualtext.equals(expected)) {
	
	     System.out.println("Edit Quick Entry verified");
	}else
    {
	System.out.println("Edit Quick Entry not verified");
    }
	   HelperClass.clickUsingJS(By.xpath("//div[contains(@class,'side-list-icon')]/button/mat-icon[contains(text(),'add_circle')]"));
	   Thread.sleep(2000);
	   String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Quick Entry']"));
	   String expected1="Add New Quick Entry";
        if (actualtext1.equals(expected1)) {
	
	     System.out.println("Add New Quick Entry verified");
	}else
    {
	System.out.println("Add New Quick Entry not verified");
    }
}
public void checkboxinaddnewquickentryandverifyoptionsareenabling() throws InterruptedException{
	   Thread.sleep(2000);
	   Quickentry.checkboxesinaddnewquickentry.click();
	   Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[1]")).isDisplayed());
		System.out.println("Delete button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[2]")).isDisplayed());
		System.out.println("Copy button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[3]")).isDisplayed());
		System.out.println("EXCEL button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[4]")).isDisplayed());
		System.out.println("CSV button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[5]")).isDisplayed());
		System.out.println("PDF button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[6]")).isDisplayed());
		System.out.println("PRINT button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[7]")).isDisplayed());
		System.out.println("INACTIVE button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[8]")).isDisplayed());
		System.out.println("ACTIVE button verified");
}
public void cancelselectionsinaddnewquickentry() throws InterruptedException{
	   
	   Quickentry.checkboxinaddnewquickentry.click();
	   Thread.sleep(2000);
	   Quickentry.cancelselectionsinaddnewquickentry.click();
	   String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Quick Entry']"));
	   String expected1="Add New Quick Entry";
        if (actualtext1.equals(expected1)) {
	
	     System.out.println("Add New Quick Entry verified");
	   }else
            {
	     System.out.println("Add New Quick Entry not verified");
    }
}
public void Deleteyesbuttoninaddnewquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddnewquickentry.click();
	   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[1]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
	   String expected="Confirm Delete";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Delete verified");
	    } else {
	        System.out.println("Confirm Delete not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	String actualText1=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record deleted successfully']")).trim();
	   String expected1="Record deleted successfully";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("Record deleted successfully");
	    } else {
	        System.out.println("Record not deleted" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void Deletenobuttoninaddnewquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddnewquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[1]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
	   String expected="Confirm Delete";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Delete verified");
	    } else {
	        System.out.println("Confirm Delete not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
	Thread.sleep(3000);
	try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Delete']"))) {
	        System.out.println("Confirm Delete verified");
	    } else {
	        System.out.println("Confirm Delete should not display" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
	}
}
public void Copybuttoninaddnewquickentry() {
	
	Quickentry.checkboxinaddnewquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[2]"));
	   String actualText=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record copied successfully']")).trim();
	   String expected="Record copied successfully";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Record copied successfully");
	    } else {
	        System.out.println("The record not copied: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Copy: " + e.getMessage());
	}
}
public void exportinaddnewquickentry () throws InterruptedException{
	Quickentry.checkboxinaddnewquickentry.click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space(text())='border_all']")));
	   Quickentry.excelinexport.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]")));
	   Quickentry.csvinexport.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space(text())='picture_as_pdf']")));
	   Quickentry.pdfinexport.click();
}
public void Inactiveyesbuttoninaddnewquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddnewquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Inactive']")).trim();
	   String expected="Confirm Inactive";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Inactive verified");
	    } else {
	        System.out.println("Confirm Inactive not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Inactive: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	Thread.sleep(3000);
	String actualText1=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record inactivated successfully']")).trim();
	   String expected1="Record inactivated successfully";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("Record inactivated successfully");
	    } else {
	        System.out.println("Record not inactivated" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Inactivated: " + e.getMessage());
	}
}
public void Inactivenobuttoninaddnewquickentry() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement checkboxDiv = wait.until(ExpectedConditions.elementToBeClickable(
	    By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div")
	));
	checkboxDiv.click();
	Quickentry.checkboxinaddnewquickentry.click();
	Thread.sleep(1000);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space(@type)='button'])[7]")));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space(@type)='button'])[7]")));
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
	   Thread.sleep(2000);
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Inactive']")).trim();
	   String expected="Confirm Inactive";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Inactive verified");
	    } else {
	        System.out.println("Confirm Inactive not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Inactive: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
	Thread.sleep(1000);
	try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Inactive']"))) {
	        System.out.println("Confirm Inactive verified");
	    } else {
	        System.out.println("Confirm Inactive should not display" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Inactive: " + e.getMessage());
	}
}
public void Activeyesbuttoninaddnewquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddnewquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[8]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Active']")).trim();
	   String expected="Confirm Active";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Active verified");
	    } else {
	        System.out.println("Confirm Active not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Active: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	Thread.sleep(1000);
	String actualText1=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record activated successfully']")).trim();
	   String expected1="Record activated successfully";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("Record activated successfully");
	    } else {
	        System.out.println("Record not activated" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying activated: " + e.getMessage());
	}
}
public void Activenobuttoninaddnewquickentry() throws InterruptedException {
	
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    WebElement checkboxDiv = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div")));
//	    checkboxDiv.click();
    Quickentry.checkboxinaddnewquickentry.click();
    Thread.sleep(3000);
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[8]"));
	   Thread.sleep(2000);
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Active']")).trim();
	   String expected="Confirm Active";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Active verified");
	    } else {
	        System.out.println("Confirm Active not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Active: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
	Thread.sleep(3000);
	try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Active']"))) {
	        System.out.println("Confirm Active verified");
	    } else {
	        System.out.println("Confirm Active should not display" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Active: " + e.getMessage());
	}
}
public void Closeyesbuttoninaddnewquickentry() {
	   Quickentry.closebuttoninaddnewquickentry.click();
	   String actualText=HelperClass.getText(By.xpath("//span[normalize-space(text())='Terminate process']"));
	String expected="Terminate process";
	if (actualText.equals(expected)) {
	    System.out.println("Terminate process verified");
	}else{
	    System.out.println("Terminate process not verified: " + actualText);
    }
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	String actualText1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Quick Entry']"));
	String expected1="Add Quick Entry";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("Add Quick Entry verified");
	    } else {
	        System.out.println("Add Quick Entry not verified: " + actualText1);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Add Quick Entry: " + e.getMessage());
	}
}
public void Closenobuttoninaddnewquickentry() {
	
	   Quickentry.closebuttoninaddnewquickentry.click();
	   String actualText=HelperClass.getText(By.xpath("//span[normalize-space(text())='Terminate process']"));
	String expected="Terminate process";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Terminate process verified");
	    } else {
	        System.out.println("Terminate process not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Terminate process: " + e.getMessage());
	}

	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
	try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//span[normalize-space(text())='Add New Quick Entry']"))) {
	        System.out.println("Add New Quick Entry verified");
	    } else {
	        System.out.println("Add New Quick Entry not verified: ");
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Add New Quick Entry: " + e.getMessage());
	}
}
public void searchinaddquickentry() throws InterruptedException {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search here...']//parent::div")));
	  HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']//parent::div"));
	 HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']//parent::div"), "QE - 22");
	 Thread.sleep(3000);
	 String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='QE - 22']")).trim();
	 String expected = "QE - 22";

	 try {
		    if (actualText.equals(expected)) {
		        System.out.println("✅ 'QE - 22' name verified");
		    } else {
		        System.out.println("❌ 'QE - 22' not verified: " + actualText);
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying 'QE - 22': " + e.getMessage());
		}
}
public void checkboxesinaddquickentry() throws InterruptedException{
	Thread.sleep(1000);
	Quickentry.checkboxinaddquickentry.click();
}
public void actionsinaddquickentry() throws InterruptedException {
	Thread.sleep(1000);
	Quickentry.actionsinaddquickentry.click();
}
public void exportinaddquickentryactions() throws InterruptedException{
	   Thread.sleep(1000);
	Quickentry.exporttopdf.click();
HelperClass.clickUsingJS(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Export to Excel']")));
	   Quickentry.exporttoexcel.click();
	HelperClass.clickUsingJS(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Export to CSV']")));
	   Quickentry.exporttocsv.click();
}
public void mousehoverviewinaddquickentry() throws InterruptedException{
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='View']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='View']"));
	Thread.sleep(2000);
	String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Quick Entry']")).trim();
	String expected = "Quick Entry";

	try {
	    if (actualText.equals(expected)) {
	        System.out.println("✅ Quick Entry name verified");
	    } else {
	        System.out.println("❌ Quick Entry not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("⚠️ An error occurred while verifying Quick Entry name: " + e.getMessage());
	}
	Thread.sleep(5000);
	HelperClass.clickUsingJS(By.xpath("(//button[@type='button'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//button[@type='button'])[2]"));
	String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Quick Entry']"));
	   String expected1="Edit Quick Entry";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Edit Quick Entry verified");
		    } else {
		        System.out.println("Edit Quick Entry not verified");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Edit Quick Entry: " + e.getMessage());
		}
}
public void mousehoverexportinaddquickentry() throws InterruptedException {
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='Export']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='Export']"));
}
public void mousehovereditinaddquickentry() {
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='Edit']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='Edit']"));
	String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Quick Entry']"));
	   String expected1="Edit Quick Entry";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Edit Quick Entry verified");
		    } else {
		        System.out.println("Edit Quick Entry not verified");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Edit Quick Entry: " + e.getMessage());
		}
}
public void mousehoverdeleteyesbuttoninaddquickentry() {
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='Delete']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='Delete']"));
	String actualtext1=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']"));
	   String expected1="Confirm Delete";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Confirm Delete verified");
		    } else {
		        System.out.println("Confirm Delete not verified");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	   HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='Yes']"));
	   String actualtext2=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record deleted successfully']"));
	   String expected2="Record deleted successfully";
	   try {
		    if (actualtext2.equals(expected2)) {
		        System.out.println("Record deleted successfully");
		    } else {
		        System.out.println("Record not deleted");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
}
public void mousehoverdeletenobuttoninaddquickentry() throws InterruptedException {
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='Delete']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='Delete']"));
	String actualtext1=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']"));
	   String expected1="Confirm Delete";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Confirm Delete verified");
		    } else {
		        System.out.println("Confirm Delete not verified");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Delete']"))) {
		        System.out.println("Confirm Delete verified");
		    } else {
		        System.out.println("Confirm Delete should not display");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
public void checkboxinaddquickentryandverifyoptionsareenabling() throws InterruptedException{
	   Thread.sleep(2000);
	   Quickentry.checkboxesinaddquickentry.click();
	   Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[1]")).isDisplayed());
		System.out.println("Delete button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[2]")).isDisplayed());
		System.out.println("Copy button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[3]")).isDisplayed());
		System.out.println("EXCEL button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[4]")).isDisplayed());
		System.out.println("CSV button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[5]")).isDisplayed());
		System.out.println("PDF button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[6]")).isDisplayed());
		System.out.println("PRINT button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[7]")).isDisplayed());
		System.out.println("INACTIVE button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[8]")).isDisplayed());
		System.out.println("ACTIVE button verified");
}
public void cancelselectionsinaddquickentry() throws InterruptedException{
	   
	Quickentry.checkboxesinaddquickentry.click();
	   Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Cancel selection']"));
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//mat-icon[normalize-space()='highlight_off']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		    }
		} catch (Exception e) {
		    System.out.println("Exception occurred while checking element: " + e.getMessage());
		}
}
public void Deleteyesbuttoninaddquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddquickentry.click();
	   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[1]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
	   String expected="Confirm Delete";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Delete verified");
	    } else {
	        System.out.println("Confirm Delete not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	String actualText1=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record deleted successfully']")).trim();
	   String expected1="Record deleted successfully";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("Record deleted successfully");
	    } else {
	        System.out.println("Record not deleted" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void Deletenobuttoninaddquickentry() throws InterruptedException {
	
	Thread.sleep(2000);
	Quickentry.checkboxinaddquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[1]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
	   String expected="Confirm Delete";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Delete verified");
	    } else {
	        System.out.println("Confirm Delete not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
	Thread.sleep(3000);
	try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Delete']"))) {
	        System.out.println("Confirm Delete verified");
	    } else {
	        System.out.println("Confirm Delete should not display" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
	}
}
public void Copybuttoninaddquickentry() {
	
	Quickentry.checkboxinaddquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[2]"));
	   String actualText=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record copied successfully']")).trim();
	   String expected="Record copied successfully";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Record copied successfully");
	    } else {
	        System.out.println("The record not copied: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Copy: " + e.getMessage());
	}
}
public void selecteditemexportinaddquickentry() {
	Quickentry.checkboxinaddquickentry.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space(text())='border_all']")));
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='border_all']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]")));
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space(text())='picture_as_pdf']//parent::button")));
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='picture_as_pdf']//parent::button"));
}
public void Inactiveyesbuttoninaddquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Inactive']")).trim();
	   String expected="Confirm Inactive";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Inactive verified");
	    } else {
	        System.out.println("Confirm Inactive not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Inactive: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	Thread.sleep(3000);
	String actualText1=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record inactivated successfully']")).trim();
	   String expected1="Record inactivated successfully";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("Record inactivated successfully");
	    } else {
	        System.out.println("Record not inactivated" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Inactivated: " + e.getMessage());
	}
}
public void Inactivenobuttoninaddquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Inactive']")).trim();
	   String expected="Confirm Inactive";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Inactive verified");
	    } else {
	        System.out.println("Confirm Inactive not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Inactive: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
	Thread.sleep(3000);
	try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Inactive']"))) {
	        System.out.println("Confirm Inactive verified");
	    } else {
	        System.out.println("Confirm Inactive should not display" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Inactive: " + e.getMessage());
	}
}
public void Activeyesbuttoninaddquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[8]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Active']")).trim();
	   String expected="Confirm Active";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Active verified");
	    } else {
	        System.out.println("Confirm Active not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Active: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	Thread.sleep(3000);
	String actualText1=HelperClass.getText(By.xpath("//p[normalize-space(text())='Record activated successfully']")).trim();
	   String expected1="Record activated successfully";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("Record activated successfully");
	    } else {
	        System.out.println("Record not activated" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying activated: " + e.getMessage());
	}
}
public void Activenobuttoninaddquickentry() throws InterruptedException {
	
	Quickentry.checkboxinaddquickentry.click();
	   HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[8]"));
	   String actualText=HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Active']")).trim();
	   String expected="Confirm Active";
	try {
	    if (actualText.equals(expected)) {
	        System.out.println("Confirm Active verified");
	    } else {
	        System.out.println("Confirm Active not verified: " + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Active: " + e.getMessage());
	}
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
	Thread.sleep(3000);
	try {
	    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Active']"))) {
	        System.out.println("Confirm Active verified");
	    } else {
	        System.out.println("Confirm Active should not display" + actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Confirm Active: " + e.getMessage());
	}
}
public void ClickonPagiantionDropdownandValidateinquickentry() throws Exception {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "5");
//	HelperClass.safeSelectByVisibleText(By.xpath("//span[@aria-label='dropdownlist']"), "5");
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='5']")));
//	HelperClass.safeClick(By.xpath("div[normalize-space()='5']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/span[1]")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/span[1]"));
	
	String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='5']")).trim();
	String expected = "Records: 5";

	if (actualText.equals(expected)) {
	    System.out.println("5 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText);
	}
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
	String expected1 = "Records: 20";

	if (actualText1.equals(expected1)) {
	    System.out.println("20 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText);
	}
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
	HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
	HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='50']")));
	HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='50']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
	HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));


String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='50']")).trim();
String expected2 = "Records: 50";

if (actualText2.equals(expected2)) {
    System.out.println("50 records are there");
} else {
    System.out.println("Text not matched. Actual: " + actualText);
}
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

	if (actualText3.equals(expected3)) {
	    System.out.println("100 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText);
	}
}
public void nextbuttoninaddquickentry() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
	
}
public void previousbuttoninaddquickentry() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
}


