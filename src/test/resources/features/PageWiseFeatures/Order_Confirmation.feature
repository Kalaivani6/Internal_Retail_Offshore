Feature: Order_Confirmation

As an agent,I need to support customer for shopping XFINITY Mobile products and plans.

Background: 
Given I launch the Retail application as an agent


Scenario: Validation of successful placed order message
	Given I lookup for a customer and I shop a device 
	And I am in Order confirmation Page
	Then I see Successfull message of order placement
	
Scenario: Validation of receipt number
	Given I lookup for a customer and I shop a device 
	And I am in Order confirmation Page
	Then I see receipt number and mailed to email Id in Success message
	
Scenario: Validation of merchant address
	Given I lookup for a customer and I shop a device 
	And I am in Order confirmation Page
	Then I see merchant address

Scenario: Validation of payment details
	Given I lookup for a customer and I shop a device 
	And I am in Order confirmation Page
	Then I see payment details