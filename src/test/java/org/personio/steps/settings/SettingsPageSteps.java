package org.personio.steps.settings;

import com.personio.framework.By;
import com.personio.framework.TestState;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
Steps definition for Settings page
 */
public class SettingsPageSteps extends TestState {

    public SettingsPageSteps () {
        super ();
    }

    @Then("^Settings page is loaded$")
    public void settingsPageIsLoaded () {
        HomePage().SettingsPage().Label("//strong[text()='Settings']", By.ByType.Xpath).isVisible();
    }

    @When("^I click on On/Offboarding link in settings page$")
    public void iClickOnOnOffBoarding () {
        HomePage().SettingsPage().OnAndOffBoarding().click();
    }
}
