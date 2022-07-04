Feature: Add product in my jurnal

  @Test2
  Scenario:
    Given I already logged in
    When I click product menu
    Then Product page appear
    When I click action
    Then The action option appear
    And I click new product
    Then Create new product page appear
    And I fill name "RPP"
    And I choose pcs for unit
    And I choose single for product type
    Then I choose i buy this item on price setting
    And I choose i sell this item on price setting
    And I click create product
    Then Product with name "RPP" is created


