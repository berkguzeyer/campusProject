Feature:Human Resources

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  @Regression
  Scenario: Validate the add button on positions categories page from Human Resources
    Given Navigate to position categories from human resources
    And Click on Add button
    And Enter Name to New Position Category field
      | lucky |
    And Click on save button
    Then Success message should be displayed
  @Regression
  Scenario: Validate the edit button on positions categories page from Human Resources
    Given Navigate to position categories from human resources
    And Click on edit button
    And Change the name with new one
    And Click on save button
    Then Success message should be displayed

  @Regression
Scenario: Validate the delete button on positions categories page from Human Resources
Given Navigate to position categories from human resources
  And Click on delete button
  And Click on delete confirm button
  Then Success message should be displayed

