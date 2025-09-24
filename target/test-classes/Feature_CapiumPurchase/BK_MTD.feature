Feature: MTD tab

  Background: User login
   Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module
    
  @MTD
  Scenario: Verify MTD tab
  Given Click on MTD and validate
  And Click on submit vat and validate
  
  @MTD
  Scenario: Verify vat period tab in submit vat
  Given Click on MTD and validate
  And Click on submit vat and validate
  When Click on vat period and submit in submit vat
  
  @MTD
  Scenario: Verify mousehover actions in submit vat
  Given Click on MTD and validate
  And Click on submit vat and validate
  When Click on mousehover actions in submit vat
  
  @MTD
  Scenario: Verify pagination next and previous button in submit vat
  Given Click on MTD and validate
  And Click on submit vat and validate
  When Click on pagination in submit vat
  Then Click on next button in submit vat
  Then Click on previous button in submit vat
  
  @MTD
  Scenario: Verify bridging vat
  Given Click on MTD and validate
  And Click on bridging vat and validate
  
  @MTD
  Scenario: Verify vat period tab in bridging vat
  Given Click on MTD and validate
  And Click on bridging vat and validate
  When Click on vat period and submit in bridging vat
  
  @MTD
  Scenario: Verify mousehover actions in bridging vat
  Given Click on MTD and validate
  And Click on bridging vat and validate
  When Click on mousehover actions in bridging vat
  
  @MTD
  Scenario: Verify view vat details tab
  Given Click on MTD and validate
  And Click on view vat details tab and validate
  
  @MTD
  Scenario: Verify vat transactions detail tab
  Given Click on MTD and validate
  And Click on vat transactions detail tab and validate
  
  @MTD
  Scenario: Verify vat transactions actions
  Given Click on MTD and validate
  And Click on vat transactions detail actions
  
  @MTD
  Scenario: Verify pagination next and previous button in vat transactions detail
  Given Click on MTD and validate
  And Click on pagination in vat transactions detail
  When Click on next button in vat transactions detail
  Then Click on previous button in vat transactions detail
  
  @MTD
  Scenario: Verify vat settings tab
  Given Click on MTD and validate
  And Click on vat settings tab and validate
  
  @MTD
  Scenario: Verify non mandatory fields in vat settings tab
  Given Click on MTD and validate
  And Enter non mandatory fields in vat settings
  
  @MTD
  Scenario: Verify discount period checkbox in vat settings
  Given Click on MTD and validate
  And Click on discount period checkbox and validate
  
  @MTD
  Scenario: Verify vat codes in vat settings
  Given Click on MTD and validate
  And Click on vat codes and validate
  
  @MTD
  Scenario: Verify actions in vat codes
  Given Click on MTD and validate
  And Click on actions in vat codes
 
  @MTD
  Scenario: Verify actions in vat codes selected actions
  Given Click on MTD and validate
  And Click on actions in vat codes selected actions
  
  @MTD
  Scenario: Verify pagination next and previous button in vat codes 
  Given Click on MTD and validate
  And Click on pagination in vat codes
  When Click on next button in vat codes
  Then Click on previous button in vat codes
  