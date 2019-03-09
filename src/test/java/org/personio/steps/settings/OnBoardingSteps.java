package org.personio.steps.settings;

import com.personio.framework.By;
import com.personio.framework.TestState;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnBoardingSteps extends TestState {

    public OnBoardingSteps () {
        super ();
    }

    @Then("^Onboarding page is displayed$")
    public void onBoardingPageIsDisplayed () {
        HomePage().SettingsPage().OnBoardingPage().Link("//a[contains(text(),'Onboarding Templates')]", By.ByType.Xpath).isVisible();
    }

    @When("^I click on Onboarding Steps link$")
    public void iClickOnBoardingSteps () {
        HomePage().SettingsPage().OnBoardingPage().OnboardingSteps().click();
    }

    @When("^I click on Onboarding Templates link$")
    public void iClickOnBoardingTemplates () {
        HomePage().SettingsPage().OnBoardingPage().OnboardingTemplate().click();
    }

    @Then("^Onboarding Steps page is loaded$")
    public void onBoardingStepsPageIsLoaded () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepName().isVisible();
    }

    @Then("^Onboarding Templates page is loaded$")
    public void onBoardingTemplatesPageIsLoaded () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().TemplateName().isVisible();
    }

    @When("^I enter (.*) in the step name field and click on Add Step button$")
    public void iEnterStepAndClickAddNew (String stepName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepName().SendKeys(stepName);
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().AddStep().click();
    }

    @And("^I click on Add item link")
    public void iClickOnAddItem () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().AddItem().click();
    }

    @And("^I select the item (.*) in the Item type dropdown$")
    public void iSelectItemType (String item) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().ItemType().selectByVisibleText(item);
    }

    @And("^I click on Create button$")
    public void iClickCreateButton () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().Create().click();
    }

    @Then("^Text area item for step (.*) is present at index (\\d+)$")
    public void textAreaItemIsPresentAtIndex (String stepName, int index) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepItemTextArea(stepName, index).isVisible();
    }

    @Then("^Add item to Steps dialog is opened$")
    public void addItemDialogIsOpened () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().Div("//h4[text()='Add item to step']", By.ByType.Xpath).isVisible();
    }

    @And("^Checkbox item for step (.*) is present at index (\\d+)$")
    public void checkBoxItemIsPresentAtIndex (String stepName, int index) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepItemCheckbox(stepName, index).isVisible();
    }

    @And("^I click on Save Changes button for step (.*)$")
    public void iClickSaveChangesButton (String stepName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().SaveChanges(stepName).click();
    }

    @When("^I enter (.*) in the Template Name field and click on Add Template button$")
    public void iEnterTemplateName (String templateName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().TemplateName().SendKeys(templateName);
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().AddTemplate().click();
    }

    @When("^I click on Add Step button in Onboarding templates page for template (.*)$")
    public void iClickOnAddStepButtonTemplates (String templateName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().AddStep(templateName).click();
    }

    @Then("^Add Template dialog is opened$")
    public void addTemplateDialogIsOpened () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().Div("//h4[text()='Add step to template']", By.ByType.Xpath);
    }

    @When("^I select the item (.*) in the Step list$")
    public void iSelectItemInStepList (String item) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().Step().SearchSelect(item);
    }

    @When("^I select the item (.*) in the Responsible list$")
    public void iSelectItemInResponsibleList (String item) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().Responsible().selectByVisibleText(item);
    }

    @When("^I select the deadline as (\\d+) days (before hire|after hire)$")
    public void iSelectDeadline (int days, String item) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().DueDateOffset().SendKeys(days);
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().OffSetDirection().selectByVisibleText(item);
    }

    @When("^I click Create button on Add steps to template page$")
    public void iClickCreateAddStepToTemplate () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().Create().click();
    }

    @Then("^steps table for the template (.*) is visible$")
    public void stepsTableForTemplateIsVisible (String templateName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().StepsTable(templateName).isVisible();
    }
}
