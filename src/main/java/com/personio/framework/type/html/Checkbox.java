package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Class for Checkbox elements in web page
 */
public class Checkbox extends HtmlElement {

    public Checkbox (RemoteWebDriver driver, String id) {
        super (driver, id);
    }

    public Checkbox (RemoteWebDriver driver, String id, By.ByType byType) {
        super (driver, id, byType);
    }

    public Checkbox (RemoteWebDriver driver, String id, By.ByType byType, int index) {
        super (driver, id, byType, index);
    }
}
