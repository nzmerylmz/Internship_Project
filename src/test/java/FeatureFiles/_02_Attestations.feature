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
      | nameInput | grup1 |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchInput | grup1 |

    And Click on the element in the Dialog content
      |searchButton|

    And Click on the element in the Dialog content
      |editButton|

    And User edit item from Dialog
      | nameInput | grup112 |

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      |grup112|

    And Success message should be displayed












