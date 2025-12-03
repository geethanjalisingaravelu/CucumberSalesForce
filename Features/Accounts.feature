Feature: Accounts test cases
Scenario: Create New Account T10
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User Click on "New"
When User enter into textbox "accName" "Aut Acc10"
Then User selects "Technology Partner" from "type" dropdown
Then User selects "High" from "custPriority" dropdown
Then User Click on "save"
Then User verify the page "newAccountPage" 


Scenario: Create New View T11
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User Click on "createNewView"
When User enter into textbox "viewName" "ViewName1"
Then User Click on "viewUniqueName"
When User enter into textbox "viewUniqueName" "ViewUniqueName1"
Then User Click on "save"
Then User Verify the text in DropDown "ViewName1" "viewDropDown"

Scenario: Edit View T12
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User selects "ViewName1" from "viewDropDown" dropdown
Then User Click on "edit"
When User enter into textbox "viewName" "NewViewName" 
Then User selects "Account Name" from "filterFields" dropdown
Then User selects "contains" from "operatorFields" dropdown
When User enter into textbox "value" "a" 
Then User selects "Last Activity" from "fieldToDisplayDropDown" dropdown
Then User Click on "rightArrow"
Then User Click on "save"
Then User Verify the text in DropDown "NewViewName" "viewDropDown"

Scenario: Merge Accounts T13
Given User launch the application
Given User is on "AccountsPage"
Then User Click on "accounts"
Then User Click on "mergeAccLink"
When User enter into textbox "mergeAcc" "Aut" 
Then User Click on "findAccBtn"
Then User Click on "listAcc1"
Then User Click on "listAcc2"
Then User Click on "next"
Then User Click on "merge"
And User switch to window alert and accept
Then User Verify the text "recentlyViewed" "Automation Account"

@smoke
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
When User enter into textbox "reportNameInput" "SalesForceRep" 
Then User Click on "uniqueNameInput"
When User enter into textbox "uniqueNameInput" "SalesForceRep25" 
Then User Click on "saveAndRunReport"
Then User Verify the text "reportName" "SalesForceRep"













	