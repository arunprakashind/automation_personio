@feature-onboarding
Feature: Onboarding

  Background:

    Given I login to application using username arun.prakash.ind@gmail.com and password Personio@123
    Then Home page is loaded

  @id=onboarding1
  Scenario: As a user I can create a template with some steps for on boarding an employee

    When I click on Configurations link in home page
    Then Settings page is loaded

    When I click on On/Offboarding link in settings page
    Then Onboarding page is loaded
    When I select Onboarding Steps tab on Onboarding page
    Then Onboarding Steps page is loaded

    When I enter New Step 1 in the step name field and click on Add Step button
    And I click on Add item link
    Then Add item to Steps dialog is opened
    When I select the item Text information in the Item type list item
    And I click on Create button on Add item to Steps Page
    Then Text area item of index 0 for step New Step 1 is visible

    When I click on Add item link
    Then Add item to Steps dialog is opened
    When I select the item Checkbox in the Item type list item
    And I click on Create button on Add item to Steps Page
    Then Checkbox item of index 0 for step New Step 1 is visible

    When I set the Text area item of index 0 for step New Step 1 with value This is a test
    Then the Text area item of index 0 for step New Step 1 has value This is a test
    And I click on Save Changes button for step New Step 1

    When I select Onboarding Templates tab on Onboarding page
    Then Onboarding Templates page is loaded
    When I enter Template 1 in the Template Name field and click on Add Template button
    And I click on Add Step button in Onboarding templates page for template Template 1
    Then Add Template dialog is opened

    When I select the item New Step 1 in the Step list
    And I select the item Employee in the Responsible list
    And I select the deadline as 5 days after hire
    And I click Create button on Add steps to template page
    Then steps table for the template Template 1 is visible
    When I click the Save Changes button for template Template 1
    Then the item at row 1 and column 2 of template Template 1 has text New Step 1
    And the select item at row 1 and column 3 of template Template 1 has value Employee selected
    And the text field at row 1 and column 4 of template Template 1 has value 5
    And the select item at row 1 and column 4 of template Template 1 has value after hire selected

    When I click on Employees link in home page
    Then Employees page is loaded
    When I click the employee link Arun in Employees table
    Then Employee Details page is loaded
    When I click the tab Onboarding in Employee details page
    Then the link Template 1 is present in the employee details tab

  @id=onboarding2
  Scenario: As a user I can delete the template and the steps created

    When I click on Configurations link in home page
    Then Settings page is loaded

    When I click on On/Offboarding link in settings page
    Then Onboarding page is loaded
    And the template Template 1 is present in the templates list
    When I click on the template link Template 1 in the templates list
    Then the item at row 1 and column 2 of template Template 1 has text New Step 1
    And the select item at row 1 and column 3 of template Template 1 has value Employee selected
    And the text field at row 1 and column 4 of template Template 1 has value 5
    And the select item at row 1 and column 4 of template Template 1 has value after hire selected

    When I delete the template Template 1
    Then delete template confirmation dialog Are you sure that you want to delete this template? is shown
    When I click on Delete button in the confirmation dialog for Delete template
    Then the template Template 1 is not present in the templates list

    When I select Onboarding Steps tab on Onboarding page
    Then Onboarding Steps page is loaded
    And the step New Step 1 is present in the steps list
    When I click on the step link New Step 1 in the steps list
    Then Text area item of index 0 for step New Step 1 is visible
    And the Text area item of index 0 for step New Step 1 has value This is a test
    And Checkbox item of index 0 for step New Step 1 is visible
    
    When I delete the step New Step 1
    Then delete step confirmation dialog Are you sure that you want to delete this step? is shown
    When I click on Delete button in the confirmation dialog for Delete step
    Then the step New Step 1 is not present in the steps list

    When I click on Employees link in home page
    Then Employees page is loaded
    When I click the employee link Arun in Employees table
    Then Employee Details page is loaded
    When I click the tab Onboarding in Employee details page
    Then the link Template 1 is not present in the employee details tab