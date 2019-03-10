package org.personio.pom.home.settings.onboarding;

import com.personio.framework.By;
import com.personio.framework.type.html.*;
import com.personio.framework.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

/*
Page class for Onboarding Steps page
 */
public class OnBoardingStepsPage extends Page {

    public OnBoardingStepsPage (RemoteWebDriver driver) {
        super (driver, "//h4[text()='Steps']", By.ByType.Xpath);
    }

    public TextField StepName () {
        return new TextField (getDriver(), "input[name='step_name']", By.ByType.CSS);
    }

    public Button AddStep () {
        return new Button (getDriver(), "//form[contains(@action,'add-step')]//button[@type='submit']",By.ByType.Xpath);
    }

    public Button AddItem () {
        WebElement parent = this.Div ("div.block-section.active", By.ByType.CSS).getElement();
        return new Button (getDriver(), parent, ".//a[@href='#modal-add-item']", By.ByType.Xpath);
    }

    public Select ItemType () {
        WebElement item = new SelectItem (getDriver(), "item_type", By.ByType.Name).getElement();
        return new Select(item);
    }

    public Button Create () {
        return new Button (getDriver(), "//button[text()='Create']", By.ByType.Xpath);
    }

    public TextArea StepItemTextArea(String stepName, int index) {
        return new TextArea (getDriver(), "//div[./h4[contains(text(), '" + stepName + "')]]//textarea", By.ByType.Xpath, index);
    }

    public Checkbox StepItemCheckbox (String stepName, int index) {
        return new Checkbox (getDriver(), "//div[./h4[contains(text(), '" + stepName + "')]]//i[contains(@class,'fa-check-square')]", By.ByType.Xpath, index);
    }

    public Button SaveChanges (String stepName) {
        return new Button (getDriver(), "//div[./h4[contains(text(), '" + stepName + "')]]//button[contains(@class,'btn btn-sm btn-primary')]", By.ByType.Xpath);
    }

    public Link StepLink (String stepName) {
        return new Link (getDriver(), this.Div("step_list", By.ByType.Id).getElement(), "//a[contains(text(),'" + stepName + "')]", By.ByType.Xpath);
    }

    public Link DeleteStep (String stepName) {
        return new Link (getDriver(), "//div[./h4[contains(text(), '" + stepName + "')]]//a[@href='#modal-delete-step']", By.ByType.Xpath);
    }

    public Div DeleteStepDialog () {
        return new Div (getDriver(), "modal-delete-step", By.ByType.Id);
    }

    public Button DeleteStepConfirm () {
        return new Button (getDriver(), DeleteStepDialog().getElement(), ".//button[text()='Delete']", By.ByType.Xpath);
    }
}
