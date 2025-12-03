Feature: Login test cases

Scenario: Login with invalid username and password
Given User launch the application
Given User is on "LoginPage"
When User enter into textbox "username" "geethanjali.singaravelu240@agentforce.com"
When User enter into textbox "password" ""
Then User Click on "Login"
Then User Verify the text "errorMessage" "Error: Please enter your password."

@smoke
Scenario: Check Remember Me TC3
Given User launch the application
Given User is on "LoginPage"
Then User read the Data and enter the value to "username" "username"
Then User read the Data and enter the value to "password" "password"
Then User Click on "rememberMe"
Then User Click on "Login"
Then User Click on Verify Button "Verify"
Then User Click on "userMenuDropDown"
Then User Click on "logout"
Then User Verify the text "actualOutput" "geethanjali.singaravelu240@agentforce.com"


Scenario: Forgot Password 4A
Given User launch the application
Given User is on "LoginPage"
Then User Click on "forgotPassword"
When User enter into textbox "forgotPasswordUn" "geethanjali.singaravelu240@agentforce.com"
Then User Click on "forgotPasswordCont"
Then User Verify the text "forgotPwdMsg" "We’ve sent you an email with a link to finish resetting your password."

@Regression
Scenario: Forgot Password 4B
Given User launch the application
Given User is on "LoginPage"
When User enter into textbox "username" "123"
When User enter into textbox "password" "22131"
Then User Click on "Login"
Then User Verify the text "errorMessage" "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator."
