package com.purchaseAlexa.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAlexaSteps {
WebDriver driver = new ChromeDriver();

    @Given("^the user navigates to \"([^\"]*)\"$")
    public void the_user_navigates_to(String url) {
    driver.get(url);
    }

    @Given("^search for \"([^\"]*)\"$")
    public void searches_for(String arg1) throws Throwable {

    }

    @Given("^navigate to the second page$")
    public void navigate_to_the_second_page() throws Throwable {

    }

    @Given("^selects the third item$")
    public void selects_the_third_item() throws Throwable {

    }

    @Then("^user should be able to add it to the cart$")
    public void user_should_be_able_to_add_it_to_the_cart() throws Throwable {

    }

}




