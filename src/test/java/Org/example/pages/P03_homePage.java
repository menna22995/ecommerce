package Org.example.pages;

import Org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P03_homePage {

    public WebElement logintoAcc() {
        WebElement logintoAcc = Hooks.driver.findElement(By.className("ico-login"));
        return logintoAcc;
    }

    public WebElement enterValidEmail(){
        WebElement enterValidEmail=Hooks.driver.findElement(By.id("Email"));
        return enterValidEmail;
    }

    public WebElement enterValidPassword(){
        WebElement enterValidPassword=Hooks.driver.findElement(By.id("Password"));
        return enterValidPassword;
    }
    public WebElement loginbtn(){
        WebElement loginbtn=Hooks.driver.findElement(By.className("login-button"));
        return loginbtn;
    }
    public  WebElement gotoDropDown(){

        WebElement gotoDropDown=Hooks.driver.findElement(By.id("customerCurrency"));
        return  gotoDropDown;
    }

    public  WebElement changecurr(){
        WebElement changecurr=Hooks.driver.findElement(By.id("customerCurrency"));
        Select dropList= new Select(changecurr);
        dropList.selectByValue("Euro");
        return changecurr;

    }

    public WebElement searchFiled() {
        WebElement searchFiled = Hooks.driver.findElement(By.id("small-searchterms"));
        return searchFiled;
    }

    public WebElement writeName() {
        WebElement writeName = Hooks.driver.findElement(By.id("small-searchterms"));
        return writeName;
    }

    public WebElement searchBTn() {
        WebElement searchBtn = Hooks.driver.findElement(By.className("search-box-button"));
        return searchBtn;
    }
    public WebElement searchVal() {
        WebElement searchVal = Hooks.driver.findElement(By.linkText("https://demo.nopcommerce.com/search?q=book"));
        return searchVal;
    }
//        public WebElement hovermouse() {
//        WebElement hovermouse = Hooks.driver.findElement(By.linkText("Computers"));
//////        Select dropList= new Select(hovermouse);
//////        dropList.selectByValue("Desktops ");
//        return hovermouse;
//      }
    public  WebElement selectCat(){
        WebElement selectCat=Hooks.driver.findElement(By.linkText("Desktops"));
//        Select dropList= new Select(selectCat);
//        dropList.selectByValue("Desktops");
        return selectCat;
    }

    public WebElement navToCat(){
        WebElement navToCat=Hooks.driver.findElement(By.linkText("https://demo.nopcommerce.com/desktops"));
     return navToCat;
    }
    public  WebElement clickonbtn(){
        WebElement clickonbtn=Hooks.driver.findElement(By.className("nivo-control"));
   return  clickonbtn;
    }
    public  WebElement showres(){
        WebElement showres=Hooks.driver.findElement(By.linkText("https://demo.nopcommerce.com/"));
        return  showres;
    }
    public  WebElement clickonicon(){
        WebElement clickonicon=Hooks.driver.findElement(By.linkText("YouTube"));
        return  clickonicon;
    }
    public  WebElement clikonfollow(){
        WebElement clikonfollow=Hooks.driver.findElement(By.className("tp-yt-paper-button"));
        return  clikonfollow;
    }
    public  WebElement selectproduct(){
        WebElement selectproduct=Hooks.driver.findElement(By.className("add-to-wishlist-button"));
        return  selectproduct;
    }
    public  WebElement tabtoadd(){
        WebElement tabtoadd=Hooks.driver.findElement(By.id("add-to-wishlist-button-4"));
        return  tabtoadd;
    }
    public  WebElement added(){
        WebElement added=Hooks.driver.findElement(By.linkText("wishlist"));
        return  added;
    }

}
