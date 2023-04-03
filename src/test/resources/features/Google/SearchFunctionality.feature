Feature:Testing Google Search Functionality
  #is general description
  Scenario:Happy Path(positive) testing for search
    #is all about test case
  Given User navigate to the Google
    When User searches for CodeFish
    Then User gets more than ten links on the first page

    Scenario: Happy Path testing search result
      Given User navigate to the Google
      When User searches for Kyrgiz Food in USA
      Then User gets result
      Scenario: Happy Path(positive) Testing timeResult from Search
        Given User navigate to the Google
        When User searches for turkish baklava
        Then User gets result less than one second