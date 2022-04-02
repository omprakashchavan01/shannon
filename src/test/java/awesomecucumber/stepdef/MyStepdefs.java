package awesomecucumber.stepdef;

import awesomecucumber.objects.Product;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("I'm on the Store/Product page")
    public void i_m_on_the_store_page() throws InterruptedException {
        Thread.sleep(5000);
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I add a {product} to the Cart")
    public void i_add_a_to_the_cart(Product product) throws InterruptedException {
        Thread.sleep(5000);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("PRODUCT NAME = " + product.getName());
    }
    @Then("I see {int} {product} in the Cart")
    public void i_see_in_the_cart(Integer int1, Product product) throws InterruptedException {
        Thread.sleep(5000);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("PRODUCT NAME = " + product.getName());
    }
}
