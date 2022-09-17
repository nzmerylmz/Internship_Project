Feature: Position Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Position

    And Click on the element in the left Nav
      | setupOne      |

      | parameters |

      | bankAccounts  |

    And Click on the element in the Dialog
      | addButton |


    And User sending the keys in Dialog content
      | nameInput | sanfrancisco |
      | iban | TR1234567891234567 |

    And Click on the element in the Form Content
      |   currency|
      |   currencyTry|

    And User sending the keys in Dialog content
      | integrationCode2 | 12345 |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    #edit------------------------
    And User sending the keys and edit in Dialog content
      | nameInput | sanfrancisco |

    And User edit and save in Dialog content
      | nameInput | california |
      | iban | TR1234567891234567 |
      | integrationCode2 | 12345 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete a Position

    And Click on the element in the left Nav
      | setupOne      |

      | parameters |

      | bankAccounts  |

    And User delete item from Dialog
      | nameInput | california |


    Then Success message should be displayed


