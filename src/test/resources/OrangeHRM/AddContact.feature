Feature: add contact in my jurnal
@Test
  Scenario: Success create contact
    Given I already logged in
    When I click contact menu
    Then Contact page appear
    When I click new contact
    Then Create new contact page appear
    When i fill name with "ericha"
    And I choose contact type as customer
    And I choose SIM for identity
    And I click add button
    Then Contact with name "ericha" is created


