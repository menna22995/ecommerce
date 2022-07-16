package Org.example.pages;

import Org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registration {
    public WebElement registerbtn(){
        WebElement registerbtn= Hooks.driver.findElement(By.className("ico-register"));
       return registerbtn;


    }
    public WebElement selectradio(){
     WebElement   selectradio= Hooks.driver.findElement(By.xpath("//input[@id='gender-male']"));
     return selectradio;
    }



public WebElement enterFirstName(){
        WebElement enterFirstName=Hooks.driver.findElement(By.xpath("//input[@id='FirstName']"));
        return enterFirstName;

}

    public WebElement enterLastName(){
        WebElement enterLastName=Hooks.driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        return enterLastName;

    }

    public WebElement enterBirthDay(){

       // WebElement list=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        WebElement enterBirthDay=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select dropList= new Select(enterBirthDay);
        dropList.selectByValue("4");
        return enterBirthDay;


    }
    public WebElement enterBirthmonth(){

        // WebElement list=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        WebElement enterBirthmonth=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select dropList= new Select(enterBirthmonth);
        dropList.selectByIndex(5);
        return enterBirthmonth;


    }

    public WebElement enterBirthYear(){

        // WebElement list=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        WebElement enterBirthYear=Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select dropList= new Select(enterBirthYear);
        dropList.selectByIndex(4);
        return enterBirthYear;


    }

    public  WebElement enterEmail(){
        WebElement enterEmail=Hooks.driver.findElement(By.id("Email"));
        return enterEmail;
    }
    public  WebElement enterPassword(){
        WebElement enterPassword=Hooks.driver.findElement(By.id("Password"));
        return enterPassword;
    }

    public  WebElement enterConfirmPassword(){
        WebElement enterConfirmPassword=Hooks.driver.findElement(By.id("ConfirmPassword"));
        return enterConfirmPassword;
    }

    public WebElement registerButn(){
        WebElement registerButn= Hooks.driver.findElement(By.id("register-button"));



        return registerButn;



    }

    public WebElement getsuccessMsg(){
        WebElement getsuccessMsg= Hooks.driver.findElement(By.className("result"));
        return getsuccessMsg;


    }

}

