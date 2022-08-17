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
        WebElement searchVal = Hooks.driver.findElement(By.linkText("Apple MacBook Pro 13-inch"));
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
    public  WebElement clickTwittericon(){
        WebElement clickTwittericon=Hooks.driver.findElement(By.linkText("Twitter"));
        return  clickTwittericon;
    }
    public  WebElement clikTwitterfollow(){
        WebElement clikTwitterfollow=Hooks.driver.findElement(By.className("r-poiln3"));
        return  clikTwitterfollow;
    }
    public  WebElement clickFacebookicon(){
        WebElement clickFacebookicon=Hooks.driver.findElement(By.linkText("Facebook"));
        return  clickFacebookicon;
    }
    public  WebElement clikFacebookfollow(){
        WebElement clikFacebookfollow=Hooks.driver.findElement(By.className("r-poiln3"));
        return  clikFacebookfollow;
    }
    public  WebElement clickrssicon(){
        WebElement clickrssicon=Hooks.driver.findElement(By.linkText("RSS"));
        return  clickrssicon;
    }
    public  WebElement clikrssfollow(){
        WebElement clikrssfollow=Hooks.driver.findElement(By.className("r-poiln3"));
        return  clikrssfollow;
    }

    public  WebElement clickonbtnnext(){
        WebElement clickonbtnnext=Hooks.driver.findElement(By.className("nivo-control active"));
        return  clickonbtnnext;
    }
    public  WebElement showenext(){
        WebElement showenext=Hooks.driver.findElement(By.linkText("https://demo.nopcommerce.com/iphone-6"));
        return  showenext;
    }



    public  WebElement gotoDropDownlist(){

        WebElement gotoDropDownlist=Hooks.driver.findElement(By.id("customerCurrency"));
        return  gotoDropDownlist;
    }

    public  WebElement selectCurrSec(){
        WebElement selectCurrSec=Hooks.driver.findElement(By.id("customerCurrency"));
        Select dropList= new Select(selectCurrSec);
        dropList.selectByValue("Euro");
        return selectCurrSec;

    }
    public  WebElement selectCurrthird(){
        WebElement selectCurrthird=Hooks.driver.findElement(By.id("customerCurrency"));
        Select dropList= new Select(selectCurrthird);
        dropList.selectByValue("Euro");
        return selectCurrthird;

    }
    public  WebElement selectCurrfourth(){
        WebElement selectCurrfourth=Hooks.driver.findElement(By.id("customerCurrency"));
        Select dropList= new Select(selectCurrfourth);
        dropList.selectByValue("Euro");
        return selectCurrfourth;

    }

    public WebElement searchBTnn() {
        WebElement searchBtnn = Hooks.driver.findElement(By.className("search-box-button"));
        return searchBtnn;
    }
    public WebElement searchVale() {
        WebElement searchVale = Hooks.driver.findElement(By.linkText("Science & Faith"));
        return searchVale;
    }

}
