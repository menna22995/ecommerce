package Org.example.stepDefs;

import Org.example.pages.invalidLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class inValid_login {
    invalidLogin log=new invalidLogin();


    @Given("user navigate login page")
    public void step2(){
        log.step2().click();
    }

    @When("user login with \"invalid\" \"test@example.com\"")
    public  void invalidEmail(){

        log.invalidEmail().sendKeys("tttest@example.com");
    }
    @And("user login with invalid\"P@ssw0rd\"")
    public void invalidpass(){

        log.invalidPass().sendKeys("123456");
    }
    @And("user presss on login button")
    public void loginbtnn() throws InterruptedException {
        Thread.sleep(2000);
        log.loginbtnn().click();
    }
    @Then("user could not login to the system")
    public  void failedlogin(){
        String expected_msg="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
       String actual_msg= log.failedlogin().getText();
        Assert.assertTrue(actual_msg.contains(expected_msg));
    }
}
