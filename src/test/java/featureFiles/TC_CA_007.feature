Feature:School Locations

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    Given Click on setup button
    When Click on school Setup button
    And Click on locations button

  Scenario: Validate the add button on School Locations
    And Click on Add button
    And Enter Name and short name
      | New York |
      | NY       |
    And Select classroom
    And Enter a number for capacity
      | 10 |
    Then Click on save button
    Then Success message should be displayed

  Scenario:Validate the edit button on School Locations
    And Click on edit button
    And Change the name with new location
    And Click on save button
    Then Success message should be displayed

  Scenario: Validate the delete button on School Locations
    And Click on delete button
    And Click on delete confirm button
    Then Success message should be displayed
