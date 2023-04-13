Feature: Subject Categories Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on login Button
    Then User should login successfully
    And Navigate to Education page

  Scenario: Create a new
    Given  Add a new
    Then Success message should be displayed

  Scenario: Edit
    Given Recreate a new
    Then Success message should be displayed

  Scenario: Delete
    Given Delete a name
    Then Success message should be displayed


