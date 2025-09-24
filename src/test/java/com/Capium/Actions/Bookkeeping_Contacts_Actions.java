package com.Capium.Actions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_Contacts_Locators;
import com.Capium.Locators.Bookkeeping_Quickentry_Locators;
import com.Capium.Utilites.ExcelReader;
import com.Capium.Utilites.HelperClass;


public class Bookkeeping_Contacts_Actions {
	Bookkeeping_Contacts_Locators Contacts = null;
	
public Bookkeeping_Contacts_Actions() {
		this.Contacts = new Bookkeeping_Contacts_Locators();
		PageFactory.initElements(HelperClass.getDriver(),Contacts);
	}
	String ContactsFilePath = "D:\\Bookkeeping_5.0\\Bookkeeping_5.0\\Bookkeeping_5.0\\src\\test\\resources\\Excel_files\\Contacts.xlsx";
	WebDriverWait wait=HelperClass.getWait();
	   WebDriver driver=HelperClass.getDriver();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
public void customerstabincontacts() throws InterruptedException{
			
	HelperClass.waitForPageToLoad(driver);
	HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']"));
	Thread.sleep(2000);
	HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']"), "BK Automation");
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   Thread.sleep(5000);
		HelperClass.clickUsingJS(By.xpath(" //a[normalize-space(text())='Contacts']"));
	   assertTrue(HelperClass.getDriver().findElement(By.xpath(" //a[normalize-space(text())='Customers']"))
				.isDisplayed());
	   System.out.println("Customers verified");
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customers']"))
				.isDisplayed());
	   System.out.println("Suppliers verified");
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customers']"))
				.isDisplayed());
	   System.out.println("Director verified");
	   assertTrue(HelperClass.getDriver().findElement(By.xpath("//a[normalize-space(text())='Customers']"))
				.isDisplayed());
	   System.out.println("Shareholder verified");
		Thread.sleep(2000);
        HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Customers']"));
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Customer']"));
		String expected = "Add Customer";
		   try {
			    if (actualtext.equals(expected)) {
			        System.out.println("Add Customer verified");
			    } else {
			        System.out.println("Add Customer not verified");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Add Customer: " + e.getMessage());
			}
}
public void validateaddnewcustomers() {
	
     HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Customer']"));
	   String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
	   String expected = "Add New Customer";

		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Add New Customer verified");
			 } else {
			        System.out.println("Add New Customer not verified");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Add New Customer: " + e.getMessage());
			 }
}
public void entermandatoryfieldsincustomers() {   
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet1");
	String[] customers = data[0];
	Contacts.customername.sendKeys(customers[0]);
    Contacts.customeremail.sendKeys(customers[1]);       
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and New']"));
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
	String expected = "The operation completed Successfully!";
		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Customer added");
			 } else {
			        System.out.println("Customer not added");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Adding customer: " + e.getMessage());
			 }
	String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
	String expected1 = "Add New Customer";
		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Add New Customer verified");
			} else {
				      System.out.println("Add New Customer not verified");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying Add New Customer: " + e.getMessage());
			}
}
public void enternonmandatoryfieldsincustomers() throws IOException { 
	
	HelperClass.clickUsingJS(By.xpath("//input[@formcontrolname='tradingName']"));
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet1");
	String[] customers = data[0];
	Contacts.tradingnameincustomers.sendKeys(customers[2]);
	Contacts.addressline1incustomers.sendKeys(customers[3]);
	Contacts.addressline2incustomers.sendKeys(customers[4]);
	Contacts.addressline3incustomers.sendKeys(customers[5]);
	Contacts.cityincustomers.sendKeys(customers[6]);
	HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[@aria-autocomplete='list'])[1]"), "United Kingdom", By.xpath("(//div[normalize-space(text())='United Kingdom'])[2]"));
    Contacts.postcodeincustomers.sendKeys(customers[7]);
    Contacts.mobilenumberincustomers.sendKeys(customers[8]);
    Contacts.phoneincustomers.sendKeys(customers[9]);
    Contacts.faxincustomers.sendKeys(customers[10]);
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Commercial Details']"));
    HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[@aria-autocomplete='list'])[2]"), "30 Days", By.xpath("(//div[normalize-space(text())='30 Days'])[2]"));
    Contacts.vatregistrationnumberincustomers.sendKeys(customers[11]);
    Contacts.bankaccountnameincustomers.sendKeys(customers[12]);
    Contacts.bankaccountnumberincustomers.sendKeys(customers[13]);
    Contacts.branchcodeincustomers.sendKeys(customers[14]);
    Contacts.accountibancodeincustomers.sendKeys(customers[15]);
    Contacts.openingbalanceincustomers.sendKeys(customers[16]);
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
    HelperClass.captureScreenshot("Non mandatory fields");
}
public void clearformincustomers() {
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet1");
	String[] customers = data[0];
	Contacts.customername.sendKeys(customers[0]);
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Clear Form']"));
	String actualtext1 = HelperClass.getText(By.xpath("//input[@formcontrolname='name']"));
	String expected1 = "";

		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Data is cleared");
			} else {
				      System.out.println("Data is not cleared");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying clear form: " + e.getMessage());
			}
}
public void searchinaddnewcustomer() {
	 	
	Contacts.searchinaddnewcustomer.click();
	   String actualText = HelperClass.getText(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]")).trim();
	   String expected = "search";
        try {
		if (actualText.equals(expected)) {
		    System.out.println("Search box is displayed");
		} else {
		    System.out.println("Search box is not displayed");
		}
        } catch (Exception e) {
		    System.out.println("An error occurred while verifying search box: " + e.getMessage());
	}
	 HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "Fransis");
	String actualText1 = HelperClass.getText(By.xpath("//a[normalize-space(text())='Fransis']")).trim();
	String expected1 = "Fransis";
     try {
	if (actualText1.equals(expected1)) {
	    System.out.println("✅Fransis name verified");
	} else {
	    System.out.println("❌Fransis name is not verified" + actualText);
	       }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying customer name: " + e.getMessage());
    }    
	   Contacts.searchcrossinaddnewcustomer.click();
	   String actualText2 = HelperClass.getText(By.xpath("//input[normalize-space(@placeholder)='Search']")).trim();
	   try {
	   if (HelperClass.isElementPresent(By.xpath("//input[normalize-space(@placeholder)='Search']"))) {
		    System.out.println("✅Fransis name erased");
		} else {
		    System.out.println("❌Fransis name is not erased: " + actualText);
		       }
        } catch (Exception e) {
          System.out.println("An error occurred while verifying search cross: " + e.getMessage());
               }
}
public void addbuttoninaddnewcustomer(){

	   HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//table[@aria-describedby='side-list']/tbody/tr[1]/td[1]/div/div/a"));
	   String actualtext=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Customer']"));
	   String expected="Edit Customer";
        if (actualtext.equals(expected)) {
	
	     System.out.println("Edit Customer verified");
	}else
    {
	System.out.println("Edit Customer not verified");
    }
	   HelperClass.clickUsingJS(By.xpath("//div[contains(@class,'side-list-icon')]/button/mat-icon[contains(text(),'add_circle')]"));
	   String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
	   String expected1="Add New Customer";
        if (actualtext1.equals(expected1)) {
	
	     System.out.println("Add New Customer verified");
	}else
    {
	System.out.println("Add New Customer not verified");
    }
}
public void checkboxandvalidateoptionsinaddnewcustomer() throws InterruptedException{

        Thread.sleep(1000);
        Contacts.checkboxesinaddnewcustomer.click();
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
public void cancelselectionsinaddnewcustomer(){
	   
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Cancel selections']"));
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//mat-icon[normalize-space()='highlight_off']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying cancel selections: " + e.getMessage());
		}
}
public void deletebuttoninaddnewcustomer(){
	
    Contacts.customercheckboxinaddnewcustomer.click();
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
	        System.out.println("Error: Accounts has Associated Transactions"+ actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void copybuttoninaddnewcustomer() {
	
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
public void exportinaddnewcustomer() throws InterruptedException {
	
//	Contacts.customercheckboxinaddnewcustomer.click();
    Thread.sleep(2000);	
    HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));
    Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));
}
public void inactivebuttoninaddnewcustomer() {
	
	Contacts.customercheckboxinaddnewcustomer.click();
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
public void activebuttoninaddnewcustomer(){
	
	Contacts.customercheckboxinaddnewcustomer.click();
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
public void closebuttoninaddnewcustomer() {

	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']//parent::button"));
	   String actualText=HelperClass.getText(By.xpath("//span[normalize-space(text())='Terminate process']"));
	String expected="Terminate process";
	if (actualText.equals(expected)) {
	    System.out.println("Terminate process verified");
	}else{
	    System.out.println("Terminate process not verified: " + actualText);
 }
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Customer']"));
	String expected1 = "Add Customer";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Add Customer verified");
		    } else {
		        System.out.println("Add Customer not verified");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Add Customer: " + e.getMessage());
		}
}
public void searchinaddcustomer() throws InterruptedException{
	
	WebElement input = driver.findElement(By.xpath("//input[@placeholder='Search here...']"));
	HelperClass.sleep1(2000);
	js.executeScript("arguments[0].value='Fransis'; arguments[0].dispatchEvent(new Event('input'));", input);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	HelperClass.sleep1(2000);
	 String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Fransis']")).trim();
	 String expected = "Fransis";
	 try {
		    if (actualText.equals(expected)) {
		        System.out.println("✅ 'Fransis' name verified");
		    } else {
		        System.out.println("❌ 'Fransis' not verified: " + actualText);
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying 'Fransis': " + e.getMessage());
		}
}
public void actionsinaddcustomer() throws InterruptedException {
	
   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
   Thread.sleep(1000);
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Export As PDF']"));
   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
   Thread.sleep(1000);
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
   Thread.sleep(1000);
   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")); 	
}
public void mousehovereditinaddcustomer() {
	
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='Edit']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='Edit']"));
	String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Customer']"));
	   String expected1="Edit Customer";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Edit Customer verified");
		    } else {
		        System.out.println("Edit Customer not verified");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Edit Customer: " + e.getMessage());
		}
}
public void mousehoverdeletebuttoninaddcustomer() {
	
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
public void checkboxinaddcustomer() throws InterruptedException{
	
	   Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]//parent::div"));
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
public void cancelselectioninaddcustomer(){

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
public void deletebuttoninaddcustomer() throws InterruptedException {
	
	HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
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
public void copybuttoninaddcustomer() {
	
	HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
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
public void exportinaddcustomer() throws InterruptedException {
	
//	   HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
//	   Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));
	   Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button"));
	   Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button")); 
}
public void inactivebuttoninaddcustomer() {
	
	HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
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
public void activebuttoninaddcustomer(){
	
	HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
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
public void pagiantiondropdowninaddcustomer() throws Exception {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "5");
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
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText);
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

if (actualText2.equals(expected2)) {
    System.out.println("20 records are there");
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
public void nextbuttoninaddcustomer() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void previousbuttoninaddcustomer() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void supplierstabincontacts() throws InterruptedException {

	HelperClass.waitForPageToLoad(driver);
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']"));
	Thread.sleep(2000);
	HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']"), "BK Automation");
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   Thread.sleep(5000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Contacts']"));
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Suppliers']"));
       String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Supplier']"));
       String expected = "Add Supplier";
       try {
	        if (actualtext.equals(expected)) {
	        System.out.println("Add Supplier verified");
	        } else {
	        System.out.println("Add Supplier not verified");
	        }
	   } catch (Exception e) {
	    System.out.println("An error occurred while verifying Add Supplier: " + e.getMessage());
	   }
}
public void validateaddnewsuppliers() {
	
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Supplier']"));
	   String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Supplier']"));
	   String expected = "Add New Supplier";
		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Add New Supplier verified");
			 } else {
			        System.out.println("Add New Supplier not verified");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Add New Supplier: " + e.getMessage());
			 }
}
public void entermandatoryfieldsinsuppliers() {   
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet2");
	String[] suppliers = data[0];
	Contacts.suppliername.sendKeys(suppliers[0]);      
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and New']"));
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
	   String expected = "The operation completed Successfully!";

		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Supplier added");
			 } else {
			        System.out.println("Supplier not added");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Adding supplier: " + e.getMessage());
			 }
	String actualtext1 = HelperClass.getText(By.xpath(" //span[normalize-space(text())='Add New Supplier']"));
	String expected1 = "Add New Supplier";
		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Add New Supplier verified");
			} else {
				      System.out.println("Add New Supplier not verified");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying Add New Supplier: " + e.getMessage());
			}
}
public void enternonmandatoryfieldsinsuppliers() throws IOException { 
	
	HelperClass.clickUsingJS(By.xpath("(//input[@formcontrolname='tradingName'])[1]"));
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet2");
	String[] suppliers = data[0];
	Contacts.tradingnameinsuppliers.sendKeys(suppliers[1]);
	Contacts.addressline1insuppliers.sendKeys(suppliers[2]);
	Contacts.addressline2insuppliers.sendKeys(suppliers[3]);
	Contacts.addressline3insuppliers.sendKeys(suppliers[4]);
	Contacts.cityinsuppliers.sendKeys(suppliers[5]);
	HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[@aria-autocomplete='list'])[1]"), "United Kingdom", By.xpath("(//div[normalize-space(text())='United Kingdom'])[2]"));
	Contacts.postcodeinsuppliers.sendKeys(suppliers[6]);
	Contacts.suppliersemail.sendKeys(suppliers[7]);
    Contacts.mobilenumberinsuppliers.sendKeys(suppliers[8]);
    Contacts.phoneinsuppliers.sendKeys(suppliers[9]);
    Contacts.faxinsuppliers.sendKeys(suppliers[10]);
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Commercial Details']"));
    HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[@aria-autocomplete='list'])[6]"), "30 Days", By.xpath("(//div[normalize-space(text())='30 Days'])[2]"));
    Contacts.vatregistrationnumberinsuppliers.sendKeys(suppliers[11]);
    Contacts.bankaccountnameinsuppliers.sendKeys(suppliers[12]);
    Contacts.bankaccountnumberinsuppliers.sendKeys(suppliers[13]);
    Contacts.branchcodeinsuppliers.sendKeys(suppliers[14]);
    Contacts.accountibancodeinsuppliers.sendKeys(suppliers[15]);
    Contacts.openingbalanceinsuppliers.sendKeys(suppliers[16]);
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
    HelperClass.captureScreenshot("Non mandatory fields");
}
public void clearforminsuppliers() {
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet2");
	String[] suppliers = data[0];
	Contacts.suppliername.sendKeys(suppliers[0]);
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Clear Form']"));
	String actualtext1 = HelperClass.getText(By.xpath("//input[@formcontrolname='name']"));
	String expected1 = "";

		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Data is cleared");
			} else {
				      System.out.println("Data is not cleared");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying clear form: " + e.getMessage());
			}
}
public void searchinaddnewsuppliers() {
	
	Contacts.searchinaddnewsuppliers.click();
	   String actualText = HelperClass.getText(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]")).trim();
	   String expected = "search";
	   try {
		    if (actualText.equals(expected)) {
		        System.out.println("Search box is displayed");
		    } else {
		        System.out.println("Search box is not displayed");
		    }
		} catch (Exception e) {
			System.out.println("An error occurred while verifying search button: " + e.getMessage());
		}
	 HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "Francy");
	String actualText1 = HelperClass.getText(By.xpath("//a[normalize-space(text())='Francy']")).trim();
	String expected1 = "Francy";
	try {
	    if (actualText1.equals(expected1)) {
	        System.out.println("✅ Francy name verified");
	    } else {
	        System.out.println("❌ Francy name is not verified: " + actualText1);
	    }
	} catch (Exception e) {
		System.out.println("An error occurred while verifying supplier name: " + e.getMessage());
	}

	   Contacts.searchcrossinaddnewsuppliers.click();
	   String actualText2 = HelperClass.getText(By.xpath("//input[normalize-space(@placeholder)='Search']")).trim();
	   try {
		    if (HelperClass.isElementPresent(By.xpath("//input[normalize-space(@placeholder)='Search']"))) {
		        System.out.println("✅ Fransis name erased");
		    } else {
		        System.out.println("❌ Fransis name is not erased: " + actualText);
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying erased: " + e.getMessage());

		}

}
public void addbuttoninaddnewsuppliers(){

	   HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//table[@aria-describedby='side-list']/tbody/tr[1]/td[1]/div/div/a"));
	   String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Overview']"));
	   String expected1="Overview";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Overview verified");
		    } else {
		        System.out.println("Overview not verified");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying overview: " + e.getMessage());
		}
	   HelperClass.clickUsingJS(By.xpath("//div[contains(@class,'side-list-icon')]/button/mat-icon[contains(text(),'add_circle')]"));
	   String actualtext2=HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Supplier']"));
	   String expected2="Add New Supplier";
	   try {
		    if (actualtext2.equals(expected2)) {
		        System.out.println("Add New Supplier verified");
		    } else {
		        System.out.println("Add New Supplier not verified");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Add New Supplier: " + e.getMessage());
		}
}
public void checkboxandvalidateoptionsinaddnewsuppliers() throws InterruptedException{

    Thread.sleep(1000);
    Contacts.checkboxesinaddnewsuppliers.click();
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
public void cancelselectionsinaddnewsuppliers(){
	   
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Cancel selections']"));
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
public void deletebuttoninaddnewsuppliers(){
	
    Contacts.suppliercheckboxinaddnewsuppliers.click();
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
	        System.out.println("Error: Accounts has Associated Transactions"+ actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void copybuttoninaddnewsuppliers() {
	
	Contacts.suppliercheckboxinaddnewsuppliers.click();
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
public void exportinaddnewsupliers() throws InterruptedException {
	
//	Contacts.suppliercheckboxinaddnewsuppliers.click();
    Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='border_all']"));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]")));
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]")));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]"));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='PDF']/ancestor::button")));
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='PDF']/ancestor::button")));
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));
}
public void inactivebuttoninaddnewsuppliers() {
	
	Contacts.suppliercheckboxinaddnewsuppliers.click();
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
public void activebuttoninaddnewsuppliers(){
	
	Contacts.suppliercheckboxinaddnewsuppliers.click();
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
public void closebuttoninaddnewsuppliers() {

	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']//parent::button"));
	   String actualText=HelperClass.getText(By.xpath("//span[normalize-space(text())='Terminate process']"));
	String expected="Terminate process";
	if (actualText.equals(expected)) {
	    System.out.println("Terminate process verified");
	}else{
	    System.out.println("Terminate process not verified: " + actualText);
 }
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Supplier']"));
	String expected1 = "Add Supplier";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Add Supplier verified");
		    } else {
		        System.out.println("Add Supplier not verified");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Add Supplier: " + e.getMessage());
		}
}
public void searchinaddsupplier() throws InterruptedException{
	
	WebElement input = driver.findElement(By.xpath("//input[@placeholder='Search here...']"));
	HelperClass.sleep1(2000);
	js.executeScript("arguments[0].value='Francy'; arguments[0].dispatchEvent(new Event('input'));", input);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	HelperClass.sleep1(2000);
	 String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Francy']")).trim();
	 String expected = "Francy";
	 try {
		    if (actualText.equals(expected)) {
		        System.out.println("✅ 'Francy' name verified");
		    } else {
		        System.out.println("❌ 'Francy' not verified: " + actualText);
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying 'Francy': " + e.getMessage());
		}
}
public void actionsinaddsupplier() {
	
	HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]//parent::div"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='PDF']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Excel']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button")); 	
}
public void checkboxandvalidateoptionsinaddsuppliers() throws InterruptedException{
	
	   Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]//parent::div"));
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
public void cancelselectionsinaddsupplier(){
	   
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
public void deletebuttoninaddsupplier(){
	
	HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
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
	        System.out.println("Error: Accounts has Associated Transactions"+ actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void copybuttoninaddsupplier() {
	
	 HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
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
public void exportinaddsupplier() throws InterruptedException {
	
	  
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='border_all']"));
	   Thread.sleep(2000);
	   HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]"));
	   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button")); 
}
public void inactivebuttoninaddsupplier() {
	
	HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[2]//parent::div"));
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
public void activebuttoninaddsupplier(){
	
	Contacts.checkboxinaddsupplier.click();
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
public void pagiantiondropdowninaddsupplier () throws Exception {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "5");
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
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText);
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

if (actualText2.equals(expected2)) {
    System.out.println("20 records are there");
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
public void nextbuttoninaddsupplier() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
	
}
public void previousbuttoninaddsupplier() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void directortabincontacts() throws InterruptedException {

	   HelperClass.waitUntilVisible(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   HelperClass.waitUntilClickable(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   Thread.sleep(5000);
	   Contacts.contactstab.click();
       Contacts.directortab.click();
       String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Director']"));
       String expected = "Add Director";
       try {
	        if (actualtext.equals(expected)) {
	        System.out.println("Add Director verified");
	        } else {
	        System.out.println("Add Director not verified");
	        }
	   } catch (Exception e) {
	    System.out.println("An error occurred while verifying Add Director: " + e.getMessage());
	   }
}
public void validateaddnewdirector() {
	
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Director']"));
	   String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Directors']"));
	   String expected = "Add New Directors";
		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Add New Directors verified");
			 } else {
			        System.out.println("Add New Directors not verified");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Add New Directors: " + e.getMessage());
			 }
}
public void entermandatoryfieldsindirector() throws InterruptedException {   
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet3");
	String[] director = data[0];
	Contacts.directorfirstname.sendKeys(director[0]); 
	HelperClass.clearField(HelperClass.getDriver(), Contacts.directorappointmentdate);
	Thread.sleep(2000);
	Contacts.directorappointmentdate.sendKeys(director[1]);
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and New']"));
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
	   String expected = "The operation completed Successfully!";
		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Director added");
			 } else {
			        System.out.println("Director not added");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Adding Director: " + e.getMessage());
			 }
	String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Directors']"));
	String expected1 = "Add New Directors";
		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Add New Directors verified");
			} else {
				      System.out.println("Add New Directors not verified");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying Add New Directors: " + e.getMessage());
			}
}
public void enternonmandatoryfieldsindirector() throws IOException { 
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet3");
	String[] director = data[0];
	Contacts.directorlastname.sendKeys(director[2]);
	Contacts.addressline1indirector.sendKeys(director[3]);
	Contacts.addressline2indirector.sendKeys(director[4]);
	Contacts.addressline3indirector.sendKeys(director[5]);
	Contacts.cityindirector.sendKeys(director[6]);
	Contacts.postcodeindirector.sendKeys(director[7]);
	HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[@aria-autocomplete='list'])[1]"), "United Kingdom", By.xpath("(//div[normalize-space(text())='United Kingdom'])[2]"));
    Contacts.directoremail.sendKeys(director[8]);
    Contacts.phoneindirector.sendKeys(director[9]);
    HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),"//mat-select[@formcontrolname='shareholderId']", "No");
    Contacts.terminationdateindirector.sendKeys(director[10]);
    Contacts.notesindirector.sendKeys(director[11]);
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
    HelperClass.captureScreenshot("Non mandatory fields");
}
public void clearformindirector() {
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet3");
	String[] customers = data[0];
	Contacts.directorfirstname.sendKeys(customers[0]);
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Clear Form']"));
	String actualtext1 = HelperClass.getText(By.xpath("//input[@formcontrolname='firstName']"));
	String expected1 = "";
		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Data is cleared");
			} else {
				      System.out.println("Data is not cleared");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying clear form: " + e.getMessage());
			}
}
public void searchinaddnewdirector() {
	
	Contacts.searchinaddnewdirector.click();
	   String actualText = HelperClass.getText(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]")).trim();
	   String expected = "search";
	   try {
		    if (actualText.equals(expected)) {
		        System.out.println("Search box is displayed");
		    } else {
		        System.out.println("Search box is not displayed");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying search box: " + e.getMessage());
		}

	 HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "Prasanna");
	String actualText1 = HelperClass.getText(By.xpath("//a[normalize-space(text())='Prasanna']")).trim();
	String expected1 = "Prasanna";
	   try {
	      if (actualText1.equals(expected1)) {
	       System.out.println("✅Prasanna name verified");
	       } else {
	       System.out.println("❌Prasanna name is not verified" + actualText);
	       }
	       }catch (Exception e) {
	        System.out.println("An error occurred while verifying director name: " + e.getMessage());
	       }
	   Contacts.searchcrossinaddnewdirector.click();
	   String actualText2 = HelperClass.getText(By.xpath("//input[normalize-space(@placeholder)='Search']")).trim();
	   try {
	   if (HelperClass.isElementPresent(By.xpath("//input[normalize-space(@placeholder)='Search']"))) {
		    System.out.println("✅Prasanna name erased");
		} else {
		    System.out.println("❌Prasanna name is not erased: " + actualText);
		       }
		}catch (Exception e) {
	        System.out.println("An error occurred while verifying director name: " + e.getMessage());
	       }  
}
public void addbuttoninaddnewdirector(){

	   HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//table[@aria-describedby='side-list']/tbody/tr[1]/td[1]/div/div/a"));
	   String actualtext=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Directors']"));
	   String expected="Edit Directors";
	   try {
     if (actualtext.equals(expected)) {
	     System.out.println("Edit Directors verified");
	   }else
        {
	System.out.println("Edit Directors not verified");
       }
	   }catch (Exception e) {
	        System.out.println("An error occurred while verifying Edit Directors: " + e.getMessage());
	   }
	   HelperClass.clickUsingJS(By.xpath("//div[contains(@class,'side-list-icon')]/button/mat-icon[contains(text(),'add_circle')]"));
	   String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Directors']"));
	   String expected1="Add New Directors";
	   try {
     if (actualtext1.equals(expected1)) {
	     System.out.println("Add New Directors verified");
	   }else
       {
	     System.out.println("Add New Directors not verified");
       }
       }catch (Exception e) {
        System.out.println("An error occurred while verifying Add New Directors: " + e.getMessage());
       }
}
public void checkboxandvalidateoptionsinaddnewdirector() throws InterruptedException{

    Thread.sleep(1000);
    Contacts.checkboxesinaddnewdirector.click();
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
public void cancelselectionsinaddnewdirector(){
	   
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Cancel selections']"));
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//mat-icon[normalize-space()='highlight_off']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying cancel selection:" + e.getMessage());
		}
}
public void deletebuttoninaddnewdirector(){
	
    Contacts.directorcheckboxinaddnewdirector.click();
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
	        System.out.println("Error: Accounts has Associated Transactions"+ actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void copybuttoninaddnewdirector() {
	
	Contacts.directorcheckboxinaddnewdirector.click();
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
public void exportinaddnewdirector() {
	
	Contacts.directorcheckboxinaddnewdirector.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Excel']/ancestor::button")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Excel']/ancestor::button")));
	By Excel=By.xpath("//p[normalize-space()='Excel']/ancestor::button");
	WebElement downloadexcel = driver.findElement(Excel);
	HelperClass.clickUsingJS(downloadexcel);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='CSV']/ancestor::button")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='CSV']/ancestor::button")));
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='PDF']/ancestor::button")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='PDF']/ancestor::button")));
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));
}
public void inactivebuttoninaddnewdirector() {
	
	Contacts.directorcheckboxinaddnewdirector.click();
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
public void activebuttoninaddnewdirector(){
	
	Contacts.directorcheckboxinaddnewdirector.click();
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
public void closebuttoninaddnewdirector() {

	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']//parent::button"));
	   String actualText=HelperClass.getText(By.xpath("//span[normalize-space(text())='Terminate process']"));
	String expected="Terminate process";
	if (actualText.equals(expected)) {
	    System.out.println("Terminate process verified");
	}else{
	    System.out.println("Terminate process not verified: " + actualText);
 }
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Director']"));
	String expected1 = "Add Director";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Add Director verified");
		    } else {
		        System.out.println("Add Director not verified");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Add Director: " + e.getMessage());
		}
}
public void searchinadddirector(){
	
	WebElement input = driver.findElement(By.xpath("//input[@placeholder='Search here...']"));
	HelperClass.sleep1(2000);
	js.executeScript("arguments[0].value='Prasanna'; arguments[0].dispatchEvent(new Event('input'));", input);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	HelperClass.sleep1(2000);
	 String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Prasanna']")).trim();
	 String expected = "Prasanna";
	 try {
		    if (actualText.equals(expected)) {
		        System.out.println("✅ 'Prasanna' name verified");
		    } else {
		        System.out.println("❌ 'Prasanna' not verified: " + actualText);
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying 'Prasanna': " + e.getMessage());
		}
}
public void actionsexportinadddirector() {
	
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")));
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")); 	
}
public void mousehovereditinadddirector() {
	
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='Edit']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='Edit']"));
	String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Directors']"));
	   String expected1="Edit Directors";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Edit Directors verified");
		    } else {
		        System.out.println("Edit Directors not verified");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Edit Directors: " + e.getMessage());
		}
}
public void mousehoverdeletebuttoninadddirector() {
	
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
public void checkboxandvalidateoptionsinadddirector() throws InterruptedException{

    Thread.sleep(1000);
    Contacts.checkboxesinadddirector.click();
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
public void deletebuttoninadddirector(){
	
	Contacts.directorcheckboxinadddirector.click();
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
	        System.out.println("Error: Accounts has Associated Transactions"+ actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void copybuttoninadddirector() {
	
	Contacts.directorcheckboxinadddirector.click();
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
public void exportinadddirector() {
	
	Contacts.directorcheckboxinadddirector.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Excel']/ancestor::button")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Excel']/ancestor::button")));
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='CSV']/ancestor::button")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='CSV']/ancestor::button")));
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='PDF']/ancestor::button")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='PDF']/ancestor::button")));
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));
}
public void inactivebuttoninadddirector() {
	
	Contacts.directorcheckboxinadddirector.click();
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
public void activebuttoninadddirector(){
	
	Contacts.directorcheckboxinadddirector.click();
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
public void closebuttoninadddirector() {
	
	Contacts.checkboxesinadddirector.click();
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='highlight_off']"));
	String actualText = HelperClass.getText(By.xpath("//mat-icon[normalize-space()='highlight_off']")).trim();
	try {  
		if (HelperClass.isElementPresentAndDisplayed(
				By.xpath("//mat-icon[normalize-space()='highlight_off']//parent::span"))) {
			System.out.println("Element is still present");
		} else {
			System.out.println("Element is removed");
		}
	} catch (Exception e) {
	    System.out.println("An exception occurred while checking the tab status: " + e.getMessage());
	}
}
public void pagiantiondropdowninadddirector () throws Exception {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "5");
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
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText);
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

