Feature: As a User, I want to see all job location in Careers Page

@ignore
Scenario Outline: Succesfully display all job location
	Given I visit Avenue Code website
	When I navigate to Careers page
	Then I should see '<jobLocationAmount>' job locations
	
Examples:
	| jobLocationAmount |
	| 6					|