Feature: Subject Categories Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And Navigate to Education page
  @Regression
  Scenario: Create a new
    Given  Add a new
    Then Success message should be displayed
  @Regression
  Scenario: Edit
    Given Recreate a new
    Then Success message should be displayed
  @Regression
  Scenario: Delete
    Given Delete a name
    Then Success message should be displayed


