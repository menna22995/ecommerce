package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FollowTwitter {
    P03_homePage home=new P03_homePage();

    @Given("user open twitter icon")
    public void clickTwittericon(){

        home.clickTwittericon().click();
    }
    @Then("user goto twitter press follow")
    public void  clikTwitterfollow(){

        home.clikTwitterfollow().click();
        String  expectedres="https://twitter.com/nopCommerce";
        String actualres="https://twitter.com/nopCommerce";
        Assert.assertEquals(actualres,expectedres);
    }
}
