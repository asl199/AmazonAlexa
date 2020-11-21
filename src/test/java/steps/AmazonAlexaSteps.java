package steps;


import pages.AmazonHomePage;
import pages.AmazonSecondPage;
import pages.AmazonThirdPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import utilities.Driver;

public class AmazonAlexaSteps {
WebDriver driver;
    AmazonHomePage amazonHomePage = new AmazonHomePage();
    AmazonSecondPage amazonSecondPage = new AmazonSecondPage();
    AmazonThirdPage amazonThirdPage = new AmazonThirdPage();

    @Given("^the user navigates to \"([^\"]*)\"$")
    public void the_user_navigates_to(String url) {
        driver = Driver.getDriver();
        driver.get(url);
    }


    @Given("^search for \"([^\"]*)\"$")
    public void searches_for(String item)  {
        amazonHomePage.searchInput.sendKeys(item);
    }

    @Given("^navigate to the second page$")
    public void navigate_to_the_second_page()  {
        amazonHomePage.searchButton.click();
    }

    @Given("^select the third item$")
    public void selects_the_third_item()  {
        amazonSecondPage.items.get(3).click();
    }

    @Then("^user should be able to add item to the cart$")
    public void user_should_be_able_to_add_it_to_the_cart() {
        Assert.assertTrue(amazonThirdPage.addToCartButton.isDisplayed());
        amazonThirdPage.addToCartButton.click();
        Assert.assertTrue(amazonThirdPage.cart.getText().equals("1"));
        driver.close();
    }
}




