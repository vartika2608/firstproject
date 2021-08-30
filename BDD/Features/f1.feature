Feature:To test the ksrtc application
Scenario:To test the login page of ksrtc application
Given open chrome browser and url of the application
When enter username and password
Then Login success

Scenario: To test the functionality of searching Bus route on ksrtc application
Given User successfully logged in into the application
When enter FromTo GoingTo DateOfDeparture and DateOfReturn 
Then Route found successfully