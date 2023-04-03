@regression
Feature: Testing the search functionality of Etsy
  Scenario:Validation title of Etsy Hat
    When User searchs for 'Hat' for Etsy WebPage
    Then User validates the title 'Hat - Etsy' from Etsy

  Scenario:Validation title of Etsy Hat
    When User searchs for 'key' for Etsy WebPage
    Then User validates the title 'Key - Etsy' from Etsy

  Scenario:Validation title of Etsy Hat
    When User searchs for 'pin' for Etsy WebPage
    Then User validates the title 'Pin - Etsy' from Etsy



