Feature: Positions under Human Resources Setup

#  Coded by Berk G. #

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to positions under human resources

  Scenario: Add Positions under Human Resources Setup
    And Click on add button
    And Fill the form
    When Click on save button
    Then First position on the list should match with the credentials


  Scenario: Edit Positions under Human Resources Setup
    And Click on edit button
    When Change the credentials
    And Click on save button
    Then First position on the list should be changed with new credentials


  Scenario: Delete Positions under Human Resources Setup
    And Click on delete button
    And Click on delete confirm button
    Then First position on the list should be changed