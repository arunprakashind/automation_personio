package org.personio.pom.home.settings.onboarding;

import com.personio.framework.By;
import com.personio.framework.type.html.*;
import com.personio.framework.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class OnBoardingTemplatesPage extends Page {

    public OnBoardingTemplatesPage (RemoteWebDriver driver) {
        super (driver, "//h4[text()='Templates']", By.ByType.Xpath);
    }

    public TextField TemplateName () {
        return new TextField (getDriver(), "input[name='template_name']", By.ByType.CSS);
    }

    public Button AddTemplate () {
        return new Button (getDriver(), "//form[contains(@action,'add-template')]//button[@type='submit']",By.ByType.Xpath);
    }

    public Button AddStep (String templateName) {
        return new Button (getDriver(), "//div[./h4/*[text()='" + templateName + "']]//a[@href='#modal-add-step']", By.ByType.Xpath);
    }

    public SearchSelectItem Step () {
        return new SearchSelectItem(getDriver(), "step_id", By.ByType.Name);
    }

    public Select Responsible () {
        WebElement item = new SelectItem(getDriver(), "responsible", By.ByType.Name).getElement();
        return new Select(item);
    }

    public TextField DueDateOffset () {
        return new TextField (getDriver(), "due_date_offset", By.ByType.Name);
    }

    public Select OffSetDirection () {
        WebElement item = new SelectItem(getDriver(), "offset_direction", By.ByType.Name).getElement();
        return new Select(item);
    }

    public Button Create () {
        return new Button (getDriver(), "//button[text()='Create']", By.ByType.Xpath);
    }

    public Table StepsTable (String templateName) {
        return new Table (getDriver(), "//div[./h4/*[text()='" + templateName + "']]//table[contains(@class, 'template-steps')]", By.ByType.Xpath);
    }

    public Button SaveChanges (String templateName) {
        return new Button (getDriver(), "//div[./h4/*[contains(text(), '" + templateName + "')]]//button[contains(@class,'btn btn-sm btn-primary')]", By.ByType.Xpath);
    }
}
