package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
	public SignInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='userid']")
	private WebElement fieldToEnterEmailOrUsername;

	@FindBy(xpath = "//button[@name='signin-continue-btn']")
	private WebElement continueButton;

	@FindBy(xpath = "//a[contains(@href, 'reg.ebay')]")
	private WebElement linkForRegister;

	@FindBy(xpath = "//button[@id='signin_fb_btn']")
	private WebElement facebookSignInButton;

	@FindBy(xpath = "//button[@id='signin_ggl_btn']")
	private WebElement googleSignInButton;

	@FindBy(xpath = "//button[@id='signin_appl_btn']")
	private WebElement appleSignInButton;

	@FindBy(xpath = "//div[contains(@class,'inline-notice--attention')]")
	private WebElement errorMessage;


	public Boolean signInWindowIsOpen() {
		return driver.getCurrentUrl().contains("signin");
	}

	public void isFieldToEnterEmailOrUsernameVisible() {
		fieldToEnterEmailOrUsername.isDisplayed();
	}

	public void isContinueButtonVisible() {
		continueButton.isDisplayed();
	}

	public void isLinkForRegisterVisible() {
		linkForRegister.isDisplayed();
	}

	public void isFacebookSignInButtonVisible() {
		facebookSignInButton.isDisplayed();
	}

	public void isGoogleSignInButtonVisible() {
		googleSignInButton.isDisplayed();
	}

	public void isAppleSignInButtonVisible() {
		appleSignInButton.isDisplayed();
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public void isErrorMessageVisible() {
		errorMessage.isDisplayed();
	}
}
