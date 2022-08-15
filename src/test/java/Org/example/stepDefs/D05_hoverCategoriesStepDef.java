package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import Org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage home=new P03_homePage();

   @Given("user hover on first main category")
   public void hovermouse(){
       Actions action = new Actions(driver);
       WebElement btn = Hooks.driver.findElement(By.linkText("Computers"));
       action.moveToElement(btn).perform();

   }
    @When("user select one sub category and select it")
    public void  selectCat(){
        home.selectCat().click();
    }
 @Then("user navigate to sub category page")
 public void navToCat(){
        String expectedRes="https://demo.nopcommerce.com/desktops";
   Boolean ActualRes=  home.navToCat().isDisplayed();
     Assert.assertTrue(ActualRes,expectedRes);
 }
}
