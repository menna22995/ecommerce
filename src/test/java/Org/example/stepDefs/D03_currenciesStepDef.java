package Org.example.stepDefs;

import Org.example.pages.P03_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage home=new P03_homePage();

    @Given("user navigates login page")
        public void logintoAcc(){
                  home.logintoAcc().click();

        }

        @When("user enter valid email")
    public void  enterValidEmail(){
            home.enterValidEmail().sendKeys("neew@e.com");
        }

        @And("user enter valid pass")

        public  void  entervalidPassword(){

            home.enterValidPassword().sendKeys("P@ssw0rd");
        }

    @And("user enter login button")
    public void loginbtn() throws InterruptedException {
        Thread.sleep(2000);
        home.loginbtn().click();

    }

        @And("user go to dropdown list on the top left of home page")

          public void  gotoDropDown(){
        home.gotoDropDown().click();

        }

        @Then("user select Euro currency")
    public  void selectCurr() throws InterruptedException {

            home.changecurr().click();

            String actualval = "€1032.00";
            String expectedval = Hooks.driver.findElement(By.className("price actual-price")).getText();
            Assert.assertTrue(actualval.contains(expectedval));

        }
        //    String expected="€1032.00";
//            String option="Euro";
//            int count=0;
//Thread.sleep(2000);
//        List<WebElement> list=  Hooks.driver.findElements(By.xpath("//select[@id=\"customerCurrency\"]"));
//        for (WebElement i :list) {
//            String curOption = i.getText();
//            if (curOption.contains(option)) {
//                i.click();
//               count ++;
////                break;
//            }
//        }
//        if (count!=0){
//            System.out.println(option);
//        }
//          list.get(2).click();
//
//         String actual = Hooks.driver.findElement(By.className("price actual-price")).getText();
//            Assert.assertTrue(actual.contains(expected));
//    }






    @And("user go to dropdown list on the top left")
    public void  gotoDropDownlist(){
        home.gotoDropDownlist().click();

    }
  @Then("user select Euro currency in second product")
  public  void selectCurrSec() throws InterruptedException {

      home.selectCurrSec().click();

      String actualval = "€1548.00";
      String expectedval = Hooks.driver.findElement(By.className("price actual-price")).getText();
      Assert.assertTrue(actualval.contains(expectedval));

  }
  @Then("user select Euro currency in third product")
  public  void selectCurrthird() throws InterruptedException {

      home.selectCurrthird().click();

      String actualval = "€210.70";
      String expectedval = Hooks.driver.findElement(By.className("price actual-price")).getText();
      Assert.assertTrue(actualval.contains(expectedval));

  }
    @Then("user select Euro currency in fourth product")
    public  void selectCurrfourth() throws InterruptedException {

        home.selectCurrfourth().click();

        String actualval = "€21.50";
        String expectedval = Hooks.driver.findElement(By.className("price actual-price")).getText();
        Assert.assertTrue(actualval.contains(expectedval));

    }

    }
