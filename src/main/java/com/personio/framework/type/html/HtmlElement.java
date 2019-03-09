package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HtmlElement {
    private RemoteWebDriver driver;
    private WebElement element;
    private WebElement parentElement;
    private long clickWait = 1*60; //1 minute

    public HtmlElement(RemoteWebDriver driver, String id) {

        this.driver = driver;
        try {
            this.element = this.driver.findElement(By.all(By.ByType.Id, id));
        } catch (NullPointerException | NoSuchElementException ex) {
            this.element = null;
        }
    }

    public HtmlElement(RemoteWebDriver driver, String id, By.ByType type) {

        this.driver = driver;
        try {
            this.element = this.driver.findElement(By.all(type, id));
        } catch (NullPointerException | NoSuchElementException ex) {
            this.element = null;
        }
    }

    public HtmlElement (RemoteWebDriver driver, String id, By.ByType type, int index) {
        this.driver = driver;
        try {
            List<WebElement> elements = this.driver.findElements(By.all(type, id));
            this.element = elements.get(index);
        } catch (NullPointerException | NoSuchElementException ex) {
            this.element = null;
        }
    }

    public boolean isVisible () {

        if (this.element != null)
            return element.isDisplayed();
        else
            return false;
    }
    public HtmlElement(RemoteWebDriver driver, WebElement parentElement, String id, By.ByType type) {

        this.driver = driver;
        this.parentElement = parentElement;
        try {
            this.element = this.parentElement.findElement(By.all(type, id));
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | StaleElementReferenceException | NoSuchElementException ex) {
            this.element = null;
        }
    }

    public WebElement getElement() {
        return this.element;
    }

    public void SendKeys (String keys) {
        this.getElement().sendKeys(keys);
    }

    public void SendKeys (Integer keys) {
        this.getElement().sendKeys(keys.toString());
    }

    public void click () {

        WebDriverWait clickWait = new WebDriverWait(this.driver, this.clickWait);
        clickWait.until(ExpectedConditions.elementToBeClickable(this.getElement()));
        //this.scrollIntoView();
        try {
            this.element.click();
        }
        catch (Exception ex) {
            if (ex.getMessage().contains("is not clickable at point")) {
                Actions actions = new Actions(this.driver);
                actions.moveToElement(this.element).click().perform();
                return;
            }
            throw ex;
        }
    }

    public void scrollIntoView() {
        JavascriptExecutor javascriptExecutor = this.driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", new Object[]{this.element});
    }
}