Feature: Testing Google Search Func
  Background: navigation to the website
    Given User navigates to the 'https://www.google.com/'

  Scenario: Happy Path(positive) Testing Search
   // Given User navigates to the 'https://www.google.com/'
    When User searches for 'codefish'
    Then User gets more then 10 links
    Scenario: Happy Positie result Search
     // Given User navigates to the 'https://www.google.com/'
      When User searches for 'Kyrgiz food Usa'
      Then User gets result 181000000