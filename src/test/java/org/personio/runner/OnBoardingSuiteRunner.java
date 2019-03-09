package org.personio.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features/onboarding.feature"},
        glue = "org.personio.steps",
        snippets = SnippetType.CAMELCASE,
        plugin = {"junit:result/cucumber.xml", "json:result/cucumberJsonResult.json", "html:result/cucumberHTML"}
)
public class OnBoardingSuiteRunner {

}
