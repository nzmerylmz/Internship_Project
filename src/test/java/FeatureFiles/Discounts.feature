Feature: Fields Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to discounts page


  Scenario: Create Discounts

    When Create a discounts
    Then succes message should be displayed

  Scenario: Edit Discounts

    When User edit the discounts
    Then succes message should be displayed


  Scenario:  Delete Discounts

    When User delete the discounts
    Then succes message should be displayed