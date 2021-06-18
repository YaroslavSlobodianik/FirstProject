package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage extends BasePage {

    @FindBy(xpath = "//input[@id='EmailAddress']")
    private WebElement emailAddressInput;

    @FindBy(xpath = "//input[@id='signin']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@id='Password-error']")
    private WebElement signInErrorMessage;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public void emailAddress(final String keyword) {
        emailAddressInput.sendKeys(keyword);
    }

    public void submitBySignInButton() {
        signInButton.submit();
    }

    public String getSignInErrorMessage() {
        return signInErrorMessage.getText();
    }
}