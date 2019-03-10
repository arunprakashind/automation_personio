package org.personio.pom.home.employees;

import com.personio.framework.By;
import com.personio.framework.type.html.Table;
import com.personio.framework.web.Page;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EmployeesPage extends Page {

    public EmployeesPage (RemoteWebDriver driver) {
        super (driver, "div.js-staff-root", By.ByType.CSS);
    }

    public Table EmployeesTable () {
        return new Table (getDriver(), "staff_table", By.ByType.Id);
    }
}
