Feature: Add-Edit-Delete Document Types under Parameters Setup

  #  Coded by Busra V. #

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to document types under parameters setup
  @Regression
  Scenario: Add Document Types under Parameters Setup
    And Click on add button
    And Add name and stage
    When Click on save button
    Then Success message should be displayed
  @Regression
  Scenario: Edit Document Types under Parameters Setup
    When Enter the name on the name text box to search
    And Click on search button
    And Click on edit button
    And Change the name and stage on edit document page
    And Click on save button
    Then Success message should be displayed
  @Regression
  Scenario: Delete Document Types under Parameters Setup
    When Enter the name on the name text box to search for delete
    And Click on search button
    And Click on delete button
    And Click on delete confirm button
    Then Success message should be displayed