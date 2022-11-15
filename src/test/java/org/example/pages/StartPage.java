package org.example.pages;

import org.example.base.BaseMethods;
import org.example.base.BaseTest;

public class StartPage extends BaseTest {

    BaseMethods baseMethods = new BaseMethods();

    public void clickCookies(){
        baseMethods.waitToElementId(Constants.COOKIES_BUTTON);
        baseMethods.clickById(Constants.COOKIES_BUTTON);
    }

    public void clickToFlight(){
        baseMethods.waitToElementId(Constants.BOOKING_BUTTON);
        baseMethods.clickById(Constants.BOOKING_BUTTON);
    }
}
