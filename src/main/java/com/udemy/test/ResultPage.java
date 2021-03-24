package com.udemy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    WebDriver webDriver;
    By firstcourseBy = By.cssSelector(".course-list--container--3zXPS>:first-of-type");

    public ResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public OrderPage goToOrder(){
        webDriver.findElement(firstcourseBy).click();
        OrderPage orderPage = new OrderPage(webDriver);
        return orderPage;
    }
}
