Feature: Document Types Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create New Document Type, Edit it and Delete it
    And Click on the element in the Left Nav
      | setupOne     |
      | parameters   |
      | documentTypes|

    And Click on the element in the Dialog
      | addButton |

    And User sends keys in the Dialog Content
      | nameInput | group1-tes24 |


    And Click on the element in the Dialog New Document
      | stage           |
      | newDocumentStage|

    And Click on Esc on the keyboard
    And Click on save button
    And Success message should be displayed

    And Edit the new created document type

    And Success edit message should be displayed

    And Send keys to the Name area

    And Click on the element in the Dialog to Delete the Edited document type
      | searchButton       |
      | deleteButton       |
      | deleteDialogButton |

    And Success delete message should be displayed







