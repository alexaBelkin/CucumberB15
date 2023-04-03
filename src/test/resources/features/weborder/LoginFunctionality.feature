@regression
Feature: Testing Login functionality og login page
  @smoke
  Scenario: Testing positive login(correct username +correct password)
    When User provide 'guest1@microworks.com' and 'Guest1!' for Weborder
    Then User validates 'ORDER DETAILS - Weborder' from homepage

    Scenario: Testing negative login(correct username +wrong password)
      When User provide 'guest1@microworks.com' and '1234!' for Weborder
      Then User validates 'Sign in Failed' error message
@kingArtur @alexa
      Scenario:Testing negative login(wrong username +correct password)
        When User provide 'ahmet@microworks.com' and 'Guest1!' for Weborder
        Then User validates 'Sign in Failed' error message
@smoke @cucumber
    Scenario:Testing negative login(empty +empty password)
        When User provide '' and '' for Weborder
        Then User validates 'Sign in Failed' error message