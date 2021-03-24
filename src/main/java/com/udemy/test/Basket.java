package com.udemy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basket {
    WebDriver webDriver;
    By courseInBasketBy = By.xpath("//*[@id=\"udemy\"]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/ul[1]/div/li/div/div[2]/a/div");

    public Basket(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean coureseIsDisplayed(){
        boolean isCourseAdded = webDriver.findElement(courseInBasketBy).isDisplayed();
        return isCourseAdded;
    }
}
