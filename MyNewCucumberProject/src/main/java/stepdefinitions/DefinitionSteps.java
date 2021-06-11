package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Locale;
import manager.PageFactoryManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import pages.RegisterPage;
import pages.SignInPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

	private static final long DEFAULT_TIMEOUT = 60;
	WebDriver driver;
	HomePage homePage;
	SignInPage signInPage;
	ProductPage productPage;
	PageFactoryManager pageFactoryManager;
	CheckoutPage checkoutPage;
	RegisterPage registerPage;


	@Before
	public void testsSetUp() {
		chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pageFactoryManager = new PageFactoryManager(driver);

	}

	@And("User opens {string} page")
	public void openHomePage(final String url) {
		homePage = pageFactoryManager.getHomePage();
		homePage.openHomePage(url);
	}


	@And("User checks header visibility")
	public void checkHeaderVisibility() {
		homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
		homePage.isHeaderVisible();
	}

	@And("User checks search field visibility")
	public void checkSearchVisibility() {
		homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		homePage.isSearchFieldVisible();
	}

	@And("User checks footer visibility")
	public void checkFooterVisibility() {
		homePage.isFooterVisible();
	}

	@And("User checks cart visibility")
	public void checkCartVisibility() {
		homePage.isCartIconVisible();
	}

	@And("User checks sign in button visibility")
	public void checkSignInButtonVisibility() {
		homePage.isSignInButtonVisible();
	}

	@And("User checks register button visibility")
	public void checkRegisterButtonVisibility() {
		homePage.isRegisterButtonVisible();
	}

	@And("User checks shop by category button visibility")
	public void checkShopByCategoryButtonVisibility() {
		homePage.isShopByCategoryButtonVisible();
	}

	@And("User checks categories navigation container visibility")
	public void checkCategoriesNavigationContainerVisibility() {
		homePage.isCategoriesNavigationContainerVisible();
	}

	@And("User checks upper carousel visibility")
	public void checkUpperCarouselVisibility() {
		homePage.isUpperCarouselVisible();
	}

	@And("User checks upper popular categories list visibility")
	public void checkUpperPopularCategoriesListVisibility() {
		homePage.isUpperPopularCategoriesListVisible();
	}

	@And("User checks below carousel visibility")
	public void checkBelowCarouselVisibility() {
		homePage.isBelowCarouselVisible();
	}

	@And("User checks below popular categories list visibility")
	public void checkBelowPopularCategoriesListVisibility() {
		homePage.isBelowPopularCategoriesListVisible();
	}


	@When("User clicks shop by category button")
	public void clickShopByCategoryButton() {
		homePage.clickShopByCategoryButton();
	}

	@And("User checks shop by category popup visibility")
	public void checkShopByCategoryPopupVisibility() {
		homePage.isShopByCategoryPopupVisible();
	}

	@And("User clicks to close shop by category button")
	public void clickToCloseShopByCategoryButton() {
		homePage.clickToCloseShopByCategoryButton();
	}

	@And("User clicks sign in button")
	public void clickSignInButton() {
		homePage.clickSignInButton();
	}

	@And("User checks sign in window is open")
	public void checkSignInWindowIsOpen() {
		signInPage = pageFactoryManager.getSignInPage();
		signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		assertTrue(signInPage.signInWindowIsOpen());
	}

	@And("User checks field to enter email or username visibility")
	public void checkFieldToEnterEmailOrUsernameVisibility() {
		signInPage.isFieldToEnterEmailOrUsernameVisible();
	}

	@And("User checks continue button visibility")
	public void checkContinueButtonVisibility() {
		signInPage.isContinueButtonVisible();
	}

	@And("User checks link for register visibility")
	public void checkLinkForRegisterVisibility() {
		signInPage.isLinkForRegisterVisible();
	}

	@And("User checks facebook sign in button visibility")
	public void checkFacebookSignInButtonVisibility() {
		signInPage.isFacebookSignInButtonVisible();
	}

	@And("User checks google sign in button visibility")
	public void checkGoogleSignInButtonVisibility() {
		signInPage.isGoogleSignInButtonVisible();
	}

	@And("User checks apple sign in button visibility")
	public void checkAppleSignInButtonVisibility() {
		signInPage.isAppleSignInButtonVisible();
	}

	@When("User clicks on continue button")
	public void clickOnContinueButton() {
		signInPage = pageFactoryManager.getSignInPage();
		signInPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, signInPage.getContinueButton());
		signInPage.clickOnContinueButton();
	}

	@Then("User checks error message visibility")
	public void checkErrorMessageVisibility() {
		signInPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, signInPage.getErrorMessage());
		signInPage.isErrorMessageVisible();
	}

	@Given("User opens {string} page for Register")
	public void opensHomePagePageForRegister(final String url) {
		pageFactoryManager = new PageFactoryManager(driver);
		registerPage = pageFactoryManager.getRegisterPage();
		registerPage.openRegisterPage(url);
	}

	@And("User clicks on register button")
	public void userClicksOnRegisterButton() {
		registerPage.clickOnRegisterButton();
	}

	@And("User checks register page visibility")
	public void userChecksRegisterPageVisibility() {
		registerPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		assertTrue(registerPage.registerWindowIsOpen());
	}


	@And("User checks personal account radio button is checked")
	public void checkPersonalAccountRadioButtonIsChecked() {
		registerPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		//registerPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, registerPage.getPersonalAccountRadioButtonChecked());
		registerPage.isPersonalAccountRadioButtonCheckedVisible();
	}

	@And("User checks sign in button on register page visibility")
	public void checkSignInButtonOnRegisterPageVisibility() {
		registerPage.isSignInButtonVisible();
	}

	@And("User checks input field for first name visibility")
	public void checkInputFieldForFirstNameVisibility() {
		registerPage.isInputFieldForFirstNameVisible();
	}

	@And("User checks input field for last name visibility")
	public void checkInputFieldForLastNameVisibility() {
		registerPage.isInputFieldForLastNameVisible();
	}

	@And("User checks input field for email visibility")
	public void checkInputFieldForEmailVisibility() {
		registerPage.isInputFieldForEmailVisible();
	}

	@And("User checks input field for password name visibility")
	public void checkInputFieldForPasswordNameVisibility() {
		registerPage.isInputFieldForPasswordVisible();
	}

	@And("User checks countinue with Google button visibility")
	public void checkCountinueWithGoogleButtonVisibility() {
		registerPage.isContinueWithGoogleButtonVisible();
	}

	@And("User checks countinue with Facebook button visibility")
	public void checkCountinueWithFacebookButtonVisibility() {
		registerPage.isContinueWithFacebookButtonVisible();
	}

	@And("User checks countinue with Apple button visibility")
	public void checkCountinueWithAppleButtonVisibility() {
		registerPage.isContinueWithAppleButtonVisible();
	}

	@When("User clicks on business account un checked radio button")
	public void clickOnBusinessAccountUnCheckedRadioButton() {
		registerPage.clickOnBusinessAccountRadioButtonUnChecked();
	}

	@Then("User checks business account radio button checked visibility")
	public void checkBusinessAccountRadioButtonCheckedVisibility() {
		registerPage.isBusinessAccountRadioButtonCheckedVisible();
	}

	@And("User checks input field for business name visibility")
	public void checkInputFieldForBusinessNameVisibility() {
		registerPage.isInputFieldForBusinessNameVisible();
	}

	@And("User checks input field for business email visibility")
	public void checkInputFieldForBusinessEmailVisibility() {
		registerPage.isInputFieldForBusinessEmailVisible();
	}

	@And("User checks input field for business password visibility")
	public void checkInputFieldForBusinessPasswordVisibility() {
		registerPage.isInputFieldForBusinessPasswordVisible();
	}

	@And("User clicks on selector for business country")
	public void clickOnSelectorForBusinessCountry() {
		registerPage.clickOnSelectorForBusinessCountry();
	}

	@And("User clicks on country from selector list")
	public void userClicksOnCountryFromSelectorList() {
		registerPage.clickOnCountryFromSelectorList();
	}

	@And("User checks {string} on selector")
	public void userChecksCountryNameOnSelector(final String countryName) {
		assertTrue(registerPage.getCountryNameFromSelector().equalsIgnoreCase(countryName));
	}

	@And("User clicks on fashion category button")
	public void clickOnFashionCategoryButton() {
		homePage.clickOnFashionCategoryButton();
	}

	@And("User clicks on category womens shoes in fashion button")
	public void clickOnCategoryWomensShoesInFashionButton() {
		productPage = pageFactoryManager.getProductPage();
		productPage.clickOnCategoryWomensShoesInFashionButton();
	}

	@And("User clicks on first item in womens shoes category")
	public void clickOnFirstItemInWomensShoesCategory() {
		productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		productPage.clickOnFirstItemInWomensShoesCategory();
	}

	@When("User clicks on add to cart")
	public void clickOnAddToCart() {
		productPage.clickOnAddToCartButton();
	}

	@Then("User checks {string} on cart icon")
	public void checkAmountOnCartIcon(final String amount) {
		productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAmountOnCartIconVisible());
		assertTrue(productPage.getAmountOnCartIcon().equals(amount));
	}

	@And("User clicks on buy it now button")
	public void clickOnBuyItNowButton() {
		productPage.clickOnBuyItNowButton();
	}

	@And("User checks buy it now popup visibility")
	public void checkBuyItNowPopupVisible() {
		productPage.isBuyItNowPopupVisible();
	}

	@And("User clicks on check out as a guest button")
	public void clickOnCheckOutAsAGuestButton() {
		productPage.clickOnCheckOutAsGuest();
	}

	@And("User clicks on confirm and pay button")
	public void clickOnConfirmAndPayButton() {
		checkoutPage = pageFactoryManager.getCheckoutPage();
		checkoutPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, checkoutPage.getConfirmAndPayButton());
		checkoutPage.clickOnConfirmAndPayButton();

	}

	@And("User enters {string} into firstName input")
	public void enterFirstNameIntoFirstNameInput(final String firstName) {
		checkoutPage = pageFactoryManager.getCheckoutPage();
		checkoutPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, checkoutPage.getInputForFirstName());
		checkoutPage.enterFirstNameIntoInput(firstName);
	}

	@And("User enters {string} into lastName input")
	public void enterLastNameIntoLastNameInput(final String lastName) {
		checkoutPage.enterLastNameIntoInput(lastName);
	}

	@And("User enters {string} into streetAddress input")
	public void entersStreetAddressIntoStreetAddressInput(final String streetAddress) {
		checkoutPage.enterStreetAddressIntoInput(streetAddress);
	}

	@And("User enters {string} into city input")
	public void userEntersCityIntoCityInput(final String city) {
		checkoutPage.enterCityIntoInput(city);
	}

	@And("User enters {string} into confirmEmail input")
	public void enterConfirmEmailIntoConfirmEmailInput(final String confirmEmail) {
		checkoutPage.enterConfirmEmailIntoInput(confirmEmail);
	}

	@And("User enters {string} into phoneNumber input")
	public void enterPhoneNumberIntoPhoneNumberInput(final String phoneNumber) {
		checkoutPage.enterPhoneNumberIntoInput(phoneNumber);
	}

	@And("User checks error message near button visibility")
	public void checkErrorMessageNearButtonVisibility() {
		checkoutPage.isErrorMessageNearButtonVisible();
	}

	@And("User checks error message near address form visibility")
	public void checkErrorMessageNearAddressFormVisibility() {
		checkoutPage.isErrorMessageNearAddressFormVisible();
	}

	@And("User enters {string} into email input")
	public void entersEmailIntoEmailInput(final String email) {
		checkoutPage.enterEmailIntoInput(email);
	}

	@And("User clicks on address submit button")
	public void clickOnAddressSubmitButton() {
		checkoutPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		checkoutPage.clickOnAddAddressSubmitButton();
	}


	@Then("User clicks on add new card radio button")
	public void clickOnAddNewCardRadioButton() {
		checkoutPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, checkoutPage.getAddNewCartRadioButton());
		checkoutPage.clickOnAddNewCardRadioButton();
	}

	@And("User checks credit card details form visibility")
	public void checkCreditCardDetailsFormVisibility() {
		checkoutPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		checkoutPage.isCreditCardDetailsFormVisible();

	}

	@And("User clicks on paypal radio button")
	public void clickOnPaypalRadioButton() {
		checkoutPage.clickOnPaypalRadioButton();
	}

	@And("User closes new opened paypal window")
	public void switchToThePaypalNewOpenedWindow() {
//    String winHandleBefore = driver.getWindowHandle();
//        for (String winHandle : driver.getWindowHandles()) {
//			//driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
//            driver.switchTo().window(winHandle);
//			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		//	driver.close();
//        }
		// driver.switchTo().window(winHandleBefore);
	}

	@Then("User checks error first name visibility")
	public void checkErrorFirstNameVisibility() {
		checkoutPage.isErrorFirstNameVisible();
	}

	@And("User checks error last name visibility")
	public void checkErrorLastNameVisibility() {
		checkoutPage.isErrorLastNameVisible();
	}

	@And("User checks error address visibility")
	public void checkErrorAddressVisibility() {
		checkoutPage.isErrorAddressVisible();
	}

	@And("User checks error city visibility")
	public void checkErrorCityVisibility() {
		checkoutPage.isErrorCityVisible();
	}

	@And("User checks error email visibility")
	public void checkErrorEmailVisibility() {
		checkoutPage.isErrorEmailVisible();
	}

	@And("User checks error confirm email visibility")
	public void checkErrorConfirmEmailVisibility() {
		checkoutPage.isErrorConfirmEmailVisible();
	}

	@When("User clicks on michael kors checkbox")
	public void clickOnMichaelKorsCheckbox() {
		productPage.clickOnMichaelKorsCheckbox();
	}

	@Then("User checks all elements in the list contains {string}")
	public void checkAllElementsInTheListContainsBrand(String brand) {
		List<WebElement> itemsList = productPage.getSortedListOfItems();
		for (WebElement webElement : itemsList) {
			assertTrue(webElement.getText().toLowerCase(Locale.ROOT).contains(brand));
		}
	}

	@When("User enter {string} into search field")
	public void enterKeywordIntoSearchField(final String keyword) {
		homePage.enterKeywordIntoSearchField(keyword);
	}

	@And("User clicks on search button")
	public void clicksOnSearchButton() {
		homePage.clickOnSearchButton();
	}

	@Then("User checks url contains {string}")
	public void checksUrlContainsKeyword(String searchText) {
		homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
		assertTrue(driver.getCurrentUrl().contains(searchText));
	}

	@And("User checks all elements in the list on home page contains {string}")
	public void checksAllElementsInTheListOnHomePageContainsSearchText(final String searchText) {
		List<WebElement> itemsList = homePage.getItemListOnHomePage();
		for (WebElement webElement : itemsList) {
			assertTrue(webElement.getText().toLowerCase(Locale.ROOT).contains(searchText));
		}
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
