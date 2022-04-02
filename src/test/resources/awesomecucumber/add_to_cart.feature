#@featuretag
Feature: Add to cart

  @smoke
    Scenario Outline: smoked
      Given I'm on the Store page
      When I add a "<product_name>" to the Cart
      Then I see 1 "<product_name>" in the Cart

      Examples:
        | product_name |
        | Blue Shoes   |

  Scenario Outline: not smoked
    Given I'm on the Store page
    When I add a "<product_name>" to the Cart
    Then I see 1 "<product_name>" in the Cart

    Examples:
      | product_name |
      | Blue Shoes   |









