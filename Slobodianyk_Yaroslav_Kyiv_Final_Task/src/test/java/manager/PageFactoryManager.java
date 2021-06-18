package manager;

import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class PageFactoryManager {

    private WebDriver driver;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SalesPage getSalesPage() {
        return new SalesPage(getDriver());
    }

    public WishListPage getWishListPage() {
        return new WishListPage(getDriver());
    }

    public MenPage getMenPage() {
        return new MenPage(getDriver());
    }

    public GlassesAssortmentPage getCapsAssortmentPage() {
        return new GlassesAssortmentPage(getDriver());
    }

    public ShirtsAssortmentPage getShirtsAssortmentPage() {
        return new ShirtsAssortmentPage(getDriver());
    }

    public ShirtPage getShirtPage() {
        return new ShirtPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

    public MarketPlacePage getMarketPlacePage() {
        return new MarketPlacePage(getDriver());
    }

    public SectionPage getSectionPage() {
        return new SectionPage(getDriver());
    }

    public NikePage getNikePage() {
        return new NikePage(getDriver());
    }

    public AuthorizationPage getAuthorizationPage() {
        return new AuthorizationPage(getDriver());
    }
}
