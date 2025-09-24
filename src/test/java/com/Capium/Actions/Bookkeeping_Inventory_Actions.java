package com.Capium.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_Inventory_Locators;
import com.Capium.Locators.Bookkeeping_Reports_Locators;
import com.Capium.Utilites.ExcelReader;
import com.Capium.Utilites.HelperClass;


public class Bookkeeping_Inventory_Actions {
	
	Bookkeeping_Inventory_Locators Reports = null;
	private Bookkeeping_Inventory_Locators Inventory;
	
	public Bookkeeping_Inventory_Actions() {
			this.Inventory = new Bookkeeping_Inventory_Locators();
			PageFactory.initElements(HelperClass.getDriver(),Inventory);
		}
	String InventoryFilepath="C:\\Users\\user\\Documents\\Inventory.xlsx";
		WebDriverWait wait=HelperClass.getWait();
		   WebDriver driver=HelperClass.getDriver();

public void producttab() throws InterruptedException {
	
	HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']"));
	Thread.sleep(2000);
	HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']"), "BK Automation");
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	Thread.sleep(2000);
	HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
	Thread.sleep(5000);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Sales']"));
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Product']"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Product']"));
	String[][] data = ExcelReader.getSheetData(InventoryFilepath, "Sheet1");
	String[] product = data[0];
	Inventory.productname.sendKeys(product[0]);
	Thread.sleep(1000);
	HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
			By.xpath("//ng-select[@formcontrolname='vatRate']"), "Custom Vat",
			By.xpath("//div[normalize-space(text())='Custom Vat']"));
	Inventory.price.sendKeys(product[1]);
	HelperClass.clickUsingJS(By.xpath("//mat-checkbox[@formcontrolname='trackProductInInvetory']//input"));
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
	WebElement productname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='e-table']/tbody/tr[1]/td[3]//span")));
	String Product = productname.getText().trim();
	String P = Product;
	System.out.println("P: " + Product);
	Inventory.inventorytab.click();
	String actualtext1 = HelperClass.getText(By.xpath("//table[@aria-describedby='Inventory']/tbody/tr[1]/td[1]"));
	   String expected1 =Product;
	   try {
			if (actualtext1.equals(expected1)) {
				  System.out.println("productname verified");
		    } else {
				  System.out.println("productname not verified");
		           }
			} catch (Exception e) {
				  System.out.println("An error occurred while verifying productname: " + e.getMessage());
			}
}
public void inventorytab() throws InterruptedException, IOException {
		
		HelperClass.clickUsingJS(By.xpath("//input[@placeholder='Search here...']"));
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search here...']"), "BK Automation");
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a"));
		Thread.sleep(5000);
		Inventory.inventorytab.click();
		String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='Inventory']"));
		   String expected = "Inventory";
			try {
				 if (actualtext.equals(expected)) {
				      System.out.println("Inventory verified");
				  } else {
				      System.out.println("Inventory not verified");
				          }
				  } catch (Exception e) {
				      System.out.println("An error occurred while verifying Inventory: " + e.getMessage());
				  }
			HelperClass.selectAllDropdownOptions(By.xpath("//input[@aria-autocomplete='list']"), By.xpath("//div[@role='option']"), null, expected);
}
public static void setDateAsTextandsearch()throws IOException {

//	HelperClass.setValueUsingJS(By.xpath("(//input[@autocomplete='off'])[1]"), 16/9/2025);
//	HelperClass.setValueUsingJS(By.xpath("(//input[@autocomplete='off'])[2]"), 16/9/2025);
	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='search'])[2]"));
	HelperClass.captureScreenshot("Date");
 }
