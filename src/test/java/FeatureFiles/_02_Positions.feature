Feature: Positions Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create Positions
      And Click on the element in the left nav
        | humanResources      |
        | humanResourcesSetup |
        | Positions           |

      And Click on the element in the Dialog content
        | addButton|

      And User sending the keys in Dialog content
        | nameInput | batu7 |
        | shortName | gb    |

      And Click on the element in the Dialog content
        | saveButton|

      And Success message should be displayed

      And User sending the keys in Dialog content
        | searchInput | batu7 |

      And Click on the element in the Dialog content
        |editButton|

      And User edit item from Dialog
        | nameInput | batu9 |

      And Click on the element in the Dialog content
        | saveButton|

      And Success message should be displayed

      And User delete item from Dialog
        | batu9 |

      And Success message should be displayed



















