Feature: Fields under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to fields under parameters setup

  Scenario: Add Fields under Parameters Setup
    And Click on Add button
    And Enter name "Jack Nicholson" and code "JN"
    When Click on save button
    Then Success message should be displayed

  Scenario: Edit Fields under Parameters Setup
    When Enter the name as "Jack Nicholson" on the search box
    And Enter the code as "JN" on the search box
    And Click on search button
    And Click on field edit button
    And Enter name "David Nicholson" and code "DN"
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete Fields under Parameters Setup
    When Enter the name as "David Nicholson" on the search box
    And Enter the code as "DN" on the search box
    And Click on search button
    And Click on field delete button
    When Click on delete confirm button
    Then Success message should be displayed
