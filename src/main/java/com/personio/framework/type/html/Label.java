package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Label extends HtmlElement {

    public Label (RemoteWebDriver driver, String id) {
        super (driver, id);
    }

    public Label (RemoteWebDriver driver, String id, By.ByType byType) {
        super (driver, id, byType);
    }
}
