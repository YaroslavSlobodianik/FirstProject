package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShirtPage extends BasePage{

    @FindBy(xpath = "//select[contains(@id,'main-size')]")
    private WebElement chooseSizeButton;

    @FindBy(xpath = "//option[text()='M - Chest 38-40']")
    private WebElement shirtSizeMButton;

    @FindBy(xpath = "//span[@data-bind='text: buttonText']")
    private WebElement shirtAddToCartButton;

    @FindBy(xpath = "//span[@id='selectSizeError']")
    private WebElement selectSizeError;

    public ShirtPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnChooseSizeButton() {
        chooseSizeButton.click();
    }

    public void clickOnShirtSizeMButton() {
        shirtSizeMButton.click();
    }

    public void clickOnShirtsAddToCartButton() {
        shirtAddToCartButton.click();
    }
}
