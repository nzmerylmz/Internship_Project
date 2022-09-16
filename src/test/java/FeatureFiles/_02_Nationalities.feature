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
      | nameInput | uyu |

    And Click on the element in the Dialog content
      | saveButton|

    And User sending the keys in Dialog content
      | searchInput | uyu |

    And Click on the element in the Dialog content
      | searchButton |

    And Click on the element in the Dialog content
      |editButton|

    And User sending the keys in Dialog content
      | nameInput | kalk |

    And Click on the element in the Dialog content
      | saveButton|

    And Success message should be displayed

    And User delete item from Dialog
      | kalk |

    And Success message should be displayed