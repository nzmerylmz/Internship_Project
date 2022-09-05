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
       |nameInput| grup1|
       |codeInput| 77|

      And Click on the element in the left Nav
       |Section|
       |departmentConstants|

      And Click on the element in the Dialog content
        |saveButton|

      And Success message should be displayed

      And Click on the element in the Dialog content
       |searchButton|

      And Click on the element in the Dialog content
       |editButton|

      And User edit item from Dialog
        |nameInput| grup101|
        |codeInput| 99|

      And Click on the element in the left Nav
        |Section|
        |departmentConstants|

      And Click on the element in the Dialog content
         |saveButton|

      And Success message should be displayed

      And Click on the element in the Dialog content
        |searchButton|

      And Click on the element in the Dialog content
        |deleteButton|

      And Click on the element in the Dialog content
        |deleteDialogButton|