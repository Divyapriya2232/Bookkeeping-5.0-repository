Feature: Inventory tab

Background: User login
  Given Launch the browser
  And User need to enter the Application Url
  When User Enter username and Password
  Then User Click on login button
  And redirect to Bookkeeping module
  
  @Inventorytab
  Scenario: Verify inventory tab
  Given Click on product
  And Click on inventory and validate
  
  @Inventorytab
  Scenario: Verify from and to date
  Given Click on inventory and validate
  And Click on from and to date
  
  @Inventorytab
  Scenario: Verify loss of stock button
  Given Click on inventory and validate
  And Click on loss of stock and validate
  When Enter mandatory fields in inventory
  
  @Inventorytab
  Scenario: Verify non mandatory fields in inventory
  Given Click on inventory and validate
  And Click on loss of stock and validate
  When Enter non mandatory fields in inventory
  
  @Inventorytab
  Scenario: Verify cancel in loss of stock
  Given Click on inventory and validate
  And Click on loss of stock and validate
  When Click on cancel in loss of stock and validate
  
  @Inventorytab
  Scenario: Verify add new line in loss of stock
  Given Click on inventory and validate
  And Click on loss of stock and validate
  When Click on add new line in loss of stock and validate
  
  @Inventorytab
  Scenario: Verify clear all lines in loss of stock
  Given Click on inventory and validate
  And Click on loss of stock and validate
  When Click on clear all lines in loss of stock and validate
  
  @Inventorytab
  Scenario: Verify delete in loss of stock
  Given Click on inventory and validate
  And Click on loss of stock and validate
  When Click on delete in loss of stock and validate
  
  @Inventorytab
  Scenario: Verify accounts in inventory
  Given Click on inventory and validate
  And Click on loss of stock and validate
  When Click on accounts in inventory and validate
  
