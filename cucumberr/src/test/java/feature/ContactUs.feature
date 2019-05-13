Feature: This feature is to test contact us screen


Scenario: User should be able to submit the contact details
When User enter FirstName
And User enter last name
And User enter EmailAddress
And User enter comments
And Submit the content
Then User should able to see thank you message

Scenario: User should be able to reset the contact details
When User enter FirstName
And User enter last name
And User enter EmailAddress
And User enter comments
And reset the content
Then User should able to all the fields are resetted




