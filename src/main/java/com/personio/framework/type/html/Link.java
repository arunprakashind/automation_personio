package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Link extends HtmlElement {

    public Link (RemoteWebDriver driver, String id) {
        super(driver, id);
    }

    public Link (RemoteWebDriver driver, String id, By.ByType byType) {
        super(driver, id, byType);
    }
}
