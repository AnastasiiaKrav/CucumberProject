package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

	@FindBy(xpath = "//div/a[contains(@href, 'Womens-Shoes')]")
	private WebElement categoryWomensShoesInFashionButton;

	@FindBy(xpath = "//ul[contains(@class, 'list__items')]/li[2]")
	private WebElement itemInWomensShoesCategory;

	@FindBy(xpath = "//a[@role = 'button' and @id= 'isCartBtn_btn']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//i[@id='gh-cart-n']")
	private WebElement amountOnCartIcon;

	@FindBy(xpath = "//a[@id='binBtn_btn']")
	private WebElement buyItNowButton;

	@FindBy(xpath = "//div[@id='streamLineBinOly']")
	private WebElement buyItNowPopoup;

	@FindBy(xpath = "//button[@id='sbin-gxo-btn']")
	private WebElement checkOutAsGuestButton;

	@FindBy(xpath = "//a[contains(@href, 'Michael-Kors')]")
	private WebElement michaelKorsCheckbox;

	@FindBy(xpath = "//ul[@class='b-list__items_nofooter srp-results srp-grid']//li")
	private List<WebElement> sortedListOfItems;


	public ProductPage(WebDriver driver) {
		super(driver);
	}


	public void clickOnCategoryWomensShoesInFashionButton() {
		categoryWomensShoesInFashionButton.click();
	}

	public void clickOnFirstItemInWomensShoesCategory() {
		itemInWomensShoesCategory.click();
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public WebElement getAmountOnCartIconVisible() {
		return amountOnCartIcon;
	}

	public String getAmountOnCartIcon() {
		return amountOnCartIcon.getText();
	}

	public void clickOnBuyItNowButton() {
		buyItNowButton.click();
	}

	public void isBuyItNowPopupVisible() {
		buyItNowPopoup.isDisplayed();
	}

	public void clickOnCheckOutAsGuest() {
		checkOutAsGuestButton.click();
	}

	public void clickOnMichaelKorsCheckbox() {
		michaelKorsCheckbox.click();
	}

	public List<WebElement> getSortedListOfItems() {
		return sortedListOfItems;
	}
}