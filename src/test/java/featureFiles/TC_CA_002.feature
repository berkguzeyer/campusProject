Feature: Positions under Human Resources Setup

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
    Then First name on the list should match with the credentials

  Scenario: Edit Attestations under Human Resources Setup
    And Click on edit button
    And Change the name
    When Click on save button
    Then First name on the list should be changed with new credentials

  Scenario: Delete Attestations under Human Resources Setup
    And Click on Delete button
    And Click on delete confirm button
    Then First name of the list should not be the same