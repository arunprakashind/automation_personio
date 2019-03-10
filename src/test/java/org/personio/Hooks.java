package org.personio;

import com.personio.framework.TestState;
import cucumber.api.java.After;

/*
Hooks class for after scenario
 */
public class Hooks {

    /*
    Destroy the browser after scenario is finished
     */
    @After
    public void afterScenario() {
        TestState.destroy();
    }
}