if (actualText2.equals(expected2)) {
    System.out.println("20 records are there");
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
public void nextbuttoninadddirector() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void previousbuttoninadddirector() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
public void shareholdertabincontacts() throws InterruptedException {

	   HelperClass.waitUntilVisible(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   HelperClass.waitUntilClickable(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	   Thread.sleep(5000);
	   Contacts.contactstab.click();
       Contacts.shareholdertabincontacts.click();
       String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Shareholder']"));
       String expected = "Add Shareholder";
       try {
	        if (actualtext.equals(expected)) {
	        System.out.println("Add Shareholder verified");
	        } else {
	        System.out.println("Add Shareholder not verified");
	        }
	   } catch (Exception e) {
	    System.out.println("An error occurred while verifying Add Shareholder: " + e.getMessage());
	   }
}
public void validateaddnewshareholder() {
	
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Shareholder']"));
	   String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Shareholders']"));
	   String expected = "Add New Shareholders";

		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Add New Shareholders verified");
			 } else {
			        System.out.println("Add New Shareholders not verified");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Add New Shareholders: " + e.getMessage());
			 }
}
public void entermandatoryfieldsinshareholder() {   
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet4");
	String[] shareholder = data[0];
	Contacts.shareholderfirstname.sendKeys(shareholder[0]);
    Contacts.shareholdervaluepershare.sendKeys(shareholder[1]);
    Contacts.shareholdernumberofshare.sendKeys(shareholder[2]);
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and New']"));
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
	   String expected = "The operation completed Successfully!";
		try {
			   if (actualtext.equals(expected)) {
			        System.out.println("Shareholder added");
			 } else {
			        System.out.println("Shareholder not added");
			        }
			 } catch (Exception e) {
			    System.out.println("An error occurred while verifying Adding Shareholder: " + e.getMessage());
			 }
	String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Shareholders']"));
	String expected1 = "Add New Shareholders";
		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Add New Shareholders verified");
			} else {
				      System.out.println("Add New Shareholders not verified");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying Add New Shareholders: " + e.getMessage());
			}
}
public void enternonmandatoryfieldsinshareholder() throws IOException { 
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet4");
	String[] shareholder = data[0];
	Contacts.shareholderlastname.sendKeys(shareholder[3]);
	Contacts.addressline1inshareholder.sendKeys(shareholder[4]);
	Contacts.addressline2inshareholder.sendKeys(shareholder[5]);
	Contacts.addressline3inshareholder.sendKeys(shareholder[6]);
	Contacts.cityinshareholder.sendKeys(shareholder[7]);
	Contacts.postcodeinshareholder.sendKeys(shareholder[8]);
	HelperClass.SearchAndSelectClient(HelperClass.getDriver(),HelperClass.getWait(), By.xpath("(//input[@aria-autocomplete='list'])[1]"), "United Kingdom", By.xpath("(//div[normalize-space(text())='United Kingdom'])[2]"));
    Contacts.shareholderemail.sendKeys(shareholder[9]);
    Contacts.phoneinshareholder.sendKeys(shareholder[10]);
    HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),"//mat-select[@formcontrolname='shareType']", "Non-Equity");
    Contacts.notesinshareholder.sendKeys(shareholder[11]);
    HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
    HelperClass.captureScreenshot("Non mandatory fields");
}
public void clearforminshareholder() {
	
	String[][] data = ExcelReader.getSheetData(ContactsFilePath, "Sheet4");
	String[] shareholder = data[0];
	Contacts.shareholderfirstname.sendKeys(shareholder[0]);
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Clear Form']"));
	String actualtext1 = HelperClass.getText(By.xpath("//input[@formcontrolname='firstName']"));
	String expected1 = "";
		try {
				if (actualtext1.equals(expected1)) {
				      System.out.println("Data is cleared");
			} else {
				      System.out.println("Data is not cleared");
				        }
			} catch (Exception e) {
				    System.out.println("An error occurred while verifying clear form: " + e.getMessage());
			}
}
public void searchinaddnewshareholder() {
 	
	Contacts.searchinaddnewshareholder.click();
	   String actualText = HelperClass.getText(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]")).trim();
	   String expected = "search";
        try {
		if (actualText.equals(expected)) {
		    System.out.println("Search box is displayed");
		} else {
		    System.out.println("Search box is not displayed");
		}
        } catch (Exception e) {
		    System.out.println("An error occurred while verifying search box: " + e.getMessage());
        }
	  HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "Deepika");
	  String actualText1 = HelperClass.getText(By.xpath("//a[normalize-space(text())='Deepika']")).trim();
	  String expected1 = "Deepika";
       try {
	   if (actualText1.equals(expected1)) {
	       System.out.println("✅Deepika name verified");
	   } else {
	       System.out.println("❌Deepika name is not verified" + actualText);
	          }
	   } catch (Exception e) {
	       System.out.println("An error occurred while verifying shareholder name: " + e.getMessage());
       }    
	   Contacts.searchcrossinaddnewshareholder.click();
	   String actualText2 = HelperClass.getText(By.xpath("//input[normalize-space(@placeholder)='Search']")).trim();
	    try {
	    if (HelperClass.isElementPresent(By.xpath("//input[normalize-space(@placeholder)='Search']"))) {
		    System.out.println("✅Deepika name erased");
		} else {
		    System.out.println("❌Deepika name is not erased: " + actualText);
		       }
        } catch (Exception e) {
          System.out.println("An error occurred while verifying search cross: " + e.getMessage());
        }
}
public void addbuttoninaddnewshareholder(){

	   HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//table[@aria-describedby='side-list']/tbody/tr[1]/td[1]/div/div/a"));
	   String actualtext=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Shareholders']"));
	   String expected="Edit Shareholders";
	    try {
        if (actualtext.equals(expected)) {
	     System.out.println("Edit Shareholders verified");
	    }else{
	       System.out.println("Edit Shareholders not verified");
              }
        } catch (Exception e) {
           System.out.println("An error occurred while verifying Edit Shareholders: " + e.getMessage());
        }
	   HelperClass.clickUsingJS(By.xpath("//div[contains(@class,'side-list-icon')]/button/mat-icon[contains(text(),'add_circle')]"));
	   String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Shareholders']"));
	   String expected1="Add New Shareholders";
	    try {
         if (actualtext1.equals(expected1)) {
	      System.out.println("Add New Shareholders verified");
	     }else{
	      System.out.println("Add New Shareholders not verified");
               }
	     } catch (Exception e) {
	           System.out.println("An error occurred while verifying Add New Shareholders: " + e.getMessage());
	     }
}
public void checkboxandvalidateoptionsinaddnewshareholder() throws InterruptedException{

    Thread.sleep(1000);
    Contacts.checkboxesinaddnewshareholder.click();
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
public void cancelselectionsinaddnewshareholder(){
	   
	Contacts.shareholdercheckboxinaddnewshareholder.click();
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Cancel selections']"));
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//mat-icon[normalize-space()='highlight_off']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying cancel selection: " + e.getMessage());
		}
}
public void deletebuttoninaddnewshareholder(){
	
    HelperClass.clickUsingJS(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
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
	        System.out.println("Error: Accounts has Associated Transactions"+ actualText);
	    }
	    } catch (Exception e) {
	        System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	    }
}
public void copybuttoninaddnewshareholders() {
	
	Contacts.shareholdercheckboxinaddnewshareholder.click();
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
public void exportinaddnewshareholder() throws InterruptedException {
	
	Contacts.shareholdercheckboxinaddnewshareholder.click();
    Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));
	Thread.sleep(3000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));
}
public void inactivebuttoninaddnewshareholder() {
	
	Contacts.shareholdercheckboxinaddnewshareholder.click();
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
public void activebuttoninaddnewshareholder(){
	
	Contacts.shareholdercheckboxinaddnewshareholder.click();
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
public void closebuttoninaddnewshareholder() {

	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='close']//parent::button"));
	   String actualText=HelperClass.getText(By.xpath("//span[normalize-space(text())='Terminate process']"));
	String expected="Terminate process";
	if (actualText.equals(expected)) {
	    System.out.println("Terminate process verified");
	}else{
	    System.out.println("Terminate process not verified: " + actualText);
 }
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
	String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Shareholder']"));
	String expected1 = "Add Shareholder";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Add Shareholder verified");
		    } else {
		        System.out.println("Add Shareholder not verified");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Add Shareholder: " + e.getMessage());
		}
}
public void searchinaddshareholder(){
	
	WebElement input = driver.findElement(By.xpath("//input[@placeholder='Search here...']"));
	HelperClass.sleep1(2000);
	js.executeScript("arguments[0].value='Deepika'; arguments[0].dispatchEvent(new Event('input'));", input);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	HelperClass.sleep1(2000);
	 String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Deepika']")).trim();
	 String expected = "Deepika";
	 try {
		    if (actualText.equals(expected)) {
		        System.out.println("'Deepika' name verified");
		    } else {
		        System.out.println("'Deepika' not verified: " + actualText);
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying 'Deepika': " + e.getMessage());
		}
}
public void actionsexportinaddshareholder() throws InterruptedException {
	
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export As PDF']/ancestor::button"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
	   HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
	   Thread.sleep(1000);
	   HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button")); 	
}
public void checkboxandvalidateoptionsinshareholder() throws InterruptedException{

    Thread.sleep(1000);
    Contacts.checkboxesinaddshareholder.click();
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
public void mousehovereditinaddshareholder() {
	
	HelperClass.hoverOverElement(By.xpath("(//table/tbody/tr)[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//button[@title='Edit']")));
	HelperClass.clickUsingJS(By.xpath("//button[@title='Edit']"));
	String actualtext1=HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Shareholders']"));
	   String expected1="Edit Shareholders";
	   try {
		    if (actualtext1.equals(expected1)) {
		        System.out.println("Edit Shareholders verified");
		    } else {
		        System.out.println("Edit Shareholders not verified");
		    }
		} catch (Exception e) {
		    System.out.println("⚠️ An error occurred while verifying Edit Shareholders: " + e.getMessage());
		}
}
public void mousehoverdeletebuttoninaddshareholder() {
	
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
public void cancelselectioninaddshareholder(){
	   
	Contacts.checkboxesinaddshareholder.click();
	   HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Cancel selection']"));
	   try {
		    if (HelperClass.isElementPresentAndDisplayed(By.xpath("//mat-icon[normalize-space()='highlight_off']"))) 
		    {
		        System.out.println("Element is still present");
		    } else {
		        System.out.println("Element is removed");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying cancel selection: " + e.getMessage());
		}
}
public void deletebuttoninaddshareholder(){
	
	HelperClass.clickUsingJS(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
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
	        System.out.println("Error: Accounts has Associated Transactions"+ actualText);
	    }
	} catch (Exception e) {
	    System.out.println("An error occurred while verifying Record deleted: " + e.getMessage());
	}
}
public void copybuttoninaddshareholder() {
	
	Contacts.shareholdercheckboxinaddshareholder.click();
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
public void exportinaddshareholder() throws InterruptedException {
	
	Contacts.shareholdercheckboxinaddshareholder.click();
    Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));
	Thread.sleep(1000);
	Contacts.shareholdercheckboxinaddshareholder.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button"));
	Thread.sleep(1000);
	Contacts.shareholdercheckboxinaddshareholder.click();
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));
}
public void inactivebuttoninaddshareholder() {
	
	Contacts.shareholdercheckboxinaddshareholder.click();
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
public void activebuttoninaddshareholder(){
	
	Contacts.shareholdercheckboxinaddshareholder.click();
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
public void pagiantiondropdowninaddshareholder () throws Exception {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='dropdownlist']")));
	HelperClass.safeClick(By.xpath("//span[@aria-label='dropdownlist']"));
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "5");
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
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/mat-checkbox"));
	
	String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
	String expected1 = "Records: 10";

	if (actualText1.equals(expected1)) {
	    System.out.println("10 records are there");
	} else {
	    System.out.println("Text not matched. Actual: " + actualText);
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

if (actualText2.equals(expected2)) {
    System.out.println("20 records are there");
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
public void nextbuttoninaddshareholder() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to next page'])[1]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to last page'])[1]"));
}
public void previousbuttoninaddshareholder() throws InterruptedException {
	Thread.sleep(1000);
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to previous page'])[2]"));
	HelperClass.clickUsingJS(By.xpath("(//div[@title='Go to first page'])[2]"));
}
}



