package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	@FindBy(xpath = "//div[@class='cartsummary-cta']")
	private WebElement goToCheckoutButton;

	@FindBy(xpath = "//a[contains(@href, 'sellerid')]")
	private WebElement payOnlyThisSellerButton;

	@FindBy(xpath = "//button[@data-test-id='cart-remove-item']")
	private WebElement removeItem;

	@FindBy(xpath = "//div[@class=\"table\"]")
	private WebElement totalAmountTable;

	@FindBy(xpath = "//div[@class=\"page-alerts\"]")
	private WebElement pageAlerts;

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	public void isGoToCheckoutButtonVisible() {
		goToCheckoutButton.isDisplayed();
	}

	public void isPayOnlyThisSellerButtonVisible() {
		payOnlyThisSellerButton.isDisplayed();
	}

	public void isRemoveItemVisible() {
		removeItem.isDisplayed();
	}

	public void isTotalAmountTableVisible() {
		totalAmountTable.isDisplayed();
	}

	public void isPageAlertsVisible() {
		pageAlerts.isDisplayed();
	}
}
