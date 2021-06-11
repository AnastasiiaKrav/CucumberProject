package manager;

import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import pages.RegisterPage;
import pages.ShoppingCartPage;
import pages.SignInPage;

public class PageFactoryManager {

	WebDriver driver;

	public PageFactoryManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return new HomePage(driver);
	}

	public SignInPage getSignInPage() {
		return new SignInPage(driver);
	}

	public RegisterPage getRegisterPage() {
		return new RegisterPage(driver);
	}

	public ShoppingCartPage getShoppingCartPage() {
		return new ShoppingCartPage(driver);
	}

	public ProductPage getProductPage() {
		return new ProductPage(driver);
	}

	public CheckoutPage getCheckoutPage() {
		return new CheckoutPage(driver);
	}
}
