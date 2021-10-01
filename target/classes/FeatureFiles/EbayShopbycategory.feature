@regression

Feature: Ebey Shop by category Functionality

  Scenario: Buy a gift cards
    Given Open Ebay website
    Then Click on Shop by category bar
    When Shop by category display
    Then Click on others option
    And  Click on Gift Cards & Coupons 
    Then Click on Gift cards
    When Click brand,value,type,valid locatopns
    And Listed of Gift cards display according to need
  