Feature: Client Dashboard

Background: User login
  Given Launch the browser
  And User need to enter the Application Url
  When User Enter username and Password
  Then User Click on login button
  And redirect to Bookkeeping module
  
  @Quickentrytab
  Scenario: Verify Quick entry 
  Given Click on quick entry and validate
  
  @Quickentrytab
  Scenario: Verify add quick entry 
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  When Enter mandatory fields and save and exit in quick entry
  
  @Quickentrytab
  Scenario: Verify non mandatory fields in quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  When Enter non mandatory fields and save and new in quick entry
  
  @Quickentrytab
  Scenario: Verify clear form in quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on clear form in quick entry
  
  @Quickentrytab
  Scenario: Verify add new line in quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on add new line in quick entry
  
  @Quickentrytab
  Scenario: Verify search in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on search in add new quick entry
  
  @Quickentrytab
  Scenario: Verify add button in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on add button in add new quick entry
  
  @Quickentrytab
  Scenario: Verify Checkbox in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on checkbox and validate in add new quick entry
  
  @Quickentrytab
  Scenario: Verify cancel selections in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on cancel selections in add new quick entry
  
  @Quickentrytab
  Scenario: Verify delete button in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  When Click on delete yes button in add new quick entry
  Then Click on delete no button in add new quick entry
  
  @Quickentrytab
  Scenario: Verify copy button in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on copy button in add new quick entry
  
  @Quickentrytab
  Scenario: Verify export in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  Then Click on export in add new quick entry
  
  @Quickentrytab
  Scenario: Verify inactive button in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  When Click on inactive yes button in add new quick entry
  Then Click on inactive no button in add new quick entry
  
  @Quickentrytab
  Scenario: Verify active button in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  When Click on active yes button in add new quick entry
  Then Click on active no button in add new quick entry
  
  @Quickentrytab
  Scenario: Verify close button in add new quick entry
  Given Click on quick entry and validate
  And Click on add quick entry and validate
  When Click on close no button in add new quick entry
  Then Click on close yes button in add new quick entry
  
  @Quickentrytab
  Scenario: Verify search in add quick entry
  Given Click on quick entry and validate
  Then Click on search in add quick entry
  
  @Quickentrytab
  Scenario: Verify actions in add quick entry
  Given Click on quick entry and validate
  And Click on checkboxes in add quick entry
  When Click on actions in add quick entry
  Then Click on export in add quick entry actions

  @Quickentrytab 
  Scenario: Verify mousehover view in add quick entry
  Given Click on quick entry and validate
  Then Click on mousehover view in add quick entry
  
  @Quickentrytab
  Scenario: Verify mousehover export in add quick entry
  Given Click on quick entry and validate
  When Click on mousehover export in add quick entry
  
  @Quickentrytab
  Scenario: Verify mousehover edit in add quick entry
  Given Click on quick entry and validate
  When Click on mousehover edit in add quick entry
  
  @Quickentrytab
  Scenario: Verify mousehover delete button in add quick entry
  Given Click on quick entry and validate
  When Click on mousehover delete yes button in add quick entry
  Then Click on mousehover delete no button in add quick entry
  
  @Quickentrytab
  Scenario: Verify Checkbox in add quick entry
  Given Click on quick entry and validate
  Then Click on checkbox and validate in add quick entry
  
  @Quickentrytab
  Scenario: Verify cancel selections in add quick entry
  Given Click on quick entry and validate
  Then Click on cancel selections in add quick entry
  
  @Quickentrytab
  Scenario: Verify selected item delete button in add quick entry
  Given Click on quick entry and validate
  When Click on delete yes button in add quick entry
  Then Click on delete no button in add quick entry
  
  @Quickentrytab
  Scenario: Verify selected item copy button in add quick entry
  Given Click on quick entry and validate
  When Click on copy button in add quick entry
  
  @Quickentrytab
  Scenario: Verify selected item export in add quick entry
  Given Click on quick entry and validate
  When Click on selected item export in add quick entry
  
  @Quickentrytab
  Scenario: Verify selected item inactive button in add quick entry
  Given Click on quick entry and validate
  When Click on inactive yes button in add quick entry
  Then Click on inactive no button in add quick entry
  
  @Quickentrytab
  Scenario: Verify selected item active button in add quick entry
  Given Click on quick entry and validate
  When Click on active yes button in add quick entry
  Then Click on active no button in add quick entry
  
  #@Quickentrytab
  #Scenario: Verify pagination in add quick entry
  #Given Click on quick entry and validate
  #When Click on pagination in add quick entry
  
  @Quickentrytab
  Scenario: Verify next and previous button in add quick entry
  Given Click on quick entry and validate
  When Click on next in add quick entry
  Then Click on previous in add quick entry