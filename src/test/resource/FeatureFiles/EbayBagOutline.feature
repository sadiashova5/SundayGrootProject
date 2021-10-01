@regression
Feature: Ebay Bag outline

  Scenario Outline: Search Bag with brand
    Given Open Ebay website
    When Search for "<Items>"
    And Filter by "<Brand>"
    Then list of selected "<Brand>" display

    Examples: 
      | Items            |    Brand        |
      | Shoulder Bag     |    CHANEL       |
      | Clutch           |    Gucci        |  
      | Backpack         |    Michael Kors |
 
 
  