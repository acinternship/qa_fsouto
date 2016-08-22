Feature: As a User, I want that the Careers page displays the number of open positions, and it should also match the amount of open positions displayed in the job location page.

@ignore
Scenario Outline: Succefully display the amount of open positions for a job location
	Given I visit Avenue Code website
	And I'm in the Careers page
	When I click in '<jobLocation>'
	Then I should see '<openPostionAmount>' open positions

Examples:
	| jobLocation 				| openPostionAmount	|
	| San Francisco Bay Area	| 13				|
	| Belo Horizonte			| 17				|
	| São Paulo					| 17				|
	| Jacksonville, FL			| 1					|
	| New York					| 5					|
	| Pittsburgh				| 1					|