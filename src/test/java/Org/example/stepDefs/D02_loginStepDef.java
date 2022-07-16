package Org.example.stepDefs;

import Org.example.pages.P02_login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D02_loginStepDef {

    P02_login login = new P02_login();


    @Given("user go to login page")
    public void step1(){
        login.step1().click();
    }

    @When("user login with \"valid\" \"test@example.com\"")
    public  void validEmail(){

login.ValidEmail().sendKeys("test@example.com");
    }

    @And("user login with \"P@ssw0rd\"")
    public  void  validPassword(){

        login.ValidPassword().sendKeys("123456");
    }

    @And("user press on login button")
    public void loginbtn() throws InterruptedException {
        Thread.sleep(2000);
        login.loginbtn().click();

    }

    @Then("user login to the system successfully")
    public  void successLogin() throws InterruptedException {
        Thread.sleep(2000);
        String expectedmsg="https://demo.nopcommerce.com/";
        String actualurl=login.successLogin().getAttribute(" https://demo.nopcommerce.com/");
        Assert.assertTrue(actualurl.contains(expectedmsg));
    }



//    @Given("user go to login page")
//    public void step2(){
//        login.step2().click();
//    }
//
//    @When("user login with \"invalid\" \"test@example.com\"")
//    public  void invalidEmail(){
//
//        login.inValidEmail().sendKeys("uuu@example.com");
//    }
//
//    @And("user login with \"P@ssw0rd\"")
//    public  void  invalidPassword(){
//
//        login.inValidPassword().sendKeys("12345");
//    }
//
//    @And("user login to the system successfully")
//    public  void pressLogin(){
//        login.pressLogin().click();
//    }
//  @Then("user could not login to the system")
//    public  void faildLogin(){
//      String expected="Login was unsuccessful. Please correct the errors and try again.";
//       String actualmsg= login.faildLogin().getText();
//       Assert.assertTrue(actualmsg.contains(expected));
//  }
}
