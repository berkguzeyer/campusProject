Feature:Human Resources

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully


  Scenario: Validate the add button on positions categories page from Human Resources
    Given Navigate to position categories from human resources
    And Click on Add button
    And Enter Name to New Position Category field
      | lucky |
    And Click on save button
    Then Name should be displayed after adding


