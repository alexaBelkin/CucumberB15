@smartBearRegression2
Feature: Testing the account creation and validation from SmartBear

  Scenario: Testing creation order
    Given User provides username and password and cliking login Button and click order button
    When User provides product and quantity for Product Information
      | product  | MyMoney |
      | quantity | 5       |
    And User provides name,street,city,state,zip for Address Information
      | name   | Ahmet   |
      | street | midway  |
      | city   | chicago |
      | state  | il      |
      | zip    | 60018   |
    And User choosing card,Card Nr,expirationDate and click Process button for Payment Info
      | card           | Visa  |
      | Card Nr        | 12234 |
      | expirationDate | 04/28 |


    Then validate message Message
  |New order has|

#    And User goes to View All Order page and validates added product: '<name>', '<product>', '<quantity>','<date>', '<street>', '<city>', '<state>', '<zip>', '<card>','<Card Nr>','<expirationDate>'


#    Examples:
#      | product     | quantity | name | city   | street | zip    | card       | Card Nr | expirationDate | Message       | state | date       |
#      | MyMoney     | 5        | Alan | Austin | 23345  | 600656 | Visa       | 123456  | 03/25          | New order has | IL    | 03/30/2023 |
#