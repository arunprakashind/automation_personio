package com.personio.framework.web;

import com.personio.framework.util.Utilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.util.Properties;

public class Browser {

    private RemoteWebDriver driver;
    private String browser;
    private String url;

    public Browser () {

        this.getProperties();
        switch (this.browser) {
            case "chrome":
                this.setUpChromeDriver();
                break;
            case "firefox":
                this.setupFirefoxDriver();
        }
        this.driver.get(this.url);
    }

    public RemoteWebDriver getDriver () {
        return this.driver;
    }

    public void setUpChromeDriver () {
        try {
            File file = new File(System.getProperty("user.dir") + File.separator + "lib" + File.separator + "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            this.driver = new ChromeDriver();
        }
        catch (Exception ex) {
            throw new AssertionError("Failure getting chromedriver : " + ex.getMessage());
        }
    }

    public void setupFirefoxDriver () {
        try {

            File file = new File(System.getProperty("user.dir") + File.separator + "lib" + File.separator + "geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
            this.driver = new FirefoxDriver();
        }
        catch (Exception ex) {
            throw new AssertionError("Failure getting firefox driver : " + ex.getMessage());
        }
    }

    public void getProperties () {
        Properties properties = new Utilities().getProperties();
        this.browser = properties.getProperty("browser");
        this.url = properties.getProperty("url");
    }

    public void quitDriver () {
        this.driver.quit();
    }
}