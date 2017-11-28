package com.common.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
    protected WebDriver driver;

    public PageObjects(WebDriver driver){
        this.driver = new WebDriverDeploy().setWebdriver("Chrome");
        PageFactory.initElements(driver,this);
    }
}
