package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SectionPage extends BasePage {

    public SectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-productid='5857319']//p[@class='price']//span[contains(text(),'$')]")
    private List<WebElement> searchDollarSign;

    public List<WebElement>  getTextOfPriceFirstThing() {
        return searchDollarSign;
    }
}
