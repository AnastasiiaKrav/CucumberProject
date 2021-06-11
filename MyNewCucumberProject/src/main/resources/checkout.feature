Feature: checkout page functionality
  As a user
  I want to test checkout page, positive and negative tests
  So that I can be sure the user will be able pass all steps payment options
  If needed will see error messages to enter correct data

  Scenario Outline: Check payment options on chechout page
    Given User opens '<homePage>' page
    And User clicks on fashion category button
    And User clicks on category womens shoes in fashion button
    And User clicks on first item in womens shoes category
    And User clicks on buy it now button
    And User checks buy it now popup visibility
    When User clicks on check out as a guest button
    And User enters '<firstName>' into firstName input
    And User enters '<lastName>' into lastName input
    And User enters '<streetAddress>' into streetAddress input
    And User enters '<city>' into city input
    And User enters '<email>' into email input
    And User enters '<confirmEmail>' into confirmEmail input
    And User enters '<phoneNumber>' into phoneNumber input
    And User clicks on address submit button
    Then User clicks on add new card radio button
    And User checks credit card details form visibility
    And User clicks on paypal radio button
    And User closes new opened paypal window


    Examples:
      | homePage              | firstName | lastName | streetAddress | city    | email             | confirmEmail      | phoneNumber |
      | https://www.ebay.com/ | John      | Doe      | Unknown       | Unknown | johndoe@gmail.com | johndoe@gmail.com | 661234567   |


  Scenario Outline: Сheck checkout page for error messages
    Given User opens '<homePage>' page
    And User clicks on fashion category button
    And User clicks on category womens shoes in fashion button
    And User clicks on first item in womens shoes category
    And User clicks on buy it now button
    And User checks buy it now popup visibility
    When User clicks on check out as a guest button
    And User clicks on confirm and pay button
    And User checks error message near button visibility
    And User checks error message near address form visibility
    And User enters '<email>' into email input
    And User clicks on address submit button
    And User checks error email visibility
    And User clicks on address submit button
    Then User checks error first name visibility
    And User checks error last name visibility
    And User checks error address visibility
    And User checks error city visibility
    And User checks error confirm email visibility

    Examples:
      | homePage              | email |
      | https://www.ebay.com/ | hello |