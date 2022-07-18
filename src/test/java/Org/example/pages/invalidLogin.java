package Org.example.pages;

import Org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class invalidLogin {
    public WebElement step2() {
        WebElement step2 = Hooks.driver.findElement(By.className("ico-login"));
        return step2;
    }
 public WebElement invalidEmail(){

     WebElement inValidEmail=Hooks.driver.findElement(By.id("Email"));
     return inValidEmail;
 }
 public WebElement invalidPass(){
        WebElement inValidPass=Hooks.driver.findElement(By.id("Password"));
        return  inValidPass;
 }

    public WebElement loginbtnn(){
        WebElement loginbtnn=Hooks.driver.findElement(By.className("login-button"));
        return loginbtnn;
    }

    public WebElement failedlogin(){
        WebElement failedlogin=Hooks.driver.findElement(By.className("validation-summary-errors"));
        return  failedlogin;
    }
}