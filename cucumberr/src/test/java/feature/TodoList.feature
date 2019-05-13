Feature: This feature is to do list
Scenario: User should do list
When Tap + button
And add list
Then check list are added

Scenario: User can delete list
When Tap the element
And Tap on the delete icon
Then Corresponding item should be deleted




