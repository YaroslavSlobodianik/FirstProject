package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    private static final String ASOS_URL = "https://www.asos.com/ru/men/";

    @FindBy(xpath = "//section[@class='mu-section  '][1]//div[@class='salesBanner-headerWrap-desktop']//h2[@class='salesBanner-header__title'][1]//img[contains(@class,'salesBanner-header__image')][1]")
    private WebElement salesButton;

    @FindBy(xpath = "//a[contains(@class,'TO7hyVB')][@data-testid='men-floor']")
    private WebElement menButton;

    @FindBy(xpath = "//a[@aria-label='Отложено']")
    private WebElement viewWishListButton;

    @FindBy(xpath = "//span[contains(@class,'src-GlobalBanner-Content-Content_copy')]")
    private WebElement clickSalesBanner;

    @FindBy(xpath = "//div[@id='miniBagDropdown']//div[@class='_33s2s-y']")
    private WebElement miniBagDropdownPopup;

    @FindBy(xpath = "//span[@class='_1z5n7CN']")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//span[text()='Просмотреть Корзину']")
    private WebElement viewBagButton;

    @FindBy(xpath = "//a[@type='a'][contains(@href,'bag')]")
    private WebElement amountOfProductsInCartAfterDeleting;

    @FindBy(xpath = "//a[contains(@data-testid,'marketplace')]")
    private WebElement marketPlaceButton;

    @FindBy(xpath = "//input[@id='chrome-search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(@class,'_6iPIuvw ')]")
    private WebElement authorizationButton;

    @FindBy(xpath = "//a[text()='Войти']")
    private WebElement myAccountButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSaleButton() {
        salesButton.click();
    }

    public void clickOnMenButton() {
        menButton.click();
    }

    public void clickOnViewWishListButton() {
        viewWishListButton.click();
    }

    public void clickOnCentralSalesBanner() {
        clickSalesBanner.click();
    }

    public WebElement getMiniBagDropdownPopup() {
        return miniBagDropdownPopup;
    }

    public void clickOnSearchInput() {
         searchInput.click();
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }

    public void clickOnViewBagButton() {
        viewBagButton.click();
    }

    public String getTextOfAmountOfProductsInCartAfterDeleting() {
        return amountOfProductsInCartAfterDeleting.getText();
    }
    public void clickOnMarketPlaceButton() {
        marketPlaceButton.click();
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public WebElement getAuthorizationButton() {
        return authorizationButton;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public HomePage goTo(){
        driver.get(ASOS_URL);
        return this;
    }
}
