@regression

Feature: Ebey Women Functionality
  
  Scenario: Women's dresses
    Given Open Ebay website
    And Click on Fashion bar
    When Fashion page display
    Then Click on Women's Clothing 
    And Shop by Category pop up
    Then Click on Dresses
    When Select Brand,Size,Dress Length,Color
    Then Listed of dresses display according to need
  