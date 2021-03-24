package com.udemy.test;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UdemyOrder extends BaseTest {


    @Test
    public void UdemyTest(){

        HomePage homePage = new HomePage(webDriver);
        String s = "test";

        ResultPage resultPage = homePage.search(s);
        OrderPage orderPage = resultPage.goToOrder();

        orderPage.closePopUp();
        orderPage.addToBasket();

        Basket basket = orderPage.goToBasket();
        boolean isDisplayed = basket.coureseIsDisplayed();
        assertEquals(isDisplayed , true);



    }

}
//TODO PAGE OBJECT
/* BASE test
*HOME PAGE
* RESULT PAGE
* order page
* basket
 */
