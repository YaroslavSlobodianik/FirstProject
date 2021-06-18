package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShirtsAssortmentPage extends BasePage{

    @FindBy(xpath = "//img[@data-auto-id='productTileImage'][contains(@src,'oversized-rubashka-tsveta-haki')]")
    private WebElement shirtsButton;

    public ShirtsAssortmentPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnShirtButton() {
        shirtsButton.click();
    }
}
