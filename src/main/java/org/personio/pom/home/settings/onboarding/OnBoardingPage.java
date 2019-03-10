package org.personio.pom.home.settings.onboarding;

import com.personio.framework.By;
import com.personio.framework.type.html.Link;
import com.personio.framework.web.Page;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Page Class for Onboarding page
 */
public class OnBoardingPage extends Page {

    public OnBoardingPage (RemoteWebDriver driver) {
        super (driver, "employee_details_tab", By.ByType.Id);
    }

    public Link Tab (String tabName) {
        return new Link (getDriver(), "//a[contains(text(),'" + tabName + "')]", By.ByType.Xpath);
    }

    public OnBoardingStepsPage OnBoardingStepsPage () {
        return new OnBoardingStepsPage (getDriver());
    }

    public OnBoardingTemplatesPage OnBoardingTemplatesPage () {
        return new OnBoardingTemplatesPage(getDriver());
    }
}
