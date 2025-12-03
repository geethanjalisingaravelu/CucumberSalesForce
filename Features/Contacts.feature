Feature: Contacts test cases
Scenario: Create New Contact T25
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts"
Then User Click on "New"
When User enter into textbox "lname" "Shan"
When User enter into textbox "accName" "Automation Account"
Then User Click on "save"
Then User verify the page "newContact"


Scenario: Create New View T26
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts"
Then User Click on "createNewView"
When User enter into textbox "viewName" "Auto ViewTest"
Then User Click on "viewUniqueName"
When User enter into textbox "viewUniqueName" "Automat_UniqueViewTest"
Then User Click on "save"
Then User Verify the text in DropDown "Auto ViewTest" "viewDropDown" 

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
When User enter into textbox "viewUniqueName" "UniqueNameTest"
Then User Click on "save" 
Then User Verify the text "errorMsg" "Error: You must enter a value"
 

Scenario: Check the cancel button works fine T31
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User Click on "createNewView"
When User enter into textbox "viewName" "UniqueNameTest"
When User enter into textbox "viewUniqueName" "UniqueNameTest"
Then User Click on "cancel"
Then User Verify the text not in DropDown "viewDropDown" "UniqueNameTest"

@smoke
Scenario: Check save and New button works fine T32
Given User launch the application
Given User is on "ContactsPage"
Then User Click on "contacts" 
Then User Click on "New" 
When User enter into textbox "lname" "Akshara"
When User enter into textbox "accName" "Automation Account"
Then User Click on "saveAndNew" 
Then User verify the page "contactEdit" 

