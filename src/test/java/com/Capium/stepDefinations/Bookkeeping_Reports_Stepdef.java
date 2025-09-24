package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Bookkeeping_Reports_Actions;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookkeeping_Reports_Stepdef {
	
	Bookkeeping_Reports_Actions  ReportsActions=new Bookkeeping_Reports_Actions();
	
     @Given("Click on reports")
     public void click_on_reports() throws InterruptedException {
          ReportsActions.reportstab();
 		  StepTracker.setCurrentStep("Click on reports");
     }
     @And("Click on report dashboard and validate")
     public void click_on_report_dashboard_and_validate(){
    	  ReportsActions.reportdashboardtab();
		  StepTracker.setCurrentStep("Click on report dashboard and validate");
     }
     @When("Click on all reports in report dashboard and validate")
     public void click_on_all_reports_in_report_dashboard_and_validate(){
    	  ReportsActions.allreportsinreportdashboard();
		  StepTracker.setCurrentStep("Click on all reports in report dashboard and validate");
     }
     @And("Click on financials and validate")
     public void click_on_financials_and_validate() {
    	 ReportsActions.validatefinancialtab();
		 StepTracker.setCurrentStep("Click on financials and validate");
     }
     @And("Click on profit & loss and validate")
     public void click_on_profit_loss_and_validate() throws IOException {
    	 ReportsActions.validateprofitandlosstab();
		 StepTracker.setCurrentStep("Click on profit & loss and validate");
     }
     @When("Click on profit & loss actions")
     public void click_on_profit_loss_actions() throws InterruptedException {
    	 ReportsActions.profitandlossactions();
		 StepTracker.setCurrentStep("Click on profit & loss actions");
     }
     @Then("Click on account in profit & loss and validate")
     public void click_on_account_in_profit_loss_and_validate() throws InterruptedException {
    	 ReportsActions.accountinprofitandloss();
		 StepTracker.setCurrentStep("Click on account in profit & loss and validate");
     }
     @And("Click on balance sheet and validate")
     public void click_on_balance_sheet_and_validate() throws IOException {
    	 ReportsActions.validatebalancesheettab();
		 StepTracker.setCurrentStep("Click on balance sheet and validate");
     }
     @When("Click on balance sheet actions")
     public void click_on_balance_sheet_actions() throws InterruptedException {
    	 ReportsActions.balancesheetactions();
		 StepTracker.setCurrentStep("Click on balance sheet actions");
     }
     @Then("Click on account in balance sheet and validate")
     public void click_on_account_in_balance_sheet_and_validate() throws InterruptedException {
    	 ReportsActions.accountinbalancesheet();
		 StepTracker.setCurrentStep("Click on account in balance sheet and validate");
     }
     @And("Click on trial balance and validate")
     public void click_on_trial_balance_and_validate() throws IOException {
    	 ReportsActions.validatetrialbalancetab();
		 StepTracker.setCurrentStep("Click on trial balance and validate");
     }
     @When("Click on trial balance actions")
     public void click_on_trial_balance_actions() throws InterruptedException {
    	 ReportsActions.trialbalanceactions();
		 StepTracker.setCurrentStep("Click on trial balance actions");
     }
     @Then("Click on account in trial balance")
     public void click_on_account_in_trial_balance() throws InterruptedException {
    	 ReportsActions.accountintrialbalance();
		 StepTracker.setCurrentStep("Click on account in trial balance");
     }
     @When("Click on comparative report and validate")
     public void click_on_comparative_report_and_validate() throws IOException {
    	 ReportsActions.validatecomparativereporttab();
		 StepTracker.setCurrentStep("Click on comparative report and validate");
     }
     @When("Click on comparative report actions")
     public void click_on_comparative_report_actions() throws InterruptedException, IOException {
    	 ReportsActions.comparativereportactions();
		 StepTracker.setCurrentStep("Click on comparative report actions");
     }
     @And("Click on day-book and validate")
     public void click_on_day_book_and_validate() throws IOException {
    	 ReportsActions.validatedaybooktab();
		 StepTracker.setCurrentStep("Click on day-book and validate");
     }
     @When("Click on day-book search button and validate")
     public void click_on_day_book_search_button_and_validate() {
    	 ReportsActions.searchindaybook();
		 StepTracker.setCurrentStep("Click on day-book search button and validate");
     }
     @When("Click on day-book actions")
     public void click_on_day_book_actions() throws InterruptedException {
    	 ReportsActions.daybookactions();
		 StepTracker.setCurrentStep("Click on day-book actions");
     }
     @And("Click on day-book accounts")
     public void click_on_day_book_accounts() throws InterruptedException {
    	 ReportsActions.accountsindaybook();
		 StepTracker.setCurrentStep("Click on day-book accounts");
     }
     @Then("Click on day-book reference number,contact and validate")
     public void click_on_day_book_reference_number_contact_and_validate()throws InterruptedException {
    	 ReportsActions.daybookreferencenumberandcontact();
		 StepTracker.setCurrentStep("Click on day-book reference number,contact and validate");
     }
     @And("Click on day-book pagination")
     public void click_on_day_book_pagination() throws Exception {
    	 ReportsActions.daybookpagination();
		 StepTracker.setCurrentStep("Click on day-book pagination");
     }
     @When("Click on day-book next button")
     public void click_on_day_book_next_button() throws InterruptedException {
    	 ReportsActions.daybooknextbutton();
		 StepTracker.setCurrentStep("Click on day-book next button");
     }
     @Then("Click on day-book previous button")
     public void click_on_day_book_previous_button() throws InterruptedException {
    	 ReportsActions.daybookpreviousbutton();
		 StepTracker.setCurrentStep("Click on day-book previous button");
     }
     @And("Click on cash flow and validate")
     public void click_on_cash_flow_and_validate() throws IOException {
    	 ReportsActions.validatecashflowtab();
		 StepTracker.setCurrentStep("Click on cash flow and validate");
     }
     @When("Click on cash flow actions")
     public void click_on_cash_flow_actions() throws InterruptedException, IOException {
    	 ReportsActions.cashflowactions();
		 StepTracker.setCurrentStep("Click on cash flow actions");
     }
     @And("Click on additional and validate")
     public void click_on_additional_and_validate() {
    	 ReportsActions.validateadditionaltab();
		 StepTracker.setCurrentStep("Click on additional and validate");
     }
     @When("Click on account details and validate")
     public void click_on_account_details_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.validateaccountdetailstab();
		 StepTracker.setCurrentStep("Click on account details and validate");
     }
     @When("Click on account details actions")
     public void click_on_account_details_actions() throws InterruptedException, IOException {
    	 ReportsActions.accountdetailsactions();
		 StepTracker.setCurrentStep("Click on account details actions");
     }
     @When("Click on account details accounts")
     public void click_on_account_details_accounts() throws IOException, InterruptedException {
    	 ReportsActions.accountdetailsaccounts();
		 StepTracker.setCurrentStep("Click on account details accounts");
     }
     @When("Click on account details pagination")
     public void click_on_account_details_pagination() throws Exception {
    	 ReportsActions.accountdetailspagination();
		 StepTracker.setCurrentStep("Click on account details pagination");
     }
     @When("Click on account details next button")
     public void click_on_account_details_next_button() throws InterruptedException {
    	 ReportsActions.accountdetailsnextbutton();
		 StepTracker.setCurrentStep("Click on account details next button");
     }
     @Then("Click on account details previous button")
     public void click_on_account_details_previous_button() throws InterruptedException {
    	 ReportsActions.accountdetailspreviousbutton();
		 StepTracker.setCurrentStep("Click on account details previous button");
     }
     @And("Click on nominal ledger and validate")
     public void click_on_nominal_ledger_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.validatenominalledgertab();
		 StepTracker.setCurrentStep("Click on nominal ledger and validate");
     }
     @When("Click on nominal ledger actions")
     public void click_on_nominal_ledger_actions() throws InterruptedException {
    	 ReportsActions.nominalledgeractions();
		 StepTracker.setCurrentStep("Click on nominal ledger actions");
     }
     @Then("Click on nominal ledger accounts")
     public void click_on_nominal_ledger_accounts() throws InterruptedException {
    	 ReportsActions.nominalledgeraccounts();
		 StepTracker.setCurrentStep("Click on nominal ledger accounts");
     }
     @And("Click on business snapshot and validate")
     public void click_on_business_snapshot_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.validatebusinesssnapshottab();
		 StepTracker.setCurrentStep("Click on business snapshot and validate");
     }
     @And("Click on account list and validate")
     public void click_on_account_list_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.validateaccountlisttab();
		 StepTracker.setCurrentStep("Click on account list and validate");
     }
     @When("Click on account list search")
     public void click_on_account_list_search() {
    	 ReportsActions.accountlistsearch();
		 StepTracker.setCurrentStep("Click on account list search");
     }
     @When("Click on account list actions")
     public void click_on_account_list_actions() throws InterruptedException {
    	 ReportsActions.accountlistactions();
		 StepTracker.setCurrentStep("Click on account list actions");
     }
     @And("Click on account list accounts")
     public void click_on_account_list_accounts() throws InterruptedException {
    	 ReportsActions.accountlistaccounts();
		 StepTracker.setCurrentStep("Click on account list accounts");
     }
     @When("Click on account list pagination")
     public void click_on_account_list_pagination() throws Exception {
    	 ReportsActions.accountlistpagination();
		 StepTracker.setCurrentStep("Click on account list pagination");
     }
     @When("Click on account list next button")
     public void click_on_account_list_next_button() throws InterruptedException {
    	 ReportsActions.accountlistnextbutton();
		 StepTracker.setCurrentStep("Click on account list next button");
     }
     @Then("Click on account list previous button")
     public void click_on_account_list_previous_button() throws InterruptedException {
    	 ReportsActions.accountlistpreviousbutton();
		 StepTracker.setCurrentStep("Click on account list previous button");
     }
     @And("Click on annual report and validate")
     public void click_on_annual_report_and_validate() {
    	 ReportsActions.validateaccountreporttab();
		 StepTracker.setCurrentStep("Click on annual report and validate");
     }
     @When("Click on sales performance and validate")
     public void click_on_sales_performance_and_validate() throws IOException{
    	 ReportsActions.validatesalesperformancetab();
		 StepTracker.setCurrentStep("Click on sales performance and validate");
     }
     @When("Click on expenses performance and validate")
     public void click_on_expenses_performance_and_validate() throws IOException {
    	 ReportsActions.validateexpenseperformancetab();
		 StepTracker.setCurrentStep("Click on expenses performance and validate");
     }
     @When("Click on transaction list by date and validate")
     public void click_on_transaction_list_by_date_and_validate() throws IOException {
    	 ReportsActions.validatetransactionlistbydatetab();
		 StepTracker.setCurrentStep("Click on transaction list by date and validate");
     }
     @When("Click on transaction list by date search button")
     public void click_on_transaction_list_by_date_search_button() {
    	 ReportsActions.searchintransactionlistbydate();
		 StepTracker.setCurrentStep("Click on transaction list by date search button");
     }
     @When("Click on transaction list by date actions")
     public void click_on_transaction_list_by_date_actions() throws InterruptedException {
    	 ReportsActions.transactionlistbydateactions();
		 StepTracker.setCurrentStep("Click on transaction list by date actions");
     }
     @When("Click on transaction list by date accounts")
     public void click_on_transaction_list_by_date_accounts() throws InterruptedException {
    	 ReportsActions.accountintransactionlistbydate();
		 StepTracker.setCurrentStep("Click on transaction list by date accounts");
     }
     @When("Click on transaction list by date reference number,name and validate")
     public void click_on_transaction_list_by_date_reference_number_name_and_validate() throws InterruptedException {
    	 ReportsActions.transactionlistbydatereferencenumberandname();
		 StepTracker.setCurrentStep("Click on transaction list by date reference number,name and validate");
     }
     @When("Click on transaction list by date pagination")
     public void click_on_transaction_list_by_date_pagination() throws Exception {
    	 ReportsActions.transactionlistbydatepagination();
		 StepTracker.setCurrentStep("Click on transaction list by date pagination");
     }
     @When("Click on transaction list by date next button")
     public void click_on_transaction_list_by_date_next_button() throws InterruptedException {
    	 ReportsActions.transactionlistbydatenextbutton();
		 StepTracker.setCurrentStep("Click on transaction list by date next button");
     }
     @Then("Click on transaction list by date previous button")
     public void click_on_transaction_list_by_date_previous_button() throws InterruptedException {
    	 ReportsActions.transactionlistbydatepreviousbutton();
		 StepTracker.setCurrentStep("Click on transaction list by date previous button");
     }
     @When("Click on recent transactions and validate")
     public void click_on_recent_transactions_and_validate() throws IOException {
    	 ReportsActions.validaterecenttransactionstab();
		 StepTracker.setCurrentStep("Click on recent transactions and validate");
     }
     @When("Click on recent transactions search button and validate")
     public void click_on_recent_transactions_search_button_and_validate() {
    	 ReportsActions.searchinrecenttransactions();
		 StepTracker.setCurrentStep("Click on recent transactions search button and validate");
     }
     @When("Click on recent transactions actions")
     public void click_on_recent_transactions_actions() throws InterruptedException {
    	 ReportsActions.recenttransactionsactions();
		 StepTracker.setCurrentStep("Click on recent transactions actions");
     }
     @And("Click on recent transactions reference number")
     public void click_on_recent_transactions_reference_number() throws InterruptedException {
    	 ReportsActions.recenttransactionsreferencenumber();
		 StepTracker.setCurrentStep("Click on recent transactions reference number");
     }
     @When("Click on recent transactions pagination")
     public void click_on_recent_transactions_pagination() throws Exception {
    	 ReportsActions.recenttransactionspagination();
		 StepTracker.setCurrentStep("Click on recent transactions pagination");
     }
     @When("Click on recent transactions next button")
     public void click_on_recent_transactions_next_button() throws InterruptedException {
    	 ReportsActions.recenttransactionsnextbutton();
		 StepTracker.setCurrentStep("Click on recent transactions next button");
     }
     @Then("Click on recent transactions previous button")
     public void click_on_recent_transactions_previous_button()throws InterruptedException {
    	 ReportsActions.recenttransactionspreviousbutton();
		 StepTracker.setCurrentStep("Click on recent transactions previous button");
     }
     @When ("Click on balance sheet comparison and validate")
     public void click_on_balance_sheet_comparison_and_validate()throws IOException {
    	 ReportsActions.validatebalancesheetcomparisontab();
		 StepTracker.setCurrentStep("Click on balance sheet comparison and validate");
     }
     @When ("Click on balance sheet comparison actions")
     public void click_on_balance_sheet_comparison_actions() throws InterruptedException{
    	 ReportsActions.balancesheetcomparisonactions();
		 StepTracker.setCurrentStep("Click on balance sheet comparison actions");
     }
     @When("Click on balance sheet comparison accounts")
     public void click_on_balance_sheet_comparison_accounts() throws IOException {
    	 ReportsActions.accountinbalancesheetcomparison();
		 StepTracker.setCurrentStep("Click on balance sheet comparison accounts");
     }
     @When("Click on balance sheet comparison account and validate")
     public void click_on_balance_sheet_comparison_account_and_validate() {
    	 ReportsActions.validateaccountinbalancesheetcomparison();
		 StepTracker.setCurrentStep("Click on balance sheet comparison account and validate");
     }
     @When("Click on balance sheet detail and validate")
     public void click_on_balance_sheet_detail_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.validatebalancesheetdetailtab();
		 StepTracker.setCurrentStep("Click on balance sheet detail and validate");
     }
     @When("Click on balance sheet detail actions")
     public void click_on_balance_sheet_detail_actions() throws InterruptedException {
    	 ReportsActions.balancesheetdetailactions();
		 StepTracker.setCurrentStep("Click on balance sheet detail actions");
     }
     @When("Click on balance sheet detail accounts")
     public void click_on_balance_sheet_detail_accounts() throws InterruptedException {
    	 ReportsActions.accountsinbalancesheetdetail();
		 StepTracker.setCurrentStep("Click on balance sheet detail accounts");
     }
     @And("Click on balance sheet detail particular,reference number and validate")
     public void click_on_balance_sheet_detail_particular_reference_number_and_validate() throws InterruptedException {
    	 ReportsActions.balancesheetdetailparticularandreferencenumber();
		 StepTracker.setCurrentStep("Click on balance sheet detail particular,reference number and validate");
     }
     @When("Click on custom report and validate")
     public void click_on_custom_report_and_validate() throws IOException {
    	 ReportsActions.validatecustomreporttab();
		 StepTracker.setCurrentStep("Click on custom report and validate");
     }
     @And("Click on customer and validate")
     public void click_on_customer_and_validate() {
    	 ReportsActions.validatecustomertab();
		 StepTracker.setCurrentStep("Click on customer and validate");
     }
     @When("Click on advance report tab in customer and validate")
     public void click_on_advance_report_tab_in_customer_and_validate() throws IOException {
    	 ReportsActions.validateadvancereportincustomer();
		 StepTracker.setCurrentStep("Click on advance report tab in customer and validate");
     }
     @When("Click on advance report search button in customer and validate")
     public void click_on_advance_report_search_button_in_customer_and_validate() throws InterruptedException {
    	 ReportsActions.searchinadvancereportincustomer();
		 StepTracker.setCurrentStep("Click on advance report search button in customer and validate");
     }
     @When("Click on customer dropdown in advance report")
     public void click_on_customer_dropdown_in_advance_report() throws InterruptedException {
    	 ReportsActions.advancereportcustomerdropdown();
		 StepTracker.setCurrentStep("Click on customer dropdown in advance report");
     }
     @When("Click on advance report actions in customer")
     public void click_on_advance_report_actions_in_customer() throws InterruptedException {
    	 ReportsActions.advancereportactionsincustomer();
		 StepTracker.setCurrentStep("Click on advance report actions in customer");
     }
     @When("Click on advance report account in customer")
     public void click_on_advance_report_account_in_customer() throws InterruptedException {
    	 ReportsActions.advancereportaccountsincustomer();
		 StepTracker.setCurrentStep("Click on advance report account in customer");
     }
     @And("Click on advance report customer name,reference number and validate")
     public void click_on_advance_report_customer_name_reference_number_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.advancereportcustomernameandreferencenumber();
		 StepTracker.setCurrentStep("Click on advance report customer name,reference number and validate");
     }
     @When("Click on advance report pagination in customer")
     public void click_on_advance_report_pagination_in_customer() throws Exception {
    	 ReportsActions.advancereportpaginationincustomer();
		 StepTracker.setCurrentStep("Click on advance report pagination in customer");
     }
     @When("Click on advance report next button in customer")
     public void click_on_advance_report_next_button_in_customer() throws InterruptedException {
    	 ReportsActions.advancereportnextbuttonincustomer();
		 StepTracker.setCurrentStep("Click on advance report next button in customer");
     }
     @Then("Click on advance report previous button in customer")
     public void click_on_advance_report_previous_button_in_customer() throws InterruptedException {
    	 ReportsActions.advancereportpreviousbuttonincustomer();
		 StepTracker.setCurrentStep("Click on advance report previous button in customer");
     }
     @When("Click on sales report and validate")
     public void click_on_sales_report_and_validate() throws IOException {
    	 ReportsActions.validatesalesreporttab();
		 StepTracker.setCurrentStep("Click on sales report and validate");
     }
     @When("Click on sales report actions")
     public void click_on_sales_report_actions() throws InterruptedException {
    	 ReportsActions.salesreportactions();
		 StepTracker.setCurrentStep("Click on sales report actions");
     }
     @When("Click on sales report accounts")
     public void click_on_sales_report_accounts() throws InterruptedException {
    	 ReportsActions.accountsinsalesreport();
		 StepTracker.setCurrentStep("Click on sales report accounts");
     }
     @When("Click on customer list and validate")
     public void click_on_customer_list_and_validate() {
    	 ReportsActions.validatecustomerlisttab();
		 StepTracker.setCurrentStep("Click on customer list and validate");
     }
     @When("Click on customer list search")
     public void click_on_customer_list_search() {
    	 ReportsActions.searchincustomerlist();
		 StepTracker.setCurrentStep("Click on customer list search");
     }
     @When("Click on customer list actions")
     public void click_on_customer_list_actions() throws InterruptedException {
    	 ReportsActions.customerlistactions();
		 StepTracker.setCurrentStep("Click on customer list actions");
     }
     @When("Click on customer list customer name and validate")
     public void click_on_customer_list_customer_name_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.customerlistcustomername();
		 StepTracker.setCurrentStep("Click on customer list customer name and validate");
     }
     @When("Click on customer list pagination")
     public void click_on_customer_list_pagination() throws Exception {
    	 ReportsActions.customerlistpagination();
		 StepTracker.setCurrentStep("Click on customer list pagination");
     }
     @When("Click on customer list next button")
     public void click_on_customer_list_next_button() throws InterruptedException {
    	 ReportsActions.customerlistnextbutton();
		 StepTracker.setCurrentStep("Click on customer list next button");
     }
     @Then("Click on customer list previous button")
     public void click_on_customer_list_previous_button() throws InterruptedException {
    	 ReportsActions.customerlistpreviousbutton();
		 StepTracker.setCurrentStep("Click on customer list previous button");
     }
     @When("Click on customer ageing list and validate")
     public void click_on_customer_ageing_list_and_validate() throws IOException {
    	 ReportsActions.validatecustomerageinglisttab();
		 StepTracker.setCurrentStep("Click on customer ageing list and validate");
     }
     @When("Click on customer ageing list search")
     public void click_on_customer_ageing_list_search() {
    	 ReportsActions.searchincustomerageinglist();
		 StepTracker.setCurrentStep("Click on customer ageing list search");
     }
     @When("Click on customer dropdown in customer ageing list")
     public void click_on_customer_dropdown_in_customer_ageing_list() throws InterruptedException {
    	 ReportsActions.customerageinglistcustomerdropdown();
		 StepTracker.setCurrentStep("Click on customer dropdown in customer ageing list");
     }
     @When("Click on customer ageing list actions")
     public void click_on_customer_ageing_list_actions() throws InterruptedException {
    	 ReportsActions.customerageinglistactions();
		 StepTracker.setCurrentStep("Click on customer ageing list actions");
     }
     @When("Click on customer ageing list customer name and validate")
     public void click_on_customer_ageing_list_customer_name_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.customerageinglistcustomername();
		 StepTracker.setCurrentStep("Click on customer ageing list customer name and validate");
     }
     @When("Click on customer ageing list pagination")
     public void click_on_customer_ageing_list_pagination() throws Exception {
    	 ReportsActions.customerageinglistpagination();
		 StepTracker.setCurrentStep("Click on customer ageing list pagination");
     }
     @When("Click on customer ageing list next button")
     public void click_on_customer_ageing_list_next_button() throws InterruptedException {
    	 ReportsActions.customerageinglistnextbutton();
		 StepTracker.setCurrentStep("Click on customer ageing list next button");
     }
     @Then("Click on customer ageing list previous button")
     public void click_on_customer_ageing_list_previous_button() throws InterruptedException {
    	 ReportsActions.customerageinglistpreviousbutton();
		 StepTracker.setCurrentStep("Click on customer ageing list previous button");
     }
     @When("Click on transaction by customer and validate")
     public void click_on_transaction_by_customer_and_validate() throws IOException {
    	 ReportsActions.validatetransactionbycustomertab();
		 StepTracker.setCurrentStep("Click on transaction by customer and validate");
     }
     @When("Click on transaction by customer search")
     public void click_on_transaction_by_customer_search() {
    	 ReportsActions.searchintransactionbycustomer();
		 StepTracker.setCurrentStep("Click on transaction by customer search");
     }
     @When("Click on customer dropdown in transaction by customer")
     public void click_on_customer_dropdown_in_transaction_by_customer() throws InterruptedException {
    	 ReportsActions.customerdropdownintransactionbycustomer();
		 StepTracker.setCurrentStep("Click on customer dropdown in transaction by customer");
     }
     @When("Click on transaction by customer actions")
     public void click_on_transaction_by_customer_actions() throws InterruptedException {
    	 ReportsActions.transactionbycustomeractions();
		 StepTracker.setCurrentStep("Click on transaction by customer actions");
     }
     @When("Click on transaction by customer accounts")
     public void click_on_transaction_by_customer_accounts() throws InterruptedException{
    	 ReportsActions.accountintransactionsbycustomer();
		 StepTracker.setCurrentStep("Click on transaction by customer accounts");
     }
     @When("Click on transaction by customer reference number and validate")
     public void click_on_transaction_by_customer_reference_number_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.transactionsbycustomerreferencenumber();
		 StepTracker.setCurrentStep("Click on transaction by customer reference number and validate");
     }
     @When("Click on transaction by customer pagination")
     public void click_on_transaction_by_customer_pagination() throws Exception {
    	 ReportsActions.transactionsbycustomerpagination();
		 StepTracker.setCurrentStep("Click on transaction by customer pagination");
     }
     @When("Click on transaction by customer next button")
     public void click_on_transaction_by_customer_next_button() throws InterruptedException {
    	 ReportsActions.transactionsbycustomernextbutton();
		 StepTracker.setCurrentStep("Click on transaction by customer next button");
     }
     @Then("Click on transaction by customer previous button")
     public void click_on_transaction_by_customer_previous_button() throws InterruptedException {
    	 ReportsActions.transactionsbycustomerpreviousbutton();
		 StepTracker.setCurrentStep("Click on transaction by customer previous button");
     }
     @When("Click on sales product list and validate")
     public void click_on_sales_product_list_and_validate() throws IOException {
    	 ReportsActions.validatesalesproductlisttab();
		 StepTracker.setCurrentStep("Click on sales product list and validate");
     }
     @When("Click on sales product list search")
     public void click_on_sales_product_list_search() {
    	 ReportsActions.searchinsalesproductlist();
		 StepTracker.setCurrentStep("Click on sales product list search");
     }
     @When("Click on product dropdown in sales product list")
     public void click_on_product_dropdown_in_sales_product_list() throws InterruptedException {
    	 ReportsActions.productdropdowninsalesproductlist();
		 StepTracker.setCurrentStep("Click on product dropdown in sales product list");
     }
     @When("Click on sales product list actions")
     public void click_on_sales_product_list_actions() throws InterruptedException {
    	 ReportsActions.salesproductlistactions();
		 StepTracker.setCurrentStep("Click on sales product list actions");
     }
     @When("Click on sales product list accounts")
     public void click_on_sales_product_list_accounts() throws InterruptedException {
    	 ReportsActions.accountinsalesproductlist();
		 StepTracker.setCurrentStep("Click on sales product list accounts");
     }
     @When("Click on sales product list reference number and validate")
     public void click_on_sales_product_list_reference_number_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.salesproductlistreferencenumber();
		 StepTracker.setCurrentStep("Click on sales product list reference number and validate");
     }
     @When("Click on sales product list pagination")
     public void click_on_sales_product_list_pagination() throws Exception {
    	 ReportsActions.salesproductlistpagination();
		 StepTracker.setCurrentStep("Click on sales product list pagination");
     }
     @When("Click on sales product list next button")
     public void click_on_sales_product_list_next_button() throws InterruptedException {
    	 ReportsActions.salesproductlistnextbutton();
		 StepTracker.setCurrentStep("Click on sales product list next button");
     }
     @Then("Click on sales product list previous button")
     public void click_on_sales_product_list_previous_button() throws InterruptedException {
    	 ReportsActions.salesproductlistpreviousbutton();
		 StepTracker.setCurrentStep("Click on sales product list previous button");
     }
     @When("Click on customer receipts and validate")
     public void click_on_customer_receipts_and_validate() throws IOException {
    	 ReportsActions.validatecustomerreceipttab();
		 StepTracker.setCurrentStep("Click on customer receipts and validate");
     }
     @When("Click on customer receipts search")
     public void click_on_customer_receipts_search() {
    	 ReportsActions.searchincustomerreceipt();
		 StepTracker.setCurrentStep("Click on customer receipts search");
     }
     @When("Click on customer dropdown in customer receipts")
     public void click_on_customer_dropdown_in_customer_receipts() throws InterruptedException {
    	 ReportsActions.customerdropdownincustomerreceipt();
		 StepTracker.setCurrentStep("Click on customer dropdown in customer receipts");
     }
     @When("Click on customer receipts actions")
     public void click_on_customer_receipts_actions() throws InterruptedException {
    	 ReportsActions.customerreceiptactions();
		 StepTracker.setCurrentStep("Click on customer receipts actions");
     }
     @When("Click on customer receipts accounts")
     public void click_on_customer_receipts_accounts() throws InterruptedException {
    	 ReportsActions.accountincustomerreceipt();
		 StepTracker.setCurrentStep("Click on customer receipts accounts");
     }
     @When("Click on customer receipts reference number,customer name and validate")
     public void click_on_customer_receipts_reference_number_customer_name_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.customerreceiptreferencenumberandcustomername();
		 StepTracker.setCurrentStep("Click on customer receipts reference number,customer name and validate");
     }
     @When("Click on customer receipts pagination")
     public void click_on_customer_receipts_pagination() throws Exception {
    	 ReportsActions.customerreceiptpagination();
		 StepTracker.setCurrentStep("Click on customer receipts pagination");
     }
     @When("Click on customer receipts next button")
     public void click_on_customer_receipts_next_button() throws InterruptedException {
    	 ReportsActions.customerreceiptnextbutton();
		 StepTracker.setCurrentStep("Click on customer receipts next button");
     }
     @Then("Click on customer receipts previous button")
     public void click_on_customer_receipts_previous_button() throws InterruptedException {
    	 ReportsActions.customerreceiptpreviousbutton();
		 StepTracker.setCurrentStep("Click on customer receipts previous button");
     }
     @When("Click on debtors and validate")
     public void click_on_debtors_and_validate() throws IOException {
    	 ReportsActions.validatedebtorstab();
		 StepTracker.setCurrentStep("Click on debtors and validate");
     }
     @When("Click on customer dropdown in debtors")
     public void click_on_customer_dropdown_in_debtors() throws InterruptedException {
    	 ReportsActions.customerdropdownindebtors();
		 StepTracker.setCurrentStep("Click on customer dropdown in debtors");
     }
     @When("Click on debtors actions")
     public void click_on_debtors_actions() throws InterruptedException {
    	 ReportsActions.debtorsactions();
		 StepTracker.setCurrentStep("Click on debtors actions");
     }
     @When("Click on debtors accounts")
     public void click_on_debtors_accounts() throws InterruptedException {
    	 ReportsActions.accountindebtors();
		 StepTracker.setCurrentStep("Click on debtors accounts");
     }
     @When("Click on debtors reference number and validate")
     public void click_on_debtors_reference_number_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.debtorsreferencenumber();
		 StepTracker.setCurrentStep("Click on debtors reference number and validate");
     }
     @When("Click on customer statement and validate")
     public void click_on_customer_statement_and_validate() throws IOException {
    	 ReportsActions.validatecustomerstatementtab();
		 StepTracker.setCurrentStep("Click on customer statement and validate");
     }
     @When("Click on customer statement search")
     public void click_on_customer_statement_search() throws InterruptedException {
    	 ReportsActions.searchincustomerstatement();
		 StepTracker.setCurrentStep("Click on customer statement search");
     }
     @When("Click on customer dropdown in customer statement")
     public void click_on_customer_dropdown_in_customer_statement() throws InterruptedException {
      	 ReportsActions.customerdropdownincustomerstatement();
         StepTracker.setCurrentStep("Click on customer dropdown in customer statement");
     }
     @When("Click on customer statement actions")
     public void click_on_customer_statement_actions() throws InterruptedException {
    	 ReportsActions.customerstatementactions();
         StepTracker.setCurrentStep("Click on customer statement actions");
     }
     @When("Click on customer statement pagination")
     public void click_on_customer_statement_pagination() throws Exception {
    	 ReportsActions.customerstatementpagination();
         StepTracker.setCurrentStep("Click on customer statement pagination");
     }
     @When("Click on customer statement next button")
     public void click_on_customer_statement_next_button() throws InterruptedException {
    	 ReportsActions.customerstatementnextbutton();
         StepTracker.setCurrentStep("Click on customer statement next button");
     }
     @Then("Click on customer statement previous button")
     public void click_on_customer_statement_previous_button() throws InterruptedException {
    	 ReportsActions.customerstatementpreviousbutton();
         StepTracker.setCurrentStep("Click on customer statement previous button");
     }
     @When("Click on sales invoice list and validate")
     public void click_on_sales_invoice_list_and_validate() throws IOException {
    	 ReportsActions.validatesalesinvoicelisttab();
         StepTracker.setCurrentStep("Click on sales invoice list and validate");
     }
     @When("Click on sales invoice list search")
     public void click_on_sales_invoice_list_search() {
    	 ReportsActions.searchinsalesinvoicelist();
         StepTracker.setCurrentStep("Click on sales invoice list search");
     }
     @When("Click on customer dropdown in sales invoice list")
     public void click_on_customer_dropdown_in_sales_invoice_list() throws InterruptedException {
    	 ReportsActions.customerdropdowninsalesinvoicelist();
         StepTracker.setCurrentStep("Click on customer dropdown in sales invoice list");
     }
     @When("Click on sales invoice list actions")
     public void click_on_sales_invoice_list_actions() throws InterruptedException {
    	 ReportsActions.salesinvoicelistactions();
         StepTracker.setCurrentStep("Click on sales invoice list actions");
     }
     @When("Click on sales invoice list accounts")
     public void click_on_sales_invoice_list_accounts() throws InterruptedException {
    	 ReportsActions.salesinvoicelistaccounts();
         StepTracker.setCurrentStep("Click on sales invoice list accounts");
     }
     @When("Click on sales invoice list invoice number,reference number and validate")
     public void click_on_sales_invoice_list_invoice_number_reference_number_and_validate() throws InterruptedException {
    	 ReportsActions.salesinvoicelistreferencenumberandcustomername();
         StepTracker.setCurrentStep("Click on sales invoice list invoice number,reference number and validate");
     }
     @When("Click on sales invoice list pagination")
     public void click_on_sales_invoice_list_pagination() throws Exception {
    	 ReportsActions.salesinvoicelistpagination();
         StepTracker.setCurrentStep("Click on sales invoice list pagination");
     }
     @When("Click on sales invoice list next button")
     public void click_on_sales_invoice_list_next_button() throws InterruptedException {
    	 ReportsActions.salesinvoicelistnextbutton();
         StepTracker.setCurrentStep("Click on sales invoice list next button");
     }
     @Then("Click on sales invoice list previous button")
     public void click_on_sales_invoice_list_previous_button() throws InterruptedException {
    	 ReportsActions.salesinvoicelistpreviousbutton();
         StepTracker.setCurrentStep("Click on sales invoice list previous button");
     }
     @When("Click on open invoice and validate")
     public void click_on_open_invoice_list_validate() throws IOException {
    	 ReportsActions.validateopeninvoicetab();
         StepTracker.setCurrentStep("Click on open invoice and validate");
     }
     @When("Click on open invoice search")
     public void click_on_open_invoice_search() {
    	 ReportsActions.searchinopeninvoice();
         StepTracker.setCurrentStep("Click on open invoice search");
     }
     @When("Click on customer dropdown in open invoice")
     public void click_on_customer_dropdown_in_open_invoice() throws InterruptedException {
    	 ReportsActions.customerdropdowninopeninvoice();
         StepTracker.setCurrentStep("Click on customer dropdown in open invoice");
     }
     @When("Click on open invoice actions")
     public void click_on_open_invoice_actions() throws InterruptedException {
    	 ReportsActions.openinvoiceactions();
         StepTracker.setCurrentStep("Click on open invoice actions");
     }
     @When("Click on open invoice accounts")
     public void click_on_open_invoice_accounts() throws InterruptedException {
    	 ReportsActions.openinvoiceaccounts();
         StepTracker.setCurrentStep("Click on open invoice accounts");
     }
     @When("Click on open invoice reference number,customer and validate")
     public void click_on_open_invoice_reference_number_customer_and_validate() throws InterruptedException {
    	 ReportsActions.openinvoicereferencenumberandcustomer();
         StepTracker.setCurrentStep("Click on open invoice reference number,customer and validate");
     }
     @When("Click on open invoice pagination")
     public void click_on_open_invoice_pagination() throws Exception {
    	 ReportsActions.openinvoicepagination();
         StepTracker.setCurrentStep("Click on open invoice pagination");
     }
     @When("Click on open invoice next button")
     public void click_on_open_invoice_next_button() throws InterruptedException {
    	 ReportsActions.openinvoicenextbutton();
         StepTracker.setCurrentStep("Click on open invoice next button");
     }
     @Then("Click on open invoice previous button")
     public void click_on_open_invoice_previous_button() throws InterruptedException {
    	 ReportsActions.openinvoicepreviousbutton();
         StepTracker.setCurrentStep("Click on open invoice next button");
     }
     @When("Click on income by customer summary and validate")
     public void click_on_income_by_customer_summary_and_validate() throws IOException {
    	 ReportsActions.validateincomebycustomersummarytab();
    	 StepTracker.setCurrentStep("Click on income by customer summary and validate");
     }
     @When("Click on income by customer summary search")
     public void click_on_income_by_customer_summary_search() {
    	 ReportsActions.searchinincomebycustomersummary();
    	 StepTracker.setCurrentStep("Click on income by customer summary search");
     }
     @When("Click on income by customer summary actions")
     public void click_on_income_by_customer_summary_actions() throws InterruptedException {
    	 ReportsActions.incomebycustomersummaryactions();
    	 StepTracker.setCurrentStep("Click on income by customer summary actions");
     }
     @When("Click on income by customer summary accounts")
     public void click_on_income_by_customer_summary_accounts() throws InterruptedException {
    	 ReportsActions.incomebycustomersummaryaccounts();
    	 StepTracker.setCurrentStep("Click on income by customer summary accounts");
     }
     @When("Click on income by customer summary customer and validate")
     public void click_on_income_by_customer_summary_customer_and_validate() throws InterruptedException {
    	 ReportsActions.incomebycustomersummarycustomer();
    	 StepTracker.setCurrentStep("Click on income by customer summary customer and validate");
     }
     @When("Click on income by customer summary pagination")
     public void click_on_income_by_customer_summary_pagination() throws Exception {
    	 ReportsActions.incomebycustomersummarypagination();
    	 StepTracker.setCurrentStep("Click on income by customer summary pagination");
     }
     @When("Click on income by customer summary next button")
     public void click_on_income_by_customer_summary_next_button() throws InterruptedException {
    	 ReportsActions.incomebycustomersummarynextbutton();
    	 StepTracker.setCurrentStep("Click on income by customer summary next button");
     }
     @Then("Click on income by customer summary previous button")
     public void click_on_income_by_customer_summary_previous_button() throws InterruptedException {
    	 ReportsActions.incomebycustomersummarypreviousbutton();
    	 StepTracker.setCurrentStep("Click on income by customer summary previous button");
     }
     @When("Click on customer balance summary and validate")
     public void click_on_customer_balance_summary_and_validate(){
    	 ReportsActions.validatecustomerbalancesummarytab();
    	 StepTracker.setCurrentStep("Click on customer balance summary and validate");
     }
     @When("Click on customer balance summary search")
     public void click_on_customer_balance_summary_search() {
    	 ReportsActions.searchincustomerbalancesummary();
    	 StepTracker.setCurrentStep("Click on customer balance summary search");
     }
     @When("Click on customer balance summary actions")
     public void click_on_customer_balance_summary_actions() throws InterruptedException {
    	 ReportsActions.customerbalancesummaryactions();
    	 StepTracker.setCurrentStep("Click on customer balance summary actions");
     }
     @When("Click on customer balance summary customer and validate")
     public void click_on_customer_balance_summary_customer_and_validate() throws InterruptedException {
    	 ReportsActions.customerbalancesummarycustomer();
    	 StepTracker.setCurrentStep("Click on customer balance summary customer and validate");
     }
     @When("Click on customer balance summary pagination")
     public void click_on_customer_balance_summary_pagination() throws Exception {
    	 ReportsActions.customerbalancesummarypagination();
    	 StepTracker.setCurrentStep("Click on customer balance summary pagination");
     }
     @When("Click on customer balance summary next button")
     public void click_on_customer_balance_summary_next_button() throws InterruptedException {
    	 ReportsActions.customerbalancesummarynextbutton();
    	 StepTracker.setCurrentStep("Click on customer balance summary next button");
     }
     @Then("Click on customer balance summary previous button")
     public void click_on_customer_balance_summary_previous_button() throws InterruptedException {
    	 ReportsActions.customerbalancesummarypreviousbutton();
    	 StepTracker.setCurrentStep("Click on customer balance summary previous button");
     }
     @When("Click on deposit details and validate")
     public void click_on_deposit_details_and_validate() {
    	 ReportsActions.validatedepositedetailstab();
    	 StepTracker.setCurrentStep("Click on deposit details and validate");
     }
     @When("Click on deposit details actions")
     public void click_on_deposit_details_actions() throws InterruptedException {
    	 ReportsActions.depositedetailsactions();
    	 StepTracker.setCurrentStep("Click on deposit details actions");
     }
     @When("Click on deposit details accounts")
     public void click_on_deposit_details_accounts() {
    	 ReportsActions.depositedetailsaccounts();
    	 StepTracker.setCurrentStep("Click on deposit details accounts");
     }
     @When("Click on deposit details reference number and validate")
     public void click_on_deposit_details_reference_number_and_validate() throws InterruptedException {
    	 ReportsActions.depositedetailsreferencenumber();
    	 StepTracker.setCurrentStep("Click on deposit details reference number and validate");
     }
     @When("Click on advance ageing list and validate")
     public void click_on_advance_ageing_list_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.validateadvanceageinglisttab();
    	 StepTracker.setCurrentStep("Click on advance ageing list and validate");
     }
     @When("Click on advance ageing list actions")
     public void click_on_advance_ageing_list_actions() throws InterruptedException {
    	 ReportsActions.advanceageinglistactions();
    	 StepTracker.setCurrentStep("Click on advance ageing list actions");
     }
     @When("Click on advance ageing list accounts")
     public void click_on_advance_ageing_list_accounts() throws InterruptedException {
    	 ReportsActions.advanceageinglistaccounts();
    	 StepTracker.setCurrentStep("Click on advance ageing list accounts");
     }
     @When("Click on advance ageing list reference number,customer and validate")
     public void click_on_advance_ageing_list_reference_number_customer_and_validate() throws InterruptedException {
    	 ReportsActions.advanceageinglistreferencenumberandcustomer();
    	 StepTracker.setCurrentStep("Click on advance ageing list reference number,customer and validate");
     }
     @When("Click on quotation by customer and validate")
     public void click_on_quotation_by_customer_and_validate() throws IOException, InterruptedException{
    	 ReportsActions.validatequotationbycustomertab();
    	 StepTracker.setCurrentStep("Click on quotation by customer and validate");
     }
     @When("Click on customer dropdown in quotation by customer")
     public void click_on_customer_dropdown_in_quotation_by_customer() throws InterruptedException {
    	 ReportsActions.customerdropdowninquotationbycustomer();
    	 StepTracker.setCurrentStep("Click on customer dropdown in quotation by customer");
     }
     @When("Click on quotation by customer actions")
     public void click_on_quotation_by_customer_actions() throws InterruptedException {
    	 ReportsActions.quotationbycustomeractions();
    	 StepTracker.setCurrentStep("Click on quotation by customer actions");
     }
     @When("Click on quotation by customer accounts")
     public void click_on_quotation_by_customer_accounts() throws InterruptedException {
    	 ReportsActions.quotationbycustomeraccounts();
    	 StepTracker.setCurrentStep("Click on quotation by customer accounts");
     }
     @When("Click on quotation by customer reference number validate")
     public void click_on_quotation_by_customer_reference_number_validate() throws InterruptedException {
    	 ReportsActions.quotationbycustomerreferencenumber();
    	 StepTracker.setCurrentStep("Click on quotation by customer reference number validate");
     }
     @When("Click on invoice and received payments and validate")
     public void click_on_invoice_and_received_payments_and_validate() throws IOException, InterruptedException {
    	 ReportsActions.validateinvoiceandreceivedpaymentstab();
    	 StepTracker.setCurrentStep("Click on invoice and received payments and validate");
     }
     @When("Click on customer dropdown in invoice and received payments")
     public void click_on_customer_dropdown_in_invoice_and_received_payments() throws InterruptedException {
    	 ReportsActions.customerdropdownininvoiceandreceivedpayments();
    	 StepTracker.setCurrentStep("Click on customer dropdown in invoice and received payments");
     }
     @When("Click on invoice and received payments actions")
     public void click_on_invoice_and_received_payments_actions() throws InterruptedException {
    	 ReportsActions.invoiceandreceivedpaymentsactions();
    	 StepTracker.setCurrentStep("Click on invoice and received payments actions");
     }
     @When("Click on invoice and received payments accounts")
     public void click_on_invoice_and_received_payments_accounts() throws InterruptedException {
    	 ReportsActions.invoiceandreceivedpaymentsaccounts();
    	 StepTracker.setCurrentStep("Click on invoice and received payments accounts");
     }
     @When("Click on invoice and received payments reference number,customer and validate")
     public void click_on_invoice_and_received_payments_reference_number_customer_and_validate() throws InterruptedException {
    	 ReportsActions.invoiceandreceivedpaymentsreferencenumberandcustomername();
    	 StepTracker.setCurrentStep("Click on invoice and received payments reference number,customer and validate");
     }
     @When("Click on sales by product service detail and validate")
     public void click_on_sales_by_product_service_detail_and_validate() throws InterruptedException, IOException {
    	 ReportsActions.validatesalesbyproductservicedetailtab();
    	 StepTracker.setCurrentStep("Click on sales by product service detail and validate");
     }
     @When("Click on customer dropdown in sales by product service detail")
     public void click_on_customer_dropdown_in_sales_by_product_service_detail() throws InterruptedException {
    	 ReportsActions.customerdropdowninsalesbyproductservicedetails();
    	 StepTracker.setCurrentStep("Click on customer dropdown in sales by product service detail");
     }
     @When("Click on sales by product service detail and actions")
     public void click_on_sales_by_product_service_detail_and_actions() throws InterruptedException {
    	 ReportsActions.salesbyproductservicedetailactions();
    	 StepTracker.setCurrentStep("Click on sales by product service detail and actions");
     }
     @When("Click on sales by product service detail and accounts")
     public void click_on_sales_by_product_service_detail_and_accounts() throws InterruptedException {
    	 ReportsActions.salesbyproductservicedetailaccounts();
    	 StepTracker.setCurrentStep("Click on sales by product service detail and accounts");
     }
     @When("Click on sales by products service detail reference number,customer and validate")
     public void click_on_sales_by_products_service_detail_reference_number_customer_and_validate() throws InterruptedException {
    	 ReportsActions.salesbyproductservicedetailreferencenumberandcustomername();
    	 StepTracker.setCurrentStep("Click on sales by products service detail reference number,customer and validate");
     }
     @When("Click on sales by product service summary and validate")
     public void click_on_sales_by_product_service_summary_and_validate() throws IOException {
    	 ReportsActions.validatesalesbyproductservicesummarytab();
    	 StepTracker.setCurrentStep("Click on sales by product service summary and validate");
     }
     @When("Click on sales by product service summary search")
     public void click_on_sales_by_product_service_summary_search() {
    	 ReportsActions.searchinsalesbyproductservicesummary();
    	 StepTracker.setCurrentStep("Click on sales by product service summary search");
     }
     @When("Click on sales by product service summary actions")
     public void click_on_sales_by_product_service_summary_actions() throws InterruptedException {
    	 ReportsActions.salesbyproductservicesummaryactions();
    	 StepTracker.setCurrentStep("Click on sales by product service summary actions");
     }
     @And("Click on supplier and validate")
     public void click_on_supplier_and_validate() {
    	 ReportsActions.validatesuppliertab();
    	 StepTracker.setCurrentStep("Click on supplier and validate");
     }
     @When("Click on advance report tab in supplier and validate")
     public void click_on_advance_report_tab_in_supplier_and_validate() throws IOException {
    	 ReportsActions.validateadvancereportinsupplier();
    	 StepTracker.setCurrentStep("Click on advance report tab in supplier and validate");
     }
     @When("Click on advance report search button in customer and supplier")
     public void click_on_advance_report_search_button_in_customer_and_supplier() {
    	 ReportsActions.searchinadvancereportinsupplier();
    	 StepTracker.setCurrentStep("Click on advance report search button in customer and supplier");
     }
     @When("Click on supplier dropdown in advance report")
     public void click_on_supplier_dropdown_in_advance_report() throws InterruptedException {
    	 ReportsActions.advancereportsupplierdropdown();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in advance report");
     }
     @When("Click on advance report actions in supplier")
     public void click_on_advance_report_actions_in_supplier() throws InterruptedException {
    	 ReportsActions.advancereportactionsinsupplier();
    	 StepTracker.setCurrentStep("Click on advance report actions in supplier");
     }
     @When("Click on advance report accounts in supplier")
     public void click_on_advance_report_accounts_in_supplier() throws InterruptedException {
    	 ReportsActions.advancereportaccountsinsupplier();
    	 StepTracker.setCurrentStep("Click on advance report accounts in supplier");
     }
     @When("Click on advance report supplier,reference number and validate")
     public void click_on_advance_report_supplier_reference_number_and_validate() throws InterruptedException {
    	 ReportsActions.advancereportsupplierreferencenumberinsupplier();
    	 StepTracker.setCurrentStep("Click on advance report supplier,reference number and validate");
     }
     @When("Click on advance report pagination in supplier")
     public void click_on_advance_report_pagination_in_supplier() throws Exception {
    	 ReportsActions.advancereportpaginationinsupplier();
    	 StepTracker.setCurrentStep("Click on advance report pagination in supplier");
     }
     @When("Click on advance report next button in supplier")
     public void click_on_advance_report_next_button_in_supplier() throws InterruptedException {
    	 ReportsActions.advancereportnextbuttoninsupplier();
    	 StepTracker.setCurrentStep("Click on advance report next button in supplier");
     }
     @Then("Click on advance report previous button in supplier")
     public void click_on_advance_report_previous_button_in_supplier() throws InterruptedException {
    	 ReportsActions.advancereportpreviousbuttoninsupplier();
    	 StepTracker.setCurrentStep("Click on advance report previous button in supplier");
     }
     @When("Click on purchases report tab")
     public void click_on_purchases_report_tab() throws IOException {
    	 ReportsActions.validatepurchasesreport();
    	 StepTracker.setCurrentStep("Click on purchases report tab");
     }
     @When("Click on purchases report actions")
     public void click_on_purchases_report_actions() throws InterruptedException {
    	 ReportsActions.purchasesreportactions();
    	 StepTracker.setCurrentStep("Click on purchases report actions");
     }
     @When("Click on purchases report accounts")
     public void click_on_purchases_report_accounts() throws InterruptedException {
    	 ReportsActions.purchasesreportaccounts();
    	 StepTracker.setCurrentStep("Click on purchases report accounts");
     }
     @When("Click on supplier list tab")
     public void click_on_supplier_list_tab() {
    	 ReportsActions.validatesupplierlist();
    	 StepTracker.setCurrentStep("Click on supplier list tab");
     }
     @When("Click on supplier list search")
     public void click_on_supplier_list_search() {
    	 ReportsActions.searchinsupplierlist();
    	 StepTracker.setCurrentStep("Click on supplier list search");
     }
     @When("Click on supplier list actions")
     public void click_on_supplier_list_actions() throws InterruptedException {
    	 ReportsActions.supplierlistactions();
    	 StepTracker.setCurrentStep("Click on supplier list actions");
     }
     @When("Click on supplier list supplier name and validate")
     public void click_on_supplier_list_supplier_name_and_validate(){
    	 ReportsActions.supplierlistsuppliername();
    	 StepTracker.setCurrentStep("Click on supplier list supplier name and validate");
     }
     @When("Click on supplier list pagination")
     public void click_on_supplier_list_pagination() throws Exception {
    	 ReportsActions.supplierlistpagination();
    	 StepTracker.setCurrentStep("Click on supplier list pagination");
     }
     @When("Click on supplier list next button")
     public void click_on_supplier_list_next_button() throws InterruptedException {
    	 ReportsActions.supplierlistnextbutton();
    	 StepTracker.setCurrentStep("Click on supplier list supplier name and validate");
     }
     @Then("Click on supplier list previous button")
     public void click_on_supplier_list_previous_button() throws InterruptedException {
    	 ReportsActions.supplierlistpreviousbutton();
    	 StepTracker.setCurrentStep("Click on supplier list previous button");
     }
     @When("Click on supplier ageing list tab")
     public void click_on_supplier_ageing_list_tab() {
    	 ReportsActions.validatesupplierageinglist();
    	 StepTracker.setCurrentStep("Click on supplier ageing list tab");
     }
     @When("Click on supplier ageing list search")
     public void click_on_supplier_ageing_list_search() {
    	 ReportsActions.searchinsupplierageinglist();
    	 StepTracker.setCurrentStep("Click on supplier ageing list search");
     }
     @When("Click on supplier dropdown in supplier ageing list")
     public void click_on_supplier_dropdown_in_supplier_ageing_list() throws InterruptedException {
    	 ReportsActions.supplierageinglistsupplierdropdown();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in supplier ageing list");
     }
     @When("Click on supplier ageing list actions")
     public void click_on_supplier_ageing_list_actions() throws InterruptedException {
    	 ReportsActions.supplierageinglistactions();
    	 StepTracker.setCurrentStep("Click on supplier ageing list actions");
     }
     @When("Click on supplier ageing list accounts")
     public void click_on_supplier_ageing_list_accounts() throws InterruptedException {
    	 ReportsActions.supplierageinglistaccounts();
    	 StepTracker.setCurrentStep("Click on supplier ageing list accounts");
     }
     @When("Click on supplier ageing list supplier name and validate")
     public void click_on_supplier_ageing_list_supplier_name_and_validate() {
    	 ReportsActions.supplierageinglistsuppliername();
    	 StepTracker.setCurrentStep("Click on supplier ageing list supplier name and validate");
     }
     @When("Click on supplier ageing list pagination")
     public void click_on_supplier_ageing_list_pagination() throws Exception {
    	 ReportsActions.supplierageinglistpagination();
    	 StepTracker.setCurrentStep("Click on supplier ageing list pagination");
     }
     @When("Click on supplier ageing list next button")
     public void click_on_supplier_ageing_list_next_button() throws InterruptedException {
    	 ReportsActions.supplierageinglistnextbutton();
    	 StepTracker.setCurrentStep("Click on supplier ageing list supplier name and validate");
     }
     @Then("Click on supplier ageing list previous button")
     public void click_on_supplier_ageing_list_previous_button() throws InterruptedException {
    	 ReportsActions.supplierageinglistpreviousbutton();
    	 StepTracker.setCurrentStep("Click on supplier ageing list previous button");
     }
     @When("Click on transactions by supplier tab and validate")
     public void click_on_transactions_by_supplier_tab_and_validate() throws IOException {
    	 ReportsActions.validatetransactionsbysupplier();
    	 StepTracker.setCurrentStep("Click on transactions by supplier tab and validate");
     }
     @When("Click on transactions by supplier search and validate")
     public void click_on_transactions_by_supplier_search_and_validate() {
    	 ReportsActions.searchintransactionsbysupplier();
    	 StepTracker.setCurrentStep("Click on transactions by supplier search and validate");
     }
     @When("Click on supplier dropdown in transactions by supplier")
     public void click_on_supplier_dropdown_in_transactions_by_supplier(){
    	 ReportsActions.transactionsbysuppliersupplierdropdown();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in transactions by supplier");
     }
     @When("Click on transactions by supplier actions and validate")
     public void click_on_transactions_by_supplier_actions_and_validate() throws InterruptedException {
    	 ReportsActions.transactionsbysupplieractions();
    	 StepTracker.setCurrentStep("Click on transactions by supplier actions and validate");
     }
     @When("Click on transactions by supplier accounts and validate")
     public void click_on_transactions_by_supplier_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.transactionsbysupplieraccounts();
    	 StepTracker.setCurrentStep("Click on transactions by supplier accounts and validate");
     }
     @When("Click on transactions by supplier account name,reference number and validate")
     public void click_on_transactions_by_supplier_account_name_reference_number_and_validate() throws InterruptedException {
    	 ReportsActions.transactionsbysupplieraccountnamereferencenumber();
    	 StepTracker.setCurrentStep("Click on transactions by supplier account name,reference number and validate");
     }
     @When("Click on transactions by supplier pagination")
     public void click_on_transactions_by_supplier_pagination() throws Exception {
    	 ReportsActions.transactionsbysupplierpagination();
    	 StepTracker.setCurrentStep("Click on transactions by supplier pagination");
     }
     @When("Click on transactions by supplier next button")
     public void click_on_transactions_by_supplier_next_button() throws InterruptedException {
    	 ReportsActions.transactionsbysuppliernextbutton();
    	 StepTracker.setCurrentStep("Click on transactions by supplier next button");
     }
     @Then("Click on transactions by supplier previous button")
     public void click_on_transactions_by_supplier_previous_button() throws InterruptedException {
    	 ReportsActions.transactionsbysupplierpreviousbutton();
    	 StepTracker.setCurrentStep("Click on transactions by supplier previous button");
     }
     @When("Click on payment to supplier tab and validate")
     public void click_on_payment_to_supplier_tab_and_validate() throws IOException {
    	 ReportsActions.validatepaymenttosupplier();
    	 StepTracker.setCurrentStep("Click on payment to supplier tab and validate");
     }
     @When("Click on payment to supplier search and validate")
     public void click_on_payment_to_supplier_search_and_validate(){
    	 ReportsActions.searchinpaymenttosuppliertab();
    	 StepTracker.setCurrentStep("Click on payment to supplier tab and validate");
     }
     @When("Click on supplier dropdown in payment to supplier")
     public void click_on_supplier_dropdown_in_payment_to_supplier() {
    	 ReportsActions.paymenttosuppliersupplierdropdown();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in payment to supplier");
     }
     @When("Click on payment to supplier actions and validate")
     public void click_on_payment_to_supplier_actions_and_validate() throws InterruptedException {
    	 ReportsActions.paymenttosupplieractions();
    	 StepTracker.setCurrentStep("Click on payment to supplier actions and validate");
     }
     @When("Click on payment to supplier accounts and validate")
     public void click_on_payment_to_supplier_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.paymenttosupplieraccounts();
    	 StepTracker.setCurrentStep("Click on payment to supplier accounts and validate");
     }
     @When("Click on payment to supplier reference number,supplier name and validate")
     public void click_on_payment_to_supplier_reference_number_supplier_name_and_validate() throws InterruptedException {
    	 ReportsActions.paymenttosupplierreferencenumbersuppliername();
    	 StepTracker.setCurrentStep("Click on payment to supplier reference number,supplier name and validate");
     }
     @When("Click on payment to supplier pagination")
     public void click_on_payment_to_supplier_pagination() throws Exception {
    	 ReportsActions.paymenttosupplierpagination();
    	 StepTracker.setCurrentStep("Click on payment to supplier pagination");
     }
     @When("Click on payment to supplier next button")
     public void click_on_payment_to_supplier_next_button() throws InterruptedException {
    	 ReportsActions.paymenttosuppliernextbutton();
    	 StepTracker.setCurrentStep("Click on payment to supplier next button");
     }
     @Then("Click on payment to supplier previous button")
     public void click_on_payment_to_supplier_previous_button() throws InterruptedException {
    	 ReportsActions.paymenttosupplierpreviousbutton();
    	 StepTracker.setCurrentStep("Click on payment to supplier previous button");
     }
     @When("Click on creditors tab and validate")
     public void click_on_creditors_tab_and_validate() throws IOException {
    	 ReportsActions.validatecreditorstab();
    	 StepTracker.setCurrentStep("Click on creditors tab and validate");
     }
     @When("Click on supplier dropdown in creditors")
     public void click_on_supplier_dropdown_in_creditors() throws InterruptedException{
    	 ReportsActions.creditorssupplierdropdown();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in creditors");
     }
     @When("Click on creditors actions and validate")
     public void click_on_creditors_actions_and_validate() throws InterruptedException {
    	 ReportsActions.creditorsactions();
    	 StepTracker.setCurrentStep("Click on creditors actions and validate");
     }
     @When("Click on creditors accounts and validate")
     public void click_on_creditors_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.creditorsaccounts();
    	 StepTracker.setCurrentStep("Click on creditors accounts and validate");
     }
     @When("Click on supplier statement tab and validate")
     public void click_on_supplier_statement_tab_and_validate() throws IOException {
    	 ReportsActions.validatesupplierstatementtab();
    	 StepTracker.setCurrentStep("Click on supplier statement tab and validate");
     }
     @When("Click on supplier statement search and validate")
     public void click_on_supplier_statement_search_and_validate() {
    	 ReportsActions.searchinsupplierstatement();
    	 StepTracker.setCurrentStep("Click on supplier statement search and validate");
     }
     @When("Click on supplier dropdown in supplier statement")
     public void click_on_supplier_dropdown_in_supplier_statement() throws InterruptedException {
    	 ReportsActions.supplierdropdowninsupplierstatement();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in supplier statement");
     }
     @When("Click on supplier statement actions and validate")
     public void click_on_supplier_statement_actions_and_validate() throws InterruptedException {
    	 ReportsActions.supplierstatementactions();
    	 StepTracker.setCurrentStep("Click on supplier statement actions and validate");
     }
     @When("Click on supplier statement accounts and validate")
     public void click_on_supplier_statement_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.supplierstatementaccounts();
    	 StepTracker.setCurrentStep("Click on supplier statement accounts and validate");
     }
     @When("Click on supplier statement reference number and validate")
     public void click_on_supplier_statement_reference_number_and_validate() throws InterruptedException {
    	 ReportsActions.supplierstatementreferencenumber();
    	 StepTracker.setCurrentStep("Click on supplier statement reference number and validate");
     }
     @When("Click on supplier statement pagination")
     public void click_on_supplier_statement_pagination() throws Exception {
    	 ReportsActions.supplierstatementpagination();
    	 StepTracker.setCurrentStep("Click on supplier statement pagination");
     }
     @When("Click on supplier statement next button")
     public void click_on_supplier_statement_next_button() throws InterruptedException {
    	 ReportsActions.supplierstatementnextbutton();
    	 StepTracker.setCurrentStep("Click on supplier statement next button");
     }
     @Then("Click on supplier statement previous button")
     public void click_on_supplier_statement_previous_button() throws InterruptedException {
    	 ReportsActions.supplierstatementpreviousbutton();
    	 StepTracker.setCurrentStep("Click on supplier statement previous button");
     }
     @When("Click on purchases invoice list tab and validate")
     public void click_on_purchases_invoice_list_tab_and_validate() throws IOException {
    	 ReportsActions.validatepurchasesinvoicelisttab();
    	 StepTracker.setCurrentStep("Click on purchases invoice list tab and validate");
     }
     @When("Click on purchases invoice list search and validate")
     public void click_on_purchases_invoice_list_search_and_validate() {
    	 ReportsActions.searchinpurchasesinvoicelist();
    	 StepTracker.setCurrentStep("Click on purchases invoice list search and validate");
     }
     @When("Click on supplier dropdown in purchases invoice list")
     public void click_on_supplier_dropdown_in_purchases_invoice_list() throws InterruptedException {
    	 ReportsActions.supplierdropdowninpurchasesinvoicelist();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in purchases invoice list");
     }
     @When("Click on purchases invoice list actions and validate")
     public void click_on_purchases_invoice_list_actions_and_validate() throws InterruptedException {
    	 ReportsActions.purchasesinvoicelistactions();
    	 StepTracker.setCurrentStep("Click on purchases invoice list actions and validate");
     }
     @When("Click on purchases invoice list accounts and validate")
     public void click_on_purchases_invoice_list_accounts_and_validate()throws InterruptedException {
    	 ReportsActions.purchasesinvoicelistaccounts();
    	 StepTracker.setCurrentStep("Click on purchases invoice list accounts and validate");
     }
     @When("Click on purchases invoice list reference number,supplier name and validate")
     public void click_on_purchases_invoice_list_reference_number_supplier_name_and_validate() throws InterruptedException {
    	 ReportsActions.purchasesinvoicelistreferencenumberandsuppliername();
    	 StepTracker.setCurrentStep("Click on purchases invoice list reference number,supplier name and validate");
     }
     @When("Click on purchases invoice list pagination")
     public void click_on_purchases_invoice_list_pagination() throws Exception {
    	 ReportsActions.purchasesinvoicelistpagination();
    	 StepTracker.setCurrentStep("Click on purchases invoice list pagination");
     }
     @When("Click on purchases invoice list next button")
     public void click_on_purchases_invoice_list_next_button() throws InterruptedException {
    	 ReportsActions.purchasesinvoicelistnextbutton();
    	 StepTracker.setCurrentStep("Click on purchases invoice list next button");
     }
     @Then("Click on purchases invoice list previous button")
     public void click_on_purchases_invoice_list_previous_button() throws InterruptedException {
    	 ReportsActions.purchasesinvoicelistpreviousbutton();
    	 StepTracker.setCurrentStep("Click on purchases invoice list previous button");
     }
     @When("Click on unpaid purchases tab and validate")
     public void click_on_unpaid_purchases_tab_and_validate() throws IOException {
    	 ReportsActions.validateunpaidpurchasestab();
    	 StepTracker.setCurrentStep("Click on unpaid purchases tab and validate");
     }
     @When("Click on unpaid purchases search and validate")
     public void click_on_unpaid_purchases_search_and_validate() {
    	 ReportsActions.searchinunpaidpurchases();
    	 StepTracker.setCurrentStep("Click on unpaid purchases search and validate");
     }
     @When("Click on supplier dropdown in unpaid purchases")
     public void click_on_supplier_dropdown_in_unpaid_purchases() throws InterruptedException {
    	 ReportsActions.supplierdropdowninunpaidpurchases();
    	 StepTracker.setCurrentStep("Click on supplier dropdown in unpaid purchases");
     }
     @When("Click on unpaid purchases actions and validate")
     public void click_on_unpaid_purchases_actions_and_validate() throws InterruptedException {
    	 ReportsActions.unpaidpurchasesactions();
    	 StepTracker.setCurrentStep("Click on unpaid purchases actions and validate");
     }
     @When("Click on unpaid purchases accounts and validate")
     public void click_on_unpaid_purchases_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.unpaidpurchasesaccounts();
    	 StepTracker.setCurrentStep("Click on unpaid purchases accounts and validate");
     }
     @When("Click on unpaid purchases reference number,supplier name and validate")
     public void click_on_unpaid_purchases_reference_number_supplier_name_and_validate() throws InterruptedException {
    	 ReportsActions.unpaidpurchasesreferencenumberandsuppliername();
    	 StepTracker.setCurrentStep("Click on unpaid purchases reference number,supplier name and validate");
     }
     @When("Click on unpaid purchases pagination")
     public void click_on_unpaid_purchases_pagination() throws Exception {
    	 ReportsActions.unpaidpurchasespagination();
    	 StepTracker.setCurrentStep("Click on unpaid purchases pagination");
     }
     @When("Click on unpaid purchases next button")
     public void click_on_unpaid_purchases_next_button() throws InterruptedException {
    	 ReportsActions.unpaidpurchasesnextbutton();
    	 StepTracker.setCurrentStep("Click on unpaid purchases next button");
     }
     @Then("Click on unpaid purchases previous button")
     public void click_on_unpaid_purchases_previous_button() throws InterruptedException {
    	 ReportsActions.unpaidpurchasespreviousbutton();
    	 StepTracker.setCurrentStep("Click on unpaid purchases previous button");
     }
     @When("Click on expenses by supplier summary tab and validate")
     public void click_on_expenses_by_supplier_summary_tab_and_validate() throws IOException {
    	 ReportsActions.validateexpensesbysuppliersummarytab();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary tab and validate");
     }
     @When("Click on expenses by supplier summary search and validate")
     public void click_on_expenses_by_supplier_summary_search_and_validate() {
    	 ReportsActions.searchinexpensesbysuppliersummary();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary search and validate");
     }
     @When("Click on expenses by supplier summary actions and validate")
     public void click_on_expenses_by_supplier_summary_actions_and_validate() throws InterruptedException {
    	 ReportsActions.expensesbysuppliersummaryactions();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary actions and validate");
     }
     @When("Click on expenses by supplier summary accounts and validate")
     public void click_on_expenses_by_supplier_summary_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.expensesbysuppliersummaryaccounts();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary accounts and validate");
     }
     @When("Click on expenses by supplier summary supplier name and validate")
     public void click_on_expenses_by_supplier_summary_supplier_name_and_validate() throws InterruptedException {
    	 ReportsActions.expensesbysuppliersummarysuppliername();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary supplier name and validate");
     }
     @When("Click on expenses by supplier summary pagination")
     public void click_on_expenses_by_supplier_summary_pagination() throws Exception {
    	 ReportsActions.expensesbysuppliersummarypagination();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary pagination");
     }
     @When("Click on expenses by supplier summary next button")
     public void click_on_expenses_by_supplier_summary_next_button() throws InterruptedException {
    	 ReportsActions.expensesbysuppliersummarynextbutton();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary next button");
     }
     @Then("Click on expenses by supplier summary previous button")
     public void click_on_expenses_by_supplier_summary_previous_button() throws InterruptedException {
    	 ReportsActions.expensesbysuppliersummarypreviousbutton();
    	 StepTracker.setCurrentStep("Click on expenses by supplier summary previous button");
     }
     @When("Click on supplier balance summary tab and validate")
     public void click_on_supplier_balance_summary_tab_and_validate() {
    	 ReportsActions.validatesupplierbalancesummarytab();
    	 StepTracker.setCurrentStep("Click on supplier balance summary tab and validate");
     }
     @When("Click on supplier balance summary search and validate")
     public void click_on_supplier_balance_summary_search_and_validate() {
    	 ReportsActions.searchinsupplierbalancesummary();
    	 StepTracker.setCurrentStep("Click on supplier balance summary search and validate");
     }
     @When("Click on supplier balance summary actions and validate")
     public void click_on_supplier_balance_summary_actions_and_validate() throws InterruptedException {
    	 ReportsActions.supplierbalancesummaryactions();
    	 StepTracker.setCurrentStep("Click on supplier balance summary actions and validate");
     }
     @When("Click on supplier balance summary accounts and validate")
     public void click_on_supplier_balance_summary_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.supplierbalancesummaryaccounts();
    	 StepTracker.setCurrentStep("Click on supplier balance summary accounts and validate");
     }
     @When("Click on supplier balance summary supplier name and validate")
     public void click_on_supplier_balance_summary_supplier_name_and_validate() throws InterruptedException {
    	 ReportsActions.supplierbalancesummarysuppliername();
    	 StepTracker.setCurrentStep("Click on supplier balance summary supplier name and validate");
     }
     @When("Click on supplier balance summary pagination")
     public void click_on_supplier_balance_summary_pagination() throws Exception {
    	 ReportsActions.supplierbalancesummarypagination();
    	 StepTracker.setCurrentStep("Click on supplier balance summary pagination");
     }
     @When("Click on supplier balance summary next button")
     public void click_on_supplier_balance_summary_next_button() throws InterruptedException {
    	 ReportsActions.supplierbalancesummarynextbutton();
    	 StepTracker.setCurrentStep("Click on supplier balance summary next button");
     }
     @Then("Click on supplier balance summary previous button")
     public void click_on_supplier_balance_summary_previous_button() throws InterruptedException {
    	 ReportsActions.supplierbalancesummarypreviousbutton();
    	 StepTracker.setCurrentStep("Click on supplier balance summary previous button");
     }
     @When("Click on account payable ageing list tab and validate")
     public void click_on_account_payable_ageing_list_tab_and_validate() {
    	 ReportsActions.validateaccountpayableageinglisttab();
    	 StepTracker.setCurrentStep("Click on account payable ageing list tab and validate");
     }
     @When("Click on account payable ageing list actions and validate")
     public void click_on_account_payable_ageing_list_actions_and_validate() throws InterruptedException {
    	 ReportsActions.accountpayableageinglistactions();
    	 StepTracker.setCurrentStep("Click on account payable ageing list actions and validate");
     }
     @When("Click on account payable ageing list accounts and validate")
     public void click_on_account_payable_ageing_list_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.accountpayableageinglistaccounts();
    	 StepTracker.setCurrentStep("Click on account payable ageing list accounts and validate");
     }
     @When("Click on account payable ageing list reference number,supplier name and validate")
     public void click_on_account_payable_ageing_list_reference_number_supplier_name_and_validate() throws InterruptedException {
    	 ReportsActions.accountpayableageinglistreferencenumberandsuppliername();
    	 StepTracker.setCurrentStep("Click on account payable ageing list reference number,supplier name and validate");
     }
     @When("Click on cheque detail tab and validate")
     public void click_on_cheque_detail_tab_and_validate() {
    	 ReportsActions.validatechequedetailtab();
    	 StepTracker.setCurrentStep("Click on cheque detail tab and validate");
     }
     @When("Click on cheque detail actions and validate")
     public void click_on_cheque_detail_actions_and_validate() throws InterruptedException {
    	 ReportsActions.chequedetailactions();
    	 StepTracker.setCurrentStep("Click on cheque detail actions and validate");
     }
     @When("Click on cheque detail accounts and validate")
     public void click_on_cheque_detail_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.chequedetailaccounts();
    	 StepTracker.setCurrentStep("Click on cheque detail accounts and validate");
     }
     @When("Click on cheque detail reference number and validate")
     public void click_on_cheque_detail_reference_number_and_validate() throws InterruptedException {
    	 ReportsActions.chequedetailreferencenumber();
    	 StepTracker.setCurrentStep("Click on cheque detail reference number and validate");
     }
     @When("Click on purchase and applied payments tab and validate")
     public void click_on_purchase_and_applied_payments_tab_and_validate() throws IOException {
    	 ReportsActions.validatepurchaseandappliedpaymentstab();
    	 StepTracker.setCurrentStep("Click on purchase and applied payments tab and validate");
     }
     @When("Click on purchase and applied payments actions and validate")
     public void click_on_purchase_and_applied_payments_actions_and_validate() throws InterruptedException {
    	 ReportsActions.purchaseandappliedpaymentsactions();
    	 StepTracker.setCurrentStep("Click on purchase and applied payments actions and validate");
     }
     @When("Click on purchase and applied payments accounts and validate")
     public void click_on_purchase_and_applied_payments_accounts_and_validate() throws InterruptedException {
    	 ReportsActions.purchaseandappliedpaymentsaccounts();
    	 StepTracker.setCurrentStep("Click on purchase and applied payments accounts and validate");
     }
     @When("Click on purchase and applied payments reference number,supplier name and validate")
     public void click_on_purchase_and_applied_payments_reference_number_supplier_name_and_validate() throws InterruptedException {
    	 ReportsActions.purchaseandappliedpaymentsreferencenumberandsuppliername();
    	 StepTracker.setCurrentStep("Click on purchase and applied payments reference number,supplier name and validate");
     }
     @When("Click on VAT tab and validate")
     public void click_on_vat_tab_and_validate() throws IOException {
    	 ReportsActions.validateVATtab();
    	 StepTracker.setCurrentStep("Click on VAT tab and validate");
     }
     @When("Click on VAT actions and validate")
     public void click_on_vat_actions_and_validate() throws InterruptedException {
    	 ReportsActions.VATactions();
    	 StepTracker.setCurrentStep("Click on VAT actions and validate");
     }
}


