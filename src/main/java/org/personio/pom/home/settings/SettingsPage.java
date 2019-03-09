package org.personio.pom.home.settings;

import com.personio.framework.By;
import com.personio.framework.type.html.Link;
import com.personio.framework.web.Page;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SettingsPage extends Page {

    public SettingsPage (RemoteWebDriver driver) {
        super (driver, "div.personio-submenu-list", By.ByType.CSS);
    }

    public Link OnAndOffBoarding () {
        return new Link (getDriver(), "//a[text()='On-/Offboarding']", By.ByType.Xpath);
    }

    public OnBoardingPage OnBoardingPage () {
        return new OnBoardingPage (getDriver());
    }
}
