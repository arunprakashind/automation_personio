package com.personio.framework.type.html;

import com.personio.framework.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Table extends HtmlElement {

    public Table (RemoteWebDriver driver, String id) {
        super (driver, id);
    }

    public Table (RemoteWebDriver driver, String id, By.ByType byType) {
        super (driver, id, byType);
    }

    public String getItem (int row, int column) {
        String text = null;
        List<WebElement> tableRows = getElement().findElements(By.xpath(".//tr"));
        if (tableRows.size() >= row) {
            List<WebElement> tableColumns = tableRows.get(row).findElements(By.xpath(".//td"));
            if (tableColumns.size() >= column - 1) {
                text = tableColumns.get(column - 1).getText().trim();
            }
            else {
                throw new AssertionError("Table column size is less than the given value " + column);
            }
        }
        else {
            throw new AssertionError("Table row size is less than the given value " + row);
        }
        return text;
    }

    public String getSelectItemValue (int row, int column) {
        String text = null;
        List<WebElement> tableRows = getElement().findElements(By.xpath(".//tr"));
        if (tableRows.size() >= row) {
            List<WebElement> tableColumns = tableRows.get(row).findElements(By.xpath(".//td"));
            if (tableColumns.size() >= column - 1) {
                WebElement selectItem = tableColumns.get(column - 1).findElement(By.xpath(".//select"));
                text = new Select(selectItem).getFirstSelectedOption().getText();
            }
            else {
                throw new AssertionError("Table column size is less than the given value " + column);
            }
        }
        else {
            throw new AssertionError("Table row size is less than the given value " + row);
        }
        return text;
    }

    public String getTextFieldValue (int row, int column) {
        String text = null;
        List<WebElement> tableRows = getElement().findElements(By.xpath(".//tr"));
        if (tableRows.size() >= row) {
            List<WebElement> tableColumns = tableRows.get(row).findElements(By.xpath(".//td"));
            if (tableColumns.size() >= column - 1) {
                WebElement textField = tableColumns.get(column - 1).findElement(By.xpath(".//input"));
                text = textField.getAttribute("value");
            }
            else {
                throw new AssertionError("Table column size is less than the given value " + column);
            }
        }
        else {
            throw new AssertionError("Table row size is less than the given value " + row);
        }
        return text;
    }
}
