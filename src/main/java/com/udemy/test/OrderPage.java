package com.udemy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    WebDriver webDriver;
    By closePopupBy = By.cssSelector(".udlite-btn.udlite-btn-medium.udlite-btn-ghost.udlite-heading-sm.alert-banner--button--21v33");
    By addToBasketBy = By.xpath("//*[@id=\"udemy\"]/div[2]/div[3]/div[1]/div[3]/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[4]/div/button");
    By goToBasketBy = By.xpath("//*[@id=\"udemy\"]/div[13]/div/div[2]/div/div/div/div[1]/div/button");

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void closePopUp(){
        webDriver.findElement(closePopupBy).click();
    }

    public void addToBasket(){
        webDriver.findElement(addToBasketBy).click();
    }

    public Basket goToBasket(){
        webDriver.findElement(goToBasketBy).click();
        Basket basket = new Basket(webDriver);
        return basket;
    }



}
