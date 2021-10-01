@regression
Feature: Ebay Toys outline

  Scenario Outline: Search kids Toys with brand
    Given Open Ebay website
    When Search for "<Items>"
    And Filter by "<Brand>"
    Then list of selected "<Brand>" display

    Examples: 
      | Items          |      Brand         |
      | Batman         |      Mattel        |
      | Barbie         |      Disney        |  
      | Toy Story      |      Fisher-Price  |
