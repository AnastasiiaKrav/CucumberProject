Feature: Sign in and register pages feature
  As a user
  I want to test sign in and register pages, positive and negative tests
  So that I can be sure the user will be able successfully sign in or register into the site

  Scenario Outline: Check Sign In page for main functions
    Given User opens '<signInPage>' page
    When User checks sign in window is open
    Then User checks field to enter email or username visibility
    And User checks continue button visibility
    And User checks link for register visibility
    And User checks facebook sign in button visibility
    And User checks google sign in button visibility
    And User checks apple sign in button visibility

    Examples:
      | signInPage                               |
      | https://signin.ebay.com/ws/eBayISAPI.dll |

  Scenario Outline: Check Error massage on sign in page when email or username are not correct
    Given User opens '<signInPage>' page
    When User clicks on continue button
    Then User checks error message visibility

    Examples:
      | signInPage                               |
      | https://signin.ebay.com/ws/eBayISAPI.dll |

  Scenario Outline: Check Register page for main functions
    Given User opens '<registerPage>' page for Register
    And User clicks on register button
    And User checks register page visibility
    And User checks personal account radio button is checked
    And User checks sign in button on register page visibility
    And User checks input field for first name visibility
    And User checks input field for last name visibility
    And User checks input field for email visibility
    And User checks input field for password name visibility
    And User checks countinue with Google button visibility
    And User checks countinue with Facebook button visibility
    And User checks countinue with Apple button visibility
    When User clicks on business account un checked radio button
    Then User checks business account radio button checked visibility
    And User checks input field for business name visibility
    And User checks input field for business email visibility
    And User checks input field for business password visibility
#    And User clicks on selector for business country
    And User clicks on country from selector list
    And User checks '<countryName>' on selector


    Examples:
      | registerPage          | countryName |
      | https://www.ebay.com/ | Ukraine     |

