package org.personio.steps;

import com.personio.framework.TestState;
import cucumber.api.java.en.When;

/*
Step defintion for Login page
 */
public class LoginSteps extends TestState {

    public LoginSteps () {
        super();
    }

    @When("^I login to application using username (.*) and password (.*)$")
    public void iLoginToApplication (String userName, String password) {
        LoginPage().UserName().SendKeys(userName);
        LoginPage().Password().SendKeys(password);
        LoginPage().Login().click();
    }
}
