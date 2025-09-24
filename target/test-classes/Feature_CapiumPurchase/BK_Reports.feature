Feature: Reports tab

  Background: User login
   Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module
    
  @FinancialReportstab  @Test
  Scenario: Verify reports tab
    Given Click on reports
    And Click on report dashboard and validate

  #@FinancialReportstab 
  #Scenario: Verify all reports in report dashboard
    #Given Click on reports
    #And Click on report dashboard and validate
    #When Click on all reports in report dashboard and validate

  @FinancialReportstab @Test
  Scenario: Verify profit & loss tab
    Given Click on reports
    And Click on financials and validate
    And Click on profit & loss and validate
    When Click on profit & loss actions
    Then Click on account in profit & loss and validate

  @FinancialReportstab @Test
  Scenario: Verify balance sheet tab
    Given Click on reports
    And Click on balance sheet and validate
    When Click on balance sheet actions
    Then Click on account in balance sheet and validate

  @FinancialReportstab @Test
  Scenario: Verify trial balance tab
    Given Click on reports
    And Click on trial balance and validate
    When Click on trial balance actions
    Then Click on account in trial balance

  @FinancialReportstab @Test
  Scenario: Verify comparative report tab
    Given Click on reports
    And Click on comparative report and validate
    When Click on comparative report actions

  @FinancialReportstab @Test 
  Scenario: Verify day-book tab
    Given Click on reports
    And Click on day-book and validate
    When Click on day-book search button and validate
    When Click on day-book actions
    And Click on day-book accounts
    Then Click on day-book reference number,contact and validate
    #And Click on day-book pagination
    When Click on day-book next button
    Then Click on day-book previous button

  @FinancialReportstab @Test
  Scenario: Verify cash flow tab
    Given Click on reports
    And Click on cash flow and validate
    When Click on cash flow actions
    
  @AdditionalReportstab @Test 
  Scenario: Verify account details tab 
  Given Click on reports 
  And Click on additional and validate
  When Click on account details and validate
  When Click on account details actions
  When Click on account details accounts
  #When Click on account details pagination
  When Click on account details next button
  Then Click on account details previous button
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify nominal ledger tab 
  Given Click on reports 
  And Click on nominal ledger and validate
  When Click on nominal ledger actions
  Then Click on nominal ledger accounts 
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify business snapshot tab 
  Given Click on reports 
  And Click on business snapshot and validate
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify account list tab 
  Given Click on reports 
  And Click on account list and validate
  When Click on account list search
  When Click on account list actions
  And Click on account list accounts
  #When Click on account list pagination
  When Click on account list next button
  Then Click on account list previous button
  
  @AdditionalReportstab @Test @Run
  Scenario: Verify sales performance tab 
  Given Click on reports 
  And Click on annual report and validate
  When Click on sales performance and validate 
  When Click on expenses performance and validate
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify transaction list by date tab 
  Given Click on reports 
  When Click on transaction list by date and validate
  When Click on transaction list by date search button
  When Click on transaction list by date actions
  When Click on transaction list by date accounts
  When Click on transaction list by date reference number,name and validate
  #When Click on transaction list by date pagination
  When Click on transaction list by date next button
  Then Click on transaction list by date previous button
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify recent transactions tab 
  Given Click on reports 
  When Click on recent transactions and validate
  When Click on recent transactions search button and validate
  When Click on recent transactions actions
  And Click on recent transactions reference number
  #When Click on recent transactions pagination
  When Click on recent transactions next button
  Then Click on recent transactions previous button
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify balance sheet comparison tab 
  Given Click on reports 
  When Click on balance sheet comparison and validate
  When Click on balance sheet comparison actions
  When Click on balance sheet comparison accounts
  When Click on balance sheet comparison account and validate
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify balance sheet detail tab 
  Given Click on reports 
  When Click on balance sheet detail and validate
  When Click on balance sheet detail actions
  When Click on balance sheet detail accounts 
  And Click on balance sheet detail particular,reference number and validate
  
  @AdditionalReportstab @Test @Run 
  Scenario: Verify custom report tab 
  Given Click on reports 
  When Click on custom report and validate
  
  @CustomerReportstab @Test 
  Scenario: Verify advance report tab in customer
  Given Click on reports 
  And Click on customer and validate
  When Click on advance report tab in customer and validate
  When Click on advance report search button in customer and validate 
  When Click on customer dropdown in advance report 
  When Click on advance report actions in customer
  When Click on advance report account in customer
  And Click on advance report customer name,reference number and validate
  #When Click on advance report pagination in customer
  When Click on advance report next button in customer
  Then Click on advance report previous button in customer
  
  @CustomerReportstab @Test 
  Scenario: Verify sales report tab 
  Given Click on reports 
  When Click on sales report and validate
  When Click on sales report actions
  When Click on sales report accounts
  
  @CustomerReportstab @Test 
  Scenario: Verify customer list tab 
  Given Click on reports 
  When Click on customer list and validate
  When Click on customer list search
  When Click on customer list actions
  When Click on customer list customer name and validate
  #When Click on customer list pagination
  When Click on customer list next button
  Then Click on customer list previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify customer ageing list tab 
  Given Click on reports 
  When Click on customer ageing list and validate 
  When Click on customer ageing list search
  When Click on customer dropdown in customer ageing list 
  When Click on customer ageing list actions
  When Click on customer ageing list customer name and validate
  #When Click on customer ageing list pagination
  When Click on customer ageing list next button
  Then Click on customer ageing list previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify transaction by customer tab 
  Given Click on reports 
  When Click on transaction by customer and validate 
  When Click on transaction by customer search
  When Click on customer dropdown in transaction by customer
  When Click on transaction by customer actions
  When Click on transaction by customer accounts
  When Click on transaction by customer reference number and validate
  #When Click on transaction by customer pagination
  When Click on transaction by customer next button
  Then Click on transaction by customer previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify sales product list tab 
  Given Click on reports 
  When Click on sales product list and validate
  When Click on sales product list search
  When Click on product dropdown in sales product list
  When Click on sales product list actions 
  When Click on sales product list accounts
  When Click on sales product list reference number and validate
  #When Click on sales product list pagination
  When Click on sales product list next button
  Then Click on sales product list previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify customer receipts tab 
  Given Click on reports 
  When Click on customer receipts and validate 
  When Click on customer receipts search 
  When Click on customer dropdown in customer receipts
  When Click on customer receipts actions
  When Click on customer receipts accounts
  When Click on customer receipts reference number,customer name and validate
  #When Click on customer receipts pagination
  When Click on customer receipts next button
  Then Click on customer receipts previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify debtors tab 
  Given Click on reports 
  When Click on debtors and validate
  When Click on customer dropdown in debtors
  When Click on debtors actions 
  When Click on debtors accounts
  When Click on debtors reference number and validate
  
  @CustomerReportstab @Test 
  Scenario: Verify customer statement tab 
  Given Click on reports 
  When Click on customer statement and validate
  When Click on customer statement search 
  When Click on customer dropdown in customer statement
  When Click on customer statement actions
  #When Click on customer statement pagination
  When Click on customer statement next button
  Then Click on customer statement previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify sales invoice list tab 
  Given Click on reports 
  When Click on sales invoice list and validate
  When Click on sales invoice list search
  When Click on customer dropdown in sales invoice list
  When Click on sales invoice list actions 
  When Click on sales invoice list accounts
  When Click on sales invoice list invoice number,reference number and validate
  #When Click on sales invoice list pagination
  When Click on sales invoice list next button
  Then Click on sales invoice list previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify open invoice tab 
  Given Click on reports 
  When Click on open invoice and validate 
  When Click on open invoice search 
  When Click on customer dropdown in open invoice
  When Click on open invoice actions 
  When Click on open invoice accounts 
  When Click on open invoice reference number,customer and validate
  #When Click on open invoice pagination
  When Click on open invoice next button
  Then Click on open invoice previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify income by customer summary tab 
  Given Click on reports 
  When Click on income by customer summary and validate
  When Click on income by customer summary search
  When Click on income by customer summary actions 
  When Click on income by customer summary accounts 
  When Click on income by customer summary customer and validate 
  #When Click on income by customer summary pagination 
  When Click on income by customer summary next button
  Then Click on income by customer summary previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify customer balance summary tab 
  Given Click on reports 
  When Click on customer balance summary and validate
  When Click on customer balance summary search
  When Click on customer balance summary actions 
  When Click on customer balance summary customer and validate
  #When Click on customer balance summary pagination
  When Click on customer balance summary next button
  Then Click on customer balance summary previous button
  
  @CustomerReportstab @Test 
  Scenario: Verify deposit details tab 
  Given Click on reports 
  When Click on deposit details and validate
  When Click on deposit details actions
  When Click on deposit details accounts
  When Click on deposit details reference number and validate
  
  @CustomerReportstab @Test 
  Scenario: Verify advance ageing list tab 
  Given Click on reports 
  When Click on advance ageing list and validate 
  When Click on advance ageing list actions
  When Click on advance ageing list accounts
  When Click on advance ageing list reference number,customer and validate
  
  @CustomerReportstab @Test 
  Scenario: Verify quotation by customer tab 
  Given Click on reports 
  When Click on quotation by customer and validate 
  When Click on customer dropdown in quotation by customer
  When Click on quotation by customer actions 
  When Click on quotation by customer accounts
  When Click on quotation by customer reference number validate
  
  @CustomerReportstab @Test 
  Scenario: Verify invoice and received payments tab 
  Given Click on reports 
  When Click on invoice and received payments and validate
  When Click on customer dropdown in invoice and received payments
  When Click on invoice and received payments actions 
  When Click on invoice and received payments accounts 
  When Click on invoice and received payments reference number,customer and validate
  
  @CustomerReportstab @Test 
  Scenario: Verify sales by products service detail tab 
  Given Click on reports 
  When Click on sales by product service detail and validate
  When Click on customer dropdown in sales by product service detail
  When Click on sales by product service detail and actions
  When Click on sales by product service detail and accounts
  When Click on sales by products service detail reference number,customer and validate
  
  @CustomerReportstab @Test 
  Scenario: Verify sales by products service summary tab 
  Given Click on reports 
  When Click on sales by product service summary and validate
  When Click on sales by product service summary search 
  When Click on sales by product service summary actions

  @SupplierReportstab @Test 
  Scenario: Verify advance report tab in supplier
  Given Click on reports
  And Click on supplier and validate
  When Click on advance report tab in supplier and validate
  When Click on advance report search button in customer and supplier 
  When Click on supplier dropdown in advance report
  When Click on advance report actions in supplier
  When Click on advance report accounts in supplier
  When Click on advance report supplier,reference number and validate
  #When Click on advance report pagination in supplier
  When Click on advance report next button in supplier
  Then Click on advance report previous button in supplier
  
  @SupplierReportstab @Test 
  Scenario: Verify purchases report tab
  Given Click on reports 
  When Click on purchases report tab 
  When Click on purchases report actions 
  When Click on purchases report accounts
  
  @SupplierReportstab @Test 
  Scenario: Verify supplier list tab
  Given Click on reports 
  When Click on supplier list tab
  When Click on supplier list search
  When Click on supplier list actions 
  When Click on supplier list supplier name and validate
  #When Click on supplier list pagination 
  When Click on supplier list next button
  Then Click on supplier list previous button 
  
  @SupplierReportstab @Test 
  Scenario: Verify supplier ageing list tab
  Given Click on reports 
  When Click on supplier ageing list tab
  When Click on supplier ageing list search
  When Click on supplier dropdown in supplier ageing list
  When Click on supplier ageing list actions
  When Click on supplier ageing list accounts
  When Click on supplier ageing list supplier name and validate
  #When Click on supplier ageing list pagination 
  When Click on supplier ageing list next button
  Then Click on supplier ageing list previous button 
  
  @SupplierReportstab @Test 
  Scenario: Verify transactions by supplier tab
  Given Click on reports 
  When Click on transactions by supplier tab and validate 
  When Click on transactions by supplier search and validate
  When Click on supplier dropdown in transactions by supplier
  When Click on transactions by supplier actions and validate
  When Click on transactions by supplier accounts and validate
  When Click on transactions by supplier account name,reference number and validate
  #When Click on transactions by supplier pagination
  When Click on transactions by supplier next button
  Then Click on transactions by supplier previous button 
 
  @SupplierReportstab @Test 
  Scenario: Verify payment to supplier tab
  Given Click on reports 
  When Click on payment to supplier tab and validate
  When Click on payment to supplier search and validate
  When Click on supplier dropdown in payment to supplier
  When Click on payment to supplier actions and validate 
  When Click on payment to supplier accounts and validate
  When Click on payment to supplier reference number,supplier name and validate
  #When Click on payment to supplier pagination 
  When Click on payment to supplier next button
  Then Click on payment to supplier previous button
  
  @SupplierReportstab @Test 
  Scenario: Verify creditors tab
  Given Click on reports 
  When Click on creditors tab and validate 
  When Click on supplier dropdown in creditors
  When Click on creditors actions and validate 
  When Click on creditors accounts and validate
  
  @SupplierReportstab @Test 
  Scenario: Verify supplier statement tab
  Given Click on reports 
  When Click on supplier statement tab and validate
  When Click on supplier statement search and validate 
  When Click on supplier dropdown in supplier statement
  When Click on supplier statement actions and validate 
  When Click on supplier statement accounts and validate 
  When Click on supplier statement reference number and validate
  #When Click on supplier statement pagination 
  When Click on supplier statement next button
  Then Click on supplier statement previous button
  
  @SupplierReportstab @Test 
  Scenario: Verify purchases invoice list tab
  Given Click on reports 
  When Click on purchases invoice list tab and validate 
  When Click on purchases invoice list search and validate
  When Click on supplier dropdown in purchases invoice list
  When Click on purchases invoice list actions and validate 
  When Click on purchases invoice list accounts and validate
  When Click on purchases invoice list reference number,supplier name and validate
  #When Click on purchases invoice list pagination 
  When Click on purchases invoice list next button
  Then Click on purchases invoice list previous button
  
  @SupplierReportstab @Test 
  Scenario: Verify unpaid purchases tab
  Given Click on reports 
  When Click on unpaid purchases tab and validate
  When Click on unpaid purchases search and validate
  When Click on supplier dropdown in unpaid purchases 
  When Click on unpaid purchases actions and validate
  When Click on unpaid purchases accounts and validate
  When Click on unpaid purchases reference number,supplier name and validate
  #When Click on unpaid purchases pagination
  When Click on unpaid purchases next button
  Then Click on unpaid purchases previous button
  
  @SupplierReportstab @Test 
  Scenario: Verify expenses by supplier summary tab
  Given Click on reports 
  When Click on expenses by supplier summary tab and validate 
  When Click on expenses by supplier summary search and validate
  When Click on expenses by supplier summary actions and validate
  When Click on expenses by supplier summary accounts and validate 
  When Click on expenses by supplier summary supplier name and validate
  #When Click on expenses by supplier summary pagination 
  When Click on expenses by supplier summary next button
  Then Click on expenses by supplier summary previous button
  
  @SupplierReportstab @Test 
  Scenario: Verify supplier balance summary tab
  Given Click on reports 
  When Click on supplier balance summary tab and validate 
  When Click on supplier balance summary search and validate
  When Click on supplier balance summary actions and validate 
  When Click on supplier balance summary accounts and validate
  When Click on supplier balance summary supplier name and validate
  #When Click on supplier balance summary pagination
  When Click on supplier balance summary next button
  Then Click on supplier balance summary previous button
  
  @SupplierReportstab @Test 
  Scenario: Verify account payable ageing list tab
  Given Click on reports 
  When Click on account payable ageing list tab and validate
  When Click on account payable ageing list actions and validate
  When Click on account payable ageing list accounts and validate
  When Click on account payable ageing list reference number,supplier name and validate
  
  @SupplierReportstab @Test 
  Scenario: Verify cheque detail tab
  Given Click on reports 
  When Click on cheque detail tab and validate 
  When Click on cheque detail actions and validate
  When Click on cheque detail accounts and validate 
  When Click on cheque detail reference number and validate
  
  @SupplierReportstab @Test 
  Scenario: Verify purchase and applied payments tab
  Given Click on reports 
  When Click on purchase and applied payments tab and validate 
  When Click on purchase and applied payments actions and validate 
  When Click on purchase and applied payments accounts and validate 
  When Click on purchase and applied payments reference number,supplier name and validate
  
  @VATReportstab @Test @Rerun
  Scenario: Verify VAT tab
  Given Click on reports 
  When Click on VAT tab and validate 
  When Click on VAT actions and validate
