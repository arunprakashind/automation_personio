package com.personio.framework;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
Class that extends Selenium By class. Used for identifying elements using different locators
 */
public class By extends org.openqa.selenium.By {

    public By() {
    }

    public static org.openqa.selenium.By all(By.ByType type, String identify) {

        switch(type) {
            case Name:
                return org.openqa.selenium.By.name(identify);
            case Id:
                return org.openqa.selenium.By.id(identify);
            case CSS:
                return org.openqa.selenium.By.cssSelector(identify);
            case linkText:
                return org.openqa.selenium.By.linkText(identify);
            case Class:
                return org.openqa.selenium.By.className(identify);
            case TagName:
                return org.openqa.selenium.By.tagName(identify);
            case Xpath:
                return org.openqa.selenium.By.xpath(identify);
            default:
                throw new NoSuchElementException("By type incorrectly set to:" + type.toString());
        }
    }

    public List<WebElement> findElements(SearchContext sc) {
        throw new AssertionError("do not use this since it is just declared for overriding super class");
    }

    public static enum ByType {
        Name,
        Class,
        CSS,
        linkText,
        Id,
        TagName,
        Xpath;

        private ByType() {
        }
    }
}