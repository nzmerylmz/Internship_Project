Feature: Fields Functionality

Background:
  Given Navigate to basqar
  When Enter username and password and click login button
  Then User should login successfully
  And Navigate to fields page


  Scenario: Create Fields

    When Create a field
    Then succes message should be displayed

Scenario: Edit Fields

    When User edit the fields
  Then succes message should be displayed


Scenario:  Delete Fields

  When User delete the fields
  Then succes message should be displayed