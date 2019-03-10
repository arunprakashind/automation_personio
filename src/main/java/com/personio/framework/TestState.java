package com.personio.framework;

import com.personio.framework.web.Browser;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.personio.pom.home.HomePage;
import org.personio.pom.LoginPage;

/*
Test State which manages the state of the test
 */
public class TestState {
    private static Browser browser;

    /*
    Initialize Test State
     */
    public TestState () {
        if (TestState.browser == null) {
            TestState.browser = new Browser();
        }
    }

    /*
    Returns the remote driver
     */
    public RemoteWebDriver getDriver () {
        return TestState.browser.getDriver();
    }

    /*
    Destroy the browser
     */
    public static void destroy () {
        if (TestState.browser != null) {
            TestState.browser.quitDriver();
            TestState.browser = null;
        }
    }

    public LoginPage LoginPage () {
        return new LoginPage(getDriver());
    }

    public HomePage HomePage () {
        return new HomePage(getDriver());
    }
}
