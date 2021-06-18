package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NikePage extends BasePage{

    @FindBy(xpath = "//p[contains(text(),'nike')]")
    private WebElement mainNikeHeadLineArticle;

    public NikePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getMainNikeHeadLineArticle() {return mainNikeHeadLineArticle;}


}
