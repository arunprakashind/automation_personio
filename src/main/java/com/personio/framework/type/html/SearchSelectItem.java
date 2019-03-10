package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
Class for Search Select Items in web page
 */
public class SearchSelectItem extends HtmlElement {

    public SearchSelectItem (RemoteWebDriver driver, String id) {
        super (driver, id);
    }

    public SearchSelectItem (RemoteWebDriver driver, String id, By.ByType byType) {
        super (driver, id, byType);
    }

    public void SearchSelect (String item) {
        WebElement parent = getElement().findElement(By.xpath(".."));
        WebElement link = parent.findElement(By.all(By.ByType.CSS, "a.chosen-single"));
        if (link != null) {
            link.click();
        }
        else {
            throw new AssertionError("Element not found");
        }
        WebElement textBox = parent.findElement(By.all(By.ByType.CSS, "input.chosen-search-input"));
        textBox.sendKeys(item);
        WebElement toBeSelected = parent.findElement(By.cssSelector("li.active-result.highlighted"));
        if (toBeSelected != null) {
            toBeSelected.click();
        }
    }
}
