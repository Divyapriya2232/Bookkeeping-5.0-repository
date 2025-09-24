package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Login_Locators {

	

	@FindBy(xpath = "//input[@name='txtusername']")
	@CacheLookup
	public WebElement inputUsername;

	@FindBy(xpath = "//input[@name='txtpassword']")
	@CacheLookup
	public WebElement inputPassword;

	@FindBy(xpath = "//button[normalize-space(text())='Login']")
	@CacheLookup
	public WebElement btnLogin;

	@FindBy(xpath = "//h1")
	@CacheLookup
	public WebElement Headingtag;

	@FindBy(xpath = "//a[@title='Modules']")
	@CacheLookup
	public WebElement C_icon_inside_modules;
	
    // Clicking home button inside c icon
	@FindBy(xpath = "	")
	@CacheLookup
	public WebElement Bookkeeping_Module;

	@FindBy(xpath = "//div[text()='Accounts Production']")
	@CacheLookup
	public WebElement AccountsProduction_Module;

	@FindBy(xpath = "//div[text()='Corporation Tax']")
	@CacheLookup
	public WebElement CorporationTax_Module;

	@FindBy(xpath = "//div[text()='Self Assessment']")
	@CacheLookup
	public WebElement SelfAssessment_Module;

	@FindBy(xpath = "//div[text()='Payroll']")
	@CacheLookup
	public WebElement Payroll_Module;

	@FindBy(xpath = "//p[normalize-space()='Welcome to your Capium EcoSystem']")
	@CacheLookup
	public WebElement Homepage_Element;

	@FindBy(xpath = "(//h6[text()='Bookkeeping'])[4]")
	@CacheLookup
	public WebElement Homepage_BK_module;
	
	@FindBy(xpath="//i[@class='icon fa fa-power-off']")
	@CacheLookup
	public WebElement Logout_element;
	
	@FindBy(xpath="//div[@class='profile-logo']//label")
	@CacheLookup
	public WebElement Logo_in_homepage;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	@CacheLookup
	public WebElement Logout_inside_logo;
 
	@FindBy(xpath="//a[@title='User Profile']")
	public WebElement FivePointProfileIcon;
	
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	public WebElement SignoutFivePointZero;
	
	
	@FindBy(xpath = "//h6[text()='365']//parent::a")
	@CacheLookup
	public WebElement Capiuum365_Module;
	
	@FindBy(xpath="//h6[text()='365']//parent::div")
	public WebElement InsideCicon5_0_365Module;
	
	@FindBy(xpath="//div[normalize-space()='Capium 365']")
	public WebElement insideCicon3_0_365Module;
	
	@FindBy(xpath="//img[@alt='Capium Logo']//parent::div//parent::a")
	public WebElement CiconFivepoint_o;
	
	@FindBy(xpath="(//a[@class='btn btn-outline-primary'])[2]")
	@CacheLookup
	public WebElement loginbutton;
	
	@FindBy(xpath="//input[@type='text']")
	@CacheLookup
	public WebElement emailaddressTF;
	
	@FindBy(xpath="//button[text()='Next']")
	@CacheLookup
	public WebElement nextbutton;
	
	@FindBy(xpath="//input[@type='text']")
	@CacheLookup
	public WebElement OTPtextfield;
	
	@FindBy(xpath="//a[text()='Verify Account']")
	@CacheLookup
	public WebElement verifyaccountbutton;
	
	@FindBy(xpath="//span[text()='Bank']")
	@CacheLookup
	public WebElement Banktab;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	@CacheLookup
	public WebElement HomepageElement;

}


