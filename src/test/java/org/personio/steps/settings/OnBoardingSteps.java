package org.personio.steps.settings;

import com.personio.framework.By;
import com.personio.framework.TestState;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OnBoardingSteps extends TestState {

    public OnBoardingSteps () {
        super ();
    }

    @Then("^Onboarding page is loaded")
    public void onBoardingPageIsDisplayed () {
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().IsLoaded());
    }

    @When("^I select (.*) tab on Onboarding page$")
    public void iClickOnBoardingTemplates (String tabName) {
        HomePage().SettingsPage().OnBoardingPage().Tab(tabName).click();
    }

    @Then("^Onboarding Steps page is loaded$")
    public void onBoardingStepsPageIsLoaded () {
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().IsLoaded());
    }

    @Then("^Onboarding Templates page is loaded$")
    public void onBoardingTemplatesPageIsLoaded () {
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().IsLoaded());
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

    @Then("^Add item to Steps dialog is opened$")
    public void addItemDialogIsOpened () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().Create().waitForLoad();
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().Create().isVisible());
    }

    @And("^I select the item (.*) in the Item type list item")
    public void iSelectItemType (String item) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().ItemType().selectByVisibleText(item);
    }

    @And("^I click on Create button on Add item to Steps Page$")
    public void iClickCreateButton () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().Create().click();
    }

    @Then("^Text area item of index (\\d+) for step (.*) is visible$")
    public void textAreaItemIsPresentAtIndex (int index, String stepName) {
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepItemTextArea(stepName, index).isVisible());
    }

    @And("^Checkbox item of index (\\d+) for step (.*) is visible$")
    public void checkBoxItemIsPresentAtIndex (int index, String stepName) {
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepItemCheckbox(stepName, index).isVisible());
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
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().Create().waitForLoad();
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().Create().isVisible());
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
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().StepsTable(templateName).isVisible());
    }

    @Then("^the item at row (\\d+) and column (\\d+) of template (.*) has text (.*)$")
    public void tableHasText (int row, int column, String templateName, String expectedText) {
        String actualText = HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().StepsTable(templateName).getItem(row, column);
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("^the select item at row (\\d+) and column (\\d+) of template (.*) has value (.*) selected$")
    public void tableHasSelectItem (int row, int column, String templateName, String expectedText) {
        String actualText = HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().StepsTable(templateName).getSelectItemValue(row, column);
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("^the text field at row (\\d+) and column (\\d+) of template (.*) has value (.*)$")
    public void tableHasTextField (int row, int column, String templateName, String expectedText) {
        String actualText = HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().StepsTable(templateName).getTextFieldValue(row, column);
        Assert.assertEquals(expectedText, actualText);
    }

    @When("^I click the Save Changes button for template (.*)")
    public void iClickSaveChangesInAddTemplate (String templateName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().SaveChanges(templateName).click();
    }

    @When("^I click on the template link (.*) in the templates list$")
    public void iClickOnTemplateLink (String templateName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().TemplateLink(templateName).click();
    }

    @When("^I click on the step link (.*) in the steps list$")
    public void iClickOnStepLink (String stepName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepLink(stepName).click();
    }

    @When("^I delete the template (.*)$")
    public void iDeleteTemplate (String templateName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().DeleteTemplate(templateName).click();
    }

    @When("^I delete the step (.*)$")
    public void iDeleteStep (String stepName) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().DeleteStep(stepName).clickChild(true);
    }

    @Then("^the template (.*) is (present|not present) in the templates list$")
    public void checkTemplatePresence (String templateName, String visibility) {
        switch (visibility) {
            case "present":
                Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().TemplateLink(templateName).isVisible());
                break;
            case "not present":
                Assert.assertFalse(HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().TemplateLink(templateName).isVisible());
                break;
        }
    }

    @Then("^the step (.*) is (present|not present) in the steps list$")
    public void checkStepPresence (String stepName, String visibility) {
        switch (visibility) {
            case "present":
                Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepLink(stepName).isVisible());
                break;
            case "not present":
                Assert.assertFalse(HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepLink(stepName).isVisible());
                break;
        }
    }

    @Then("^delete template confirmation dialog (.*) is shown")
    public void deleteTemplateConfirmationDialog (String message) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().DeleteTemplateDialog().waitForLoad();
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().DeleteTemplateDialog().getText().contains(message));
    }

    @Then("^delete step confirmation dialog (.*) is shown")
    public void deleteStepConfirmationDialog (String message) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().DeleteStepDialog().waitForLoad();
        Assert.assertTrue(HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().DeleteStepDialog().getText().contains(message));
    }

    @When("^I click on Delete button in the confirmation dialog for Delete template$")
    public void iClickOnDeleteTemplateConfirmButton () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingTemplatesPage().DeleteTemplateConfirm().click();
    }

    @When("^I click on Delete button in the confirmation dialog for Delete step$")
    public void iClickOnDeleteStepConfirmButton () {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().DeleteStepConfirm().click();
    }

    @When("^I set the Text area item of index (\\d+) for step (.*) with value (.*)$")
    public void iSetTextArea (int index, String stepName, String value) {
        HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepItemTextArea(stepName, index).SendKeys(value);
    }

    @Then("^the Text area item of index (\\d+) for step (.*) has value (.*)$")
    public void textAreaHasValue (int index, String stepName, String expectedValue) {
        String actualValue = HomePage().SettingsPage().OnBoardingPage().OnBoardingStepsPage().StepItemTextArea(stepName, index).getValue();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
