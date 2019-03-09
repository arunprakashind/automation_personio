package org.personio.pom.home.settings;

import com.personio.framework.By;
import com.personio.framework.web.Page;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OnBoardingPage extends Page {

    public OnBoardingPage (RemoteWebDriver driver) {
        super (driver, "employee_details_tab", By.ByType.Id);
    }
}
