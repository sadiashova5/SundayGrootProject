@regression
Feature: Ebay Search Shoes Functionality

  Scenario: Search for Shoes
    Given Open Ebay Homepage
    When Search for Shoes
    Then Item list should have only Shoes related products