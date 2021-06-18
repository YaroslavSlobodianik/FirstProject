package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends BasePage {

    @FindBy(xpath = "//a[@class='feature__link'][contains(@href,'rubashki')]")
    private WebElement shirtsAssortmentButton;

    @FindBy(xpath = "//a[@class='feature__link'][contains(@href,'glasses')]")
    private WebElement glassesAssortmentButton;



    public MenPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnShirtsAssortmentButton() {
        shirtsAssortmentButton.click();
    }

    public void clickOnGlassesAssortmentButton() {
        glassesAssortmentButton.click();
    }
}
