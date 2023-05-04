import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(css = "input#user-name")
    private WebElement loginField;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(id = "password")
    private WebElement passwdField;

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    public void clickLoginButton() {
        loginButton.click(); }
    public void assertText(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }}