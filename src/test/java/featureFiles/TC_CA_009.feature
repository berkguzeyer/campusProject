Feature: Add-Edit-Delete Bank Accounts under Parameters Setup

  #  Coded by Busra V. #

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to bank accounts under parameters setup

  Scenario: Add Bank Accounts under Parameters Setup
    And Click on add button
    And Add name as "Zack", IBAN "859469363986", currency and integration code "84"
    When Click on save button
    Then Success message should be displayed

  Scenario: Add Bank Accounts under Parameters Setup Negative Test Case
    And Click on add button
    And Add the same name as "Zack", IBAN "859469363986", currency and integration code "84"
    When Click on save button
    Then Unsuccessful message as "already exists" should be displayed

  Scenario: Edit Bank Accounts under Parameters Setup
    When Enter the "Zack" on the name text box to search
    And Click on search button
    When Click on edit button
    And Change the name as "Jack", IBAN "859469146286", currency and integration code "67" on edit bank account
    And Click on save button
    Then Success message should be displayed

  Scenario: Delete Document Types under Parameters Setup
    When Enter the "Jack" on the name text box to search for delete
    And Click on search button
    And Click on delete button
    And Click on delete confirm button
    Then Success message should be displayed