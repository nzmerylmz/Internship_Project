Feature: Positions Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Positions
    And Click on the element in the Left Nav
      | setupOne      |
      | parameters    |
      | Nationalities |

    And Click on the element in the Dialog
      | addButton|

    And User sends keys in the Dialog Content
      | nameInput | uyu |

    And Click on the element in the Dialog
      | saveButton|

    And User sends keys in the Dialog Content
      | searchInput | uyu |

    And Click on the element in the Dialog
      | searchButton |

    And User initiates edit button
    And Click on the element in the Dialog
      |editButton|

    And User sends keys in the Dialog Content
      | nameInput | kalk |

    And Click on the element in the Dialog
      | saveButton|

    And Success message should be displayed

    And User initiates to send keys to the Dialog Content
    And User sends keys in the Dialog Content
      | searchInput | kalk |

    And Click on the element in the Dialog
      | searchButton |

    And User initiates delete button

    And Click on the element in the Dialog
      | deleteButton       |
      | deleteDialogButton |

    And Success message should be displayed