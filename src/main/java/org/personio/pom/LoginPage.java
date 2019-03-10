package org.personio.pom;

import com.personio.framework.By;
import com.personio.framework.type.html.Button;
import com.personio.framework.type.html.TextField;
import com.personio.framework.web.Page;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Page Class for Login page
 */
public class LoginPage extends Page {

    public LoginPage (RemoteWebDriver driver) {
        super(driver, "label[for=email]", By.ByType.CSS);
    }

    public TextField UserName () {
        return new TextField(getDriver(), "email");
    }

    public TextField Password () {
        return new TextField(getDriver(), "password");
    }

    public Button Login () {
        return new Button(getDriver(), "button[type=submit]", By.ByType.CSS);
    }
}
