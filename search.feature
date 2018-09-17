Feature: search 
Scenario: Search for the destination 
Given open the chrome browser 
Then navigate to trivago site 
Then search for belgium 
And verify the Result
Then close the browser