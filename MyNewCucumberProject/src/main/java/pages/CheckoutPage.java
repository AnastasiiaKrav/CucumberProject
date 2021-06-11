package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement inputForFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement inputForLastName;

	@FindBy(xpath = "//input[@id='addressLine1']")
	private WebElement inputForStreetAddress;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement inputForCity;

	@FindBy(xpath = "//input[@id='emailConfirm']")
	private WebElement inputForConfirmEmail;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement inputForPhoneNumber;

	@FindBy(xpath = "//button[@data-test-id='CONFIRM_AND_PAY_BUTTON']")
	private WebElement confirmAndPayButton;

	@FindBy(xpath = "//div[@class='render-summary payment-entry--render-summary show-all-logos selectable']")
	private WebElement addNewCartRadioButton;

	@FindBy(xpath = "//div[@class='credit-card-details ']")
	private WebElement creditCardDetailsForm;

	@FindBy(xpath = "//div[@class='render-summary payment-entry--render-summary selectable']")
	private WebElement paypalRadioButton;


	@FindBy(xpath = "//div[@id='cta-disabled-message']")
	private WebElement errorMessageNearButoon;

	@FindBy(xpath = "//div[@class='page-message ']")
	private WebElement errorMessageNearAddressForm;

	@FindBy(xpath = "//button[@data-test-id='ADD_ADDRESS_SUBMIT']")
	private WebElement addAddressSubmitButton;

	@FindBy(xpath = "//div[@id='firstName-error']")
	private WebElement errorFirstName;

	@FindBy(xpath = "//div[@id='lastName-error']")
	private WebElement errorLastName;

	@FindBy(xpath = "//div[@id='addressLine1-error']")
	private WebElement errorAddress;

	@FindBy(xpath = "//div[@id='city-error']")
	private WebElement errorCity;

	@FindBy(xpath = "//div[@id='email-error']")
	private WebElement errorEmail;

	@FindBy(xpath = "//div[@id='emailConfirm-error']")
	private WebElement errorConfirmEmail;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailInput;

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getConfirmAndPayButton() {
		return confirmAndPayButton;
	}

	public WebElement getInputForFirstName() {
		return inputForFirstName;
	}

	public void enterFirstNameIntoInput(String firstName) {
		inputForFirstName.sendKeys(firstName);
	}

	public void enterLastNameIntoInput(String lastName) {
		inputForLastName.sendKeys(lastName);
	}

	public void enterStreetAddressIntoInput(String streetAddress) {
		inputForStreetAddress.sendKeys(streetAddress);
	}

	public void enterCityIntoInput(String city) {
		inputForCity.sendKeys(city);
	}

	public void enterEmailIntoInput(String email) {
		emailInput.sendKeys(email);
	}

	public void enterConfirmEmailIntoInput(String confirmEmail) {
		inputForConfirmEmail.sendKeys(confirmEmail);
	}

	public void enterPhoneNumberIntoInput(String phoneNumber) {
		inputForPhoneNumber.sendKeys(phoneNumber);
	}

	public void clickOnConfirmAndPayButton() {
		confirmAndPayButton.click();
	}

	public WebElement getAddNewCartRadioButton() {
		return addNewCartRadioButton;
	}

	public void clickOnAddNewCardRadioButton() {
		addNewCartRadioButton.click();
	}

	public void isCreditCardDetailsFormVisible() {
		creditCardDetailsForm.isDisplayed();
	}

	public void clickOnPaypalRadioButton() {
		paypalRadioButton.click();
	}


	public void isErrorMessageNearButtonVisible() {
		errorMessageNearButoon.isDisplayed();
	}

	public void isErrorMessageNearAddressFormVisible() {
		errorMessageNearAddressForm.isDisplayed();
	}

	public void clickOnAddAddressSubmitButton() {
		addAddressSubmitButton.click();
	}

	public void isErrorFirstNameVisible() {
		errorFirstName.isDisplayed();
	}

	public void isErrorLastNameVisible() {
		errorLastName.isDisplayed();
	}

	public void isErrorAddressVisible() {
		errorAddress.isDisplayed();
	}

	public void isErrorCityVisible() {
		errorCity.isDisplayed();
	}

	public void isErrorEmailVisible() {
		errorEmail.isDisplayed();
	}

	public void isErrorConfirmEmailVisible() {
		errorConfirmEmail.isDisplayed();
	}

}
