Feature: Departments under School Setup

#  Coded by Belgin D. #

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to Departments under School Setup
  @Regression
  Scenario Outline: Add Departments under School Setup
    And Click on add button
    And Enter name as "<Name>" and code as "<Code>"
    When Click on save button
    Then Success message should be displayed
    Examples:
      | Name | Code |
      | Math | 202  |
  @Regression
  Scenario Outline: Edit Departments under School Setup
    And Click on edit button
    And Enter name as "<Name>" and code as "<Code>"
    When Click on save button
    Then Success message should be displayed
    Examples:
      | Name | Code |
      | Sci  | 201  |
  @Regression
  Scenario: Delete Departments under School Setup
    And Click on delete button
    When Click on delete confirm button
    Then Success message should be displayed

