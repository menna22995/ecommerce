package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class followFacebook {
    P03_homePage home=new P03_homePage();

    @Given("user open facebook icon")
    public void clickFacebookicon(){

        home.clickFacebookicon().click();
    }
    @Then("user goto facebook press follow")
    public void  clikFacebookfollow(){

        home.clikFacebookfollow().click();

        String  expectedres="https://www.facebook.com/nopCommerce";
        String actualres="https://www.facebook.com/nopCommerce";
        Assert.assertEquals(actualres,expectedres);
    }
}
