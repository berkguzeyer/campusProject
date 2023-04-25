Feature: Fields under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to grade levels under parameters setup

  Scenario: Add Grade Levels under Parameters Setup
    And Click on Add button
    And Enter name as "Group444", short name as "GP444" and order as "444" and select next grade
    When Click on save button
    Then Success message should be displayed

  Scenario: Edit Grade Levels under Parameters Setup
    And Click on grade level edit button
    And Enter name as "Gr_444", short name as "Gr_444" and order as "72" and select next grade
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete Grade Level under Parameters Setup
    And Click on grade level delete button
    When Click on delete confirm button
    Then Success message should be displayed
