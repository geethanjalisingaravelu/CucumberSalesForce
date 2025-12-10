Feature: Random Scenarios test cases
@smoke
Scenario: Verify first and last name of the user T33
Given User launch the application
Given User is on "HomePage"
Then User Click on "Home"
Given User is on "RandomScenariosPage"
Then User verify the page "topLeftUsername" 
Then User Click on "topLeftUsername"
And User Capture Title and store in oldTitle
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "myProfile"
Then Verify current title matches oldTitle

@smoke
Scenario: Verify the edited lastname is updated at various places T34
Given User launch the application
Given User is on "HomePage"
Then User Click on "Home"
Given User is on "RandomScenariosPage"
Then User verify the page "topLeftUsername" 
Then User Click on "topLeftUsername"
And User Capture Title and store in oldTitle
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "myProfile"
Then Verify current title matches oldTitle
Then User Click on "editProfile"
Then Switch to Frame "iframe"
Then User Click on "about"
Then User read the Data and enter the value to "lastName" "lname"
Then User Click on "saveAll"
Then Switch to Frame defaultcontent



Scenario: Verify the tab customization T35
Given User launch the application
Then User is on "RandomScenariosPage"
Then User Click on "allTabsArrow"
Then User Click on "customizeTabs"
Then User selects "Contacts" from "selectedTabs" dropdown
Then User Click on "removeArrow"
Then User Click on "save"
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "logout"
Given User is on "LoginPage"
Then User read the Data and enter the value to "username" "username"
Then User read the Data and enter the value to "password" "password"
Then User Click on "Login"
Then User is on "RandomScenariosPage"
Then User Click on "allTabsArrow"
Then User Click on "customizeTabs"
Then User Verify the text not in DropDown "selectedTabs" "tabtoremove"


Scenario: Blocking an event in the calendar T36
Given User launch the application
Given User is on "RandomScenariosPage"
Then User Click on "dateLink"
Then User Click on "timeLink"
Then User Click on "subCombo"
And User switch to other window "selSubject"
Then User Click on "endTime"
When Move the mouse hover and click to "endTime1"
Then User Click on "save"

		
	
		
		





	



	
