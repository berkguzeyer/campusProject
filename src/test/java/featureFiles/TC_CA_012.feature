Feature: Nationalities under Parameters Setup Functionality.

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And Navigate to nationalities page

  Scenario: Add Nationalities under Parameters Setup
    Given  Add a new name
    Then Success message should be displayed

  Scenario: Edit Nationalities under Parameters Setup
    Given Recreate a new edit name
    Then Success message should be displayed

  Scenario: Delete Nationalities under Parameters Setup
    Given Delete existing name
    Then Success message should be displayed