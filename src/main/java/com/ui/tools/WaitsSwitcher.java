package com.ui.tools;

import com.ui.pageObject.ItemPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitsSwitcher {
    private WebDriver driver;

    public WaitsSwitcher(WebDriver driver) {
        this.driver = driver;
    }

    public void setImplicitWaits(int seconds){
        if (seconds > 0) {
            driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        }
    }

    public <V> V setExplicitWait(int seconds, Function<? super WebDriver, V> condition){
        WebDriverWait driverWait = new WebDriverWait(driver, seconds);
        return driverWait.until(condition);
    }

    public void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}