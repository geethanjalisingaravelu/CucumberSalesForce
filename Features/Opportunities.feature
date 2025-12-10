Feature: Opportunities test cases
Scenario: Validate Opportunities DropDown T15
Given User launch the application
Given User is on "OpportunitiesPage"
Then User Click on "opportunities"
Then User Click on "opportunityDropDown"
Then User validates the dropdown "opportunityDropdownList" with options 
 | All Opportunities      |
 | Closing Next Month     | 
 | My Opportunities		|
 | New This Week 		|
 | New Last Week        |
 | Recently Viewed Opportunities     |
 | Private     |
 | Won |

 
Scenario: Create New Opportunity T16
Given User launch the application
Given User is on "OpportunitiesPage"
Then User Click on "opportunities"
Then User Click on "New"
Then User read the Data and enter the value to "oppName" "oppname"
Then User read the Data and enter the value to "accName" "accname"
Then User read the Data and enter the value to "closeDate" "closedate"
Then User selects "Closed Won" from "stage" dropdown
Then User read the Data and enter the value to "probability" "prob"
Then User selects "Partner Referral" from "leadSource" dropdown
Then User read the Data and enter the value to "campSource" "campsource"
Then User Click on "save"
Then User verify the page "newOppPage" 

 
Scenario: Test Opportunity Pipeline T17
Given User launch the application
Given User is on "OpportunitiesPage"
Then User Click on "opportunities"
Then User Click on "opportunityPipeline"
Then User verify the page "oppPipelineReport" 

 
Scenario: Test Stuck Opportunities Report T18
Given User launch the application
Given User is on "OpportunitiesPage"
Then User Click on "opportunities"
Then User Click on "stuckOpportunity"
Then User verify the page "stuckOpportunityReport" 

@smoke 
Scenario: Test Quaterly Summer Report T19
Given User launch the application
Given User is on "OpportunitiesPage"
Then User Click on "opportunities"
Then User selects "Current FY" from "interval" dropdown
Then User selects "All Opportunities" from "include" dropdown
Then User Click on "runReport"	
Then User verify the page "oppReport" 

