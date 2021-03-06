package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Class for Select Item element in web page
 */
public class SelectItem extends HtmlElement {

    public SelectItem (RemoteWebDriver driver, String id) {
        super(driver, id);
    }

    public SelectItem (RemoteWebDriver driver, String id, By.ByType byType) {
        super (driver, id, byType);
    }
}
