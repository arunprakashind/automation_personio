package com.personio.framework.web;

import com.personio.framework.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    private RemoteWebDriver driver;
    private String id;
    private By.ByType byType;
    private long pageWait = 2*60; //2 minutes

    public Page (RemoteWebDriver driver, String id, By.ByType byType) {
        this.driver = driver;
        this.id = id;
        this.byType = byType;
        this.waitForPage();
    }

    public RemoteWebDriver getDriver () {
        return this.driver;
    }

    public void waitForPage () {
        WebDriverWait wait = new WebDriverWait(this.driver, this.pageWait);
        String state = (String)this.driver.executeScript("return document.readyState;", new Object[0]);
        if (!"complete".equals(state)) {
            (new WebDriverWait(this.driver, this.pageWait)).until((driverWait) -> {
                return "complete".equals(((JavascriptExecutor)driverWait).executeScript("return document.readyState;", new Object[0]));
            });
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.all(byType, id)));
    }
}