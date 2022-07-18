package Org.example.pages;

import Org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P02_login {
    public WebElement step1(){
        WebElement step1= Hooks.driver.findElement(By.className("ico-login"));
        return step1;
    }

    public WebElement ValidEmail(){
        WebElement ValidEmail=Hooks.driver.findElement(By.id("Email"));
        return ValidEmail;
    }

    public WebElement ValidPassword(){
        WebElement ValidPassword=Hooks.driver.findElement(By.id("Password"));
        return ValidPassword;
    }

    public WebElement loginbtn(){
        WebElement loginbtn=Hooks.driver.findElement(By.className("login-button"));
        return loginbtn;
    }

    public WebElement successLogin(){
        WebElement successLogin=Hooks.driver.findElement(By.className("ico-account"));
        return  successLogin;
    }




}
