Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Subject Category
    And Click on the element in the Left Nav
      | education         |
      | educationSetup    |
      | subjectCategories |
    And Click on the element in the Dialog
      | addButton |
    And User sends keys in the Dialog Content
      | nameInput | history |
      | codeInput | his101  |
    When Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Update Subject Category
    And Click on the element in the Left Nav
      | education         |
      | educationSetup    |
      | subjectCategories |
    And User sends keys in the Dialog Content
      | searchInput | history |
      | codeInputDialog | his101  |
    And Click on the element in the Dialog
      | searchButton |
    And User initiates edit button
    And Click on the element in the Dialog
      | editButton |
    And User sends keys in the Dialog Content
      | nameInput | geometry |
      | codeInput | geo101   |
    When Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Delete Subject Category
    And Click on the element in the Left Nav
      | education         |
      | educationSetup    |
      | subjectCategories |
    And User sends keys in the Dialog Content
      | searchInput | geometry |
      | codeInputDialog | geo101   |
    And Click on the element in the Dialog
      | searchButton |
    And User initiates delete button
    When Click on the element in the Dialog
      | deleteButton       |
      | deleteDialogButton |
    And Success message should be displayed