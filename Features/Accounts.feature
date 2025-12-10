Feature: Accounts test cases

Scenario: Create New Account T10
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User Click on "New"
Then User read the Data and enter the value to "accName" "accountname"
Then User selects "Technology Partner" from "type" dropdown
Then User selects "High" from "custPriority" dropdown
Then User Click on "save"
Then User Verify the text "newAccountPage" "accountname"


Scenario: Create New View T11
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User Click on "createNewView"
Then User read the Data and enter the value to "viewName" "viewname"
Then User Click on "viewUniqueName"
Then User read the Data and enter the value to "viewUniqueName" "viewuniquename"
Then User Click on "save"
Then User Verify the text in DropDown "viewDropDown" "viewname"


Scenario: Edit View T12
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User selects property file "viewname" from "viewDropDown" dropdown
Then User Click on "edit"
Then User read the Data and enter the value to "viewName" "vieweditname"
Then User selects "Account Name" from "filterFields" dropdown
Then User selects "contains" from "operatorFields" dropdown
When User enter into textbox "value" "a" 
Then User selects "Last Activity" from "fieldToDisplayDropDown" dropdown
Then User Click on "rightArrow"
Then User Click on "save"
Then User Verify the text in DropDown "viewDropDown" "vieweditname"

@smoke
Scenario: Merge Accounts T13
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User Click on "mergeAccLink"
Then User read the Data and enter the value to "mergeAcc" "mergeacclink"
Then User Click on "findAccBtn"
Then User Click on "listAcc1"
Then User Click on "listAcc2"
Then User Click on "next"
Then User Click on "merge"
And User switch to window alert and accept
Then User Verify the text "recentlyViewed" "recentlyviewed"


Scenario: Create Account Report T14
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User Click on "lastActivity"
Then User Click on "dateFieldDropDown"
Then User Click on "createdDate"
Then User Click on "from"
Then User Click on "today1"
Then User Click on "to"
Then User Click on "toCalendar"
Then User Click on "today2"
Then User Click on "save1"
Then User read the Data and enter the value to "reportNameInput" "reportName"
Then User Click on "uniqueNameInput"
Then User read the Data and enter the value to "uniqueNameInput" "uniqueReportName"
Then User Click on "saveAndRunReport"
And sleep for 20000ms
Then User Verify the text "reportName" "reportName"













	