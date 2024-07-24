import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _21_PlaceOrderFindBy {

    public _21_PlaceOrderFindBy(){
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;
    @FindBy(css = ".fa.fa-search")
    public WebElement searchButton;
    @FindBy(xpath = "(//*[text()='Add to Cart'])[1]")
    public WebElement addToCart;
    @FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
    public WebElement shoppingCart;
    @FindBy(linkText = "Checkout")
    public WebElement checkOut;
    @FindBy(id = "button-payment-address")
    public WebElement paymentAddressButton;
    @FindBy(id = "button-shipping-address")
    public WebElement shippingAddressButton;
    @FindBy(id = "button-shipping-method")
    public WebElement shippingMethodButton;
    @FindBy(css = "input[name='agree']")
    public  WebElement radioButtonAgree;
    @FindBy(css = "div#collapse-payment-method > div > div:nth-of-type(2) > label")
    public WebElement radioButtonPaymentMethod;
    @FindBy(id = "button-payment-method")
    public WebElement paymentMethodButton;
    @FindBy(id = "button-confirm")
    public WebElement confirmButton;
    @FindBy(css = "div#content > h1")
    public WebElement successContent;

}
