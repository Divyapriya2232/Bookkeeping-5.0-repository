package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bookkeeping_Quickentry_Locators {

	@FindBy(xpath="//table[@aria-describedby='Main Grid Table']/tbody/tr[1]/td[3]/div/a")
	@CacheLookup
	public WebElement Clickonclientindashboard;
	
	@FindBy(xpath="//a[normalize-space(text())='Quick Entry']")
	@CacheLookup
	public WebElement Quickentrytab;
	
	@FindBy(xpath="//input[normalize-space(@formcontrolname)='netAmount']")
	@CacheLookup
	public WebElement Netamountinquickentry;
	
	@FindBy(xpath="//span[normalize-space(text())='Save and Exit']")
	@CacheLookup
	public WebElement Saveandexitinaddquickentry;
	
	@FindBy(xpath="//input[normalize-space(@formcontrolname)='reference']")
	@CacheLookup
	public WebElement referenceinaddquickentry;
	
	@FindBy(xpath="//span[normalize-space(text())='Save and New']")
	@CacheLookup
	public WebElement Saveandnewinaddquickentry;
	
	@FindBy(xpath="//input[normalize-space(@formcontrolname)='reference']")
	@CacheLookup
	public WebElement clearforminaddquickentry;
	
	@FindBy(xpath="(//input[normalize-space(@formcontrolname)='netAmount'])[2]")
	@CacheLookup
	public WebElement Netamountinaddnewlinequickentry;
	
	@FindBy(xpath="//input[normalize-space(@formcontrolname)='amount']")
	@CacheLookup
	public WebElement Totalamountinaddnewlinequickentry;
	
	@FindBy(xpath="(//input[normalize-space(@formcontrolname)='reference'])[2]")
	@CacheLookup
	public WebElement referenceinaddnewlineaddquickentry;
	
	@FindBy(xpath="(//input[normalize-space(@formcontrolname)='description'])[2]")
	@CacheLookup
	public WebElement Descriptioninaddnewlineaddquickentry;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='search'])[2]")
	@CacheLookup
	public WebElement searchinaddnewquickentry;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	@CacheLookup
	public WebElement searchcrossinaddnewquickentry;
	
	@FindBy(xpath="(//input[normalize-space(@type)='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinaddnewquickentry;
	
	@FindBy(xpath="(//input[normalize-space(@type)='checkbox'])[2]//parent::div")
	@CacheLookup
	public WebElement checkboxinaddnewquickentry;
	
	@FindBy(xpath="//a[normalize-space(text())='Cancel selections']")
	@CacheLookup
	public WebElement cancelselectionsinaddnewquickentry;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='border_all']")
	public WebElement excelinexport;
	
	@FindBy(xpath="(//mat-icon[normalize-space(text())='description'])[1]")
	public WebElement csvinexport;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='picture_as_pdf']")
	public WebElement pdfinexport;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='close']//parent::button")
	public WebElement closebuttoninaddnewquickentry;
	
	@FindBy(xpath="//input[@placeholder='Search here...']//parent::div")
	public WebElement searchinaddquickentry;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	public WebElement actionsinaddquickentry;
	
	@FindBy(xpath="(//input[normalize-space(@type)='checkbox'])[2]//parent::div")
	public WebElement checkboxinaddquickentry;
	
	@FindBy(xpath="//span[normalize-space(text())='Export As PDF']")
	public WebElement exporttopdf;
	
	@FindBy(xpath="//span[normalize-space(text())='Export to Excel']")
	public WebElement exporttoexcel;
	
	@FindBy(xpath="//span[normalize-space(text())='Export to CSV']")
	public WebElement exporttocsv;
	
	@FindBy(xpath="(//input[normalize-space(@type)='checkbox'])[1]//parent::div")
	@CacheLookup
	public WebElement checkboxesinaddquickentry;
	
}

