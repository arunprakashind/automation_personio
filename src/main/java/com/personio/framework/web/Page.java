package com.personio.framework.web;

import com.personio.framework.By;
import com.personio.framework.type.html.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
Base Class for pages in the application
 */
public class Page {

    private RemoteWebDriver driver;
    private String id;
    private By.ByType byType;
    private boolean pageLoaded;
    private WebElement element;
    private long pageWait = 2*60; //2 minutes

    /*
    Find page using different locators
     */
    public Page (RemoteWebDriver driver, String id, By.ByType byType) {
        this.driver = driver;
        this.id = id;
        this.byType = byType;
        this.waitForPage();
    }

    /*
    Return the remote driver
     */
    public RemoteWebDriver getDriver () {
        return this.driver;
    }

    /*
    Wait for the page to load fully
     */
    public void waitForPage () {
        WebDriverWait wait = new WebDriverWait(this.driver, this.pageWait);
        String state = (String)this.driver.executeScript("return document.readyState;", new Object[0]);
        if (!"complete".equals(state)) {
            (new WebDriverWait(this.driver, this.pageWait)).until((driverWait) -> {
                return "complete".equals(((JavascriptExecutor)driverWait).executeScript("return document.readyState;", new Object[0]));
            });
        }
        Long jsState = (Long)this.driver.executeScript("return jQuery.active;", new Object[0]);
        if (0 != jsState) {
            (new WebDriverWait(this.driver, this.pageWait)).until((driverWait) -> {
                return 0 == (Long)((JavascriptExecutor)driverWait).executeScript("return jQuery.active;", new Object[0]);
            });
        }
        try {
            this.element = wait.until(ExpectedConditions.presenceOfElementLocated(By.all(byType, id)));
            this.pageLoaded = true;
        }
        catch (NullPointerException | NoSuchElementException ex) {
            this.element = null;
            this.pageLoaded = false;
        }
    }

    /*
    Return if the page is loaded or not
     */
    public boolean IsLoaded () {
        return this.pageLoaded;
    }

    /*
    Return the Page element object
     */
    public WebElement getElement () {
        return this.element;
    }

    /*
    Find and return Div element using different locators
     */
    public Div Div (String id, By.ByType byType) {
        return new Div (getDriver(), id, byType);
    }

    /*
    Find and return Button element using different locators
     */
    public Button Button (String id, By.ByType byType) {
        return new Button (getDriver(), id, byType);
    }

    /*
    Find and return Textfield element using different locators
     */
    public TextField TextField (String id, By.ByType byType) {
        return new TextField (getDriver(), id, byType);
    }

    /*
    Find and return Link element using different locators
     */
    public Link Link (String id, By.ByType byType) {
        return new Link (getDriver(), id, byType);
    }

    /*
    Find and return Label element using different locators
     */
    public Label Label (String id, By.ByType byType) {
        return new Label (getDriver(), id, byType);
    }
}