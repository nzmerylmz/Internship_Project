Feature: Positions Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create Positions
      And Click on the element in the Left Nav
        | humanResources      |
        | humanResourcesSetup |
        | Positions           |

      And Click on the element in the Dialog
        | addButton|

      And User sends keys in the Dialog Content
        | nameInput | batu7 |
        | shortName2 | gb    |

      And Click on the element in the Dialog
        | saveButton|

      And Success message should be displayed

      And User sends keys in the Dialog Content
        | searchInput | batu7 |

      And Click on the element in the Dialog
        |editButton|

      And User sends keys in the Dialog Content
        | nameInput | batu9 |

      And Click on the element in the Dialog
        | saveButton|

      And Success message should be displayed

      And User initiates to send keys to the Dialog Content
      And User sends keys in the Dialog Content
        | searchInput | batu9 |

      And Click on the element in the Dialog
        | searchButton |

      And User initiates delete button

      And Click on the element in the Dialog
        | deleteButton       |
        | deleteDialogButton |

      And Success message should be displayed



















