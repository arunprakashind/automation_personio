Feature: Onboarding

  @id=onboarding1
  Scenario: As a user I can create a template with some steps for on boarding an employee
    When I login to application using username arun.prakash.ind@gmail.com and password Personio@123
    Then Home page is loaded

    When I click on Configurations link in home page
    Then Settings page is loaded

    When I click on On/Offboarding link in settings page
    Then Onboarding page is displayed
    When I click on Onboarding Steps link
    Then Onboarding Steps page is loaded

    When I enter New Step 123 in the step name field and click on Add Step button
    And I click on Add item link
    Then Add item to Steps dialog is opened
    When I select the item Text information in the Item type dropdown
    And I click on Create button
    Then Text area item for step New Step 123 is present at index 0

    When I click on Add item link
    Then Add item to Steps dialog is opened
    When I select the item Checkbox in the Item type dropdown
    And I click on Create button
    Then Checkbox item for step New Step 123 is present at index 0
    And I click on Save Changes button for step New Step 123

    When I click on Onboarding Templates link
    Then Onboarding Templates page is loaded
    When I enter Template 123 in the Template Name field and click on Add Template button
    And I click on Add Step button in Onboarding templates page for template Template 123
    Then Add Template dialog is opened
    
    When I select the item New Step 123 in the Step list
    And I select the item Employee in the Responsible list
    And I select the deadline as 5 days after hire
    And I click Create button on Add steps to template page
    Then steps table for the template Template 123 is visible