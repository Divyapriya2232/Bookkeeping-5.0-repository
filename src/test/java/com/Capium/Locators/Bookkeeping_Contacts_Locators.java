package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bookkeeping_Contacts_Locators {

	@FindBy(xpath=" //a[normalize-space(text())='Contacts']")
	@CacheLookup
	public WebElement contactstab;
	
	@FindBy(xpath="//a[normalize-space(text())='Customers']")
	@CacheLookup
	public WebElement customertab;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	@CacheLookup
	public WebElement customername;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	@CacheLookup
	public WebElement customeremail;
	
	@FindBy(xpath="//input[@formcontrolname='tradingName']")
	@CacheLookup
	public WebElement tradingnameincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine1']")
	@CacheLookup
	public WebElement addressline1incustomers;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine2']")
	@CacheLookup
	public WebElement addressline2incustomers;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine3']")
	@CacheLookup
	public WebElement addressline3incustomers;
	
	@FindBy(xpath="//input[@formcontrolname='city']")
	@CacheLookup
	public WebElement cityincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='postCode']")
	@CacheLookup
	public WebElement postcodeincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='mobileNumber']")
	@CacheLookup
	public WebElement mobilenumberincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	@CacheLookup
	public WebElement phoneincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='fax']")
	@CacheLookup
	public WebElement faxincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='vatRegistrationNumber']")
	@CacheLookup
	public WebElement vatregistrationnumberincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='accountName']")
	@CacheLookup
	public WebElement bankaccountnameincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='accountNumber']")
	@CacheLookup
	public WebElement bankaccountnumberincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='branchCode']")
	@CacheLookup
	public WebElement branchcodeincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='accountIBANCode']")
	@CacheLookup
	public WebElement accountibancodeincustomers;
	
	@FindBy(xpath="//input[@formcontrolname='openingBalance']")
	@CacheLookup
	public WebElement openingbalanceincustomers;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='search'])[2]")
	@CacheLookup
	public WebElement searchinaddnewcustomer;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	@CacheLookup
	public WebElement searchcrossinaddnewcustomer;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinaddnewcustomer;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]//parent::div")
	@CacheLookup
	public WebElement customercheckboxinaddnewcustomer;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	@CacheLookup
	public WebElement actionsinaddcustomer;
	
	@FindBy(xpath="//a[normalize-space(text())='Suppliers']")
	@CacheLookup
	public WebElement supplierstab;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	@CacheLookup
	public WebElement suppliername;
	
	@FindBy(xpath="(//input[@formcontrolname='tradingName'])[1]")
	@CacheLookup
	public WebElement tradingnameinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine1']")
	@CacheLookup
	public WebElement addressline1insuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine2']")
	@CacheLookup
	public WebElement addressline2insuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine3']")
	@CacheLookup
	public WebElement addressline3insuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='city']")
	@CacheLookup
	public WebElement cityinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	@CacheLookup
	public WebElement suppliersemail;
	
	@FindBy(xpath="//input[@formcontrolname='postCode']")
	@CacheLookup
	public WebElement postcodeinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='mobileNumber']")
	@CacheLookup
	public WebElement mobilenumberinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	@CacheLookup
	public WebElement phoneinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='fax']")
	@CacheLookup
	public WebElement faxinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='vatRegistrationNumber']")
	@CacheLookup
	public WebElement vatregistrationnumberinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='accountName']")
	@CacheLookup
	public WebElement bankaccountnameinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='accountNumber']")
	@CacheLookup
	public WebElement bankaccountnumberinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='branchCode']")
	@CacheLookup
	public WebElement branchcodeinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='accountIBANCode']")
	@CacheLookup
	public WebElement accountibancodeinsuppliers;
	
	@FindBy(xpath="//input[@formcontrolname='openingBalance']")
	@CacheLookup
	public WebElement openingbalanceinsuppliers;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='search'])[2]")
	@CacheLookup
	public WebElement searchinaddnewsuppliers;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	@CacheLookup
	public WebElement searchcrossinaddnewsuppliers;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinaddnewsuppliers;
	
	@FindBy(xpath="//table[@aria-describedby='side-list']/tbody/tr[1]/td[1]/div/div/mat-checkbox")
	@CacheLookup
	public WebElement suppliercheckboxinaddnewsuppliers;
	
	@FindBy(xpath="//tbody/tr[1]/td/div//mat-checkbox/div//input")
	@CacheLookup
	public WebElement checkboxinaddsupplier;
	
	@FindBy(xpath="//a[normalize-space(text())='Director']")
	@CacheLookup
	public WebElement directortab;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	@CacheLookup
	public WebElement directorfirstname;
	
	@FindBy(xpath="//input[@formcontrolname='appointmentDate']")
	@CacheLookup
	public WebElement directorappointmentdate;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	@CacheLookup
	public WebElement directorlastname;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine1']")
	@CacheLookup
	public WebElement addressline1indirector;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine2']")
	@CacheLookup
	public WebElement addressline2indirector;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine3']")
	@CacheLookup
	public WebElement addressline3indirector;
	
	@FindBy(xpath="//input[@formcontrolname='city']")
	@CacheLookup
	public WebElement cityindirector;
	
	@FindBy(xpath="//input[@formcontrolname='postCode']")
	@CacheLookup
	public WebElement postcodeindirector;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	@CacheLookup
	public WebElement directoremail;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	@CacheLookup
	public WebElement phoneindirector;
	
	@FindBy(xpath="//input[@formcontrolname='terminationDate']")
	@CacheLookup
	public WebElement terminationdateindirector;
	
	@FindBy(xpath="//textarea[@formcontrolname='notes']")
	@CacheLookup
	public WebElement notesindirector;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='search'])[2]")
	@CacheLookup
	public WebElement searchinaddnewdirector;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	@CacheLookup
	public WebElement searchcrossinaddnewdirector;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinaddnewdirector;
	
	@FindBy(xpath="//tbody/tr[1]/td/div//mat-checkbox/div//input")
	@CacheLookup
	public WebElement directorcheckboxinaddnewdirector;
		
	@FindBy(xpath="(//input[@type='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinadddirector;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]//parent::div")
	@CacheLookup
	public WebElement directorcheckboxinadddirector;
	
	@FindBy(xpath="//a[normalize-space(text())='Shareholder']")
	@CacheLookup
	public WebElement shareholdertabincontacts;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	@CacheLookup
	public WebElement shareholderfirstname;
	
	@FindBy(xpath="//input[@formcontrolname='valuePerShare']")
	@CacheLookup
	public WebElement shareholdervaluepershare;
	
	@FindBy(xpath="//input[@formcontrolname='noOfShare']")
	@CacheLookup
	public WebElement shareholdernumberofshare;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	@CacheLookup
	public WebElement shareholderlastname;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine1']")
	@CacheLookup
	public WebElement addressline1inshareholder;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine2']")
	@CacheLookup
	public WebElement addressline2inshareholder;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine3']")
	@CacheLookup
	public WebElement addressline3inshareholder;
	
	@FindBy(xpath="//input[@formcontrolname='city']")
	@CacheLookup
	public WebElement cityinshareholder;
	
	@FindBy(xpath="//input[@formcontrolname='postCode']")
	@CacheLookup
	public WebElement postcodeinshareholder;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	@CacheLookup
	public WebElement shareholderemail;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	@CacheLookup
	public WebElement phoneinshareholder;
	
	@FindBy(xpath="//textarea[@formcontrolname='notes']")
	@CacheLookup
	public WebElement notesinshareholder;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='search'])[2]")
	@CacheLookup
	public WebElement searchinaddnewshareholder;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	@CacheLookup
	public WebElement searchcrossinaddnewshareholder;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinaddnewshareholder;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]//parent::div")
	@CacheLookup
	public WebElement shareholdercheckboxinaddnewshareholder;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinaddshareholder;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]//parent::div")
	@CacheLookup
	public WebElement shareholdercheckboxinaddshareholder;
}



