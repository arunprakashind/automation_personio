package org.personio.steps;

import com.personio.framework.TestState;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class EmployeePageSteps extends TestState {

    public EmployeePageSteps () {
        super ();
    }

    @Then("^Employees page is loaded$")
    public void employeesPageIsLoaded () {
        Assert.assertTrue(HomePage().EmployeesPage().IsLoaded());
    }

    @Then("^Employee Details page is loaded$")
    public void employeeDetailsPageIsLoaded () {
        Assert.assertTrue(HomePage().EmployeeDetailsPage().IsLoaded());
    }

    @When("^I click the employee link (.*) in Employees table$")
    public void iClickLinkInEmployeesTable (String linkText) {
        HomePage().EmployeesPage().EmployeesTable().waitForVisibility();
        HomePage().EmployeesPage().EmployeesTable().findAndClickLink(linkText);
    }

    @When("^I click the tab (.*) in Employee details page$")
    public void iClickEmployeeDetailsTab (String tabName) {
        HomePage().EmployeeDetailsPage().Tab(tabName).click();
    }

    @Then("^the link (.*) is (present|not present) in the employee details tab$")
    public void presenceOfLinkInTab (String linkText, String visibility) {
        switch (visibility) {
            case "present":
                Assert.assertTrue(HomePage().EmployeeDetailsPage().LinkInTab(linkText).isVisible());
                break;
            case "not present":
                Assert.assertFalse(HomePage().EmployeeDetailsPage().LinkInTab(linkText).isVisible());
                break;
        }
    }
}
