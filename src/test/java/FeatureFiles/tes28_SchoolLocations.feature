Feature: School Locations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create New School Location, Edit it and Delete it
    And Click on the element in the Left Nav
      | setupOne   |
      | schoolSetup|
      | locations  |

    And Click on the element in the Dialog
      | addButton |

    And User sends keys in the Dialog Content
      | nameInput           | group1-tes28 |
      | shortNameInLocation | group1       |
      | capacity            | 100          |


    And Click on the element in the Dialog New Document
      | stage     |
      | laboratory|

    And Click on save button

    And Success message should be displayed

    And Edit the new created school locations

    And Success edit message should be displayed

    And Click on the element in the Dialog to Delete the Edited School Location
      | deleteButtonInLocation|
      | deleteDialogButton    |

    And Success delete message should be displayed