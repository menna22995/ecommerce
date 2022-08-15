package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D08_WishlistStepDef {
    P03_homePage home=new P03_homePage();

    @Given("user slecet product")
    public void selectproduct(){
        home.selectproduct().click();
    }
    @When("user goto product page then tab to wishlist button")
    public void tabtoadd(){
        home.tabtoadd().click();
    }
    @Then("massage added to wishlist will appear")
    public void added(){
         String actual=home.added().getText();
         String expected ="The product has been added to your wishlist";
         Assert.assertTrue(actual.contains(expected));
    }
}
