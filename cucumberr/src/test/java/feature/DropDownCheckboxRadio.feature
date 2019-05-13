Feature: To check Dropdown,checkbox,radio buttons,selected disabled

Background: User should be in drop screen
When User taps dropdown in landing screen
And  User should navigate to the dropdown screen


Scenario: User should be on the dropdown screen

When User selects the 1st dropdown
And select an options
And User selects the 2ndt dropdown
And User selects the 3rd dropdown



Scenario: User should selects checkboxes
When User selects checkbox
And check the selected is selected


@first
Scenario: User should selects the rdio button
When Tap any of the radio button
Then check it is selected
@first
Scenario: USer should  select the pumpkin
When Select pumpkin
And check Cabbage is disabled
And select grape





