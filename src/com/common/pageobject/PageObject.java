package com.common.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver; //new WebDriverDeploy().setWebdriver("Chrome");
        PageFactory.initElements(driver,this);
    }
}
