package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Generic class for Div elements or ul, li elements in web page
 */
public class Div extends HtmlElement {

    public Div (RemoteWebDriver driver, String id) {
        super (driver, id);
    }

    public Div (RemoteWebDriver driver, String id, By.ByType byType) {
        super (driver, id, byType);
    }
}
