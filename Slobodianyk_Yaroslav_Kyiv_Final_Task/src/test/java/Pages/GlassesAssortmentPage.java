package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlassesAssortmentPage extends BasePage {

    @FindBy(xpath = "//a[contains(@aria-label,'Тонкие овальные солнцезащитные очки золотистого цвета New Look')]/following-sibling::button[@data-auto-id='saveForLater']")
    private WebElement glassLikeButton;

    public GlassesAssortmentPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnGlassesLikeButton() {
        glassLikeButton.click();
    }
}
