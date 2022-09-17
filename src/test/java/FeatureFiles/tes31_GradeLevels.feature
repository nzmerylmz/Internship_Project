Feature: Grade Levels

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Grade Level
    And Click on the element in the Left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |
    And Click on the element in the Dialog
      | addButton |
    And User sends keys in the Dialog Content
      | nameInput | junior |
      | shortName | jun    |
      | order     | 13     |
    When Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Update Grade Level
    And Click on the element in the Left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |
    And User finds and edits grade level
    And User sends keys in the Dialog Content
      | nameInput | senior |
      | shortName | sen    |
      | order     | 23     |
    When Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete Grade Level
    And Click on the element in the Left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |
    When User finds and deletes grade level
    Then Success message should be displayed