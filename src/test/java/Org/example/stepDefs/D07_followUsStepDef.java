package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D07_followUsStepDef {
    P03_homePage home=new P03_homePage();

    @Given("user open youtube icon")
    public void clickonicon(){

        home.clickonicon().click();
    }
    @Then("user goto youtube press follow")
    public void  clikonfollow(){
        home.clikonfollow().click();
      String  expectedres="https://www.youtube.com/user/nopCommerce";
      String actualres="https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(actualres,expectedres);
    }

}
