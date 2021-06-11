Feature: product
  As a User I want to check user will be able manipulate with products
  Filter products, add to cart

  Scenario Outline: Check amount products added to the cart
    Given User opens '<homePage>' page
    And User clicks on fashion category button
    And User clicks on category womens shoes in fashion button
    And User clicks on first item in womens shoes category
    When User clicks on add to cart
    Then User checks '<amount>' on cart icon

    Examples:
      | homePage              | amount |
      | https://www.ebay.com/ | 1      |

  Scenario Outline: Сheck products by brand filter
    Given User opens '<homePage>' page
    And User clicks on fashion category button
    And User clicks on category womens shoes in fashion button
    When User clicks on michael kors checkbox
    Then User checks all elements in the list contains '<brand>'

    Examples:
      | homePage              | brand |
      | https://www.ebay.com/ | nike  |
