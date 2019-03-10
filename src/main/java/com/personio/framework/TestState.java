package com.personio.framework;

import com.personio.framework.web.Browser;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.personio.pom.home.HomePage;
import org.personio.pom.LoginPage;

public class TestState {
    private static Browser browser;

    public TestState () {

        if (TestState.browser == null) {
            TestState.browser = new Browser();
        }
    }

    public RemoteWebDriver getDriver () {
        return TestState.browser.getDriver();
    }

    public static void destroy () {
        TestState.browser.quitDriver();
        TestState.browser = null;
    }

    public LoginPage LoginPage () {
        return new LoginPage(getDriver());
    }

    public HomePage HomePage () {
        return new HomePage(getDriver());
    }
}
