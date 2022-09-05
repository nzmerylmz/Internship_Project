Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Attestations
    And Click on the element in the left Nav
    |humanResources|
    |humanResourcesSetup|
    |Attestations|

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | grup90 |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchInput | grup90 |

    And Click on the element in the Dialog content
      |editButton|

    And User edit item from Dialog
      | nameInput | grup779 |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchInput | grup779 |

    And Click on the element in the Dialog content
       |deleteButton|

    And Click on the element in the Dialog content
      |deleteDialogButton|

    And Success message should be displayed












