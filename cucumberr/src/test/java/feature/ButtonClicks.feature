Feature: This feature is to test buttonclicks



Scenario: Check webElement  button is clickable
When click the webelement click me button
And click the alert button
Then popup should disappear

Scenario: Check Javascript  button is clickable
When click the javascript click me button
And click the alert button
Then popup should disappear


Scenario: Check webElement  button is clickable
When click action move click me button
And click the alert button
Then popup should disappear
