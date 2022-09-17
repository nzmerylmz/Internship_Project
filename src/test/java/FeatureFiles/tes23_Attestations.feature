Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Attestations
    And Click on the element in the Left Nav
    |humanResources|
    |humanResourcesSetup|
    |Attestations|

    And Click on the element in the Dialog
      | addButton |

    And User sends keys in the Dialog Content
      | nameInput | grup1 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User sends keys in the Dialog Content
      | searchInput | grup1 |

    And Click on the element in the Dialog
      |searchButton|

    And User initiates edit button
    And Click on the element in the Dialog
      |editButton|

    And User sends keys in the Dialog Content
      | nameInput | grup112 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User initiates delete button

    And Click on the element in the Dialog
      | deleteButton       |
      | deleteDialogButton |
    And Success message should be displayed












