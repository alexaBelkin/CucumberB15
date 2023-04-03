@regression2 @scenariooutline
  Feature: Testing the Search Functionality for Etsy Scenario Outline
    Scenario Outline: Testing different Data for search function
      When User searchs for '<item>' for Etsy WebPage
      Then User validates the title '<title>' from Etsy

      Examples:
      |item| title|
      |Hat |Hat - Etsy|
      |Key |Key - Etsy|
      |Pin |Pin - Etsy|
