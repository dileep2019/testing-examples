package com.pik.contact.gui.selenium.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    //static private WebDriver driver;
    public static void main(String[] args) {
           	System.setProperty("webdriver.firefox.marionette",/usr/local/bin/geckodriver");
    //public static WebDriver getDriver() {
        //if (driver == null) {
            WebDriver driver = new FirefoxDriver();    //can be replaced with HtmlUnitDriver for better performance
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.get(
        }
        return driver;
    }

}

