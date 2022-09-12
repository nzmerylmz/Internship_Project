Feature: Positions Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Positions
    And Click on the element in the left nav
      | setupOne      |
      | parameters    |
      | Nationalities |

    And Click on the element in the Dialog content
      | addButton|

    And User sending the keys in Dialog content
      | nameInput | batu7 |

    And Click on the element in the Dialog content
      | saveButton|

    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchInput | batu7 |

    And Click on the element in the Dialog content
      | searchButton |

    And Click on the element in the Dialog content
      |editButton|

    And User edit item from Dialog
      | nameInput | papatya22 |

    And Click on the element in the Dialog content
      | saveButton|

    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchInput | papatya22 |

    And Click on the element in the Dialog content
      | searchButton |

    And Click on the element in the Dialog content
      | deleteButton |

    And Click on the element in the Dialog content
      | deleteDialogButton |
