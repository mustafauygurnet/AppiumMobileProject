package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.example.pages.Constants.CHOOSE_DAY;
import static org.junit.Assert.assertTrue;

public class BaseMethods extends BaseTest{

    protected static Wait wait;
    int nowDate;
    public void clickById(String key){
        appiumDriver.findElement(By.id(key)).click();
    }

    public void clickByXpath(String key){
        appiumDriver.findElement(By.xpath(key)).click();
    }


    public void sendKeyById(String key,String text){
        appiumDriver.findElement(By.id(key)).sendKeys(text);
    }


    public void waitToElementId(String key)  {
        wait = new FluentWait(appiumDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(1050))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.elementToBeClickable
                (By.id(key)));
    }

    public void waitToXpath(String key){
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath(key)));
    }

    public void doCheckFlight(){
        String check = appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frFlightSearch_tvSortAndFilter")).getText();
        assertTrue("ilgili ucuslar: ", check.contains("SORT"));
        Logger logger = LogManager.getLogger(BaseMethods.class);
        logger.info("check işlemi dogru");
    }

    public void addToDate(int day){
        nowDate = Integer.parseInt(appiumDriver.findElement(By.id(CHOOSE_DAY)).getText()) + day;
    }

    public void selectToDate(){
        String date = "//*[@text = " + "'" + nowDate + "'" + "]";
        clickByXpath(date);
    }
}
