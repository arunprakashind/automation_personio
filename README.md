# automation_personio
E2E Automation Suite for Onboarding feature

Core Path : The Core path I've selected for the Onboarding feature is creating a template step and adding a template based on that step. I'm verifying the template creation by checking if the template is available to assign to an employee. I feel this is the most critical part in the Onboarding flow. The reason is all the end users who is using the application will be doing the onboarding with a template creation. This is the most vital part in onboarding and enough automated tests need to be developed around this to ensure quality.

***Pre requisites***
1. To run the test suite you need to have JDK 8 and Gradle 4.x installed on your machine.
	JDK - https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
	Gradle - https://gradle.org/next-steps/?version=4.4&format=bin
2. Download latest chrome and firefox driver
	Chrome - https://chromedriver.storage.googleapis.com/index.html?path=2.46/
	Firefox - https://github.com/mozilla/geckodriver/releases/download/v0.24.0/geckodriver-v0.24.0-win64.zip

***Steps to Run the Suite***
1. Move the chromedriver.exe and geckodriver.exe to lib folder of project (automation_personio/lib)
2. Open the "automation_personio\src\main\resources\config.properties" and use the browser and site you want to test. The browser support is currently for "chrome" and "firefox" ("chrome" is given as default in the file)
3. Open Command prompt and go to project root folder (automation_personio)
4. Execute command "gradle build"

It will run the test suite. The results can be seen in "automation_personio\TestResults\EReport\report.html"
