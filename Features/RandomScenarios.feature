Feature: Random Scenarios test cases
Scenario: Verify first and last name of the user T33
Given User launch the application
Given User is on "HomePage"
Then User Click on "home"
Then User verify the page "topLeftUsername" 
Then User Click on "firstLastName"
Given User is on "UserMenuPage"
Then User Click on "userMenuDropDown"
Then User Click on "myProfile"
