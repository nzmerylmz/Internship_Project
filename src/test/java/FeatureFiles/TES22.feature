Feature: Position Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Position

    And Click on the element in the left Nav
      | humanResources      |

      | humanResourcesSetup |

      | positionCategories  |

    And Click on the element in the Dialog
      | addButton |


    And User sending the keys in Dialog content
      | nameInput | sanfrancisco |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

#edit------------------------------------------------

    And User sending the keys and edit in Dialog content
      | nameInput | sanfrancisco |
    And User edit and save in Dialog content
      | nameInput | california |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed


  Scenario: Delete a Position

    And Click on the element in the left Nav
      | humanResources      |

      | humanResourcesSetup |

      | positionCategories  |

    And User delete item from Dialog
      | nameInput | california |


    Then Success message should be displayed




