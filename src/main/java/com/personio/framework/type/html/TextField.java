package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Class for Textfield element in web page
 */
public class TextField extends HtmlElement {

    public TextField(RemoteWebDriver driver, String id) {
        super(driver, id);
    }

    public TextField(RemoteWebDriver driver, String id, By.ByType byType) {
        super(driver, id, byType);
    }
}
