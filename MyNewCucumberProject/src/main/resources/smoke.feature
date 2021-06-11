Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check site main elements visibility
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks sign in button visibility
    And User checks register button visibility
    And User checks shop by category button visibility
    And User checks categories navigation container visibility
    And User checks upper carousel visibility
    And User checks upper popular categories list visibility
    And User checks below carousel visibility
    And User checks below popular categories list visibility
    When User clicks shop by category button
    And User checks shop by category popup visibility
    Then User clicks to close shop by category button

    Examples:
      | homePage              |
      | https://www.ebay.com/ |


  Scenario Outline: Сheck search input for correct working
    Given User opens '<homePage>' page
    When User enter '<searchText>' into search field
    And User clicks on search button
    Then User checks url contains '<searchText>'
    And User checks all elements in the list on home page contains '<searchText>'

    Examples:
      | homePage              | searchText |
      | https://www.ebay.com/ | sofa       |


  Scenario Outline: Check shopping cart page for main elements visibility
    Given User opens '<homePage>' page
    When User enter '<itemNumber>' into search field
    And User clicks on search button
    And User clicks on item after search by its number
    When User clicks on add to cart
    Then User checks page url contains 'cart'
    And  User checks go to checkout button visibility
#    And User checks pay only this seller button visibility
    And User checks remove item visibility
    And User checks total amount table visibility
    And User checks page alerts visibility



    Examples:
      | homePage              | itemNumber   |
      | https://www.ebay.com/ | 294073463432 |