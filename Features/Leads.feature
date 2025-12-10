Feature: Leads test cases

Scenario: Check Leads Tab T20
Given User launch the application
Given User is on "LeadsPage"
Then User Click on "Leads"
Then User verify the page "LeadsHomePage" 

Scenario: Check Leads Select View T21
Given User launch the application
Given User is on "LeadsPage"
Then User Click on "Leads"
Then User verify the page "LeadsHomePage" 
Then User validates the dropdown "viewAllDropDown" with options 
 | All Open Leads       |
 | My Unread Leads      | 
 |My Unread Leads		|
 |Recently Viewed Leads |
 | Today's Leads        |
 | View - Custom 1      |
 | View - Custom 2      |


Scenario: Check Leads DefaultView T22
Given User launch the application
Given User is on "LeadsPage"
Then User Click on "Leads"
Then User selects "Today's Leads" from "viewDropDown" dropdown
Given User is on "LoginPage"
Then User Click on "userMenuDropDown"
Then User Click on "logout"
Then User read the Data and enter the value to "username" "username"
Then User read the Data and enter the value to "password" "password"
Then User Click on "Login"
Given User is on "LeadsPage"
Then User Click on "Leads"
Then User Click on "go"
Then User Verify the text in DropDown "actViewDropDown" "actviewdropdown" 


Scenario: Check Leads TodaysLeads T23
Given User launch the application
Given User is on "LeadsPage"
Then User Click on "Leads"
Then User selects "Today's Leads" from "viewDropDown" dropdown
Then User Click on "go"
Then User verify the page "todaysLeadsPage" 

@smoke
Scenario: Check New Button on Leads Home T24
Given User launch the application
Given User is on "LeadsPage"
Then User Click on "Leads"
Then User Click on "New"
Then User read the Data and enter the value to "lastname" "lastname"
Then User read the Data and enter the value to "company" "company"
Then User Click on "save"
Then User Verify the text "leadsNewViewPage" "lastname"

