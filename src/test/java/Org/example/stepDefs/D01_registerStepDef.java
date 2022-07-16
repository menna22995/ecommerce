package Org.example.stepDefs;

import Org.example.pages.registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D01_registerStepDef {

    registration reg=new registration();

    @Given("user go to register page")
    public void step1(){

        reg.registerbtn().click();

    }

@When("user select gender type")
public  void selectGender(){

    reg.selectradio().click();

}
@And("user enter first name \"automation\"")
    public  void valid_first_name(){

reg.enterFirstName().sendKeys("automat");
}

    @And("user enter last name \"tester\"")
    public  void valid_last_name(){

        reg.enterLastName().sendKeys("test");
    }
@And("user enter day of birth")
    public  void  valid_DayBirth(){

        reg.enterBirthDay().sendKeys("4");
}

@And("user enter month of birth")
    public void Valid_MonthBirth(){

    reg.enterBirthmonth().sendKeys("5");
}

    @And("user enter year of birth")
    public void Valid_yearBirth(){

        reg.enterBirthYear().sendKeys("4");
    }
    @And("user enter email \"test@example.com\" field")
    public  void  Valid_Email(){
        reg.enterEmail().sendKeys("new@example.com");

    }
 @And("user fills Password field \"P@ssw0rd\"")
    public void valid_password(){
        reg.enterPassword().sendKeys("P@ssw0rd");
 }
    @And("user confirm passsword field\"P@ssw0rd\"")
    public void valid_Confirmpassword(){
        reg.enterConfirmPassword().sendKeys("P@ssw0rd");
      }

    @And("user clicks on register button")
    public void valid_registerButn(){
      reg.registerButn().click();
    }
    @Then("success message is displayed")
    public void success_login() throws InterruptedException {
        Thread.sleep(2000);

        String expectedResult="Your registration completed";
      String actualResult=reg.getsuccessMsg().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

//        String expextedColor="rgba(76, 177, 124, 1)";
//        String actualColor=Hooks.driver.findElement(By.id("result")).getCssValue("color");
//        Assert.assertTrue(actualColor.contains(expextedColor));
    System.out.println("Your registration completed");
    }



}
