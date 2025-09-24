package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bookkeeping_MTD_Locators {
	
	@FindBy(xpath="//a[normalize-space(text())='MTD']")
	@CacheLookup
	public WebElement MTDtab;
 
	@FindBy(xpath="//a[ normalize-space(text())='Submit VAT']")
	@CacheLookup
	public WebElement submitvattab;
	
	@FindBy(xpath="(//button[@aria-label='Open calendar'])[1]")
	@CacheLookup
	public WebElement calendarfromdate;
	
	@FindBy(xpath="(//button[@aria-label='Open calendar'])[2]")
	@CacheLookup
	public WebElement calendartodate;
 
	@FindBy(xpath="//button[@aria-label='Open calendar']")
	@CacheLookup
	public WebElement flatrateadjustmentjournaldate;
	
	@FindBy(xpath="//a[normalize-space(text())='Bridging VAT']")
	@CacheLookup
	public WebElement bridgingvattab;
	
	@FindBy(xpath="//a[normalize-space(text())='View VAT Details']")
	@CacheLookup
	public WebElement viewvatdetailstab;
	
	@FindBy(xpath="//button[@aria-label='Open calendar']")
	@CacheLookup
	public WebElement vatsettingsregistrationdate;
	
	@FindBy(xpath="//input[@formcontrolname='registrationNo']")
	@CacheLookup
	public WebElement vatsettingsregistrationno;
}
