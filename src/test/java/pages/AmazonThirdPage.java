package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonThirdPage {
    WebDriver driver;
    public AmazonThirdPage(){
    driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
}
    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(id = "nav-cart-count")
    public WebElement cart;
}
