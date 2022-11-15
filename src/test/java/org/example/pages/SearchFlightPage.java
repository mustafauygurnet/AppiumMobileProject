package org.example.pages;

import org.example.base.BaseMethods;
import org.example.base.BaseTest;

public class SearchFlightPage extends BaseTest {

    BaseMethods baseMethods = new BaseMethods();


    public void chooseOneWayTab(){
        baseMethods.waitToElementId(Constants.ONE_WAY_TAB);
        baseMethods.clickById(Constants.ONE_WAY_TAB);
    }

    public void from(){
        baseMethods.waitToElementId(Constants.FROM);
        baseMethods.clickById(Constants.FROM);
    }

    public void fromAirport(){
        baseMethods.waitToElementId(Constants.FROM_AIRPORT);
        baseMethods.sendKeyById(Constants.FROM_AIRPORT,Constants.FROM_CITY_CODE);
        baseMethods.waitToXpath(Constants.FROM_CITY_TEXT);
        baseMethods.clickByXpath(Constants.FROM_CITY_TEXT);
    }

    public void to(){
        baseMethods.waitToElementId(Constants.TO);
        baseMethods.clickById(Constants.TO);
    }

    public void toAirport(){
        baseMethods.waitToElementId(Constants.TO_AIRPORT);
        baseMethods.sendKeyById(Constants.TO_AIRPORT,Constants.TO_CITY_CODE);
        baseMethods.waitToXpath(Constants.TO_CITY_TEXT);
        baseMethods.clickByXpath(Constants.TO_CITY_TEXT);
    }

    public void addToDate(int day){
        baseMethods.waitToElementId(Constants.CHOOSE_DAY);
        baseMethods.addToDate(day);
        baseMethods.clickById(Constants.CHOOSE_DAY);
        baseMethods.selectToDate();
        baseMethods.waitToElementId(Constants.CHOOSE_DAY);
        baseMethods.clickById(Constants.DAY_BUTTON);
    }

    public void searchFromToFlight(){
        baseMethods.waitToElementId(Constants.SEARCH_FLIGHT);
        baseMethods.clickById(Constants.SEARCH_FLIGHT);
    }

    public void checkToFlight(){
        baseMethods.waitToElementId(Constants.CHECK_FLIGHT);
        baseMethods.doCheckFlight();
    }

    public void chooseToEconomicClass(){
        baseMethods.clickByXpath(Constants.ECONOMIC_CLASS);
        baseMethods.waitToXpath(Constants.CHOOSE_ECONOMIC_CLASS);
        baseMethods.clickByXpath(Constants.CHOOSE_ECONOMIC_CLASS);
    }
}
