package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Избранное']")
    private WebElement wishListText;

    @FindBy(xpath = "//div[@class='itemCount_3vWat']")
    private WebElement wishListCounter;

    @FindBy(xpath = "//button[@aria-label='Удалить']")
    private WebElement deleteItemFromWishListButton;

    @FindBy(xpath = "//h2[contains(text(),'Нет сохраненных товаров')]")
    private WebElement emptyWishListText;

    public WishListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWishListText() {
        return wishListText;
    }

    public String getWishListCounter() {
        return wishListCounter.getText();
    }

    public void clickOnDeleteItemFromWishListButton() {
        deleteItemFromWishListButton.click();
    }

    public WebElement getEmptyWishListText() {
        return emptyWishListText;
    }

    public String getEmptyWishList() {
        return emptyWishListText.getText();
    }
}
