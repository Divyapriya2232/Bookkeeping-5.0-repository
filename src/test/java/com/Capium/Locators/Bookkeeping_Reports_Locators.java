package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bookkeeping_Reports_Locators {
	
	@FindBy(xpath="(//a[normalize-space(text())='Reports'])[2]")
	@CacheLookup
	public WebElement reportstab;
	
	@FindBy(xpath="//a[normalize-space(text())='Report Dashboard']")
	@CacheLookup
	public WebElement reportdashboard;
	
	@FindBy(xpath="//span[normalize-space(text())='Debtors']")
	@CacheLookup
	public WebElement Debtorsinreportdashboard;
	
	@FindBy(xpath="//span[normalize-space(text())='Profit & Loss']")
	@CacheLookup
	public WebElement profitandlosstab;

	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	@CacheLookup
	public WebElement profitandlossactions;
	
	@FindBy(xpath="//a[normalize-space()='Balance Sheet']")
	@CacheLookup
	public WebElement balancesheettab;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	@CacheLookup
	public WebElement balancesheetactions;
	
	@FindBy(xpath="//a[normalize-space(text())='Trial Balance']")
	@CacheLookup
	public WebElement trialbalancetab;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	@CacheLookup
	public WebElement trialbalanceactions;
	
	@FindBy(xpath="//a[normalize-space(text())='Comparative Report']")
	@CacheLookup
	public WebElement comparativereporttab;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	@CacheLookup
	public WebElement comparativereportactions;
	
	@FindBy(xpath="//a[normalize-space(text())='Day-Book']")
	@CacheLookup
	public WebElement daybooktab;
	
	@FindBy(xpath="//a[normalize-space(text())='Cash Flow']")
	@CacheLookup
	public WebElement cashflowtab;
	
	@FindBy(xpath="//a[normalize-space(text())='Additional']")
	@CacheLookup
	public WebElement additionaltab;
	
	@FindBy(xpath="//a[normalize-space(text())='Sales Performance']")
	@CacheLookup
	public WebElement salesperformancetab;
	
	@FindBy(xpath="//a[normalize-space(text())='Expenses Performance']")
	@CacheLookup
	public WebElement expenseperformancetab;
	
	@FindBy(xpath="//a[normalize-space(text())='Transaction List By Date']")
	@CacheLookup
	public WebElement transactionlistbydatetab;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	@CacheLookup
	public WebElement transactionlistbydateactions;
	
	@FindBy(xpath="//a[normalize-space(text())='Recent Transactions']")
	@CacheLookup
	public WebElement recenttransactionstab;
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	@CacheLookup
	public WebElement recenttransactionsactions;
	
	@FindBy(xpath="//a[normalize-space(text())='Balance Sheet Comparison']")
	@CacheLookup
	public WebElement balancesheetcomparisontab;
	
	@FindBy(xpath="//a[normalize-space(text())='Balance Sheet Detail']")
	@CacheLookup
	public WebElement balancesheetdetailstab;
	
	@FindBy(xpath="//a[normalize-space(text())='Custom Report']")
	@CacheLookup
	public WebElement customreporttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Customer']")
	@CacheLookup
	public WebElement customertab;
	
	@FindBy(xpath="//a[normalize-space(text())='Advance Report']")
	@CacheLookup
	public WebElement advancereportincustomertab;
	
	@FindBy(xpath="//a[normalize-space(text())='Sales Report']")
	@CacheLookup
	public WebElement salesreporttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Customer List']")
	@CacheLookup
	public WebElement customerlisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Customer Ageing List']")
	@CacheLookup
	public WebElement customerageinglisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Transactions By Customer']")
	@CacheLookup
	public WebElement transactionbycustomertab;
	
	@FindBy(xpath="//a[normalize-space(text())='Sales Product List']")
	@CacheLookup
	public WebElement salesproductlisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Customer Receipts']")
	@CacheLookup
	public WebElement customerreceipttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Debtors']")
	@CacheLookup
	public WebElement debtorstab;
	
	@FindBy(xpath="//a[normalize-space(text())='Customer Statement']")
	@CacheLookup
	public WebElement customerstatementtab;
	
	@FindBy(xpath="//a[normalize-space(text())='Sales Invoice List']")
	@CacheLookup
	public WebElement salesinvoicelisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Open Invoice']")
	@CacheLookup
	public WebElement openinvoicetab;
	
	@FindBy(xpath="//a[normalize-space(text())='Income by Customer Summary']")
	@CacheLookup
	public WebElement incomebycustomersummarytab;
	
	@FindBy(xpath="//a[normalize-space(text())='Customer Balance Summary']")
	@CacheLookup
	public WebElement customerbalancesummarytab;
	
	@FindBy(xpath="//a[normalize-space(text())='Deposit Details']")
	@CacheLookup
	public WebElement depositedetailstab;
	
	@FindBy(xpath="//a[normalize-space(text())='Advance Ageing List']")
	@CacheLookup
	public WebElement advanceageinglisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Quotation By Customer']")
	@CacheLookup
	public WebElement quotationbycustomertab;
	
	@FindBy(xpath="//a[normalize-space(text())='Invoice and Received Payments']")
	@CacheLookup
	public WebElement invoiceandreceivedpaymentstab;
	
	@FindBy(xpath="//a[normalize-space(text())='Sales by Product/Service Detail']")
	@CacheLookup
	public WebElement salesbyproductservicedetailtab;
	
	@FindBy(xpath="//a[normalize-space(text())='Sales by Product/Service Summary']")
	@CacheLookup
	public WebElement salesbyproductservicesummarytab;
	
	@FindBy(xpath="//a[normalize-space(text())='Supplier']")
	@CacheLookup
	public WebElement suppliertab;
	
	@FindBy(xpath="(//a[normalize-space(text())='Advance Report'])[2]")
	@CacheLookup
	public WebElement advancereportinsuppliertab;
	
	@FindBy(xpath="//a[normalize-space(text())='Purchases Report']")
	@CacheLookup
	public WebElement purchasesreporttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Supplier List']")
	@CacheLookup
	public WebElement supplierlisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Supplier Ageing List']")
	@CacheLookup
	public WebElement supplierageinglisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Transactions By Supplier']")
	@CacheLookup
	public WebElement transactionsbysuppliertab;
	
	@FindBy(xpath="//a[normalize-space(text())='Payment To Supplier']")
	@CacheLookup
	public WebElement paymenttosuppliertab;
	
	@FindBy(xpath="//a[normalize-space(text())='Creditors']")
	@CacheLookup
	public WebElement creditorstab;
	
	@FindBy(xpath="//a[normalize-space(text())='Supplier Statement']")
	@CacheLookup
	public WebElement supplierstatementtab;
	
	@FindBy(xpath="//a[normalize-space(text())='Purchases Invoice List']")
	@CacheLookup
	public WebElement purchasesinvoicelisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Unpaid Purchases']")
	@CacheLookup
	public WebElement unpaidpurchasestab;
	
	@FindBy(xpath="//a[normalize-space(text())='Expenses by Supplier Summary']")
	@CacheLookup
	public WebElement expensesbysuppliersummarytab;
	
	@FindBy(xpath="//a[normalize-space(text())='Supplier Balance Summary']")
	@CacheLookup
	public WebElement supplierbalancesummarytab;
	
	@FindBy(xpath="//a[normalize-space(text())='Account Payable Ageing list']")
	@CacheLookup
	public WebElement accountpayableageinglisttab;
	
	@FindBy(xpath="//a[normalize-space(text())='Cheque Detail']")
	@CacheLookup
	public WebElement chequedetailtab;
	
	@FindBy(xpath="//a[normalize-space(text())='Purchase and Applied Payments']")
	@CacheLookup
	public WebElement purchaseandappliedpaymentstab;
	
	@FindBy(xpath="//a[normalize-space(text())='VAT']")
	@CacheLookup
	public WebElement VATtab;
}
