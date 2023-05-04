import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CheckoutPage {
    public WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "//*[contains(@name, 'firstName')]")
    private WebElement firstNameField;
    @FindBy(xpath = "//*[contains(@name, 'lastName')]")
    private WebElement lastNameField;
    @FindBy(xpath = "//*[contains(@name, 'postalCode')]")
    private WebElement postalCodeField;
    @FindBy(xpath = "//*[contains(@name, 'continue')]")
    private WebElement continueButton;

    public void inputFirstName(String login) {
        firstNameField.sendKeys(login); }
    public void inputLastName(String login) {
        lastNameField.sendKeys(login); }
    public void inputPostalCode(String login) {
        postalCodeField.sendKeys(login); }
    public void clickContinueButton() {
        continueButton.click(); } }