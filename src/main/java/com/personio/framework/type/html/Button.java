package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Button extends HtmlElement {

    public Button (RemoteWebDriver driver, String id) {
        super(driver, id);
    }

    public Button (RemoteWebDriver driver, String id, By.ByType byType) {
        super(driver, id, byType);
    }

    public Button (RemoteWebDriver driver, WebElement parentElement, String id, By.ByType byType) {

        super (driver, parentElement, id, byType);
    }
}
