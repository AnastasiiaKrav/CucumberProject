package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//header")
	private WebElement header;

	@FindBy(xpath = "//footer")
	private WebElement footer;

	@FindBy(xpath = "//a[contains(@href, 'cart.')]")
	private WebElement cartIcon;

	@FindBy(xpath = "//span[@id='gh-ug']//a[contains(@href, 'signin')]")
	private WebElement signInButton;

	@FindBy(xpath = "//span[@id='gh-ug']//a[contains(@href, 'reg')]")
	private WebElement registerButton;

	@FindBy(xpath = "//button[@id='gh-shop-a']")
	private WebElement shopByCategoryButton;

	@FindBy(xpath = "//td[@class='gh-td']//div[contains(@class, 'active')]")
	private WebElement shopByCategoryPopup;

	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	private WebElement searchField;

	@FindBy(xpath = "//td[@class= 'gh-td gh-sch-btn']")
	private WebElement searchButton;

	@FindBy(xpath = "//div[@class='hl-cat-nav']")
	private WebElement categoriesNavigationContainer;

	@FindBy(xpath = "//ul[contains(@id, '2-match-media')]")
	private WebElement upperCarousel;

	@FindBy(xpath = "//div[@id='destinations_list1']")
	private WebElement upperPopularCategoriesList;

	@FindBy(xpath = "//ul[contains(@id, '4-match-media')]")
	private WebElement belowCarousel;

	@FindBy(xpath = "//div[@id='destinations_list2']")
	private WebElement belowPopularCategoriesList;

	@FindBy(xpath = "//li[@class= 'hl-cat-nav__js-tab']//a[contains(@href, 'Fashion')]")
	private WebElement fashionCategoryButton;

	@FindBy(xpath = "//ul[@class='srp-results srp-list clearfix']")
	private List<WebElement> itemListOnHomePage;


	public HomePage(WebDriver driver) {
		super(driver);
	}


	public void openHomePage(String url) {
		driver.get(url);
	}

	public void isHeaderVisible() {
		header.isDisplayed();
	}

	public void isFooterVisible() {
		footer.isDisplayed();
	}

	public void isCartIconVisible() {
		cartIcon.isDisplayed();
	}

	public void isSignInButtonVisible() {
		signInButton.isDisplayed();
	}

	public void clickSignInButton() {
		signInButton.click();
	}

	public void isRegisterButtonVisible() {
		registerButton.isDisplayed();
	}

	public void isShopByCategoryButtonVisible() {
		shopByCategoryButton.isDisplayed();
	}

	public void clickShopByCategoryButton() {
		shopByCategoryButton.click();
	}

	public void isShopByCategoryPopupVisible() {
		shopByCategoryPopup.isDisplayed();
	}

	public void clickToCloseShopByCategoryButton() {
		shopByCategoryButton.click();
	}

	public void isSearchFieldVisible() {
		searchField.isDisplayed();
	}

	public void isCategoriesNavigationContainerVisible() {
		categoriesNavigationContainer.isDisplayed();
	}

	public void isUpperCarouselVisible() {
		upperCarousel.isDisplayed();
	}

	public void isUpperPopularCategoriesListVisible() {
		upperPopularCategoriesList.isDisplayed();
	}

	public void isBelowCarouselVisible() {
		belowCarousel.isDisplayed();
	}

	public void isBelowPopularCategoriesListVisible() {
		belowPopularCategoriesList.isDisplayed();
	}

	public void clickOnFashionCategoryButton() {
		fashionCategoryButton.click();
	}

	public void enterKeywordIntoSearchField(final String searchText) {
		searchField.clear();
		searchField.sendKeys(searchText);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public List<WebElement> getItemListOnHomePage() {
		return itemListOnHomePage;
	}
}