package org.personio.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features/onboarding.feature"},
        glue = {"org.personio"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"html:TestResults/cucumber-result",
                "com.cucumber.listener.ExtentCucumberFormatter:TestResults/EReport/report.html",
                "json:TestResults/cucumber-result/cucumber.json",
                "pretty:TestResults/cucumber-result/cucumber-pretty.txt",
                "usage:TestResults/cucumber-result/cucumber-usage.json"}
)
public class OnBoardingSuiteRunner {

}
