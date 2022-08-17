package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D04_searchStepDef {

    P03_homePage home=new P03_homePage();

    @Given("user go to search filed")
    public void searchFiled(){
        home.searchFiled().click();
    }

     @When("tab to write product name")

     public void writeName(){
         home.writeName().sendKeys("book");
     }

     @And("user tab on search button")
     public void searchBTn(){
         home.searchBTn().click();
     }
     @Then("user go to the product")
    public void searchVal(){
   String expetedres="https://demo.nopcommerce.com/search?q=book";
      Boolean actualRes= home.searchVal().isDisplayed();
         Assert.assertTrue(actualRes,expetedres);
     }
    @When("tab to write sku")

    public void writesku(){
        home.writeName().sendKeys("SCI_FAITH");
    }

    @And("user tab on search buttonn")
    public void searchBTnn(){
        home.searchBTnn().click();
    }
    @Then("user go to the products")
    public void searchVale(){
        String expetedres="https://demo.nopcommerce.com/search?q=SCI_FAITH";
        Boolean actualRes= home.searchVale().isDisplayed();
        Assert.assertTrue(actualRes,expetedres);
    }



}
