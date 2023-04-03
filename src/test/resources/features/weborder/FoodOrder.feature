@regression
Feature: WebOrder Page food order functionality


Scenario:Testing the happy path food order for NY HOUSE
  Given User provide 'guest1@microworks.com' and 'Guest1!' for Weborder
  And User validates 'ORDER DETAILS - Weborder' from homepage
  When User clicks Group order Box and Next Button
  And User send the word 'I love Cucumber' for note to the Invitees Section
  And User sends email address which are 'ahmet@gmail.com' and 'mehmet@gmail.com' to the Invite List
  And User chooses the delivery address 'My House' and validates the address '3137 Laguna Street'
  And User clicks the create Group Order Button
  Then User validates the header of page 'View Group Order'
  And User validates the word 'Your group order is now pending'
