package org.personio.pom.home;

import com.personio.framework.By;
import com.personio.framework.type.html.Link;
import com.personio.framework.web.Page;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.personio.pom.home.employees.EmployeeDetailsPage;
import org.personio.pom.home.employees.EmployeesPage;
import org.personio.pom.home.settings.SettingsPage;

/*
Page Class for Home page
 */
public class HomePage extends Page {

    public HomePage (RemoteWebDriver driver) {
        super(driver, "header.navbar-fixed-top", By.ByType.CSS);
    }

    public Link Configuration () {
        return new Link (getDriver(), "a[href='/configuration']", By.ByType.CSS);
    }

    public SettingsPage SettingsPage () {
        return new SettingsPage (getDriver());
    }

    public Link Employees () {
        return new Link (getDriver(), "a[href='/staff']", By.ByType.CSS);
    }

    public EmployeesPage EmployeesPage () {
        return new EmployeesPage(getDriver());
    }

    public EmployeeDetailsPage EmployeeDetailsPage () {
        return new EmployeeDetailsPage(getDriver());
    }
}
