package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends BasePage{

    @FindBy(xpath = " //div[contains(@class,'src-GlobalBanner-Tooltip-Tooltip_wrapperCenter src-GlobalBanner-Tooltip-Tooltip_hidden')]")
    private WebElement clickThisBanner;

    @FindBy(xpath = "//div[text()='Сортировать']")
    private WebElement clickSortMenu;

    @FindBy(xpath = "//li[contains(@id,'plp_web_sort_whats_new')]")
    private WebElement clickNewGoodsButton;

    @FindBy(xpath = "//section[@id='category-banner-wrapper']//h1]")
    private WebElement headLineArticle;

    @FindBy(xpath = "//a[@data-testid='asoslogo']")
    private WebElement searchMainLogo;

    public SalesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFirstSortMenu() {
        clickSortMenu.click();
    }

    public void setClickNewGoodsButton() {
        clickNewGoodsButton.click();
    }

    public void clickOnMainLogo() { searchMainLogo.click(); }

}
