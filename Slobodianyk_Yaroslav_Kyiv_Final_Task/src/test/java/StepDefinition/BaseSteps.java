package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import manager.PageFactoryManager;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BaseSteps extends PageFactoryManager {

    WebDriver driver;

    private String EXPECTED_TEXT_OF_HEADLINE_ARTICLE = "https://www.asos.com/ru/men/rasprodazha/cat/?cid=8409&ctaref=hp|mw|promo|banner|1|edit|salelaunch70";
    private String EXPECTED_MAIN_PAGE_URL = "https://www.asos.com/ru/men/rasprodazha/cat/?cid=8409&ctaref=hp%7Cmw%7Cpromo%7Cbanner%7C1%7Cedit%7Csalelaunch70&currentpricerange=150-32990&sort=freshness";
    private String EXPECTED_MAIN_PAGE_URL_ROC = "https://www.asos.com/ru/men/";
    private String EXPECTED_SIGN_PAYMENT_METHOD = "$";
    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_ADDING = "1";
    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_DELETING = "";
    private String WISHLIST_ITEMS_COUNTER = "1 шт. сохранено";
    private String EMPTY_WISHLIST_TEXT = "Нет сохраненных товаров";
    private String EXPECTED_MAIN_PAGE_URL_NIKE = "https://www.asos.com/ru/search/?q=nike";
    private String EMAIL_ADDRESS = "testtesttesttest@test.com";
    private String ERRORE_MASSAGE = "Здесь требуется пароль";


    @Before
    public void start(){
        testsSetUp();
    }

    @After
    public void finish(){
        tearDown();
    }

    @Given("I am on the Asos Homepage")
    public void iAmOnTheAsosHomepage() {
        getHomePage().goTo();
        getBasePage().waitForPageLoadComplete(30);
    }

    @When("I go to sales page")
    public void iGoToSalesPage() {
        getHomePage().clickOnSaleButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @And("I check sort menu")
    public void iCheckSortMenu() {
        getSalesPage().clickOnFirstSortMenu();
        getBasePage().waitForPageLoadComplete(30);
    }

    @Then("I choose new goods")
    public void iChooseNewGoods() {
        getSalesPage().setClickNewGoodsButton();
        getBasePage().waitForPageLoadComplete(30);
        assertEquals(getDriver().getCurrentUrl(), EXPECTED_MAIN_PAGE_URL);
    }

    @Then("The correct head article about sales is displayed")
    public void theCorrectHeadArticleAboutSalesIsDisplayed() {
        assertEquals(getDriver().getCurrentUrl(), EXPECTED_TEXT_OF_HEADLINE_ARTICLE);
    }

    @And("I go to marketplace")
    public void iGoToMarketplace() {
        getHomePage().clickOnMarketPlaceButton();
        getBasePage().waitForPageLoadComplete(120);
    }


    @And("I choose select payment method button")
    public void iChooseSelectPaymentMethodButton() {
        getMarketPlacePage().clickChoosePaymentMethodButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @And("I choose USD payment method")
    public void iChooseUSDPaymentMethod() throws InterruptedException {
        Thread.sleep(1500);
        getMarketPlacePage().selectUSDPaymentMethod();
        getBasePage().waitForPageLoadComplete(30);
    }

    @And("I click save button")
    public void iClickSaveButton() {
        getBasePage().implicitWait(10);
        getMarketPlacePage().clickOnSaveSettingsButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @When("I click on first section")
    public void iClickOnFirstSection() {
        getMarketPlacePage().clickFirstSection();
        getBasePage().waitForPageLoadComplete(30);
    }

    @Then("I must see sign")
    public void iMustSeeSign() {
        for (WebElement webElement : getSectionPage().getTextOfPriceFirstThing()) {
            assertTrue(webElement.getText().contains(EXPECTED_SIGN_PAYMENT_METHOD));
        }
    }

    @When("I make search by value {string}")
    public void iMakeSearchByValueNike(String searchText) {
        getHomePage().clickOnSearchInput();
        getHomePage().searchByKeyword(searchText);
        getBasePage().waitForPageLoadComplete(30);
    }

    @Then("I verify that product contains text Nike")
    public void iVerifyThatProductContainsTextNike() {
        assertEquals(getDriver().getCurrentUrl(), EXPECTED_MAIN_PAGE_URL_NIKE);
    }

    @And("I click on main logo")
    public void iClickOnMainLogo() {
        getSalesPage().clickOnMainLogo();
        getBasePage().waitForPageLoadComplete(30);
    }

    @Then("I find main page")
    public void iFindMainPage() {
        assertEquals(getDriver().getCurrentUrl(), EXPECTED_MAIN_PAGE_URL_ROC);
    }

    @And("I go to men Clothes Page")
    public void iGoToMenClothesPage() {
        getHomePage().clickOnMenButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @And("I click on shirts assortment page")
    public void iClickOnShirtsAssortmentPage() {
        getMenPage().clickOnShirtsAssortmentButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @When("I open favorite shirt")
    public void iOpenFavoriteShirt() {
        getShirtsAssortmentPage().clickOnShirtButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @And("I open size shirt")
    public void iOpenSizeShirt() {
        getShirtPage().clickOnChooseSizeButton();
    }

    @And("I choose M size")
    public void iChooseMSize() {
        getShirtPage().clickOnShirtSizeMButton();
    }

    @And("I add shirt to cart")
    public void iAddShirtToCart() {
        getShirtPage().clickOnShirtsAddToCartButton();
    }

    @Then("I check how much products I have in a cart")
    public void iCheckHowMuchProductsIHaveInACart() {
        getBasePage().waitForVisibilityOfElement(30, getHomePage().getMiniBagDropdownPopup());
        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_ADDING);
    }

    @And("I go to cart")
    public void iGoToCart() {
        getBasePage().waitForVisibilityOfElement(30, getHomePage().getMiniBagDropdownPopup());
        getBasePage().moveToElement(getHomePage().getMiniBagDropdownPopup());
        getHomePage().clickOnViewBagButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @And("I remove item from cart")
    public void iRemoveItemFromCart() {
        getBasePage().implicitWait(10);
        getCartPage().clickOnRemoveItemFromCartButton();
    }

    @Then("I check that the cart is empty")
    public void iCheckThatTheCartIsEmpty() {
        getBasePage().waitForVisibilityOfElement(30, getCartPage().getCartText());
        assertEquals(getHomePage().getTextOfAmountOfProductsInCartAfterDeleting(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_DELETING);
    }

    @And("I open glasses assortment")
    public void iOpenGlassesAssortment() {
        getMenPage().clickOnGlassesAssortmentButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @When("I choose glasses to wish list")
    public void iChooseGlassesToWishList() {
        getCapsAssortmentPage().clickOnGlassesLikeButton();
    }

    @Then("I check how much items i have in wish list")
    public void iCheckHowMuchItemsIHaveInWishList() {
        getHomePage().clickOnViewWishListButton();
        getBasePage().waitForPageLoadComplete(30);
        getBasePage().waitForVisibilityOfElement(30, getWishListPage().getWishListText());
        assertEquals(getWishListPage().getWishListCounter(), WISHLIST_ITEMS_COUNTER);
    }

    @And("I open wish list")
    public void iOpenWishList() {
        getHomePage().clickOnViewWishListButton();
        getBasePage().waitForPageLoadComplete(30);
        getBasePage().waitForVisibilityOfElement(30, getWishListPage().getWishListText());
    }

    @And("I delete product in wish list")
    public void iDeleteProductInWishList() {
        getWishListPage().clickOnDeleteItemFromWishListButton();
        getBasePage().waitForPageLoadComplete(30);
    }

    @Then("My cart is empty")
    public void myCartIsEmpty() {
        getBasePage().waitForVisibilityOfElement(30, getWishListPage().getEmptyWishListText());
        assertEquals(getWishListPage().getEmptyWishList(), EMPTY_WISHLIST_TEXT);
    }

    @When("I go to authorization page")
    public void iGoToAuthorizationPage() {
        getBasePage().moveToElement(getHomePage().getAuthorizationButton());
        getBasePage().implicitWait(10);
        getBasePage().clickOnElement(getHomePage().getMyAccountButton());
    }

    @And("I enter email")
    public void iEnterPassword() {
        getBasePage().waitForPageLoadComplete(30);
        getAuthorizationPage().emailAddress(EMAIL_ADDRESS);
    }

    @And("I click on sign button")
    public void iClickOnSignButton() {
        getAuthorizationPage().submitBySignInButton();
    }

    @Then("I have error massage")
    public void iHaveErrorMassage() {
        getBasePage().implicitWait(10);
        assertEquals(getAuthorizationPage().getSignInErrorMessage(), ERRORE_MASSAGE);
    }
}

