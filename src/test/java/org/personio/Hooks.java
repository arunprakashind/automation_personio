package org.personio;

import com.personio.framework.TestState;
import cucumber.api.java.After;

public class Hooks {

    @After
    public void afterScenario() {
        TestState.destroy();
    }
}
