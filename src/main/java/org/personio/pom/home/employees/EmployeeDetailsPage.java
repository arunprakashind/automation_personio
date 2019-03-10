package org.personio.pom.home.employees;

import com.personio.framework.By;
import com.personio.framework.type.html.Link;
import com.personio.framework.web.Page;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EmployeeDetailsPage extends Page {

    public EmployeeDetailsPage (RemoteWebDriver driver) {
        super (driver, "employee_details_tab", By.ByType.Id);
    }

    public Link Tab (String tabName) {
        return new Link (getDriver(), this.getElement(), tabName, By.ByType.linkText);
    }

    public Link LinkInTab (String linkName) {
        return new Link (getDriver(), linkName, By.ByType.linkText);
    }
}
