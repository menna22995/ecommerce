package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class nextSlider {
    P03_homePage home=new P03_homePage();

    @Given("user click on nextslider button")
    public void clickonbtnnext(){

        home.clickonbtnnext().click();
    }
    @Then("user goto next slider page")
    public void showenext(){
        Boolean actualres=home.showenext().isDisplayed();
        String expectedres="https://demo.nopcommerce.com/";
        Assert.assertTrue(actualres,expectedres);
    }

}
