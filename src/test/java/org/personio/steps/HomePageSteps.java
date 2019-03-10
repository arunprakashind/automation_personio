package org.personio.steps;

import com.personio.framework.By;
import com.personio.framework.TestState;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
Step definition for Home page
 */
public class HomePageSteps extends TestState {

    public HomePageSteps () {
        super();
    }

    @Then("^Home page is loaded$")
    public void homePageIsLoaded () {
        HomePage().Link("a.header-title-link", By.ByType.CSS).isVisible();
    }

    @When("^I click on Configurations link in home page$")
    public void iClickOnConfiguration () {
        HomePage().Configuration().click();
    }

    @When("^I click on Employees link in home page$")
    public void iClickOnEmployees () {
        HomePage().Employees().click();
    }
}
