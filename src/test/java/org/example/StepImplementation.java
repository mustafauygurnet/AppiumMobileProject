package org.example;

import com.thoughtworks.gauge.Step;
import org.example.pages.SearchFlightPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pages.StartPage;

public class StepImplementation{
    Logger logger;

    public StepImplementation(){
        logger = LogManager.getLogger(StepImplementation.class);
    }

    StartPage startPage = new StartPage();
    SearchFlightPage searchFlightPage = new SearchFlightPage();

    // Start Page
    @Step("Çerezleri kabul et")
    public void clickCookies(){
        startPage.clickCookies();
        logger.info("çerezler kabul edildi");
    }

    @Step("Book a Flight butonuna Tıkla")
    public void clickToFlight(){
        startPage.clickToFlight();
        logger.info("book a flight butonuna basıldı");
    }

    // Search Flight Page

    @Step("One Way Tıkla")
    public void chooseOneWay(){
        searchFlightPage.chooseOneWayTab();
        logger.info("One way tabına tıklanıldı");
    }

    @Step("Kalkış Belirle")
    public void from(){
        searchFlightPage.from();
        logger.info("Kalkış Belirlendi");
    }

    @Step("Kalkış Havalimanı Seç")
    public void fromAirport(){
        searchFlightPage.fromAirport();
        logger.info("kalkış havalimanı belirlendi");
    }

    @Step("Varış Belirle")
    public void to(){
        searchFlightPage.to();
        logger.info("varış belirlendi");
    }

    @Step("Varış Havalimanı Belirle")
    public void toAirport(){
        searchFlightPage.toAirport();
        logger.info("varış havalimanı belirlendi");
    }

    @Step("Şuanki tarihten itibaren <int> gün Ekle")
    public void addToDate(int day){
        searchFlightPage.addToDate(day);
        logger.info("extra gün seçildi");
    }

    @Step("Uçuşları Listele")
    public void searchFromToFlight(){
        searchFlightPage.searchFromToFlight();
        logger.info("Uçuşlar listelendi");
    }

    @Step("Kontrol Et / Ara")
    public void check(){
        searchFlightPage.checkToFlight();
        logger.info("kontrol başarılı");
    }



    @Step("Eco Class Seç")
    public void chooseToEconomicClass(){
        searchFlightPage.chooseToEconomicClass();
        logger.info("Eco class seçildi");
    }
}
