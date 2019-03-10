package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Class for Text area element in web page
 */
public class TextArea extends HtmlElement {

    public TextArea (RemoteWebDriver driver, String id) {
        super (driver, id);
    }

    public TextArea (RemoteWebDriver driver, String id, By.ByType byType) {
        super (driver, id, byType);
    }

    public TextArea (RemoteWebDriver driver, String id, By.ByType byType, int index) {
        super (driver, id, byType, index);
    }
}
