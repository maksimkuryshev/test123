
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTest {
    public static LoginPage loginPage;
    public static CatalogPage catalogPage;
    public static CartPage cartPage;
    public static CheckoutPage checkoutPage;
    public static OverviewPage overviewPage;
    public static SuccessPage successPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/home/IdeaProjects/test123/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        catalogPage = new CatalogPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        overviewPage = new OverviewPage(driver);
        successPage = new SuccessPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void loginTest() {
        loginPage.inputLogin("standard_user");
        loginPage.inputPasswd("secret_sauce");
        loginPage.clickLoginBtn();
        catalogPage.clickAddToCartButton();
        catalogPage.clickCartButton();
        cartPage.clickCheckoutButton();
        checkoutPage.firstNameInput("test");
        checkoutPage.lastNameInput("test");
        checkoutPage.postalCodeInput("test");
        checkoutPage.clickContinueButton();
        overviewPage.clickFinishButton();
        successPage.assertText("Thank you for your order!");
        successPage.assertUrl("https://www.saucedemo.com/checkout-complete.html");
    }

  //@AfterClass
    //public static void tearDown() {
     // WebDriver.quit(); }
}