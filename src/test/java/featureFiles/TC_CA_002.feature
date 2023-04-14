Feature: Attestations under Human Resources Setup

#  Coded by Belgin D. #

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to attestations under human resources

  Scenario: Add Attestations under Human Resources Setup
    And Click on add button
    And Enter name in the form
    When Click on save button
    Then Success message should be displayed

  Scenario Outline: Edit Attestations under Human Resources Setup
    When Enter the name as "<Name>" on the search box
    And Click on search button
    And Click on edit button
    And Change the name
    When Click on save button
    Then Success message should be displayed
    Examples:
      | Name  |
      | Emily |

  Scenario Outline: Delete Attestations under Human Resources Setup
    When Enter the name as "<Name>" on the search box
    And Click on search button
    And Click on Delete button
    And Click on delete confirm button
    Then Success message should be displayed
    Examples:
      | Name |
      | Mary |