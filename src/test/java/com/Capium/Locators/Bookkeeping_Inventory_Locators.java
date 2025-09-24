package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bookkeeping_Inventory_Locators {

	@FindBy(xpath="//input[@formcontrolname='productName']")
	@CacheLookup
	public WebElement productname;
	
	@FindBy(xpath="//input[@formcontrolname='productPrice']")
	@CacheLookup
	public WebElement price;
	
	@FindBy(xpath="//a[normalize-space(text())='Inventory']")
	@CacheLookup
	public WebElement inventorytab;
	
	@FindBy(xpath="//span[normalize-space(text())='Loss of Stock']")
	@CacheLookup
	public WebElement losstostock;
	
	@FindBy(xpath="//input[@formcontrolname='date']")
	@CacheLookup
	public WebElement dateinlosstostock;
	
	@FindBy(xpath="//input[@formcontrolname='unitLost']")
	@CacheLookup
	public WebElement unitlostinlosstostock;
	
	@FindBy(xpath="//textarea[@formcontrolname='notes']")
	@CacheLookup
	public WebElement notesinlosstostock;
	
}
