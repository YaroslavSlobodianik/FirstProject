package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//button[@class='bag-item-remove']")
    private WebElement removeItemFromCartButton;

    @FindBy(xpath = "//h2[text()='Ваша корзина пуста']")
    private WebElement cartEmptyText;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRemoveItemFromCartButton() {
        removeItemFromCartButton.click();
    }

    public WebElement getCartText() {
        return cartEmptyText;
    }

}
