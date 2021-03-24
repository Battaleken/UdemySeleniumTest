package com.udemy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver webDriver;
    By searchboxBy = By.name("q");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ResultPage search(String s){
        webDriver.findElement(searchboxBy).sendKeys(s + Keys.ENTER);

        ResultPage resultPage = new ResultPage(webDriver);
        return resultPage;
    }



}
