package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlacePage extends BasePage {

    public MarketPlacePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//header//button[contains(@id,'settings')]")
    private WebElement selectCurrentPaymentMethod;

    @FindBy(xpath = "//div[contains(text(),'USD')]")
    private WebElement selectUsdPaymentMethod;

    @FindBy(xpath = "//button[contains(text(),'Save settings')]")
    private WebElement saveSettingsButton;

    @FindBy(xpath = "//figcaption[contains(text(),'Tara Khorzad')]")
    private WebElement selectFirstSection;

    public void clickChoosePaymentMethodButton() {
        selectCurrentPaymentMethod.click();
    }

    public void selectUSDPaymentMethod() {
        selectUsdPaymentMethod.click();
    }

    public void clickOnSaveSettingsButton() {
        saveSettingsButton.click();
    }

    public void clickFirstSection() {
        selectFirstSection.click();
    }
}
