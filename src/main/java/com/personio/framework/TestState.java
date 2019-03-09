package com.personio.framework;

import com.personio.framework.web.Browser;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestState {
    private static RemoteWebDriver driver;

    public TestState () {

        if (this.driver == null) {
            this.driver = new Browser().getDriver();
        }
    }

    public RemoteWebDriver getDriver () {
        return this.driver;
    }

    public static void destroy () {

        System.out.println("Closing Driver");
        driver.quit();
    }
}
