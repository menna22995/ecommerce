package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class rssIcon {
    P03_homePage home=new P03_homePage();

    @Given("user open rss icon")
    public void clickrssicon(){

        home.clickrssicon().click();
    }
    @Then("user goto rss press follow")
    public void  clikrssfollow(){

        home.clikrssfollow().click();
    }
}
