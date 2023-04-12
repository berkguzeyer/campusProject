Feature: Discounts under Parameters Setup

#  Coded by Berk G. #

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to discounts under parameters setup

  Scenario: Add Discounts under Human Resources Setup
    And Click on add button
    And Fill new discount form
      | Test123 |
      | Test123 |
      | 125     |
    When Click on save button
    Then Success message should be displayed

  Scenario: Edit Discounts under Human Resources Setup
    And Click on edit button
    When Change the description
    And Click on save button
    Then Success message should be displayed


  Scenario: Delete Discounts under Human Resources Setup
    And Click on delete button
    And Click on delete confirm button
    Then Success message should be displayed