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

  Scenario Outline: Сheck products by brand filter
    Given User opens '<homePage>' page
    And User clicks on fashion category button
    And User clicks on category womens shoes in fashion button
    When User clicks on michael kors checkbox
    Then User checks all elements in the list contains '<brand>'

    Examples:
      | homePage              | brand        |
      | https://www.ebay.com/ | michael kors |


  Scenario Outline: Сheck search input for correct working
    Given User opens '<homePage>' page
    When User enter '<searchText>' into search field
    And User clicks on search button
    Then User checks url contains '<searchText>'
    And User checks all elements in the list on home page contains '<searchText>'

    Examples:
      | homePage              | searchText |
      | https://www.ebay.com/ | sofa       |