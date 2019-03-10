package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Class for Link elements in web page
 */
public class Link extends HtmlElement {

    public Link (RemoteWebDriver driver, String id) {
        super(driver, id);
    }

    public Link (RemoteWebDriver driver, String id, By.ByType byType) {
        super(driver, id, byType);
    }

    public Link (RemoteWebDriver driver, WebElement parentElement, String id, By.ByType byType) {
        super(driver, parentElement, id, byType);
    }
}
