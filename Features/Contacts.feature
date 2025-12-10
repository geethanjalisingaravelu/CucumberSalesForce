Feature: Contacts test cases
@smoke
Scenario: Create New Contact T25
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts"
Then User Click on "New"
Then User read the Data and enter the value to "lname" "contactlastname"
Then User read the Data and enter the value to "accName" "contactaccname"
Then User Click on "save"
And User Verify the text "newContact" "contactlastname"


Scenario: Create New View T26
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts"
Then User Click on "createNewView"
Then User read the Data and enter the value to "viewName" "viewname"
Then User Click on "viewUniqueName"
Then User read the Data and enter the value to "viewUniqueName" "viewuniquename"
Then User Click on "save"
Then User Verify the text in DropDown "viewDropDown" "viewname" 

Scenario: Check Recently Created Contact T27
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User selects "Recently Created" from "contactsDropDown" dropdown
Then User verify the page "recentContacts" 


Scenario: Check My Contacts View T28
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User selects "My Contacts" from "viewDropDown" dropdown
Then User verify the page "myContactsView" 


Scenario: View a contact T29
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User Click on "recentlyCreated" 
Then User verify the page "contactInfo" 


Scenario: Check New View Error T30
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User Click on "createNewView"
Then User read the Data and enter the value to "viewUniqueName" "viewuniquename"
Then User Click on "save" 
Then User Verify the text "errorMsg" "contacterrmsg"
 

Scenario: Check the cancel button works fine T31
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User Click on "createNewView"
Then User read the Data and enter the value to "viewName" "contactviewname"
Then User Click on "viewUniqueName"
Then User read the Data and enter the value to "viewUniqueName" "viewuniquename"
Then User Click on "cancel"
Then User Verify the text not in DropDown "viewDropDown" "contactviewname"


Scenario: Check save and New button works fine T32
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User Click on "New" 
Then User read the Data and enter the value to "lname" "lname"
Then User read the Data and enter the value to "accName" "accountname"
Then User Click on "saveAndNew" 
Then User verify the page "contactEdit" 