public void losstostock() {
	
	Inventory.losstostock.click();
	String actualtext = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Loss of Stock']"));
	   String expected = "Loss of Stock";
		try {
			 if (actualtext.equals(expected)) {
			      System.out.println("Loss of Stock verified");
			  } else {
			      System.out.println("Loss of Stock not verified");
			          }
			  } catch (Exception e) {
			      System.out.println("An error occurred while verifying Loss of Stock: " + e.getMessage());
			  } 
}
public void mandatoryfieldsinlosstostock() throws InterruptedException {
	
	String[][] data = ExcelReader.getSheetData(InventoryFilepath, "Sheet1");
	String[] Data = data[0];
	HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[@formcontrolname='date']"));
	Thread.sleep(1000);
	Inventory.dateinlosstostock.sendKeys(Data[2]);
	HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
			By.xpath("//ng-select[@formcontrolname='product']"), "Fabric",
			By.xpath("//div[normalize-space(text())='Fabric']"));
	Inventory.unitlostinlosstostock.sendKeys(Data[3]);
	HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Save'])[2]"));
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
	   String expected = "The operation completed Successfully!";
		try {
			 if (actualtext.equals(expected)) {
			      System.out.println("operation verified");
			  } else {
			      System.out.println("operation not verified");
			          }
			  } catch (Exception e) {
			      System.out.println("An error occurred while verifying operation: " + e.getMessage());
			  } 
}
public void nonmandatoryfieldsininventory() throws InterruptedException, AWTException {
	
	String[][] data = ExcelReader.getSheetData(InventoryFilepath, "Sheet1");
	String[] Data = data[0];
	Inventory.notesinlosstostock.sendKeys(Data[4]);
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Attachment']"));
	WebDriver driver = HelperClass.getDriver();
	WebElement chooseFileButton = driver.findElement(By.xpath("//mat-icon[normalize-space(text())='cloud_upload']"));
	chooseFileButton.click();
	Thread.sleep(2000);
	String filePath = "C:\\Users\\user\\Downloads\\Capium logo.jpg";
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
	HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Save'])[2]"));
	String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
	String expected = "The operation completed Successfully!";
		try {
			 if (actualtext.equals(expected)) {
			      System.out.println("operation verified");
			  } else {
			      System.out.println("operation not verified");
			          }
			  } catch (Exception e) {
			      System.out.println("An error occurred while verifying operation: " + e.getMessage());
			  } 
}
public void cancelinlossofstock() throws InterruptedException {
	
	HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel']"));
	Thread.sleep(1000);
		try {
			if (HelperClass.isElementPresentAndDisplayed(
					By.xpath("//h2[normalize-space(text())='Loss of Stock']"))) {
				System.out.println("Element is still present");
			} else {
				System.out.println("Element is removed");
			       }
		    } catch (Exception e) {
		      System.out.println("An error occurred while verifying operation: " + e.getMessage());
		           } 
}
public void addnewlineinlossofstock() {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Add New Line']"));
	try {
		if (HelperClass.isElementPresentAndDisplayed(By.xpath("//table[@aria-describedby='account-list']/tbody/tr[2]"))) {
			System.out.println("New line should display");
		} else {
			System.out.println("New line should not display");
		       }
	    } catch (Exception e) {
	      System.out.println("An error occurred while verifying operation: " + e.getMessage());
	           } 
}
public void clearalllinesinlossofstock() {
	
	String[][] data = ExcelReader.getSheetData(InventoryFilepath, "Sheet1");
	String[] Data = data[0];
	Inventory.notesinlosstostock.sendKeys(Data[4]);
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Clear All Lines']"));
	String actualText = HelperClass.getText(By.xpath("//input[@formcontrolname='email']")).trim();
	System.out.println(actualText);
	String expected = "";
	try {
	if (actualText.equals(expected)) {
		System.out.println("Data cleared successfully");
	} else {
		System.out.println("Data not cleared: " + actualText);
	       }
    } catch (Exception e) {
        System.out.println("An error occurred while verifying operation: " + e.getMessage());
           } 
}
public void deleteinlossofstock() {
	
	HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Add New Line']"));
	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='delete_outline']"));
	try {
		if (HelperClass.isElementPresentAndDisplayed(By.xpath("//table[@aria-describedby='account-list']/tbody/tr[2]"))) {
			System.out.println("New line should display");
		} else {
			System.out.println("New line should not display");
		       }
	    } catch (Exception e) {
	      System.out.println("An error occurred while verifying operation: " + e.getMessage());
	           } 
}
public void accountsinlossofstock() {
	
	HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Inventory']/tbody/tr[1]/td[2]//a"));
	String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Inventory Transactions']")).trim();
	System.out.println(actualText);
	String expected = "Inventory Transactions";
	try {
	if (actualText.equals(expected)) {
		System.out.println("Inventory Transactions verified");
	} else {
		System.out.println("Inventory Transactions not verified: " + actualText);
	       }
    } catch (Exception e) {
        System.out.println("An error occurred while verifying Inventory Transactions: " + e.getMessage());
           } 
	HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Inventory']/tbody/tr[1]/td[3]//a"));
	String actualText1 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Inventory Transactions']")).trim();
	String expected1 = "Inventory Transactions";
	try {
	if (actualText1.equals(expected1)) {
		System.out.println("Inventory Transactions verified");
	} else {
		System.out.println("Inventory Transactions not verified: " + actualText);
	       }
    } catch (Exception e) {
        System.out.println("An error occurred while verifying Inventory Transactions: " + e.getMessage());
           } 
	HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Inventory']/tbody/tr[1]/td[4]//a"));
	String actualText2 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Inventory Transactions']")).trim();
	String expected2 = "Inventory Transactions";
	try {
	if (actualText2.equals(expected2)) {
		System.out.println("Inventory Transactions verified");
	} else {
		System.out.println("Inventory Transactions not verified: " + actualText);
	       }
    } catch (Exception e) {
        System.out.println("An error occurred while verifying Inventory Transactions: " + e.getMessage());
           }
	HelperClass.clickUsingJS(By.xpath("//table[@aria-describedby='Inventory']/tbody/tr[1]/td[5]//a"));
	String actualText3 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Inventory Transactions']")).trim();
	String expected3 = "Inventory Transactions";
	try {
	if (actualText3.equals(expected3)) {
		System.out.println("Inventory Transactions verified");
	} else {
		System.out.println("Inventory Transactions not verified: " + actualText);
	       }
    } catch (Exception e) {
        System.out.println("An error occurred while verifying Inventory Transactions: " + e.getMessage());
           }
}
}
