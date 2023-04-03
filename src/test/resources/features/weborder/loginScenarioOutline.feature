
  Feature: Testing Login functionality og login page
    Scenario Outline:  Testing Negative Login(validation message)
      When User provide '<username>' and '<password>!' for Weborder
      Then User validates 'Sign in Failed' error message


      Examples:
      |username                 |password     |
      |guest1@microworks.com    |  1234!      |
      |ahmet@microworks.com     |Guest1!      |
      |                         |             |
