Feature: UserMenuDropDown TestCases test cases

Scenario: Select UserMenu for drop down T05
Given User launch the application
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User validates the dropdown "userMenuDropDownList" with options 
 | My Profile       |
 | My Settings      | 
 |Developer Console		|
 |Logout |
 

Scenario: Select Developers Console from UserMenu drop down T08
Given User launch the application
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "devConsole"
Then User switches to the new window, closes it and switches back to the main window
Then User verifies the new window is closed


Scenario: Select Developers Console from UserMenu drop down T09
Given User launch the application
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "logout"
Then User verifies logout and is redirected to Salesforce login page

@smoke
Scenario: Select My Settings Option from UserMenu drop down T07
Given User launch the application
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "mySettings"
Then User Click on "personal"
Then User Click on "loginHistory"
Then User Click on "downloadLoginHis"
Then User Click on "displayAndLayout"
Then User Click on "custMyTabs"
Then User selects "Salesforce Chatter" from "custAppDropDown" dropdown
Then User selects "Reports" from "availTabs" dropdown
Then User Click on "rightArrow"
Then User Click on "arrowSave"
Then User Click on "emailLink"
Then User Click on "emailSettings"
Then User read the Data and enter the value to "emailName" "emailNme"
Then User read the Data and enter the value to "emailAddress" "emailAddr"
Then User Click on "autBCCRadio"
Then User Click on "save1"
Then User Click on "calAndRem"
Then User Click on "actRem"
Then User Click on "openTestRem"
Then User switches to the new window, closes it and switches back to the main window
Then User verifies the new window is closed

@smoke
Scenario: Select My Profile Option from UserMenu drop down T06
Given User launch the application
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "myProfile"
Then User Click on "editProfile"
Then Switch to Frame "iframe"
Then User Click on "about"
Then User read the Data and enter the value to "lastName" "lname"
Then User Click on "saveAll"
Then Switch to Frame defaultcontent
Then User Click on "post"
Then Switch to Frame "iframe1"
Then User read the Data and enter the value to "update" "message"
Then Switch to Frame defaultcontent
Then User Click on "share"	
Then User Click on "file"	
And sleep for 20000ms
Then User Click on "uploadFile"	
Then User read the Data and enter the value to absolute path "chooseFile" "filelocation"
And sleep for 20000ms
Then User Click on "share"	
And sleep for 20000ms
When Move the mouse hover to "profilePhoto"
When Move the mouse hover and click to "addPhoto"	
And sleep for 20000ms		
Then Switch to Frame "iframe2"
Then User read the Data and enter the value to absolute path "chooseFile1" "photolocation"
And sleep for 20000ms
Then User Click on "save"
Then User Click on "cropPhoto"
Then Switch to Frame defaultcontent







		
		
	



		
		





