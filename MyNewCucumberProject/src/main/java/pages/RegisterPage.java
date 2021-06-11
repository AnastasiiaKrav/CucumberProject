package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	@FindBy(xpath = "//input[@value='personalaccount' and @checked]")
	private WebElement personalAccountRadioButtonChecked;

	@FindBy(xpath = "//a[@href = '#']")
	private WebElement signInButton;

	@FindBy(xpath = "//span[@id='gh-ug']//a[contains(@href, 'reg')]")
	private WebElement registerButton;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement inputFieldForFirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement inputFieldForLastName;

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement inputFieldForEmail;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement inputFieldForPassword;

	@FindBy(xpath = "//button[@id='google']")
	private WebElement continueWithGoogleButton;

	@FindBy(xpath = "//button[@id='facebook']")
	private WebElement continueWithFacebookButton;

	@FindBy(xpath = "//button[@id='apple']")
	private WebElement continueWithAppleButton;

	@FindBy(xpath = "//input[@value='businessaccount']")
	private WebElement businessAccountRadioButtonUnChecked;

	@FindBy(xpath = "//input[@value='businessaccount' and @checked]")
	private WebElement businessAccountRadioButtonChecked;

	@FindBy(xpath = "//input[@name='businessName']")
	private WebElement inputFieldForBusinessName;

	@FindBy(xpath = "//input[@name='businessEmail']")
	private WebElement inputFieldForBusinessEmail;

	@FindBy(xpath = "//input[@name='bizPassword']")
	private WebElement inputFieldForBusinessPassword;

	@FindBy(xpath = "//select[@id='businessCountry']")
	private WebElement selectorForBusinessCountry;

	@FindBy(xpath = "//select//option[204]")
	private WebElement countryInSelectorList;


	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	public void openRegisterPage(String url) {
		driver.get(url);
	}

	public WebElement getPersonalAccountRadioButtonChecked() {
		return personalAccountRadioButtonChecked;
	}

	public void isPersonalAccountRadioButtonCheckedVisible() {
		personalAccountRadioButtonChecked.isDisplayed();
	}

	public void isSignInButtonVisible() {
		signInButton.isDisplayed();
	}

	public void isInputFieldForFirstNameVisible() {
		inputFieldForFirstName.isDisplayed();
	}

	public void isInputFieldForLastNameVisible() {
		inputFieldForLastName.isDisplayed();
	}

	public void isInputFieldForEmailVisible() {
		inputFieldForEmail.isDisplayed();
	}

	public void isInputFieldForPasswordVisible() {
		inputFieldForPassword.isDisplayed();
	}

	public void isContinueWithGoogleButtonVisible() {
		continueWithGoogleButton.isDisplayed();
	}

	public void isContinueWithFacebookButtonVisible() {
		continueWithFacebookButton.isDisplayed();
	}

	public void isContinueWithAppleButtonVisible() {
		continueWithAppleButton.isDisplayed();
	}

	public void clickOnBusinessAccountRadioButtonUnChecked() {
		businessAccountRadioButtonUnChecked.click();
	}

	public void isBusinessAccountRadioButtonCheckedVisible() {
		businessAccountRadioButtonChecked.isDisplayed();
	}

	public void isInputFieldForBusinessNameVisible() {
		inputFieldForBusinessName.isDisplayed();
	}

	public void isInputFieldForBusinessEmailVisible() {
		inputFieldForBusinessEmail.isDisplayed();
	}

	public void isInputFieldForBusinessPasswordVisible() {
		inputFieldForBusinessPassword.isDisplayed();
	}

	public void clickOnSelectorForBusinessCountry() {
		selectorForBusinessCountry.click();
	}

	public void clickOnCountryFromSelectorList() {
		countryInSelectorList.click();
	}


	public String getCountryNameFromSelector() {
		return countryInSelectorList.getText();
	}

	public void clickOnRegisterButton() {
		registerButton.click();
	}

	public Boolean registerWindowIsOpen() {
		return driver.getCurrentUrl().contains("signup");
	}
}
