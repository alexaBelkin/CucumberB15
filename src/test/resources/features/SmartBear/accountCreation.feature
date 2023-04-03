@smartBearRegression
Feature: Testing the account creation and validation from SmartBear

  Scenario Outline: Testing creation order
    Given User provides username and password and cliking login Button and click order button
    When User provides '<product>' and '<quantity>' for Product Information
    And User provides '<name>','<street>','<city>','<state>','<zip>' for Address Information
    And User choosing '<card>','<Card Nr>', '<expirationDate>' and click Process button for Payment Info
    Then validate message '<Message>'
    And User goes to View All Order page and validates added product: '<name>', '<product>', '<quantity>','<date>', '<street>', '<city>', '<state>', '<zip>', '<card>','<Card Nr>','<expirationDate>'


    Examples:
      | product     | quantity | name | city   | street | zip    | card       | Card Nr | expirationDate | Message       | state | date       |
      | MyMoney     | 5        | Alan | Austin | 23345  | 600656 | Visa       | 123456  | 03/25          | New order has | IL    | 03/30/2023 |
      | FamilyAlbum | 5        | Alan | Austin | 1123   | 600656 | MasterCard | 123456  | 03/25          | New order has | IL    | 03/30/2023 |
      | ScreenSaver | 5        | Alan | Austin | 23232  | 600656 | American Express   | 123456  | 03/25          | New order has | IL    | 03/30/2023 |
