package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage home=new P03_homePage();

    @Given("user click on next button")
    public void clickonbtn(){
        home.clickonbtn().click();
    }
    @Then("user goto next slider")
    public void showres(){
        Boolean actualres=home.showres().isDisplayed();
        String expectedres="https://demo.nopcommerce.com/";
        Assert.assertTrue(actualres,expectedres);
    }

}
