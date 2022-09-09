Feature: Departments Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create Departments
      And Click on the element in the left Nav
       |setupOne|
       |schoolSetup|
       |Departments|

      And Click on the element in the Dialog content
       |addButton|

      And User sending the keys in the Dialog content
       |nameInput| Baris|
       |codeInput| 77|

      And Click on the element in the left Nav
       |Section|
       |departmentConstants|

      And Click on the element in the Dialog content
        |saveButton|

      And Success message should be displayed

      And User edit item from Dialog
        |editButton2|

      And User sending the keys in the Dialog content
        |nameInput| Baris77|

      And Click on the element in the Dialog content
        |saveButton|

      And User delete item from Dialog
        |deleteButton2|

      And Click on the element in the Dialog content
        |deleteDialogButton|

      And Success message should be displayed
